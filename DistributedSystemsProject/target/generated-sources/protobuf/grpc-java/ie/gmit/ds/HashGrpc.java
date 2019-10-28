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
 * <pre>
 * The hash service definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: Project.proto")
public final class HashGrpc {

  private HashGrpc() {}

  public static final String SERVICE_NAME = "Hash";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ie.gmit.ds.HelloRequest,
      ie.gmit.ds.HelloReply> getHashPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hashPassword",
      requestType = ie.gmit.ds.HelloRequest.class,
      responseType = ie.gmit.ds.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ie.gmit.ds.HelloRequest,
      ie.gmit.ds.HelloReply> getHashPasswordMethod() {
    io.grpc.MethodDescriptor<ie.gmit.ds.HelloRequest, ie.gmit.ds.HelloReply> getHashPasswordMethod;
    if ((getHashPasswordMethod = HashGrpc.getHashPasswordMethod) == null) {
      synchronized (HashGrpc.class) {
        if ((getHashPasswordMethod = HashGrpc.getHashPasswordMethod) == null) {
          HashGrpc.getHashPasswordMethod = getHashPasswordMethod =
              io.grpc.MethodDescriptor.<ie.gmit.ds.HelloRequest, ie.gmit.ds.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hashPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.gmit.ds.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ie.gmit.ds.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new HashMethodDescriptorSupplier("hashPassword"))
              .build();
        }
      }
    }
    return getHashPasswordMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HashStub newStub(io.grpc.Channel channel) {
    return new HashStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HashBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new HashBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HashFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new HashFutureStub(channel);
  }

  /**
   * <pre>
   * The hash service definition
   * </pre>
   */
  public static abstract class HashImplBase implements io.grpc.BindableService {

    /**
     */
    public void hashPassword(ie.gmit.ds.HelloRequest request,
        io.grpc.stub.StreamObserver<ie.gmit.ds.HelloReply> responseObserver) {
      asyncUnimplementedUnaryCall(getHashPasswordMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHashPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ie.gmit.ds.HelloRequest,
                ie.gmit.ds.HelloReply>(
                  this, METHODID_HASH_PASSWORD)))
          .build();
    }
  }

  /**
   * <pre>
   * The hash service definition
   * </pre>
   */
  public static final class HashStub extends io.grpc.stub.AbstractStub<HashStub> {
    private HashStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HashStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HashStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HashStub(channel, callOptions);
    }

    /**
     */
    public void hashPassword(ie.gmit.ds.HelloRequest request,
        io.grpc.stub.StreamObserver<ie.gmit.ds.HelloReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHashPasswordMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The hash service definition
   * </pre>
   */
  public static final class HashBlockingStub extends io.grpc.stub.AbstractStub<HashBlockingStub> {
    private HashBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HashBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HashBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HashBlockingStub(channel, callOptions);
    }

    /**
     */
    public ie.gmit.ds.HelloReply hashPassword(ie.gmit.ds.HelloRequest request) {
      return blockingUnaryCall(
          getChannel(), getHashPasswordMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The hash service definition
   * </pre>
   */
  public static final class HashFutureStub extends io.grpc.stub.AbstractStub<HashFutureStub> {
    private HashFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private HashFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HashFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new HashFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ie.gmit.ds.HelloReply> hashPassword(
        ie.gmit.ds.HelloRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getHashPasswordMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HASH_PASSWORD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HashImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HashImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HASH_PASSWORD:
          serviceImpl.hashPassword((ie.gmit.ds.HelloRequest) request,
              (io.grpc.stub.StreamObserver<ie.gmit.ds.HelloReply>) responseObserver);
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

  private static abstract class HashBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HashBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ie.gmit.ds.ProjectProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Hash");
    }
  }

  private static final class HashFileDescriptorSupplier
      extends HashBaseDescriptorSupplier {
    HashFileDescriptorSupplier() {}
  }

  private static final class HashMethodDescriptorSupplier
      extends HashBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HashMethodDescriptorSupplier(String methodName) {
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
      synchronized (HashGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HashFileDescriptorSupplier())
              .addMethod(getHashPasswordMethod())
              .build();
        }
      }
    }
    return result;
  }
}
