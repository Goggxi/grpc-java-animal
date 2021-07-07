package com.goggxi.grpc.animal.client;

import com.proto.dummy.DummyServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class AnimalClient {

    public static void main(String[] args) {
        System.out.println("Hallo im client");

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 50052)
                .build();

//        blocking client - synchronous use BlockingStub
        DummyServiceGrpc.DummyServiceBlockingStub  dummyClientSync = DummyServiceGrpc.newBlockingStub(channel);
//        future client - asynchronous use FutureStub
//        DummyServiceGrpc.DummyServiceFutureStub dummyClientAsync = DummyServiceGrpc.newFutureStub(channel);

//        do something
        System.out.println("Shutting down channel");
        channel.shutdown();

    }

}
