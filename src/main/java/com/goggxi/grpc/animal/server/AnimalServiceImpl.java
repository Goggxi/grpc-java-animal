package com.goggxi.grpc.animal.server;

import com.proto.animal.*;
import io.grpc.Context;
import io.grpc.stub.StreamObserver;

public class AnimalServiceImpl extends AnimalServiceGrpc.AnimalServiceImplBase {

    @Override
    public void setClasses(AnimalReq request, StreamObserver<AnimalRes> responseObserver) {
//        extract the field we need
        Animal animal = request.getAnimal();
        String nameAnimal = animal.getName();
        String classesAnimal = animal.getClasses();

//        create the response
        String result = nameAnimal + " adalah " + classesAnimal;
        AnimalRes res = AnimalRes.newBuilder()
                .setResult(result)
                .build();

//        send the response
        responseObserver.onNext(res);

//        completed the gRPC call
        responseObserver.onCompleted();

//        super.getClasses(request, responseObserver);
    }

    @Override
    public void setManyTimesClasses(AnimalManyTimesReq request, StreamObserver<AnimalManyTimesRes> responseObserver) {
        String nameAnimal = request.getAnimal().getName();

        try {
            for (int i = 0; i < 10; i++) {
                String result = "Animal is a " + nameAnimal + " Response number : " + i;
                AnimalManyTimesRes res = AnimalManyTimesRes
                        .newBuilder()
                        .setResult(result)
                        .build();

                responseObserver.onNext(res);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            responseObserver.onCompleted();
        }

    }

    @Override
    public StreamObserver<AnimalLongReq> setLongClasses(StreamObserver<AnimalLongRes> responseObserver) {
        StreamObserver<AnimalLongReq> requestObserver = new StreamObserver<AnimalLongReq>() {

            String result = "";

            @Override
            public void onNext(AnimalLongReq value) {
//            client send a message
              result += "Animal name is " + value.getAnimal().getName() + "! \n";
            }

            @Override
            public void onError(Throwable t) {
//            client send a error
            }

            @Override
            public void onCompleted() {
//            client is done
            responseObserver.onNext(
                    AnimalLongRes.newBuilder()
                            .setResult(result)
                            .build()
            );

            responseObserver.onCompleted();
//            this is when we want to return a response (response observer)
            }
        };

        return requestObserver;
    }

    @Override
    public StreamObserver<AnimalEveryoneReq> setClassesEveryone(StreamObserver<AnimalEveryoneRes> responseObserver) {
        StreamObserver<AnimalEveryoneReq> reqStreamObserver = new StreamObserver<AnimalEveryoneReq>() {
            @Override
            public void onNext(AnimalEveryoneReq value) {
                String response = "Animals name "  + value.getAnimal().getName();
                AnimalEveryoneRes everyoneRes = AnimalEveryoneRes.newBuilder()
                        .setResult(response)
                        .build();

                responseObserver.onNext(everyoneRes);
            }

            @Override
            public void onError(Throwable t) {
//              do nothing
            }

            @Override
            public void onCompleted() {

            }
        };

        return reqStreamObserver;
    }

    @Override
    public void setClassesWithDeadline(AnimalWithDeadlineReq request, StreamObserver<AnimalWithDeadlineRes> responseObserver) {

        Context context = Context.current();

       try {
           for (int i = 0; i < 3; i++) {
               if(!context.isCancelled()){
                   System.out.println("Sleep for 100ms");
                   Thread.sleep(100);
               } else {
                   return;
               }
           }

           System.out.println("Send response");
           responseObserver.onNext(
                   AnimalWithDeadlineRes.newBuilder()
                           .setResult("Animal is " +  request.getAnimal().getName())
                           .build()
           );

           responseObserver.onCompleted();

       } catch (InterruptedException e) {
           e.printStackTrace();
       }



    }
}
