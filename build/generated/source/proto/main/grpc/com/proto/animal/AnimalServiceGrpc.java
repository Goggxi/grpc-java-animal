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
      com.proto.animal.AnimalRes> getSetClassesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setClasses",
      requestType = com.proto.animal.AnimalReq.class,
      responseType = com.proto.animal.AnimalRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.animal.AnimalReq,
      com.proto.animal.AnimalRes> getSetClassesMethod() {
    io.grpc.MethodDescriptor<com.proto.animal.AnimalReq, com.proto.animal.AnimalRes> getSetClassesMethod;
    if ((getSetClassesMethod = AnimalServiceGrpc.getSetClassesMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getSetClassesMethod = AnimalServiceGrpc.getSetClassesMethod) == null) {
          AnimalServiceGrpc.getSetClassesMethod = getSetClassesMethod =
              io.grpc.MethodDescriptor.<com.proto.animal.AnimalReq, com.proto.animal.AnimalRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setClasses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.animal.AnimalReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.animal.AnimalRes.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("setClasses"))
              .build();
        }
      }
    }
    return getSetClassesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.animal.AnimalManyTimesReq,
      com.proto.animal.AnimalManyTimesRes> getSetManyTimesClassesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setManyTimesClasses",
      requestType = com.proto.animal.AnimalManyTimesReq.class,
      responseType = com.proto.animal.AnimalManyTimesRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.animal.AnimalManyTimesReq,
      com.proto.animal.AnimalManyTimesRes> getSetManyTimesClassesMethod() {
    io.grpc.MethodDescriptor<com.proto.animal.AnimalManyTimesReq, com.proto.animal.AnimalManyTimesRes> getSetManyTimesClassesMethod;
    if ((getSetManyTimesClassesMethod = AnimalServiceGrpc.getSetManyTimesClassesMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getSetManyTimesClassesMethod = AnimalServiceGrpc.getSetManyTimesClassesMethod) == null) {
          AnimalServiceGrpc.getSetManyTimesClassesMethod = getSetManyTimesClassesMethod =
              io.grpc.MethodDescriptor.<com.proto.animal.AnimalManyTimesReq, com.proto.animal.AnimalManyTimesRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setManyTimesClasses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.animal.AnimalManyTimesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.animal.AnimalManyTimesRes.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("setManyTimesClasses"))
              .build();
        }
      }
    }
    return getSetManyTimesClassesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.animal.AnimalLongReq,
      com.proto.animal.AnimalLongRes> getSetLongClassesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setLongClasses",
      requestType = com.proto.animal.AnimalLongReq.class,
      responseType = com.proto.animal.AnimalLongRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.animal.AnimalLongReq,
      com.proto.animal.AnimalLongRes> getSetLongClassesMethod() {
    io.grpc.MethodDescriptor<com.proto.animal.AnimalLongReq, com.proto.animal.AnimalLongRes> getSetLongClassesMethod;
    if ((getSetLongClassesMethod = AnimalServiceGrpc.getSetLongClassesMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getSetLongClassesMethod = AnimalServiceGrpc.getSetLongClassesMethod) == null) {
          AnimalServiceGrpc.getSetLongClassesMethod = getSetLongClassesMethod =
              io.grpc.MethodDescriptor.<com.proto.animal.AnimalLongReq, com.proto.animal.AnimalLongRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setLongClasses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.animal.AnimalLongReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.animal.AnimalLongRes.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("setLongClasses"))
              .build();
        }
      }
    }
    return getSetLongClassesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.animal.AnimalEveryoneReq,
      com.proto.animal.AnimalEveryoneRes> getSetClassesEveryoneMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setClassesEveryone",
      requestType = com.proto.animal.AnimalEveryoneReq.class,
      responseType = com.proto.animal.AnimalEveryoneRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.animal.AnimalEveryoneReq,
      com.proto.animal.AnimalEveryoneRes> getSetClassesEveryoneMethod() {
    io.grpc.MethodDescriptor<com.proto.animal.AnimalEveryoneReq, com.proto.animal.AnimalEveryoneRes> getSetClassesEveryoneMethod;
    if ((getSetClassesEveryoneMethod = AnimalServiceGrpc.getSetClassesEveryoneMethod) == null) {
      synchronized (AnimalServiceGrpc.class) {
        if ((getSetClassesEveryoneMethod = AnimalServiceGrpc.getSetClassesEveryoneMethod) == null) {
          AnimalServiceGrpc.getSetClassesEveryoneMethod = getSetClassesEveryoneMethod =
              io.grpc.MethodDescriptor.<com.proto.animal.AnimalEveryoneReq, com.proto.animal.AnimalEveryoneRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setClassesEveryone"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.animal.AnimalEveryoneReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.animal.AnimalEveryoneRes.getDefaultInstance()))
              .setSchemaDescriptor(new AnimalServiceMethodDescriptorSupplier("setClassesEveryone"))
              .build();
        }
      }
    }
    return getSetClassesEveryoneMethod;
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
    public void setClasses(com.proto.animal.AnimalReq request,
        io.grpc.stub.StreamObserver<com.proto.animal.AnimalRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetClassesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Server Streaming
     * </pre>
     */
    public void setManyTimesClasses(com.proto.animal.AnimalManyTimesReq request,
        io.grpc.stub.StreamObserver<com.proto.animal.AnimalManyTimesRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetManyTimesClassesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.animal.AnimalLongReq> setLongClasses(
        io.grpc.stub.StreamObserver<com.proto.animal.AnimalLongRes> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSetLongClassesMethod(), responseObserver);
    }

    /**
     * <pre>
     * BiDi Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.animal.AnimalEveryoneReq> setClassesEveryone(
        io.grpc.stub.StreamObserver<com.proto.animal.AnimalEveryoneRes> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSetClassesEveryoneMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSetClassesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.animal.AnimalReq,
                com.proto.animal.AnimalRes>(
                  this, METHODID_SET_CLASSES)))
          .addMethod(
            getSetManyTimesClassesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.animal.AnimalManyTimesReq,
                com.proto.animal.AnimalManyTimesRes>(
                  this, METHODID_SET_MANY_TIMES_CLASSES)))
          .addMethod(
            getSetLongClassesMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.animal.AnimalLongReq,
                com.proto.animal.AnimalLongRes>(
                  this, METHODID_SET_LONG_CLASSES)))
          .addMethod(
            getSetClassesEveryoneMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.animal.AnimalEveryoneReq,
                com.proto.animal.AnimalEveryoneRes>(
                  this, METHODID_SET_CLASSES_EVERYONE)))
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
    public void setClasses(com.proto.animal.AnimalReq request,
        io.grpc.stub.StreamObserver<com.proto.animal.AnimalRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetClassesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Server Streaming
     * </pre>
     */
    public void setManyTimesClasses(com.proto.animal.AnimalManyTimesReq request,
        io.grpc.stub.StreamObserver<com.proto.animal.AnimalManyTimesRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getSetManyTimesClassesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Client Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.animal.AnimalLongReq> setLongClasses(
        io.grpc.stub.StreamObserver<com.proto.animal.AnimalLongRes> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSetLongClassesMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * BiDi Streaming
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.proto.animal.AnimalEveryoneReq> setClassesEveryone(
        io.grpc.stub.StreamObserver<com.proto.animal.AnimalEveryoneRes> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getSetClassesEveryoneMethod(), getCallOptions()), responseObserver);
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
    public com.proto.animal.AnimalRes setClasses(com.proto.animal.AnimalReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetClassesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Server Streaming
     * </pre>
     */
    public java.util.Iterator<com.proto.animal.AnimalManyTimesRes> setManyTimesClasses(
        com.proto.animal.AnimalManyTimesReq request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getSetManyTimesClassesMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.proto.animal.AnimalRes> setClasses(
        com.proto.animal.AnimalReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetClassesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_CLASSES = 0;
  private static final int METHODID_SET_MANY_TIMES_CLASSES = 1;
  private static final int METHODID_SET_LONG_CLASSES = 2;
  private static final int METHODID_SET_CLASSES_EVERYONE = 3;

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
        case METHODID_SET_CLASSES:
          serviceImpl.setClasses((com.proto.animal.AnimalReq) request,
              (io.grpc.stub.StreamObserver<com.proto.animal.AnimalRes>) responseObserver);
          break;
        case METHODID_SET_MANY_TIMES_CLASSES:
          serviceImpl.setManyTimesClasses((com.proto.animal.AnimalManyTimesReq) request,
              (io.grpc.stub.StreamObserver<com.proto.animal.AnimalManyTimesRes>) responseObserver);
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
        case METHODID_SET_LONG_CLASSES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setLongClasses(
              (io.grpc.stub.StreamObserver<com.proto.animal.AnimalLongRes>) responseObserver);
        case METHODID_SET_CLASSES_EVERYONE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.setClassesEveryone(
              (io.grpc.stub.StreamObserver<com.proto.animal.AnimalEveryoneRes>) responseObserver);
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
              .addMethod(getSetClassesMethod())
              .addMethod(getSetManyTimesClassesMethod())
              .addMethod(getSetLongClassesMethod())
              .addMethod(getSetClassesEveryoneMethod())
              .build();
        }
      }
    }
    return result;
  }
}
