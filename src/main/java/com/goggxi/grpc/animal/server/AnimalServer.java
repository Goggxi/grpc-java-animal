package com.goggxi.grpc.animal.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.File;
import java.io.IOException;

public class AnimalServer {

    public static void main(String[] args) throws IOException, InterruptedException {

        // plaintext server
//        Server server = ServerBuilder
//                .forPort(50052)
//                .addService(new AnimalServiceImpl())
//                .build();

        // secure server
        Server server = ServerBuilder
                .forPort(50052)
                .addService(new AnimalServiceImpl())
                .useTransportSecurity(
                        new File("ssl/server.crt"),
                        new File("ssl/server.pem")
                )
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
