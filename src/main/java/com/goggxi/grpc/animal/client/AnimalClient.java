package com.goggxi.grpc.animal.client;

import com.proto.dummy.DummyServiceGrpc;
import com.proto.animal.Animal;
import com.proto.animal.AnimalReq;
import com.proto.animal.AnimalRes;
import com.proto.animal.AnimalServiceGrpc;
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

//        create a protocol buffer animal message
        Animal animal = Animal.newBuilder()
                .setName("Cat")
                .setClasses("mammal")
                .build();

//        do the same for a AnimalReq
        AnimalReq req = AnimalReq.newBuilder()
                .setAnimal(animal)
                .build();

//        call the RPC and get back a AnimalRes (protocol buffer)
        AnimalRes res = animalClient.getClasses(req);

        System.out.println(res.getResult());

//        do something
        System.out.println("Shutting down channel");
        channel.shutdown();

    }

}
