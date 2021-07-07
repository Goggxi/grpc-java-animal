package com.goggxi.grpc.animal.server;

import com.proto.animal.Animal;
import com.proto.animal.AnimalReq;
import com.proto.animal.AnimalRes;
import com.proto.animal.AnimalServiceGrpc;
import io.grpc.stub.StreamObserver;

public class AnimalServiceImpl extends AnimalServiceGrpc.AnimalServiceImplBase {
    @Override
    public void getClasses(AnimalReq request, StreamObserver<AnimalRes> responseObserver) {
//        extract the field we need
        Animal animal = request.getAnimal();
        String nameAnimal = animal.getName();
        String classesAnimal = animal.getClasses();

//        create the response
        String result = nameAnimal + " is a " + classesAnimal;
        AnimalRes res = AnimalRes.newBuilder()
                .setResult(result)
                .build();

//        send the response
        responseObserver.onNext(res);

//        completed the gRPC call
        responseObserver.onCompleted();


//        super.getClasses(request, responseObserver);
    }
}
