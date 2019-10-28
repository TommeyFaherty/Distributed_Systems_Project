package ie.gmit.ds;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: Project.proto")
public final class PasswordGrpc {

  private PasswordGrpc() {}

  public static final String SERVICE_NAME = "Password";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ie.gmit.ds.HelloRequest,
      ie.gmit.ds.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = ie.gmit.ds.HelloRequest.class,
      responseType = ie.gmit.ds.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ie.gmit.ds.HelloRequest,
      ie.gmit.ds.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<ie.gmit.ds.HelloRequest, ie.gmit.ds.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = PasswordGrpc.getSayHelloMethod) == null) {
      synchronized (PasswordGrpc.class) {
        if ((getSayHelloMethod = PasswordGrpc.getSayHelloMethod) == null) {
          PasswordGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<ie.gmit.ds.HelloRequest, ie.gmit.ds.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.gmit.ds.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.gmit.ds.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new PasswordMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ie.gmit.ds.UsernameRequest,
      ie.gmit.ds.UsernameReply> getRetrieveNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RetrieveName",
      requestType = ie.gmit.ds.UsernameRequest.class,
      responseType = ie.gmit.ds.UsernameReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ie.gmit.ds.UsernameRequest,
      ie.gmit.ds.UsernameReply> getRetrieveNameMethod() {
    io.grpc.MethodDescriptor<ie.gmit.ds.UsernameRequest, ie.gmit.ds.UsernameReply> getRetrieveNameMethod;
    if ((getRetrieveNameMethod = PasswordGrpc.getRetrieveNameMethod) == null) {
      synchronized (PasswordGrpc.class) {
        if ((getRetrieveNameMethod = PasswordGrpc.getRetrieveNameMethod) == null) {
          PasswordGrpc.getRetrieveNameMethod = getRetrieveNameMethod =
              io.grpc.MethodDescriptor.<ie.gmit.ds.UsernameRequest, ie.gmit.ds.UsernameReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RetrieveName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.gmit.ds.UsernameRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.gmit.ds.UsernameReply.getDefaultInstance()))
              .setSchemaDescriptor(new PasswordMethodDescriptorSupplier("RetrieveName"))
              .build();
        }
      }
    }
    return getRetrieveNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ie.gmit.ds.PassRequest,
      ie.gmit.ds.PassReply> getHashPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HashPassword",
      requestType = ie.gmit.ds.PassRequest.class,
      responseType = ie.gmit.ds.PassReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ie.gmit.ds.PassRequest,
      ie.gmit.ds.PassReply> getHashPasswordMethod() {
    io.grpc.MethodDescriptor<ie.gmit.ds.PassRequest, ie.gmit.ds.PassReply> getHashPasswordMethod;
    if ((getHashPasswordMethod = PasswordGrpc.getHashPasswordMethod) == null) {
      synchronized (PasswordGrpc.class) {
        if ((getHashPasswordMethod = PasswordGrpc.getHashPasswordMethod) == null) {
          PasswordGrpc.getHashPasswordMethod = getHashPasswordMethod =
              io.grpc.MethodDescriptor.<ie.gmit.ds.PassRequest, ie.gmit.ds.PassReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HashPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.gmit.ds.PassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.gmit.ds.PassReply.getDefaultInstance()))
              .setSchemaDescriptor(new PasswordMethodDescriptorSupplier("HashPassword"))
              .build();
        }
      }
    }
    return getHashPasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PasswordStub newStub(io.grpc.Channel channel) {
    return new PasswordStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PasswordBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PasswordBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PasswordFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PasswordFutureStub(channel);
  }

  /**
   */
  public static abstract class PasswordImplBase implements io.grpc.BindableService {

    /**
     */
    public void sayHello(ie.gmit.ds.HelloRequest request,
        io.grpc.stub.StreamObserver<ie.gmit.ds.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void retrieveName(ie.gmit.ds.UsernameRequest request,
        io.grpc.stub.StreamObserver<ie.gmit.ds.UsernameReply> responseObserver) {
      asyncUnimplementedUnaryCall(getRetrieveNameMethod(), responseObserver);
    }

    /**
     */
    public void hashPassword(ie.gmit.ds.PassRequest request,
        io.grpc.stub.StreamObserver<ie.gmit.ds.PassReply> responseObserver) {
      asyncUnimplementedUnaryCall(getHashPasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ie.gmit.ds.HelloRequest,
                ie.gmit.ds.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getRetrieveNameMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ie.gmit.ds.UsernameRequest,
                ie.gmit.ds.UsernameReply>(
                  this, METHODID_RETRIEVE_NAME)))
          .addMethod(
            getHashPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ie.gmit.ds.PassRequest,
                ie.gmit.ds.PassReply>(
                  this, METHODID_HASH_PASSWORD)))
          .build();
    }
  }

  /**
   */
  public static final class PasswordStub extends io.grpc.stub.AbstractStub<PasswordStub> {
    private PasswordStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordStub(channel, callOptions);
    }

    /**
     */
    public void sayHello(ie.gmit.ds.HelloRequest request,
        io.grpc.stub.StreamObserver<ie.gmit.ds.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void retrieveName(ie.gmit.ds.UsernameRequest request,
        io.grpc.stub.StreamObserver<ie.gmit.ds.UsernameReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRetrieveNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void hashPassword(ie.gmit.ds.PassRequest request,
        io.grpc.stub.StreamObserver<ie.gmit.ds.PassReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHashPasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PasswordBlockingStub extends io.grpc.stub.AbstractStub<PasswordBlockingStub> {
    private PasswordBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordBlockingStub(channel, callOptions);
    }

    /**
     */
    public ie.gmit.ds.HelloReply sayHello(ie.gmit.ds.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public ie.gmit.ds.UsernameReply retrieveName(ie.gmit.ds.UsernameRequest request) {
      return blockingUnaryCall(
          getChannel(), getRetrieveNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public ie.gmit.ds.PassReply hashPassword(ie.gmit.ds.PassRequest request) {
      return blockingUnaryCall(
          getChannel(), getHashPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PasswordFutureStub extends io.grpc.stub.AbstractStub<PasswordFutureStub> {
    private PasswordFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ie.gmit.ds.HelloReply> sayHello(
        ie.gmit.ds.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ie.gmit.ds.UsernameReply> retrieveName(
        ie.gmit.ds.UsernameRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRetrieveNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ie.gmit.ds.PassReply> hashPassword(
        ie.gmit.ds.PassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHashPasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_RETRIEVE_NAME = 1;
  private static final int METHODID_HASH_PASSWORD = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PasswordImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PasswordImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((ie.gmit.ds.HelloRequest) request,
              (io.grpc.stub.StreamObserver<ie.gmit.ds.HelloReply>) responseObserver);
          break;
        case METHODID_RETRIEVE_NAME:
          serviceImpl.retrieveName((ie.gmit.ds.UsernameRequest) request,
              (io.grpc.stub.StreamObserver<ie.gmit.ds.UsernameReply>) responseObserver);
          break;
        case METHODID_HASH_PASSWORD:
          serviceImpl.hashPassword((ie.gmit.ds.PassRequest) request,
              (io.grpc.stub.StreamObserver<ie.gmit.ds.PassReply>) responseObserver);
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

  private static abstract class PasswordBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PasswordBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ie.gmit.ds.ProjectProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Password");
    }
  }

  private static final class PasswordFileDescriptorSupplier
      extends PasswordBaseDescriptorSupplier {
    PasswordFileDescriptorSupplier() {}
  }

  private static final class PasswordMethodDescriptorSupplier
      extends PasswordBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PasswordMethodDescriptorSupplier(String methodName) {
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
      synchronized (PasswordGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PasswordFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getRetrieveNameMethod())
              .addMethod(getHashPasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
