package com.goggxi.grpc.animal.client;

import com.proto.animal.*;
import com.proto.dummy.DummyServiceGrpc;
import io.grpc.*;
import io.grpc.netty.shaded.io.grpc.netty.GrpcSslContexts;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.net.ssl.SSLException;
import java.io.File;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class AnimalClient {

    public static void main(String[] args) throws SSLException {
        AnimalClient main = new AnimalClient();
        main.run();
    }

    private void run() throws SSLException {

        System.out.println("Hallo im client");

//        ManagedChannel channel = ManagedChannelBuilder
//                .forAddress("localhost", 50052)
//                .usePlaintext() // devs
//                .build();

        // With server authentication SSL/TLS; custom CA root certificates; not on Android
        ManagedChannel secureChannel = NettyChannelBuilder.forAddress("localhost", 50052)
                .sslContext(GrpcSslContexts.forClient().trustManager(new File("ssl/ca.crt")).build())
                .build();

        doUnaryCall(secureChannel);
//        doServerStreamingCall(channel);
//        doClientStreamingCall(channel);
//        doBidiStreamingCall(channel);
//        doUnaryCallWithDeadline(channel);

        System.out.println("Shutting down channel");
//        channel.shutdown();
        secureChannel.shutdown();

    }

    private void doUnaryCall(ManagedChannel channel) {
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
        AnimalRes res = animalClient.setClasses(req);
        System.out.println(res.getResult());
    }

    private void doServerStreamingCall(ManagedChannel channel) {
//        we prepare the request
        AnimalServiceGrpc.AnimalServiceBlockingStub animalClient = AnimalServiceGrpc.newBlockingStub(channel);

        AnimalManyTimesReq manyTimesReq = AnimalManyTimesReq.newBuilder()
                .setAnimal(Animal.newBuilder()
                        .setName("Duck")
                        .build())
                .build();

//        we stream the response (in a blocking manner)
        animalClient.setManyTimesClasses(manyTimesReq).forEachRemaining(animalManyTimesRes -> {
            System.out.println(animalManyTimesRes.getResult());
        });
    }

    private void doClientStreamingCall(ManagedChannel channel) {
//        create a client (stub)
//        create an a synchronous client
//        AnimalServiceGrpc.AnimalServiceBlockingStub syncClient = AnimalServiceGrpc.newBlockingStub(channel);
//        create an a asynchronous client
//        AnimalServiceGrpc.AnimalServiceFutureStub asyncClient = AnimalServiceGrpc.newFutureStub(channel);
//        create an a asynchronous client STUB
        AnimalServiceGrpc.AnimalServiceStub asyncClient = AnimalServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<AnimalLongReq> requestObserver =  asyncClient.setLongClasses(new StreamObserver<AnimalLongRes>() {
            @Override
            public void onNext(AnimalLongRes value) {
//              we get an response from the server
                System.out.println("Received a response from the server");
                System.out.println(value.getResult());
//              onNext will be called only once
            }

            @Override
            public void onError(Throwable t) {
//              we get an error from the server
            }

            @Override
            public void onCompleted() {
//              the server is done sending use data
//              onCompleted well be called right after onNext()
                System.out.println("Server has completed sending us something");
                latch.countDown();
            }
        });

        requestObserver.onNext(AnimalLongReq.newBuilder()
                .setAnimal(Animal.newBuilder()
                        .setName("Eagle")
                        .build())
                .build());

//      streaming message #1
        System.out.println("Sending message #1");
        requestObserver.onNext(AnimalLongReq.newBuilder()
                .setAnimal(Animal.newBuilder()
                        .setName("Zebra")
                        .build())
                .build());

 //      streaming message #2
        System.out.println("Sending message #2");
        requestObserver.onNext(AnimalLongReq.newBuilder()
                .setAnimal(Animal.newBuilder()
                        .setName("Dog")
                        .build())
                .build());

//      streaming message #3
        System.out.println("Sending message #3");
        requestObserver.onNext(AnimalLongReq.newBuilder()
                .setAnimal(Animal.newBuilder()
                        .setName("Cat")
                        .build())
                .build());

//      we tall the server that the client is done sending data
        requestObserver.onCompleted();

        try {
            latch.await(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private void doBidiStreamingCall(ManagedChannel channel) {
//        create an a asynchronous client STUB
        AnimalServiceGrpc.AnimalServiceStub asyncClient = AnimalServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<AnimalEveryoneReq> reqStreamObserver = asyncClient.setClassesEveryone(new StreamObserver<AnimalEveryoneRes>() {
            @Override
            public void onNext(AnimalEveryoneRes value) {
                System.out.println("Response from server : " + value.getResult());
            }

            @Override
            public void onError(Throwable t) {
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Server is done sending data");
                latch.countDown();
            }
        });

        Arrays.asList("Eagle", "Dog", "Zebra", "Duck").forEach(
                name -> {
                    System.out.println("Sending: " + name);
                    reqStreamObserver.onNext(AnimalEveryoneReq.newBuilder()
                            .setAnimal(Animal.newBuilder()
                                    .setName(name))
                            .build());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        );

        reqStreamObserver.onCompleted();

        try {
            latch.await(3 , TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void doUnaryCallWithDeadline(ManagedChannel channel) {
        AnimalServiceGrpc.AnimalServiceBlockingStub blockingStub = AnimalServiceGrpc.newBlockingStub(channel);

//        first call (3000ms deadline)
        try {
            System.out.println("Sending a request with a deadline of 3000ms");
            AnimalWithDeadlineRes res = blockingStub.withDeadline(Deadline.after(3000, TimeUnit.MILLISECONDS)).setClassesWithDeadline(
                    AnimalWithDeadlineReq.newBuilder()
                            .setAnimal(Animal.newBuilder().setName("Zebra"))
                            .build()
            );
            System.out.println(res.getResult());
        } catch (StatusRuntimeException e) {
            if (e.getStatus() == Status.DEADLINE_EXCEEDED) {
                System.out.println("Deadline has been exceeded, we don't want the response");
            } else {
                e.printStackTrace();
            }
        }

 //        first call (100ms deadline)
        try {
            System.out.println("Sending a request with a deadline of 100ms");
            AnimalWithDeadlineRes res = blockingStub.withDeadline(Deadline.after(100, TimeUnit.MILLISECONDS)).setClassesWithDeadline(
                    AnimalWithDeadlineReq.newBuilder()
                            .setAnimal(Animal.newBuilder().setName("Dog"))
                            .build()
            );
            System.out.println(res.getResult());
        } catch (StatusRuntimeException e) {
            if (e.getStatus() == Status.DEADLINE_EXCEEDED) {
                System.out.println("Deadline has been exceeded, we don't want the response");
            } else {
                e.printStackTrace();
            }
        }
    }

}
