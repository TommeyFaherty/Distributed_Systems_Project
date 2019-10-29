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
  private static volatile io.grpc.MethodDescriptor<ie.gmit.ds.HashRequest,
      ie.gmit.ds.HashReply> getHashPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HashPassword",
      requestType = ie.gmit.ds.HashRequest.class,
      responseType = ie.gmit.ds.HashReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ie.gmit.ds.HashRequest,
      ie.gmit.ds.HashReply> getHashPasswordMethod() {
    io.grpc.MethodDescriptor<ie.gmit.ds.HashRequest, ie.gmit.ds.HashReply> getHashPasswordMethod;
    if ((getHashPasswordMethod = PasswordGrpc.getHashPasswordMethod) == null) {
      synchronized (PasswordGrpc.class) {
        if ((getHashPasswordMethod = PasswordGrpc.getHashPasswordMethod) == null) {
          PasswordGrpc.getHashPasswordMethod = getHashPasswordMethod =
              io.grpc.MethodDescriptor.<ie.gmit.ds.HashRequest, ie.gmit.ds.HashReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HashPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.gmit.ds.HashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.gmit.ds.HashReply.getDefaultInstance()))
              .setSchemaDescriptor(new PasswordMethodDescriptorSupplier("HashPassword"))
              .build();
        }
      }
    }
    return getHashPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ie.gmit.ds.ValidateRequest,
      ie.gmit.ds.ValidateReply> getValidateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Validate",
      requestType = ie.gmit.ds.ValidateRequest.class,
      responseType = ie.gmit.ds.ValidateReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ie.gmit.ds.ValidateRequest,
      ie.gmit.ds.ValidateReply> getValidateMethod() {
    io.grpc.MethodDescriptor<ie.gmit.ds.ValidateRequest, ie.gmit.ds.ValidateReply> getValidateMethod;
    if ((getValidateMethod = PasswordGrpc.getValidateMethod) == null) {
      synchronized (PasswordGrpc.class) {
        if ((getValidateMethod = PasswordGrpc.getValidateMethod) == null) {
          PasswordGrpc.getValidateMethod = getValidateMethod =
              io.grpc.MethodDescriptor.<ie.gmit.ds.ValidateRequest, ie.gmit.ds.ValidateReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Validate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.gmit.ds.ValidateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.gmit.ds.ValidateReply.getDefaultInstance()))
              .setSchemaDescriptor(new PasswordMethodDescriptorSupplier("Validate"))
              .build();
        }
      }
    }
    return getValidateMethod;
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
    public void hashPassword(ie.gmit.ds.HashRequest request,
        io.grpc.stub.StreamObserver<ie.gmit.ds.HashReply> responseObserver) {
      asyncUnimplementedUnaryCall(getHashPasswordMethod(), responseObserver);
    }

    /**
     */
    public void validate(ie.gmit.ds.ValidateRequest request,
        io.grpc.stub.StreamObserver<ie.gmit.ds.ValidateReply> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHashPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ie.gmit.ds.HashRequest,
                ie.gmit.ds.HashReply>(
                  this, METHODID_HASH_PASSWORD)))
          .addMethod(
            getValidateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ie.gmit.ds.ValidateRequest,
                ie.gmit.ds.ValidateReply>(
                  this, METHODID_VALIDATE)))
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
    public void hashPassword(ie.gmit.ds.HashRequest request,
        io.grpc.stub.StreamObserver<ie.gmit.ds.HashReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHashPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validate(ie.gmit.ds.ValidateRequest request,
        io.grpc.stub.StreamObserver<ie.gmit.ds.ValidateReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request, responseObserver);
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
    public ie.gmit.ds.HashReply hashPassword(ie.gmit.ds.HashRequest request) {
      return blockingUnaryCall(
          getChannel(), getHashPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public ie.gmit.ds.ValidateReply validate(ie.gmit.ds.ValidateRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidateMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<ie.gmit.ds.HashReply> hashPassword(
        ie.gmit.ds.HashRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHashPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ie.gmit.ds.ValidateReply> validate(
        ie.gmit.ds.ValidateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HASH_PASSWORD = 0;
  private static final int METHODID_VALIDATE = 1;

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
        case METHODID_HASH_PASSWORD:
          serviceImpl.hashPassword((ie.gmit.ds.HashRequest) request,
              (io.grpc.stub.StreamObserver<ie.gmit.ds.HashReply>) responseObserver);
          break;
        case METHODID_VALIDATE:
          serviceImpl.validate((ie.gmit.ds.ValidateRequest) request,
              (io.grpc.stub.StreamObserver<ie.gmit.ds.ValidateReply>) responseObserver);
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
              .addMethod(getHashPasswordMethod())
              .addMethod(getValidateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
