package com.goggxi.grpc.animal.client;

import com.proto.animal.*;
import com.proto.dummy.DummyServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AnimalClient {

    public static void main(String[] args) {
        System.out.println("Hallo im client");

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50052)
                .usePlaintext() // devs
                .build();


//        blocking client - synchronous use BlockingStub
//        DummyServiceGrpc.DummyServiceBlockingStub  dummyClientSync = DummyServiceGrpc.newBlockingStub(channel);
//        future client - asynchronous use FutureStub
//        DummyServiceGrpc.DummyServiceFutureStub dummyClientAsync = DummyServiceGrpc.newFutureStub(channel);

        AnimalServiceGrpc.AnimalServiceBlockingStub animalClient = AnimalServiceGrpc.newBlockingStub(channel);

//        Unary

//        create a protocol buffer animal message
//        Animal animal = Animal.newBuilder()
//                .setName("Cat")
//                .setClasses("mammal")
//                .build();

//        do the same for a AnimalReq
//        AnimalReq req = AnimalReq.newBuilder()
//                .setAnimal(animal)
//                .build();

//        call the RPC and get back a AnimalRes (protocol buffer)
//        AnimalRes res = animalClient.setClasses(req);
//        System.out.println(res.getResult());

//        Server Streaming
//        we prepare the request
        AnimalManyTimesReq manyTimesReq = AnimalManyTimesReq.newBuilder()
                .setAnimal(Animal.newBuilder()
                        .setName("Duck")
                        .build())
                .build();

//        we stream the response (in a blocking manner)
        animalClient.setManyTimesClasses(manyTimesReq).forEachRemaining(animalManyTimesRes -> {
            System.out.println(animalManyTimesRes.getResult());
        });

//        do something
        System.out.println("Shutting down channel");
        channel.shutdown();

    }

}
