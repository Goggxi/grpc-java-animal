package com.goggxi.grpc.animal.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class AnimalServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        Server server = ServerBuilder
                .forPort(50052)
                .addService(new AnimalServiceImpl())
                .build();

        server.start();

        System.out.println("Server is running on port " + server.getPort());

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            System.out.println("Received Shutdown Request");
            server.shutdown();
            System.out.println("Successfully Stopped the server");
        }));

        server.awaitTermination();
    }

}
