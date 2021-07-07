package com.proto.animal;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: animal/animal.proto")
public final class AnimalServiceGrpc {

  private AnimalServiceGrpc() {}

  public static final String SERVICE_NAME = "animal.AnimalService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.animal.AnimalReq,
      com.proto.animal.AnimalRes> getGetClassesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getClasses",
      requestType = com.proto.animal.AnimalReq.class,
      responseType = com.proto.animal.AnimalRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.animal.AnimalReq,
      com.proto.animal.AnimalRes> getGetClassesMethod() {
    io.grpc.MethodDescriptor<com.proto.animal.AnimalReq, com.proto.animal.AnimalRes> getGetClassesMethod;
    if ((getGetClassesMethod = AnimalServiceGrpc.getGetClassesMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getGetClassesMethod = AnimalServiceGrpc.getGetClassesMethod) == null) {
          AnimalServiceGrpc.getGetClassesMethod = getGetClassesMethod =
              io.grpc.MethodDescriptor.<com.proto.animal.AnimalReq, com.proto.animal.AnimalRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getClasses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.animal.AnimalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.animal.AnimalRes.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("getClasses"))
              .build();
        }
      }
    }
    return getGetClassesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AnimalServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceStub>() {
        @java.lang.Override
        public AnimalServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceStub(channel, callOptions);
        }
      };
    return AnimalServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AnimalServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceBlockingStub>() {
        @java.lang.Override
        public AnimalServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceBlockingStub(channel, callOptions);
        }
      };
    return AnimalServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AnimalServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AnimalServiceFutureStub>() {
        @java.lang.Override
        public AnimalServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AnimalServiceFutureStub(channel, callOptions);
        }
      };
    return AnimalServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AnimalServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void getClasses(com.proto.animal.AnimalReq request,
        io.grpc.stub.StreamObserver<com.proto.animal.AnimalRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetClassesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetClassesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.animal.AnimalReq,
                com.proto.animal.AnimalRes>(
                  this, METHODID_GET_CLASSES)))
          .build();
    }
  }

  /**
   */
  public static final class AnimalServiceStub extends io.grpc.stub.AbstractAsyncStub<AnimalServiceStub> {
    private AnimalServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void getClasses(com.proto.animal.AnimalReq request,
        io.grpc.stub.StreamObserver<com.proto.animal.AnimalRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetClassesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AnimalServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AnimalServiceBlockingStub> {
    private AnimalServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.proto.animal.AnimalRes getClasses(com.proto.animal.AnimalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetClassesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AnimalServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AnimalServiceFutureStub> {
    private AnimalServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AnimalServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AnimalServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.animal.AnimalRes> getClasses(
        com.proto.animal.AnimalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetClassesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CLASSES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AnimalServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AnimalServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CLASSES:
          serviceImpl.getClasses((com.proto.animal.AnimalReq) request,
              (io.grpc.stub.StreamObserver<com.proto.animal.AnimalRes>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AnimalServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.animal.AnimalOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AnimalService");
    }
  }

  private static final class AnimalServiceFileDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier {
    AnimalServiceFileDescriptorSupplier() {}
  }

  private static final class AnimalServiceMethodDescriptorSupplier
      extends AnimalServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AnimalServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AnimalServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AnimalServiceFileDescriptorSupplier())
              .addMethod(getGetClassesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
