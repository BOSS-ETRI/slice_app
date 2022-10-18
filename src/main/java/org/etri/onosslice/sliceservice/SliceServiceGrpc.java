package org.etri.onosslice.sliceservice;

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
        value = "by gRPC proto compiler (version 1.22.1)",
        comments = "Source: slice_service.proto")
public final class SliceServiceGrpc {

  private SliceServiceGrpc() {}

  public static final String SERVICE_NAME = "onossliceservice.SliceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest,
          org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse> getAddSliceMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "AddSlice",
          requestType = org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest.class,
          responseType = org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest,
          org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse> getAddSliceMethod() {
    io.grpc.MethodDescriptor<org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest, org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse> getAddSliceMethod;
    if ((getAddSliceMethod = SliceServiceGrpc.getAddSliceMethod) == null) {
      synchronized (SliceServiceGrpc.class) {
        if ((getAddSliceMethod = SliceServiceGrpc.getAddSliceMethod) == null) {
          SliceServiceGrpc.getAddSliceMethod = getAddSliceMethod =
                  io.grpc.MethodDescriptor.<org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest, org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                          .setFullMethodName(generateFullMethodName(
                                  "onossliceservice.SliceService", "AddSlice"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new SliceServiceMethodDescriptorSupplier("AddSlice"))
                          .build();
        }
      }
    }
    return getAddSliceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusRequest,
          org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusResponse> getDeviceReportMethod;

  @io.grpc.stub.annotations.RpcMethod(
          fullMethodName = SERVICE_NAME + '/' + "DeviceReport",
          requestType = org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusRequest.class,
          responseType = org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusResponse.class,
          methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusRequest,
          org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusResponse> getDeviceReportMethod() {
    io.grpc.MethodDescriptor<org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusRequest, org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusResponse> getDeviceReportMethod;
    if ((getDeviceReportMethod = SliceServiceGrpc.getDeviceReportMethod) == null) {
      synchronized (SliceServiceGrpc.class) {
        if ((getDeviceReportMethod = SliceServiceGrpc.getDeviceReportMethod) == null) {
          SliceServiceGrpc.getDeviceReportMethod = getDeviceReportMethod =
                  io.grpc.MethodDescriptor.<org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusRequest, org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusResponse>newBuilder()
                          .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
                          .setFullMethodName(generateFullMethodName(
                                  "onossliceservice.SliceService", "DeviceReport"))
                          .setSampledToLocalTracing(true)
                          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusRequest.getDefaultInstance()))
                          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                                  org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusResponse.getDefaultInstance()))
                          .setSchemaDescriptor(new SliceServiceMethodDescriptorSupplier("DeviceReport"))
                          .build();
        }
      }
    }
    return getDeviceReportMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SliceServiceStub newStub(io.grpc.Channel channel) {
    return new SliceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SliceServiceBlockingStub newBlockingStub(
          io.grpc.Channel channel) {
    return new SliceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SliceServiceFutureStub newFutureStub(
          io.grpc.Channel channel) {
    return new SliceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SliceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addSlice(org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest request,
                         io.grpc.stub.StreamObserver<org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddSliceMethod(), responseObserver);
    }

    /**
     */
    public void deviceReport(org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusRequest request,
                             io.grpc.stub.StreamObserver<org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeviceReportMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
              .addMethod(
                      getAddSliceMethod(),
                      asyncUnaryCall(
                              new MethodHandlers<
                                      org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest,
                                      org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse>(
                                      this, METHODID_ADD_SLICE)))
              .addMethod(
                      getDeviceReportMethod(),
                      asyncServerStreamingCall(
                              new MethodHandlers<
                                      org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusRequest,
                                      org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusResponse>(
                                      this, METHODID_DEVICE_REPORT)))
              .build();
    }
  }

  /**
   */
  public static final class SliceServiceStub extends io.grpc.stub.AbstractStub<SliceServiceStub> {
    private SliceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SliceServiceStub(io.grpc.Channel channel,
                             io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SliceServiceStub build(io.grpc.Channel channel,
                                     io.grpc.CallOptions callOptions) {
      return new SliceServiceStub(channel, callOptions);
    }

    /**
     */
    public void addSlice(org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest request,
                         io.grpc.stub.StreamObserver<org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse> responseObserver) {
      asyncUnaryCall(
              getChannel().newCall(getAddSliceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deviceReport(org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusRequest request,
                             io.grpc.stub.StreamObserver<org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusResponse> responseObserver) {
      asyncServerStreamingCall(
              getChannel().newCall(getDeviceReportMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SliceServiceBlockingStub extends io.grpc.stub.AbstractStub<SliceServiceBlockingStub> {
    private SliceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SliceServiceBlockingStub(io.grpc.Channel channel,
                                     io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SliceServiceBlockingStub build(io.grpc.Channel channel,
                                             io.grpc.CallOptions callOptions) {
      return new SliceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse addSlice(org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest request) {
      return blockingUnaryCall(
              getChannel(), getAddSliceMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusResponse> deviceReport(
            org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusRequest request) {
      return blockingServerStreamingCall(
              getChannel(), getDeviceReportMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SliceServiceFutureStub extends io.grpc.stub.AbstractStub<SliceServiceFutureStub> {
    private SliceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SliceServiceFutureStub(io.grpc.Channel channel,
                                   io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SliceServiceFutureStub build(io.grpc.Channel channel,
                                           io.grpc.CallOptions callOptions) {
      return new SliceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse> addSlice(
            org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest request) {
      return futureUnaryCall(
              getChannel().newCall(getAddSliceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_SLICE = 0;
  private static final int METHODID_DEVICE_REPORT = 1;

  private static final class MethodHandlers<Req, Resp> implements
          io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SliceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SliceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_SLICE:
          serviceImpl.addSlice((org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest) request,
                  (io.grpc.stub.StreamObserver<org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse>) responseObserver);
          break;
        case METHODID_DEVICE_REPORT:
          serviceImpl.deviceReport((org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusRequest) request,
                  (io.grpc.stub.StreamObserver<org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusResponse>) responseObserver);
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

  private static abstract class SliceServiceBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SliceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.etri.onosslice.sliceservice.ONOSSliceService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SliceService");
    }
  }

  private static final class SliceServiceFileDescriptorSupplier
          extends SliceServiceBaseDescriptorSupplier {
    SliceServiceFileDescriptorSupplier() {}
  }

  private static final class SliceServiceMethodDescriptorSupplier
          extends SliceServiceBaseDescriptorSupplier
          implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SliceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SliceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                  .setSchemaDescriptor(new SliceServiceFileDescriptorSupplier())
                  .addMethod(getAddSliceMethod())
                  .addMethod(getDeviceReportMethod())
                  .build();
        }
      }
    }
    return result;
  }
}
