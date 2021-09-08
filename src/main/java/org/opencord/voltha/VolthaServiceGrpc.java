package org.opencord.voltha;

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
 * Voltha APIs
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: voltha_protos/voltha.proto")
public final class VolthaServiceGrpc {

  private VolthaServiceGrpc() {}

  public static final String SERVICE_NAME = "voltha.VolthaService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaProtos.Membership> getGetMembershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMembership",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.opencord.voltha.VolthaProtos.Membership.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaProtos.Membership> getGetMembershipMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.opencord.voltha.VolthaProtos.Membership> getGetMembershipMethod;
    if ((getGetMembershipMethod = VolthaServiceGrpc.getGetMembershipMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetMembershipMethod = VolthaServiceGrpc.getGetMembershipMethod) == null) {
          VolthaServiceGrpc.getGetMembershipMethod = getGetMembershipMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.opencord.voltha.VolthaProtos.Membership>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetMembership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.Membership.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetMembership"))
                  .build();
          }
        }
     }
     return getGetMembershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.Membership,
      com.google.protobuf.Empty> getUpdateMembershipMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMembership",
      requestType = org.opencord.voltha.VolthaProtos.Membership.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.Membership,
      com.google.protobuf.Empty> getUpdateMembershipMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.Membership, com.google.protobuf.Empty> getUpdateMembershipMethod;
    if ((getUpdateMembershipMethod = VolthaServiceGrpc.getUpdateMembershipMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getUpdateMembershipMethod = VolthaServiceGrpc.getUpdateMembershipMethod) == null) {
          VolthaServiceGrpc.getUpdateMembershipMethod = getUpdateMembershipMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaProtos.Membership, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "UpdateMembership"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.Membership.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("UpdateMembership"))
                  .build();
          }
        }
     }
     return getUpdateMembershipMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaProtos.Voltha> getGetVolthaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetVoltha",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.opencord.voltha.VolthaProtos.Voltha.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaProtos.Voltha> getGetVolthaMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.opencord.voltha.VolthaProtos.Voltha> getGetVolthaMethod;
    if ((getGetVolthaMethod = VolthaServiceGrpc.getGetVolthaMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetVolthaMethod = VolthaServiceGrpc.getGetVolthaMethod) == null) {
          VolthaServiceGrpc.getGetVolthaMethod = getGetVolthaMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.opencord.voltha.VolthaProtos.Voltha>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetVoltha"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.Voltha.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetVoltha"))
                  .build();
          }
        }
     }
     return getGetVolthaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaProtos.CoreInstances> getListCoreInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListCoreInstances",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.opencord.voltha.VolthaProtos.CoreInstances.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaProtos.CoreInstances> getListCoreInstancesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.opencord.voltha.VolthaProtos.CoreInstances> getListCoreInstancesMethod;
    if ((getListCoreInstancesMethod = VolthaServiceGrpc.getListCoreInstancesMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListCoreInstancesMethod = VolthaServiceGrpc.getListCoreInstancesMethod) == null) {
          VolthaServiceGrpc.getListCoreInstancesMethod = getListCoreInstancesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.opencord.voltha.VolthaProtos.CoreInstances>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListCoreInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.CoreInstances.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListCoreInstances"))
                  .build();
          }
        }
     }
     return getListCoreInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaProtos.CoreInstance> getGetCoreInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCoreInstance",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.VolthaProtos.CoreInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaProtos.CoreInstance> getGetCoreInstanceMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaProtos.CoreInstance> getGetCoreInstanceMethod;
    if ((getGetCoreInstanceMethod = VolthaServiceGrpc.getGetCoreInstanceMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetCoreInstanceMethod = VolthaServiceGrpc.getGetCoreInstanceMethod) == null) {
          VolthaServiceGrpc.getGetCoreInstanceMethod = getGetCoreInstanceMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaProtos.CoreInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetCoreInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.CoreInstance.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetCoreInstance"))
                  .build();
          }
        }
     }
     return getGetCoreInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaAdapter.Adapters> getListAdaptersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAdapters",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.opencord.voltha.VolthaAdapter.Adapters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaAdapter.Adapters> getListAdaptersMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.opencord.voltha.VolthaAdapter.Adapters> getListAdaptersMethod;
    if ((getListAdaptersMethod = VolthaServiceGrpc.getListAdaptersMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListAdaptersMethod = VolthaServiceGrpc.getListAdaptersMethod) == null) {
          VolthaServiceGrpc.getListAdaptersMethod = getListAdaptersMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.opencord.voltha.VolthaAdapter.Adapters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListAdapters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaAdapter.Adapters.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListAdapters"))
                  .build();
          }
        }
     }
     return getListAdaptersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.OFLogicalDevice.LogicalDevices> getListLogicalDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogicalDevices",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.opencord.voltha.OFLogicalDevice.LogicalDevices.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.OFLogicalDevice.LogicalDevices> getListLogicalDevicesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.opencord.voltha.OFLogicalDevice.LogicalDevices> getListLogicalDevicesMethod;
    if ((getListLogicalDevicesMethod = VolthaServiceGrpc.getListLogicalDevicesMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListLogicalDevicesMethod = VolthaServiceGrpc.getListLogicalDevicesMethod) == null) {
          VolthaServiceGrpc.getListLogicalDevicesMethod = getListLogicalDevicesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.opencord.voltha.OFLogicalDevice.LogicalDevices>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListLogicalDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.OFLogicalDevice.LogicalDevices.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListLogicalDevices"))
                  .build();
          }
        }
     }
     return getListLogicalDevicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.OFLogicalDevice.LogicalDevice> getGetLogicalDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLogicalDevice",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.OFLogicalDevice.LogicalDevice.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.OFLogicalDevice.LogicalDevice> getGetLogicalDeviceMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.OFLogicalDevice.LogicalDevice> getGetLogicalDeviceMethod;
    if ((getGetLogicalDeviceMethod = VolthaServiceGrpc.getGetLogicalDeviceMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetLogicalDeviceMethod = VolthaServiceGrpc.getGetLogicalDeviceMethod) == null) {
          VolthaServiceGrpc.getGetLogicalDeviceMethod = getGetLogicalDeviceMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.OFLogicalDevice.LogicalDevice>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetLogicalDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.OFLogicalDevice.LogicalDevice.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetLogicalDevice"))
                  .build();
          }
        }
     }
     return getGetLogicalDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.OFLogicalDevice.LogicalPorts> getListLogicalDevicePortsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogicalDevicePorts",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.OFLogicalDevice.LogicalPorts.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.OFLogicalDevice.LogicalPorts> getListLogicalDevicePortsMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.OFLogicalDevice.LogicalPorts> getListLogicalDevicePortsMethod;
    if ((getListLogicalDevicePortsMethod = VolthaServiceGrpc.getListLogicalDevicePortsMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListLogicalDevicePortsMethod = VolthaServiceGrpc.getListLogicalDevicePortsMethod) == null) {
          VolthaServiceGrpc.getListLogicalDevicePortsMethod = getListLogicalDevicePortsMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.OFLogicalDevice.LogicalPorts>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListLogicalDevicePorts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.OFLogicalDevice.LogicalPorts.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListLogicalDevicePorts"))
                  .build();
          }
        }
     }
     return getListLogicalDevicePortsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.OFLogicalDevice.LogicalPortId,
      org.opencord.voltha.OFLogicalDevice.LogicalPort> getGetLogicalDevicePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLogicalDevicePort",
      requestType = org.opencord.voltha.OFLogicalDevice.LogicalPortId.class,
      responseType = org.opencord.voltha.OFLogicalDevice.LogicalPort.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.OFLogicalDevice.LogicalPortId,
      org.opencord.voltha.OFLogicalDevice.LogicalPort> getGetLogicalDevicePortMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.OFLogicalDevice.LogicalPortId, org.opencord.voltha.OFLogicalDevice.LogicalPort> getGetLogicalDevicePortMethod;
    if ((getGetLogicalDevicePortMethod = VolthaServiceGrpc.getGetLogicalDevicePortMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetLogicalDevicePortMethod = VolthaServiceGrpc.getGetLogicalDevicePortMethod) == null) {
          VolthaServiceGrpc.getGetLogicalDevicePortMethod = getGetLogicalDevicePortMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.OFLogicalDevice.LogicalPortId, org.opencord.voltha.OFLogicalDevice.LogicalPort>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetLogicalDevicePort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.OFLogicalDevice.LogicalPortId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.OFLogicalDevice.LogicalPort.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetLogicalDevicePort"))
                  .build();
          }
        }
     }
     return getGetLogicalDevicePortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.OFLogicalDevice.LogicalPortId,
      com.google.protobuf.Empty> getEnableLogicalDevicePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableLogicalDevicePort",
      requestType = org.opencord.voltha.OFLogicalDevice.LogicalPortId.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.OFLogicalDevice.LogicalPortId,
      com.google.protobuf.Empty> getEnableLogicalDevicePortMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.OFLogicalDevice.LogicalPortId, com.google.protobuf.Empty> getEnableLogicalDevicePortMethod;
    if ((getEnableLogicalDevicePortMethod = VolthaServiceGrpc.getEnableLogicalDevicePortMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getEnableLogicalDevicePortMethod = VolthaServiceGrpc.getEnableLogicalDevicePortMethod) == null) {
          VolthaServiceGrpc.getEnableLogicalDevicePortMethod = getEnableLogicalDevicePortMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.OFLogicalDevice.LogicalPortId, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "EnableLogicalDevicePort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.OFLogicalDevice.LogicalPortId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("EnableLogicalDevicePort"))
                  .build();
          }
        }
     }
     return getEnableLogicalDevicePortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.OFLogicalDevice.LogicalPortId,
      com.google.protobuf.Empty> getDisableLogicalDevicePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableLogicalDevicePort",
      requestType = org.opencord.voltha.OFLogicalDevice.LogicalPortId.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.OFLogicalDevice.LogicalPortId,
      com.google.protobuf.Empty> getDisableLogicalDevicePortMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.OFLogicalDevice.LogicalPortId, com.google.protobuf.Empty> getDisableLogicalDevicePortMethod;
    if ((getDisableLogicalDevicePortMethod = VolthaServiceGrpc.getDisableLogicalDevicePortMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getDisableLogicalDevicePortMethod = VolthaServiceGrpc.getDisableLogicalDevicePortMethod) == null) {
          VolthaServiceGrpc.getDisableLogicalDevicePortMethod = getDisableLogicalDevicePortMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.OFLogicalDevice.LogicalPortId, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "DisableLogicalDevicePort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.OFLogicalDevice.LogicalPortId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("DisableLogicalDevicePort"))
                  .build();
          }
        }
     }
     return getDisableLogicalDevicePortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.openflow13.Openflow13.Flows> getListLogicalDeviceFlowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogicalDeviceFlows",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.openflow13.Openflow13.Flows.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.openflow13.Openflow13.Flows> getListLogicalDeviceFlowsMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.openflow13.Openflow13.Flows> getListLogicalDeviceFlowsMethod;
    if ((getListLogicalDeviceFlowsMethod = VolthaServiceGrpc.getListLogicalDeviceFlowsMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListLogicalDeviceFlowsMethod = VolthaServiceGrpc.getListLogicalDeviceFlowsMethod) == null) {
          VolthaServiceGrpc.getListLogicalDeviceFlowsMethod = getListLogicalDeviceFlowsMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.openflow13.Openflow13.Flows>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListLogicalDeviceFlows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.openflow13.Openflow13.Flows.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListLogicalDeviceFlows"))
                  .build();
          }
        }
     }
     return getListLogicalDeviceFlowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.openflow13.Openflow13.FlowTableUpdate,
      com.google.protobuf.Empty> getUpdateLogicalDeviceFlowTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLogicalDeviceFlowTable",
      requestType = org.opencord.voltha.openflow13.Openflow13.FlowTableUpdate.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.openflow13.Openflow13.FlowTableUpdate,
      com.google.protobuf.Empty> getUpdateLogicalDeviceFlowTableMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.openflow13.Openflow13.FlowTableUpdate, com.google.protobuf.Empty> getUpdateLogicalDeviceFlowTableMethod;
    if ((getUpdateLogicalDeviceFlowTableMethod = VolthaServiceGrpc.getUpdateLogicalDeviceFlowTableMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getUpdateLogicalDeviceFlowTableMethod = VolthaServiceGrpc.getUpdateLogicalDeviceFlowTableMethod) == null) {
          VolthaServiceGrpc.getUpdateLogicalDeviceFlowTableMethod = getUpdateLogicalDeviceFlowTableMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.openflow13.Openflow13.FlowTableUpdate, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "UpdateLogicalDeviceFlowTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.openflow13.Openflow13.FlowTableUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("UpdateLogicalDeviceFlowTable"))
                  .build();
          }
        }
     }
     return getUpdateLogicalDeviceFlowTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.openflow13.Openflow13.MeterModUpdate,
      com.google.protobuf.Empty> getUpdateLogicalDeviceMeterTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLogicalDeviceMeterTable",
      requestType = org.opencord.voltha.openflow13.Openflow13.MeterModUpdate.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.openflow13.Openflow13.MeterModUpdate,
      com.google.protobuf.Empty> getUpdateLogicalDeviceMeterTableMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.openflow13.Openflow13.MeterModUpdate, com.google.protobuf.Empty> getUpdateLogicalDeviceMeterTableMethod;
    if ((getUpdateLogicalDeviceMeterTableMethod = VolthaServiceGrpc.getUpdateLogicalDeviceMeterTableMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getUpdateLogicalDeviceMeterTableMethod = VolthaServiceGrpc.getUpdateLogicalDeviceMeterTableMethod) == null) {
          VolthaServiceGrpc.getUpdateLogicalDeviceMeterTableMethod = getUpdateLogicalDeviceMeterTableMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.openflow13.Openflow13.MeterModUpdate, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "UpdateLogicalDeviceMeterTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.openflow13.Openflow13.MeterModUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("UpdateLogicalDeviceMeterTable"))
                  .build();
          }
        }
     }
     return getUpdateLogicalDeviceMeterTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.openflow13.Openflow13.Meters> getListLogicalDeviceMetersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogicalDeviceMeters",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.openflow13.Openflow13.Meters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.openflow13.Openflow13.Meters> getListLogicalDeviceMetersMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.openflow13.Openflow13.Meters> getListLogicalDeviceMetersMethod;
    if ((getListLogicalDeviceMetersMethod = VolthaServiceGrpc.getListLogicalDeviceMetersMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListLogicalDeviceMetersMethod = VolthaServiceGrpc.getListLogicalDeviceMetersMethod) == null) {
          VolthaServiceGrpc.getListLogicalDeviceMetersMethod = getListLogicalDeviceMetersMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.openflow13.Openflow13.Meters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListLogicalDeviceMeters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.openflow13.Openflow13.Meters.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListLogicalDeviceMeters"))
                  .build();
          }
        }
     }
     return getListLogicalDeviceMetersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.openflow13.Openflow13.FlowGroups> getListLogicalDeviceFlowGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListLogicalDeviceFlowGroups",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.openflow13.Openflow13.FlowGroups.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.openflow13.Openflow13.FlowGroups> getListLogicalDeviceFlowGroupsMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.openflow13.Openflow13.FlowGroups> getListLogicalDeviceFlowGroupsMethod;
    if ((getListLogicalDeviceFlowGroupsMethod = VolthaServiceGrpc.getListLogicalDeviceFlowGroupsMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListLogicalDeviceFlowGroupsMethod = VolthaServiceGrpc.getListLogicalDeviceFlowGroupsMethod) == null) {
          VolthaServiceGrpc.getListLogicalDeviceFlowGroupsMethod = getListLogicalDeviceFlowGroupsMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.openflow13.Openflow13.FlowGroups>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListLogicalDeviceFlowGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.openflow13.Openflow13.FlowGroups.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListLogicalDeviceFlowGroups"))
                  .build();
          }
        }
     }
     return getListLogicalDeviceFlowGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.openflow13.Openflow13.FlowGroupTableUpdate,
      com.google.protobuf.Empty> getUpdateLogicalDeviceFlowGroupTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateLogicalDeviceFlowGroupTable",
      requestType = org.opencord.voltha.openflow13.Openflow13.FlowGroupTableUpdate.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.openflow13.Openflow13.FlowGroupTableUpdate,
      com.google.protobuf.Empty> getUpdateLogicalDeviceFlowGroupTableMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.openflow13.Openflow13.FlowGroupTableUpdate, com.google.protobuf.Empty> getUpdateLogicalDeviceFlowGroupTableMethod;
    if ((getUpdateLogicalDeviceFlowGroupTableMethod = VolthaServiceGrpc.getUpdateLogicalDeviceFlowGroupTableMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getUpdateLogicalDeviceFlowGroupTableMethod = VolthaServiceGrpc.getUpdateLogicalDeviceFlowGroupTableMethod) == null) {
          VolthaServiceGrpc.getUpdateLogicalDeviceFlowGroupTableMethod = getUpdateLogicalDeviceFlowGroupTableMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.openflow13.Openflow13.FlowGroupTableUpdate, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "UpdateLogicalDeviceFlowGroupTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.openflow13.Openflow13.FlowGroupTableUpdate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("UpdateLogicalDeviceFlowGroupTable"))
                  .build();
          }
        }
     }
     return getUpdateLogicalDeviceFlowGroupTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaDevice.Devices> getListDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDevices",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.opencord.voltha.VolthaDevice.Devices.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaDevice.Devices> getListDevicesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.opencord.voltha.VolthaDevice.Devices> getListDevicesMethod;
    if ((getListDevicesMethod = VolthaServiceGrpc.getListDevicesMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListDevicesMethod = VolthaServiceGrpc.getListDevicesMethod) == null) {
          VolthaServiceGrpc.getListDevicesMethod = getListDevicesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.opencord.voltha.VolthaDevice.Devices>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.Devices.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListDevices"))
                  .build();
          }
        }
     }
     return getListDevicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.Common.IDs> getListDeviceIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeviceIds",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.opencord.voltha.Common.IDs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.Common.IDs> getListDeviceIdsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.opencord.voltha.Common.IDs> getListDeviceIdsMethod;
    if ((getListDeviceIdsMethod = VolthaServiceGrpc.getListDeviceIdsMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListDeviceIdsMethod = VolthaServiceGrpc.getListDeviceIdsMethod) == null) {
          VolthaServiceGrpc.getListDeviceIdsMethod = getListDeviceIdsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.opencord.voltha.Common.IDs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListDeviceIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.IDs.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListDeviceIds"))
                  .build();
          }
        }
     }
     return getListDeviceIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.IDs,
      com.google.protobuf.Empty> getReconcileDevicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReconcileDevices",
      requestType = org.opencord.voltha.Common.IDs.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.IDs,
      com.google.protobuf.Empty> getReconcileDevicesMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.IDs, com.google.protobuf.Empty> getReconcileDevicesMethod;
    if ((getReconcileDevicesMethod = VolthaServiceGrpc.getReconcileDevicesMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getReconcileDevicesMethod = VolthaServiceGrpc.getReconcileDevicesMethod) == null) {
          VolthaServiceGrpc.getReconcileDevicesMethod = getReconcileDevicesMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.IDs, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ReconcileDevices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.IDs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ReconcileDevices"))
                  .build();
          }
        }
     }
     return getReconcileDevicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.Device> getGetDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDevice",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.VolthaDevice.Device.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.Device> getGetDeviceMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.Device> getGetDeviceMethod;
    if ((getGetDeviceMethod = VolthaServiceGrpc.getGetDeviceMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetDeviceMethod = VolthaServiceGrpc.getGetDeviceMethod) == null) {
          VolthaServiceGrpc.getGetDeviceMethod = getGetDeviceMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.Device>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.Device.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetDevice"))
                  .build();
          }
        }
     }
     return getGetDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.Device,
      org.opencord.voltha.VolthaDevice.Device> getCreateDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDevice",
      requestType = org.opencord.voltha.VolthaDevice.Device.class,
      responseType = org.opencord.voltha.VolthaDevice.Device.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.Device,
      org.opencord.voltha.VolthaDevice.Device> getCreateDeviceMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.Device, org.opencord.voltha.VolthaDevice.Device> getCreateDeviceMethod;
    if ((getCreateDeviceMethod = VolthaServiceGrpc.getCreateDeviceMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getCreateDeviceMethod = VolthaServiceGrpc.getCreateDeviceMethod) == null) {
          VolthaServiceGrpc.getCreateDeviceMethod = getCreateDeviceMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaDevice.Device, org.opencord.voltha.VolthaDevice.Device>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "CreateDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.Device.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.Device.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("CreateDevice"))
                  .build();
          }
        }
     }
     return getCreateDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      com.google.protobuf.Empty> getEnableDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableDevice",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      com.google.protobuf.Empty> getEnableDeviceMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, com.google.protobuf.Empty> getEnableDeviceMethod;
    if ((getEnableDeviceMethod = VolthaServiceGrpc.getEnableDeviceMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getEnableDeviceMethod = VolthaServiceGrpc.getEnableDeviceMethod) == null) {
          VolthaServiceGrpc.getEnableDeviceMethod = getEnableDeviceMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "EnableDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("EnableDevice"))
                  .build();
          }
        }
     }
     return getEnableDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      com.google.protobuf.Empty> getDisableDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableDevice",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      com.google.protobuf.Empty> getDisableDeviceMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, com.google.protobuf.Empty> getDisableDeviceMethod;
    if ((getDisableDeviceMethod = VolthaServiceGrpc.getDisableDeviceMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getDisableDeviceMethod = VolthaServiceGrpc.getDisableDeviceMethod) == null) {
          VolthaServiceGrpc.getDisableDeviceMethod = getDisableDeviceMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "DisableDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("DisableDevice"))
                  .build();
          }
        }
     }
     return getDisableDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      com.google.protobuf.Empty> getRebootDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RebootDevice",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      com.google.protobuf.Empty> getRebootDeviceMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, com.google.protobuf.Empty> getRebootDeviceMethod;
    if ((getRebootDeviceMethod = VolthaServiceGrpc.getRebootDeviceMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getRebootDeviceMethod = VolthaServiceGrpc.getRebootDeviceMethod) == null) {
          VolthaServiceGrpc.getRebootDeviceMethod = getRebootDeviceMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "RebootDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("RebootDevice"))
                  .build();
          }
        }
     }
     return getRebootDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      com.google.protobuf.Empty> getDeleteDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDevice",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      com.google.protobuf.Empty> getDeleteDeviceMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, com.google.protobuf.Empty> getDeleteDeviceMethod;
    if ((getDeleteDeviceMethod = VolthaServiceGrpc.getDeleteDeviceMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getDeleteDeviceMethod = VolthaServiceGrpc.getDeleteDeviceMethod) == null) {
          VolthaServiceGrpc.getDeleteDeviceMethod = getDeleteDeviceMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "DeleteDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("DeleteDevice"))
                  .build();
          }
        }
     }
     return getDeleteDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      com.google.protobuf.Empty> getForceDeleteDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ForceDeleteDevice",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      com.google.protobuf.Empty> getForceDeleteDeviceMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, com.google.protobuf.Empty> getForceDeleteDeviceMethod;
    if ((getForceDeleteDeviceMethod = VolthaServiceGrpc.getForceDeleteDeviceMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getForceDeleteDeviceMethod = VolthaServiceGrpc.getForceDeleteDeviceMethod) == null) {
          VolthaServiceGrpc.getForceDeleteDeviceMethod = getForceDeleteDeviceMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ForceDeleteDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ForceDeleteDevice"))
                  .build();
          }
        }
     }
     return getForceDeleteDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload,
      org.opencord.voltha.Common.OperationResp> getDownloadImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadImage",
      requestType = org.opencord.voltha.VolthaDevice.ImageDownload.class,
      responseType = org.opencord.voltha.Common.OperationResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload,
      org.opencord.voltha.Common.OperationResp> getDownloadImageMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload, org.opencord.voltha.Common.OperationResp> getDownloadImageMethod;
    if ((getDownloadImageMethod = VolthaServiceGrpc.getDownloadImageMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getDownloadImageMethod = VolthaServiceGrpc.getDownloadImageMethod) == null) {
          VolthaServiceGrpc.getDownloadImageMethod = getDownloadImageMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaDevice.ImageDownload, org.opencord.voltha.Common.OperationResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "DownloadImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.ImageDownload.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.OperationResp.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("DownloadImage"))
                  .build();
          }
        }
     }
     return getDownloadImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload,
      org.opencord.voltha.VolthaDevice.ImageDownload> getGetImageDownloadStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImageDownloadStatus",
      requestType = org.opencord.voltha.VolthaDevice.ImageDownload.class,
      responseType = org.opencord.voltha.VolthaDevice.ImageDownload.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload,
      org.opencord.voltha.VolthaDevice.ImageDownload> getGetImageDownloadStatusMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload, org.opencord.voltha.VolthaDevice.ImageDownload> getGetImageDownloadStatusMethod;
    if ((getGetImageDownloadStatusMethod = VolthaServiceGrpc.getGetImageDownloadStatusMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetImageDownloadStatusMethod = VolthaServiceGrpc.getGetImageDownloadStatusMethod) == null) {
          VolthaServiceGrpc.getGetImageDownloadStatusMethod = getGetImageDownloadStatusMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaDevice.ImageDownload, org.opencord.voltha.VolthaDevice.ImageDownload>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetImageDownloadStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.ImageDownload.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.ImageDownload.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetImageDownloadStatus"))
                  .build();
          }
        }
     }
     return getGetImageDownloadStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload,
      org.opencord.voltha.VolthaDevice.ImageDownload> getGetImageDownloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImageDownload",
      requestType = org.opencord.voltha.VolthaDevice.ImageDownload.class,
      responseType = org.opencord.voltha.VolthaDevice.ImageDownload.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload,
      org.opencord.voltha.VolthaDevice.ImageDownload> getGetImageDownloadMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload, org.opencord.voltha.VolthaDevice.ImageDownload> getGetImageDownloadMethod;
    if ((getGetImageDownloadMethod = VolthaServiceGrpc.getGetImageDownloadMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetImageDownloadMethod = VolthaServiceGrpc.getGetImageDownloadMethod) == null) {
          VolthaServiceGrpc.getGetImageDownloadMethod = getGetImageDownloadMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaDevice.ImageDownload, org.opencord.voltha.VolthaDevice.ImageDownload>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetImageDownload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.ImageDownload.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.ImageDownload.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetImageDownload"))
                  .build();
          }
        }
     }
     return getGetImageDownloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.ImageDownloads> getListImageDownloadsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListImageDownloads",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.VolthaDevice.ImageDownloads.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.ImageDownloads> getListImageDownloadsMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.ImageDownloads> getListImageDownloadsMethod;
    if ((getListImageDownloadsMethod = VolthaServiceGrpc.getListImageDownloadsMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListImageDownloadsMethod = VolthaServiceGrpc.getListImageDownloadsMethod) == null) {
          VolthaServiceGrpc.getListImageDownloadsMethod = getListImageDownloadsMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.ImageDownloads>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListImageDownloads"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.ImageDownloads.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListImageDownloads"))
                  .build();
          }
        }
     }
     return getListImageDownloadsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload,
      org.opencord.voltha.Common.OperationResp> getCancelImageDownloadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelImageDownload",
      requestType = org.opencord.voltha.VolthaDevice.ImageDownload.class,
      responseType = org.opencord.voltha.Common.OperationResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload,
      org.opencord.voltha.Common.OperationResp> getCancelImageDownloadMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload, org.opencord.voltha.Common.OperationResp> getCancelImageDownloadMethod;
    if ((getCancelImageDownloadMethod = VolthaServiceGrpc.getCancelImageDownloadMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getCancelImageDownloadMethod = VolthaServiceGrpc.getCancelImageDownloadMethod) == null) {
          VolthaServiceGrpc.getCancelImageDownloadMethod = getCancelImageDownloadMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaDevice.ImageDownload, org.opencord.voltha.Common.OperationResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "CancelImageDownload"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.ImageDownload.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.OperationResp.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("CancelImageDownload"))
                  .build();
          }
        }
     }
     return getCancelImageDownloadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload,
      org.opencord.voltha.Common.OperationResp> getActivateImageUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateImageUpdate",
      requestType = org.opencord.voltha.VolthaDevice.ImageDownload.class,
      responseType = org.opencord.voltha.Common.OperationResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload,
      org.opencord.voltha.Common.OperationResp> getActivateImageUpdateMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload, org.opencord.voltha.Common.OperationResp> getActivateImageUpdateMethod;
    if ((getActivateImageUpdateMethod = VolthaServiceGrpc.getActivateImageUpdateMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getActivateImageUpdateMethod = VolthaServiceGrpc.getActivateImageUpdateMethod) == null) {
          VolthaServiceGrpc.getActivateImageUpdateMethod = getActivateImageUpdateMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaDevice.ImageDownload, org.opencord.voltha.Common.OperationResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ActivateImageUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.ImageDownload.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.OperationResp.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ActivateImageUpdate"))
                  .build();
          }
        }
     }
     return getActivateImageUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload,
      org.opencord.voltha.Common.OperationResp> getRevertImageUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RevertImageUpdate",
      requestType = org.opencord.voltha.VolthaDevice.ImageDownload.class,
      responseType = org.opencord.voltha.Common.OperationResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload,
      org.opencord.voltha.Common.OperationResp> getRevertImageUpdateMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.ImageDownload, org.opencord.voltha.Common.OperationResp> getRevertImageUpdateMethod;
    if ((getRevertImageUpdateMethod = VolthaServiceGrpc.getRevertImageUpdateMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getRevertImageUpdateMethod = VolthaServiceGrpc.getRevertImageUpdateMethod) == null) {
          VolthaServiceGrpc.getRevertImageUpdateMethod = getRevertImageUpdateMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaDevice.ImageDownload, org.opencord.voltha.Common.OperationResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "RevertImageUpdate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.ImageDownload.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.OperationResp.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("RevertImageUpdate"))
                  .build();
          }
        }
     }
     return getRevertImageUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageDownloadRequest,
      org.opencord.voltha.VolthaProtos.DeviceImageResponse> getDownloadImageToDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadImageToDevice",
      requestType = org.opencord.voltha.VolthaProtos.DeviceImageDownloadRequest.class,
      responseType = org.opencord.voltha.VolthaProtos.DeviceImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageDownloadRequest,
      org.opencord.voltha.VolthaProtos.DeviceImageResponse> getDownloadImageToDeviceMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageDownloadRequest, org.opencord.voltha.VolthaProtos.DeviceImageResponse> getDownloadImageToDeviceMethod;
    if ((getDownloadImageToDeviceMethod = VolthaServiceGrpc.getDownloadImageToDeviceMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getDownloadImageToDeviceMethod = VolthaServiceGrpc.getDownloadImageToDeviceMethod) == null) {
          VolthaServiceGrpc.getDownloadImageToDeviceMethod = getDownloadImageToDeviceMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaProtos.DeviceImageDownloadRequest, org.opencord.voltha.VolthaProtos.DeviceImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "DownloadImageToDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.DeviceImageDownloadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.DeviceImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("DownloadImageToDevice"))
                  .build();
          }
        }
     }
     return getDownloadImageToDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageRequest,
      org.opencord.voltha.VolthaProtos.DeviceImageResponse> getGetImageStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImageStatus",
      requestType = org.opencord.voltha.VolthaProtos.DeviceImageRequest.class,
      responseType = org.opencord.voltha.VolthaProtos.DeviceImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageRequest,
      org.opencord.voltha.VolthaProtos.DeviceImageResponse> getGetImageStatusMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageRequest, org.opencord.voltha.VolthaProtos.DeviceImageResponse> getGetImageStatusMethod;
    if ((getGetImageStatusMethod = VolthaServiceGrpc.getGetImageStatusMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetImageStatusMethod = VolthaServiceGrpc.getGetImageStatusMethod) == null) {
          VolthaServiceGrpc.getGetImageStatusMethod = getGetImageStatusMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaProtos.DeviceImageRequest, org.opencord.voltha.VolthaProtos.DeviceImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetImageStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.DeviceImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.DeviceImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetImageStatus"))
                  .build();
          }
        }
     }
     return getGetImageStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageRequest,
      org.opencord.voltha.VolthaProtos.DeviceImageResponse> getAbortImageUpgradeToDeviceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AbortImageUpgradeToDevice",
      requestType = org.opencord.voltha.VolthaProtos.DeviceImageRequest.class,
      responseType = org.opencord.voltha.VolthaProtos.DeviceImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageRequest,
      org.opencord.voltha.VolthaProtos.DeviceImageResponse> getAbortImageUpgradeToDeviceMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageRequest, org.opencord.voltha.VolthaProtos.DeviceImageResponse> getAbortImageUpgradeToDeviceMethod;
    if ((getAbortImageUpgradeToDeviceMethod = VolthaServiceGrpc.getAbortImageUpgradeToDeviceMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getAbortImageUpgradeToDeviceMethod = VolthaServiceGrpc.getAbortImageUpgradeToDeviceMethod) == null) {
          VolthaServiceGrpc.getAbortImageUpgradeToDeviceMethod = getAbortImageUpgradeToDeviceMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaProtos.DeviceImageRequest, org.opencord.voltha.VolthaProtos.DeviceImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "AbortImageUpgradeToDevice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.DeviceImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.DeviceImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("AbortImageUpgradeToDevice"))
                  .build();
          }
        }
     }
     return getAbortImageUpgradeToDeviceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.OnuImages> getGetOnuImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOnuImages",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.VolthaDevice.OnuImages.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.OnuImages> getGetOnuImagesMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.OnuImages> getGetOnuImagesMethod;
    if ((getGetOnuImagesMethod = VolthaServiceGrpc.getGetOnuImagesMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetOnuImagesMethod = VolthaServiceGrpc.getGetOnuImagesMethod) == null) {
          VolthaServiceGrpc.getGetOnuImagesMethod = getGetOnuImagesMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.OnuImages>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetOnuImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.OnuImages.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetOnuImages"))
                  .build();
          }
        }
     }
     return getGetOnuImagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageRequest,
      org.opencord.voltha.VolthaProtos.DeviceImageResponse> getActivateImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ActivateImage",
      requestType = org.opencord.voltha.VolthaProtos.DeviceImageRequest.class,
      responseType = org.opencord.voltha.VolthaProtos.DeviceImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageRequest,
      org.opencord.voltha.VolthaProtos.DeviceImageResponse> getActivateImageMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageRequest, org.opencord.voltha.VolthaProtos.DeviceImageResponse> getActivateImageMethod;
    if ((getActivateImageMethod = VolthaServiceGrpc.getActivateImageMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getActivateImageMethod = VolthaServiceGrpc.getActivateImageMethod) == null) {
          VolthaServiceGrpc.getActivateImageMethod = getActivateImageMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaProtos.DeviceImageRequest, org.opencord.voltha.VolthaProtos.DeviceImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ActivateImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.DeviceImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.DeviceImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ActivateImage"))
                  .build();
          }
        }
     }
     return getActivateImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageRequest,
      org.opencord.voltha.VolthaProtos.DeviceImageResponse> getCommitImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommitImage",
      requestType = org.opencord.voltha.VolthaProtos.DeviceImageRequest.class,
      responseType = org.opencord.voltha.VolthaProtos.DeviceImageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageRequest,
      org.opencord.voltha.VolthaProtos.DeviceImageResponse> getCommitImageMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.DeviceImageRequest, org.opencord.voltha.VolthaProtos.DeviceImageResponse> getCommitImageMethod;
    if ((getCommitImageMethod = VolthaServiceGrpc.getCommitImageMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getCommitImageMethod = VolthaServiceGrpc.getCommitImageMethod) == null) {
          VolthaServiceGrpc.getCommitImageMethod = getCommitImageMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaProtos.DeviceImageRequest, org.opencord.voltha.VolthaProtos.DeviceImageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "CommitImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.DeviceImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.DeviceImageResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("CommitImage"))
                  .build();
          }
        }
     }
     return getCommitImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.Ports> getListDevicePortsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDevicePorts",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.VolthaDevice.Ports.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.Ports> getListDevicePortsMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.Ports> getListDevicePortsMethod;
    if ((getListDevicePortsMethod = VolthaServiceGrpc.getListDevicePortsMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListDevicePortsMethod = VolthaServiceGrpc.getListDevicePortsMethod) == null) {
          VolthaServiceGrpc.getListDevicePortsMethod = getListDevicePortsMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.Ports>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListDevicePorts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.Ports.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListDevicePorts"))
                  .build();
          }
        }
     }
     return getListDevicePortsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.PmConfigs> getListDevicePmConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDevicePmConfigs",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.VolthaDevice.PmConfigs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.PmConfigs> getListDevicePmConfigsMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.PmConfigs> getListDevicePmConfigsMethod;
    if ((getListDevicePmConfigsMethod = VolthaServiceGrpc.getListDevicePmConfigsMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListDevicePmConfigsMethod = VolthaServiceGrpc.getListDevicePmConfigsMethod) == null) {
          VolthaServiceGrpc.getListDevicePmConfigsMethod = getListDevicePmConfigsMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.PmConfigs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListDevicePmConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.PmConfigs.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListDevicePmConfigs"))
                  .build();
          }
        }
     }
     return getListDevicePmConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.PmConfigs,
      com.google.protobuf.Empty> getUpdateDevicePmConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDevicePmConfigs",
      requestType = org.opencord.voltha.VolthaDevice.PmConfigs.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.PmConfigs,
      com.google.protobuf.Empty> getUpdateDevicePmConfigsMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.PmConfigs, com.google.protobuf.Empty> getUpdateDevicePmConfigsMethod;
    if ((getUpdateDevicePmConfigsMethod = VolthaServiceGrpc.getUpdateDevicePmConfigsMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getUpdateDevicePmConfigsMethod = VolthaServiceGrpc.getUpdateDevicePmConfigsMethod) == null) {
          VolthaServiceGrpc.getUpdateDevicePmConfigsMethod = getUpdateDevicePmConfigsMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaDevice.PmConfigs, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "UpdateDevicePmConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.PmConfigs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("UpdateDevicePmConfigs"))
                  .build();
          }
        }
     }
     return getUpdateDevicePmConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.openflow13.Openflow13.Flows> getListDeviceFlowsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeviceFlows",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.openflow13.Openflow13.Flows.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.openflow13.Openflow13.Flows> getListDeviceFlowsMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.openflow13.Openflow13.Flows> getListDeviceFlowsMethod;
    if ((getListDeviceFlowsMethod = VolthaServiceGrpc.getListDeviceFlowsMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListDeviceFlowsMethod = VolthaServiceGrpc.getListDeviceFlowsMethod) == null) {
          VolthaServiceGrpc.getListDeviceFlowsMethod = getListDeviceFlowsMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.openflow13.Openflow13.Flows>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListDeviceFlows"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.openflow13.Openflow13.Flows.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListDeviceFlows"))
                  .build();
          }
        }
     }
     return getListDeviceFlowsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.openflow13.Openflow13.FlowGroups> getListDeviceFlowGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeviceFlowGroups",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.openflow13.Openflow13.FlowGroups.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.openflow13.Openflow13.FlowGroups> getListDeviceFlowGroupsMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.openflow13.Openflow13.FlowGroups> getListDeviceFlowGroupsMethod;
    if ((getListDeviceFlowGroupsMethod = VolthaServiceGrpc.getListDeviceFlowGroupsMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListDeviceFlowGroupsMethod = VolthaServiceGrpc.getListDeviceFlowGroupsMethod) == null) {
          VolthaServiceGrpc.getListDeviceFlowGroupsMethod = getListDeviceFlowGroupsMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.openflow13.Openflow13.FlowGroups>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListDeviceFlowGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.openflow13.Openflow13.FlowGroups.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListDeviceFlowGroups"))
                  .build();
          }
        }
     }
     return getListDeviceFlowGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaDevice.DeviceTypes> getListDeviceTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeviceTypes",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.opencord.voltha.VolthaDevice.DeviceTypes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaDevice.DeviceTypes> getListDeviceTypesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.opencord.voltha.VolthaDevice.DeviceTypes> getListDeviceTypesMethod;
    if ((getListDeviceTypesMethod = VolthaServiceGrpc.getListDeviceTypesMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListDeviceTypesMethod = VolthaServiceGrpc.getListDeviceTypesMethod) == null) {
          VolthaServiceGrpc.getListDeviceTypesMethod = getListDeviceTypesMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.opencord.voltha.VolthaDevice.DeviceTypes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListDeviceTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.DeviceTypes.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListDeviceTypes"))
                  .build();
          }
        }
     }
     return getListDeviceTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.DeviceType> getGetDeviceTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeviceType",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.VolthaDevice.DeviceType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.DeviceType> getGetDeviceTypeMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.DeviceType> getGetDeviceTypeMethod;
    if ((getGetDeviceTypeMethod = VolthaServiceGrpc.getGetDeviceTypeMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetDeviceTypeMethod = VolthaServiceGrpc.getGetDeviceTypeMethod) == null) {
          VolthaServiceGrpc.getGetDeviceTypeMethod = getGetDeviceTypeMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.DeviceType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetDeviceType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.DeviceType.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetDeviceType"))
                  .build();
          }
        }
     }
     return getGetDeviceTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaProtos.DeviceGroups> getListDeviceGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDeviceGroups",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.opencord.voltha.VolthaProtos.DeviceGroups.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaProtos.DeviceGroups> getListDeviceGroupsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.opencord.voltha.VolthaProtos.DeviceGroups> getListDeviceGroupsMethod;
    if ((getListDeviceGroupsMethod = VolthaServiceGrpc.getListDeviceGroupsMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListDeviceGroupsMethod = VolthaServiceGrpc.getListDeviceGroupsMethod) == null) {
          VolthaServiceGrpc.getListDeviceGroupsMethod = getListDeviceGroupsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.opencord.voltha.VolthaProtos.DeviceGroups>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListDeviceGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.DeviceGroups.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListDeviceGroups"))
                  .build();
          }
        }
     }
     return getListDeviceGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.openflow13.Openflow13.PacketOut,
      com.google.protobuf.Empty> getStreamPacketsOutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StreamPacketsOut",
      requestType = org.opencord.voltha.openflow13.Openflow13.PacketOut.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.openflow13.Openflow13.PacketOut,
      com.google.protobuf.Empty> getStreamPacketsOutMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.openflow13.Openflow13.PacketOut, com.google.protobuf.Empty> getStreamPacketsOutMethod;
    if ((getStreamPacketsOutMethod = VolthaServiceGrpc.getStreamPacketsOutMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getStreamPacketsOutMethod = VolthaServiceGrpc.getStreamPacketsOutMethod) == null) {
          VolthaServiceGrpc.getStreamPacketsOutMethod = getStreamPacketsOutMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.openflow13.Openflow13.PacketOut, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "StreamPacketsOut"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.openflow13.Openflow13.PacketOut.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("StreamPacketsOut"))
                  .build();
          }
        }
     }
     return getStreamPacketsOutMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.openflow13.Openflow13.PacketIn> getReceivePacketsInMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReceivePacketsIn",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.opencord.voltha.openflow13.Openflow13.PacketIn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.openflow13.Openflow13.PacketIn> getReceivePacketsInMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.opencord.voltha.openflow13.Openflow13.PacketIn> getReceivePacketsInMethod;
    if ((getReceivePacketsInMethod = VolthaServiceGrpc.getReceivePacketsInMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getReceivePacketsInMethod = VolthaServiceGrpc.getReceivePacketsInMethod) == null) {
          VolthaServiceGrpc.getReceivePacketsInMethod = getReceivePacketsInMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.opencord.voltha.openflow13.Openflow13.PacketIn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ReceivePacketsIn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.openflow13.Openflow13.PacketIn.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ReceivePacketsIn"))
                  .build();
          }
        }
     }
     return getReceivePacketsInMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.openflow13.Openflow13.ChangeEvent> getReceiveChangeEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReceiveChangeEvents",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.opencord.voltha.openflow13.Openflow13.ChangeEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.openflow13.Openflow13.ChangeEvent> getReceiveChangeEventsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.opencord.voltha.openflow13.Openflow13.ChangeEvent> getReceiveChangeEventsMethod;
    if ((getReceiveChangeEventsMethod = VolthaServiceGrpc.getReceiveChangeEventsMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getReceiveChangeEventsMethod = VolthaServiceGrpc.getReceiveChangeEventsMethod) == null) {
          VolthaServiceGrpc.getReceiveChangeEventsMethod = getReceiveChangeEventsMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.opencord.voltha.openflow13.Openflow13.ChangeEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ReceiveChangeEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.openflow13.Openflow13.ChangeEvent.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ReceiveChangeEvents"))
                  .build();
          }
        }
     }
     return getReceiveChangeEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaProtos.DeviceGroup> getGetDeviceGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetDeviceGroup",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.VolthaProtos.DeviceGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaProtos.DeviceGroup> getGetDeviceGroupMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaProtos.DeviceGroup> getGetDeviceGroupMethod;
    if ((getGetDeviceGroupMethod = VolthaServiceGrpc.getGetDeviceGroupMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetDeviceGroupMethod = VolthaServiceGrpc.getGetDeviceGroupMethod) == null) {
          VolthaServiceGrpc.getGetDeviceGroupMethod = getGetDeviceGroupMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaProtos.DeviceGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetDeviceGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.DeviceGroup.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetDeviceGroup"))
                  .build();
          }
        }
     }
     return getGetDeviceGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.EventFilter,
      org.opencord.voltha.VolthaProtos.EventFilter> getCreateEventFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateEventFilter",
      requestType = org.opencord.voltha.VolthaProtos.EventFilter.class,
      responseType = org.opencord.voltha.VolthaProtos.EventFilter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.EventFilter,
      org.opencord.voltha.VolthaProtos.EventFilter> getCreateEventFilterMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.EventFilter, org.opencord.voltha.VolthaProtos.EventFilter> getCreateEventFilterMethod;
    if ((getCreateEventFilterMethod = VolthaServiceGrpc.getCreateEventFilterMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getCreateEventFilterMethod = VolthaServiceGrpc.getCreateEventFilterMethod) == null) {
          VolthaServiceGrpc.getCreateEventFilterMethod = getCreateEventFilterMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaProtos.EventFilter, org.opencord.voltha.VolthaProtos.EventFilter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "CreateEventFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.EventFilter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.EventFilter.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("CreateEventFilter"))
                  .build();
          }
        }
     }
     return getCreateEventFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaProtos.EventFilters> getGetEventFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetEventFilter",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.VolthaProtos.EventFilters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaProtos.EventFilters> getGetEventFilterMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaProtos.EventFilters> getGetEventFilterMethod;
    if ((getGetEventFilterMethod = VolthaServiceGrpc.getGetEventFilterMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetEventFilterMethod = VolthaServiceGrpc.getGetEventFilterMethod) == null) {
          VolthaServiceGrpc.getGetEventFilterMethod = getGetEventFilterMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaProtos.EventFilters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetEventFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.EventFilters.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetEventFilter"))
                  .build();
          }
        }
     }
     return getGetEventFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.EventFilter,
      org.opencord.voltha.VolthaProtos.EventFilter> getUpdateEventFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateEventFilter",
      requestType = org.opencord.voltha.VolthaProtos.EventFilter.class,
      responseType = org.opencord.voltha.VolthaProtos.EventFilter.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.EventFilter,
      org.opencord.voltha.VolthaProtos.EventFilter> getUpdateEventFilterMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.EventFilter, org.opencord.voltha.VolthaProtos.EventFilter> getUpdateEventFilterMethod;
    if ((getUpdateEventFilterMethod = VolthaServiceGrpc.getUpdateEventFilterMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getUpdateEventFilterMethod = VolthaServiceGrpc.getUpdateEventFilterMethod) == null) {
          VolthaServiceGrpc.getUpdateEventFilterMethod = getUpdateEventFilterMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaProtos.EventFilter, org.opencord.voltha.VolthaProtos.EventFilter>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "UpdateEventFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.EventFilter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.EventFilter.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("UpdateEventFilter"))
                  .build();
          }
        }
     }
     return getUpdateEventFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.EventFilter,
      com.google.protobuf.Empty> getDeleteEventFilterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteEventFilter",
      requestType = org.opencord.voltha.VolthaProtos.EventFilter.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.EventFilter,
      com.google.protobuf.Empty> getDeleteEventFilterMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.EventFilter, com.google.protobuf.Empty> getDeleteEventFilterMethod;
    if ((getDeleteEventFilterMethod = VolthaServiceGrpc.getDeleteEventFilterMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getDeleteEventFilterMethod = VolthaServiceGrpc.getDeleteEventFilterMethod) == null) {
          VolthaServiceGrpc.getDeleteEventFilterMethod = getDeleteEventFilterMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaProtos.EventFilter, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "DeleteEventFilter"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.EventFilter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("DeleteEventFilter"))
                  .build();
          }
        }
     }
     return getDeleteEventFilterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaProtos.EventFilters> getListEventFiltersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListEventFilters",
      requestType = com.google.protobuf.Empty.class,
      responseType = org.opencord.voltha.VolthaProtos.EventFilters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      org.opencord.voltha.VolthaProtos.EventFilters> getListEventFiltersMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, org.opencord.voltha.VolthaProtos.EventFilters> getListEventFiltersMethod;
    if ((getListEventFiltersMethod = VolthaServiceGrpc.getListEventFiltersMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getListEventFiltersMethod = VolthaServiceGrpc.getListEventFiltersMethod) == null) {
          VolthaServiceGrpc.getListEventFiltersMethod = getListEventFiltersMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, org.opencord.voltha.VolthaProtos.EventFilters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "ListEventFilters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.EventFilters.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("ListEventFilters"))
                  .build();
          }
        }
     }
     return getListEventFiltersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.Images> getGetImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImages",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.VolthaDevice.Images.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaDevice.Images> getGetImagesMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.Images> getGetImagesMethod;
    if ((getGetImagesMethod = VolthaServiceGrpc.getGetImagesMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetImagesMethod = VolthaServiceGrpc.getGetImagesMethod) == null) {
          VolthaServiceGrpc.getGetImagesMethod = getGetImagesMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaDevice.Images>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.Images.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetImages"))
                  .build();
          }
        }
     }
     return getGetImagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaProtos.SelfTestResponse> getSelfTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SelfTest",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.VolthaProtos.SelfTestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.VolthaProtos.SelfTestResponse> getSelfTestMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaProtos.SelfTestResponse> getSelfTestMethod;
    if ((getSelfTestMethod = VolthaServiceGrpc.getSelfTestMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getSelfTestMethod = VolthaServiceGrpc.getSelfTestMethod) == null) {
          VolthaServiceGrpc.getSelfTestMethod = getSelfTestMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.VolthaProtos.SelfTestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "SelfTest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.SelfTestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("SelfTest"))
                  .build();
          }
        }
     }
     return getSelfTestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.omci.OmciMibDb.MibDeviceData> getGetMibDeviceDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMibDeviceData",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.omci.OmciMibDb.MibDeviceData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.omci.OmciMibDb.MibDeviceData> getGetMibDeviceDataMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.omci.OmciMibDb.MibDeviceData> getGetMibDeviceDataMethod;
    if ((getGetMibDeviceDataMethod = VolthaServiceGrpc.getGetMibDeviceDataMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetMibDeviceDataMethod = VolthaServiceGrpc.getGetMibDeviceDataMethod) == null) {
          VolthaServiceGrpc.getGetMibDeviceDataMethod = getGetMibDeviceDataMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.omci.OmciMibDb.MibDeviceData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetMibDeviceData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.omci.OmciMibDb.MibDeviceData.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetMibDeviceData"))
                  .build();
          }
        }
     }
     return getGetMibDeviceDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.omci.OmciAlarmDb.AlarmDeviceData> getGetAlarmDeviceDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAlarmDeviceData",
      requestType = org.opencord.voltha.Common.ID.class,
      responseType = org.opencord.voltha.omci.OmciAlarmDb.AlarmDeviceData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID,
      org.opencord.voltha.omci.OmciAlarmDb.AlarmDeviceData> getGetAlarmDeviceDataMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ID, org.opencord.voltha.omci.OmciAlarmDb.AlarmDeviceData> getGetAlarmDeviceDataMethod;
    if ((getGetAlarmDeviceDataMethod = VolthaServiceGrpc.getGetAlarmDeviceDataMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetAlarmDeviceDataMethod = VolthaServiceGrpc.getGetAlarmDeviceDataMethod) == null) {
          VolthaServiceGrpc.getGetAlarmDeviceDataMethod = getGetAlarmDeviceDataMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ID, org.opencord.voltha.omci.OmciAlarmDb.AlarmDeviceData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetAlarmDeviceData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ID.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.omci.OmciAlarmDb.AlarmDeviceData.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetAlarmDeviceData"))
                  .build();
          }
        }
     }
     return getGetAlarmDeviceDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.SimulateAlarmRequest,
      org.opencord.voltha.Common.OperationResp> getSimulateAlarmMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SimulateAlarm",
      requestType = org.opencord.voltha.VolthaDevice.SimulateAlarmRequest.class,
      responseType = org.opencord.voltha.Common.OperationResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.SimulateAlarmRequest,
      org.opencord.voltha.Common.OperationResp> getSimulateAlarmMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.SimulateAlarmRequest, org.opencord.voltha.Common.OperationResp> getSimulateAlarmMethod;
    if ((getSimulateAlarmMethod = VolthaServiceGrpc.getSimulateAlarmMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getSimulateAlarmMethod = VolthaServiceGrpc.getSimulateAlarmMethod) == null) {
          VolthaServiceGrpc.getSimulateAlarmMethod = getSimulateAlarmMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaDevice.SimulateAlarmRequest, org.opencord.voltha.Common.OperationResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "SimulateAlarm"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.SimulateAlarmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.OperationResp.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("SimulateAlarm"))
                  .build();
          }
        }
     }
     return getSimulateAlarmMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.OfAgentSubscriber,
      org.opencord.voltha.VolthaProtos.OfAgentSubscriber> getSubscribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subscribe",
      requestType = org.opencord.voltha.VolthaProtos.OfAgentSubscriber.class,
      responseType = org.opencord.voltha.VolthaProtos.OfAgentSubscriber.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.OfAgentSubscriber,
      org.opencord.voltha.VolthaProtos.OfAgentSubscriber> getSubscribeMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.OfAgentSubscriber, org.opencord.voltha.VolthaProtos.OfAgentSubscriber> getSubscribeMethod;
    if ((getSubscribeMethod = VolthaServiceGrpc.getSubscribeMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getSubscribeMethod = VolthaServiceGrpc.getSubscribeMethod) == null) {
          VolthaServiceGrpc.getSubscribeMethod = getSubscribeMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaProtos.OfAgentSubscriber, org.opencord.voltha.VolthaProtos.OfAgentSubscriber>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "Subscribe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.OfAgentSubscriber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.OfAgentSubscriber.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("Subscribe"))
                  .build();
          }
        }
     }
     return getSubscribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.Port,
      com.google.protobuf.Empty> getEnablePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnablePort",
      requestType = org.opencord.voltha.VolthaDevice.Port.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.Port,
      com.google.protobuf.Empty> getEnablePortMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.Port, com.google.protobuf.Empty> getEnablePortMethod;
    if ((getEnablePortMethod = VolthaServiceGrpc.getEnablePortMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getEnablePortMethod = VolthaServiceGrpc.getEnablePortMethod) == null) {
          VolthaServiceGrpc.getEnablePortMethod = getEnablePortMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaDevice.Port, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "EnablePort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.Port.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("EnablePort"))
                  .build();
          }
        }
     }
     return getEnablePortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.Port,
      com.google.protobuf.Empty> getDisablePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisablePort",
      requestType = org.opencord.voltha.VolthaDevice.Port.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.Port,
      com.google.protobuf.Empty> getDisablePortMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaDevice.Port, com.google.protobuf.Empty> getDisablePortMethod;
    if ((getDisablePortMethod = VolthaServiceGrpc.getDisablePortMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getDisablePortMethod = VolthaServiceGrpc.getDisablePortMethod) == null) {
          VolthaServiceGrpc.getDisablePortMethod = getDisablePortMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaDevice.Port, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "DisablePort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaDevice.Port.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("DisablePort"))
                  .build();
          }
        }
     }
     return getDisablePortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.Common.ValueSpecifier,
      org.opencord.voltha.Common.ReturnValues> getGetExtValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetExtValue",
      requestType = org.opencord.voltha.Common.ValueSpecifier.class,
      responseType = org.opencord.voltha.Common.ReturnValues.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.Common.ValueSpecifier,
      org.opencord.voltha.Common.ReturnValues> getGetExtValueMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.Common.ValueSpecifier, org.opencord.voltha.Common.ReturnValues> getGetExtValueMethod;
    if ((getGetExtValueMethod = VolthaServiceGrpc.getGetExtValueMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getGetExtValueMethod = VolthaServiceGrpc.getGetExtValueMethod) == null) {
          VolthaServiceGrpc.getGetExtValueMethod = getGetExtValueMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.Common.ValueSpecifier, org.opencord.voltha.Common.ReturnValues>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "GetExtValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ValueSpecifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.Common.ReturnValues.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("GetExtValue"))
                  .build();
          }
        }
     }
     return getGetExtValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.ValueSet,
      com.google.protobuf.Empty> getSetExtValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetExtValue",
      requestType = org.opencord.voltha.VolthaProtos.ValueSet.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.ValueSet,
      com.google.protobuf.Empty> getSetExtValueMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.ValueSet, com.google.protobuf.Empty> getSetExtValueMethod;
    if ((getSetExtValueMethod = VolthaServiceGrpc.getSetExtValueMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getSetExtValueMethod = VolthaServiceGrpc.getSetExtValueMethod) == null) {
          VolthaServiceGrpc.getSetExtValueMethod = getSetExtValueMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaProtos.ValueSet, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "SetExtValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.ValueSet.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("SetExtValue"))
                  .build();
          }
        }
     }
     return getSetExtValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.OmciTestRequest,
      org.opencord.voltha.VolthaProtos.TestResponse> getStartOmciTestActionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartOmciTestAction",
      requestType = org.opencord.voltha.VolthaProtos.OmciTestRequest.class,
      responseType = org.opencord.voltha.VolthaProtos.TestResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.OmciTestRequest,
      org.opencord.voltha.VolthaProtos.TestResponse> getStartOmciTestActionMethod() {
    io.grpc.MethodDescriptor<org.opencord.voltha.VolthaProtos.OmciTestRequest, org.opencord.voltha.VolthaProtos.TestResponse> getStartOmciTestActionMethod;
    if ((getStartOmciTestActionMethod = VolthaServiceGrpc.getStartOmciTestActionMethod) == null) {
      synchronized (VolthaServiceGrpc.class) {
        if ((getStartOmciTestActionMethod = VolthaServiceGrpc.getStartOmciTestActionMethod) == null) {
          VolthaServiceGrpc.getStartOmciTestActionMethod = getStartOmciTestActionMethod = 
              io.grpc.MethodDescriptor.<org.opencord.voltha.VolthaProtos.OmciTestRequest, org.opencord.voltha.VolthaProtos.TestResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "voltha.VolthaService", "StartOmciTestAction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.OmciTestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.opencord.voltha.VolthaProtos.TestResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new VolthaServiceMethodDescriptorSupplier("StartOmciTestAction"))
                  .build();
          }
        }
     }
     return getStartOmciTestActionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static VolthaServiceStub newStub(io.grpc.Channel channel) {
    return new VolthaServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static VolthaServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new VolthaServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static VolthaServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new VolthaServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Voltha APIs
   * </pre>
   */
  public static abstract class VolthaServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get the membership group of a Voltha Core
     * </pre>
     */
    public void getMembership(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.Membership> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMembershipMethod(), responseObserver);
    }

    /**
     * <pre>
     * Set the membership group of a Voltha Core
     * </pre>
     */
    public void updateMembership(org.opencord.voltha.VolthaProtos.Membership request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMembershipMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get high level information on the Voltha cluster
     * </pre>
     */
    public void getVoltha(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.Voltha> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVolthaMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all Voltha cluster core instances
     * </pre>
     */
    public void listCoreInstances(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.CoreInstances> responseObserver) {
      asyncUnimplementedUnaryCall(getListCoreInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get details on a Voltha cluster instance
     * </pre>
     */
    public void getCoreInstance(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.CoreInstance> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCoreInstanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all active adapters (plugins) in the Voltha cluster
     * </pre>
     */
    public void listAdapters(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaAdapter.Adapters> responseObserver) {
      asyncUnimplementedUnaryCall(getListAdaptersMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all logical devices managed by the Voltha cluster
     * </pre>
     */
    public void listLogicalDevices(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.OFLogicalDevice.LogicalDevices> responseObserver) {
      asyncUnimplementedUnaryCall(getListLogicalDevicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get additional information on a given logical device
     * </pre>
     */
    public void getLogicalDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.OFLogicalDevice.LogicalDevice> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLogicalDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * List ports of a logical device
     * </pre>
     */
    public void listLogicalDevicePorts(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.OFLogicalDevice.LogicalPorts> responseObserver) {
      asyncUnimplementedUnaryCall(getListLogicalDevicePortsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Gets a logical device port
     * </pre>
     */
    public void getLogicalDevicePort(org.opencord.voltha.OFLogicalDevice.LogicalPortId request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.OFLogicalDevice.LogicalPort> responseObserver) {
      asyncUnimplementedUnaryCall(getGetLogicalDevicePortMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enables a logical device port
     * </pre>
     */
    public void enableLogicalDevicePort(org.opencord.voltha.OFLogicalDevice.LogicalPortId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEnableLogicalDevicePortMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disables a logical device port
     * </pre>
     */
    public void disableLogicalDevicePort(org.opencord.voltha.OFLogicalDevice.LogicalPortId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDisableLogicalDevicePortMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all flows of a logical device
     * </pre>
     */
    public void listLogicalDeviceFlows(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.Flows> responseObserver) {
      asyncUnimplementedUnaryCall(getListLogicalDeviceFlowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update flow table for logical device
     * </pre>
     */
    public void updateLogicalDeviceFlowTable(org.opencord.voltha.openflow13.Openflow13.FlowTableUpdate request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLogicalDeviceFlowTableMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update meter table for logical device
     * </pre>
     */
    public void updateLogicalDeviceMeterTable(org.opencord.voltha.openflow13.Openflow13.MeterModUpdate request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLogicalDeviceMeterTableMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all meters of a logical device
     * </pre>
     */
    public void listLogicalDeviceMeters(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.Meters> responseObserver) {
      asyncUnimplementedUnaryCall(getListLogicalDeviceMetersMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all flow groups of a logical device
     * </pre>
     */
    public void listLogicalDeviceFlowGroups(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.FlowGroups> responseObserver) {
      asyncUnimplementedUnaryCall(getListLogicalDeviceFlowGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update group table for device
     * </pre>
     */
    public void updateLogicalDeviceFlowGroupTable(org.opencord.voltha.openflow13.Openflow13.FlowGroupTableUpdate request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateLogicalDeviceFlowGroupTableMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all physical devices controlled by the Voltha cluster
     * </pre>
     */
    public void listDevices(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Devices> responseObserver) {
      asyncUnimplementedUnaryCall(getListDevicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all physical devices IDs controlled by the Voltha cluster
     * </pre>
     */
    public void listDeviceIds(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.IDs> responseObserver) {
      asyncUnimplementedUnaryCall(getListDeviceIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request to a voltha Core to reconcile a set of devices based on their IDs
     * </pre>
     */
    public void reconcileDevices(org.opencord.voltha.Common.IDs request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getReconcileDevicesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get more information on a given physical device
     * </pre>
     */
    public void getDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Device> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Pre-provision a new physical device
     * </pre>
     */
    public void createDevice(org.opencord.voltha.VolthaDevice.Device request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Device> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enable a device.  If the device was in pre-provisioned state then it
     * will transition to ENABLED state.  If it was is DISABLED state then it
     * will transition to ENABLED state as well.
     * </pre>
     */
    public void enableDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEnableDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Disable a device
     * </pre>
     */
    public void disableDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDisableDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Reboot a device
     * </pre>
     */
    public void rebootDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRebootDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a device
     * </pre>
     */
    public void deleteDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Forcefully delete a device
     * </pre>
     */
    public void forceDeleteDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getForceDeleteDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Request an image download to the standby partition
     * of a device.
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public void downloadImage(org.opencord.voltha.VolthaDevice.ImageDownload request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get image download status on a device
     * The request retrieves progress on device and updates db record
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public void getImageDownloadStatus(org.opencord.voltha.VolthaDevice.ImageDownload request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.ImageDownload> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImageDownloadStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get image download db record
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public void getImageDownload(org.opencord.voltha.VolthaDevice.ImageDownload request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.ImageDownload> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImageDownloadMethod(), responseObserver);
    }

    /**
     * <pre>
     * List image download db records for a given device
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public void listImageDownloads(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.ImageDownloads> responseObserver) {
      asyncUnimplementedUnaryCall(getListImageDownloadsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Cancel an existing image download process on a device
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public void cancelImageDownload(org.opencord.voltha.VolthaDevice.ImageDownload request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp> responseObserver) {
      asyncUnimplementedUnaryCall(getCancelImageDownloadMethod(), responseObserver);
    }

    /**
     * <pre>
     * Activate the specified image at a standby partition
     * to active partition.
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * activated image running on device
     * Note that the call is expected to be non-blocking.
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public void activateImageUpdate(org.opencord.voltha.VolthaDevice.ImageDownload request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateImageUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Revert the specified image at standby partition
     * to active partition, and revert to previous image
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * previous image running on device
     * Note that the call is expected to be non-blocking.
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public void revertImageUpdate(org.opencord.voltha.VolthaDevice.ImageDownload request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp> responseObserver) {
      asyncUnimplementedUnaryCall(getRevertImageUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * Downloads a certain image to the standby partition of the devices
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public void downloadImageToDevice(org.opencord.voltha.VolthaProtos.DeviceImageDownloadRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDownloadImageToDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get image status on a number of devices devices
     * Polled from northbound systems to get state of download/activate/commit
     * </pre>
     */
    public void getImageStatus(org.opencord.voltha.VolthaProtos.DeviceImageRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImageStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Aborts the upgrade of an image on a device
     * To be used carefully, stops any further operations for the Image on the given devices
     * Might also stop if possible existing work, but no guarantees are given,
     * depends on implementation and procedure status.
     * </pre>
     */
    public void abortImageUpgradeToDevice(org.opencord.voltha.VolthaProtos.DeviceImageRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAbortImageUpgradeToDeviceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get Both Active and Standby image for a given device
     * </pre>
     */
    public void getOnuImages(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.OnuImages> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOnuImagesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Activate the specified image from a standby partition
     * to active partition.
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * activated image running on device
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public void activateImage(org.opencord.voltha.VolthaProtos.DeviceImageRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getActivateImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * Commit the specified image to be default.
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * activated image running on device upon next reboot
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public void commitImage(org.opencord.voltha.VolthaProtos.DeviceImageRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCommitImageMethod(), responseObserver);
    }

    /**
     * <pre>
     * List ports of a device
     * </pre>
     */
    public void listDevicePorts(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Ports> responseObserver) {
      asyncUnimplementedUnaryCall(getListDevicePortsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List pm config of a device
     * </pre>
     */
    public void listDevicePmConfigs(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.PmConfigs> responseObserver) {
      asyncUnimplementedUnaryCall(getListDevicePmConfigsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update the pm config of a device
     * </pre>
     */
    public void updateDevicePmConfigs(org.opencord.voltha.VolthaDevice.PmConfigs request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateDevicePmConfigsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all flows of a device
     * </pre>
     */
    public void listDeviceFlows(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.Flows> responseObserver) {
      asyncUnimplementedUnaryCall(getListDeviceFlowsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all flow groups of a device
     * </pre>
     */
    public void listDeviceFlowGroups(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.FlowGroups> responseObserver) {
      asyncUnimplementedUnaryCall(getListDeviceFlowGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List device types known to Voltha
     * </pre>
     */
    public void listDeviceTypes(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.DeviceTypes> responseObserver) {
      asyncUnimplementedUnaryCall(getListDeviceTypesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get additional information on a device type
     * </pre>
     */
    public void getDeviceType(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.DeviceType> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDeviceTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all device sharding groups
     * </pre>
     */
    public void listDeviceGroups(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceGroups> responseObserver) {
      asyncUnimplementedUnaryCall(getListDeviceGroupsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Stream control packets to the dataplane
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.PacketOut> streamPacketsOut(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamPacketsOutMethod(), responseObserver);
    }

    /**
     * <pre>
     * Receive control packet stream
     * </pre>
     */
    public void receivePacketsIn(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.PacketIn> responseObserver) {
      asyncUnimplementedUnaryCall(getReceivePacketsInMethod(), responseObserver);
    }

    /**
     * <pre>
     * This does not have an HTTP representation
     * </pre>
     */
    public void receiveChangeEvents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.ChangeEvent> responseObserver) {
      asyncUnimplementedUnaryCall(getReceiveChangeEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get additional information on a device group
     * </pre>
     */
    public void getDeviceGroup(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceGroup> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDeviceGroupMethod(), responseObserver);
    }

    /**
     */
    public void createEventFilter(org.opencord.voltha.VolthaProtos.EventFilter request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.EventFilter> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEventFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all filters present for a device
     * </pre>
     */
    public void getEventFilter(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.EventFilters> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEventFilterMethod(), responseObserver);
    }

    /**
     */
    public void updateEventFilter(org.opencord.voltha.VolthaProtos.EventFilter request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.EventFilter> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEventFilterMethod(), responseObserver);
    }

    /**
     */
    public void deleteEventFilter(org.opencord.voltha.VolthaProtos.EventFilter request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteEventFilterMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get all the filters present
     * </pre>
     */
    public void listEventFilters(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.EventFilters> responseObserver) {
      asyncUnimplementedUnaryCall(getListEventFiltersMethod(), responseObserver);
    }

    /**
     */
    public void getImages(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Images> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImagesMethod(), responseObserver);
    }

    /**
     */
    public void selfTest(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.SelfTestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSelfTestMethod(), responseObserver);
    }

    /**
     * <pre>
     * OpenOMCI MIB information
     * </pre>
     */
    public void getMibDeviceData(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.omci.OmciMibDb.MibDeviceData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMibDeviceDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * OpenOMCI ALARM information
     * </pre>
     */
    public void getAlarmDeviceData(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.omci.OmciAlarmDb.AlarmDeviceData> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAlarmDeviceDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * Simulate an Alarm
     * </pre>
     */
    public void simulateAlarm(org.opencord.voltha.VolthaDevice.SimulateAlarmRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp> responseObserver) {
      asyncUnimplementedUnaryCall(getSimulateAlarmMethod(), responseObserver);
    }

    /**
     */
    public void subscribe(org.opencord.voltha.VolthaProtos.OfAgentSubscriber request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.OfAgentSubscriber> responseObserver) {
      asyncUnimplementedUnaryCall(getSubscribeMethod(), responseObserver);
    }

    /**
     */
    public void enablePort(org.opencord.voltha.VolthaDevice.Port request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getEnablePortMethod(), responseObserver);
    }

    /**
     */
    public void disablePort(org.opencord.voltha.VolthaDevice.Port request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDisablePortMethod(), responseObserver);
    }

    /**
     */
    public void getExtValue(org.opencord.voltha.Common.ValueSpecifier request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.ReturnValues> responseObserver) {
      asyncUnimplementedUnaryCall(getGetExtValueMethod(), responseObserver);
    }

    /**
     */
    public void setExtValue(org.opencord.voltha.VolthaProtos.ValueSet request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSetExtValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * omci start and stop cli implementation
     * </pre>
     */
    public void startOmciTestAction(org.opencord.voltha.VolthaProtos.OmciTestRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.TestResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartOmciTestActionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMembershipMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.opencord.voltha.VolthaProtos.Membership>(
                  this, METHODID_GET_MEMBERSHIP)))
          .addMethod(
            getUpdateMembershipMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaProtos.Membership,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_MEMBERSHIP)))
          .addMethod(
            getGetVolthaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.opencord.voltha.VolthaProtos.Voltha>(
                  this, METHODID_GET_VOLTHA)))
          .addMethod(
            getListCoreInstancesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.opencord.voltha.VolthaProtos.CoreInstances>(
                  this, METHODID_LIST_CORE_INSTANCES)))
          .addMethod(
            getGetCoreInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.VolthaProtos.CoreInstance>(
                  this, METHODID_GET_CORE_INSTANCE)))
          .addMethod(
            getListAdaptersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.opencord.voltha.VolthaAdapter.Adapters>(
                  this, METHODID_LIST_ADAPTERS)))
          .addMethod(
            getListLogicalDevicesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.opencord.voltha.OFLogicalDevice.LogicalDevices>(
                  this, METHODID_LIST_LOGICAL_DEVICES)))
          .addMethod(
            getGetLogicalDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.OFLogicalDevice.LogicalDevice>(
                  this, METHODID_GET_LOGICAL_DEVICE)))
          .addMethod(
            getListLogicalDevicePortsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.OFLogicalDevice.LogicalPorts>(
                  this, METHODID_LIST_LOGICAL_DEVICE_PORTS)))
          .addMethod(
            getGetLogicalDevicePortMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.OFLogicalDevice.LogicalPortId,
                org.opencord.voltha.OFLogicalDevice.LogicalPort>(
                  this, METHODID_GET_LOGICAL_DEVICE_PORT)))
          .addMethod(
            getEnableLogicalDevicePortMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.OFLogicalDevice.LogicalPortId,
                com.google.protobuf.Empty>(
                  this, METHODID_ENABLE_LOGICAL_DEVICE_PORT)))
          .addMethod(
            getDisableLogicalDevicePortMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.OFLogicalDevice.LogicalPortId,
                com.google.protobuf.Empty>(
                  this, METHODID_DISABLE_LOGICAL_DEVICE_PORT)))
          .addMethod(
            getListLogicalDeviceFlowsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.openflow13.Openflow13.Flows>(
                  this, METHODID_LIST_LOGICAL_DEVICE_FLOWS)))
          .addMethod(
            getUpdateLogicalDeviceFlowTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.openflow13.Openflow13.FlowTableUpdate,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_LOGICAL_DEVICE_FLOW_TABLE)))
          .addMethod(
            getUpdateLogicalDeviceMeterTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.openflow13.Openflow13.MeterModUpdate,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_LOGICAL_DEVICE_METER_TABLE)))
          .addMethod(
            getListLogicalDeviceMetersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.openflow13.Openflow13.Meters>(
                  this, METHODID_LIST_LOGICAL_DEVICE_METERS)))
          .addMethod(
            getListLogicalDeviceFlowGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.openflow13.Openflow13.FlowGroups>(
                  this, METHODID_LIST_LOGICAL_DEVICE_FLOW_GROUPS)))
          .addMethod(
            getUpdateLogicalDeviceFlowGroupTableMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.openflow13.Openflow13.FlowGroupTableUpdate,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_LOGICAL_DEVICE_FLOW_GROUP_TABLE)))
          .addMethod(
            getListDevicesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.opencord.voltha.VolthaDevice.Devices>(
                  this, METHODID_LIST_DEVICES)))
          .addMethod(
            getListDeviceIdsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.opencord.voltha.Common.IDs>(
                  this, METHODID_LIST_DEVICE_IDS)))
          .addMethod(
            getReconcileDevicesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.IDs,
                com.google.protobuf.Empty>(
                  this, METHODID_RECONCILE_DEVICES)))
          .addMethod(
            getGetDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.VolthaDevice.Device>(
                  this, METHODID_GET_DEVICE)))
          .addMethod(
            getCreateDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaDevice.Device,
                org.opencord.voltha.VolthaDevice.Device>(
                  this, METHODID_CREATE_DEVICE)))
          .addMethod(
            getEnableDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                com.google.protobuf.Empty>(
                  this, METHODID_ENABLE_DEVICE)))
          .addMethod(
            getDisableDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                com.google.protobuf.Empty>(
                  this, METHODID_DISABLE_DEVICE)))
          .addMethod(
            getRebootDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                com.google.protobuf.Empty>(
                  this, METHODID_REBOOT_DEVICE)))
          .addMethod(
            getDeleteDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_DEVICE)))
          .addMethod(
            getForceDeleteDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                com.google.protobuf.Empty>(
                  this, METHODID_FORCE_DELETE_DEVICE)))
          .addMethod(
            getDownloadImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaDevice.ImageDownload,
                org.opencord.voltha.Common.OperationResp>(
                  this, METHODID_DOWNLOAD_IMAGE)))
          .addMethod(
            getGetImageDownloadStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaDevice.ImageDownload,
                org.opencord.voltha.VolthaDevice.ImageDownload>(
                  this, METHODID_GET_IMAGE_DOWNLOAD_STATUS)))
          .addMethod(
            getGetImageDownloadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaDevice.ImageDownload,
                org.opencord.voltha.VolthaDevice.ImageDownload>(
                  this, METHODID_GET_IMAGE_DOWNLOAD)))
          .addMethod(
            getListImageDownloadsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.VolthaDevice.ImageDownloads>(
                  this, METHODID_LIST_IMAGE_DOWNLOADS)))
          .addMethod(
            getCancelImageDownloadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaDevice.ImageDownload,
                org.opencord.voltha.Common.OperationResp>(
                  this, METHODID_CANCEL_IMAGE_DOWNLOAD)))
          .addMethod(
            getActivateImageUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaDevice.ImageDownload,
                org.opencord.voltha.Common.OperationResp>(
                  this, METHODID_ACTIVATE_IMAGE_UPDATE)))
          .addMethod(
            getRevertImageUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaDevice.ImageDownload,
                org.opencord.voltha.Common.OperationResp>(
                  this, METHODID_REVERT_IMAGE_UPDATE)))
          .addMethod(
            getDownloadImageToDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaProtos.DeviceImageDownloadRequest,
                org.opencord.voltha.VolthaProtos.DeviceImageResponse>(
                  this, METHODID_DOWNLOAD_IMAGE_TO_DEVICE)))
          .addMethod(
            getGetImageStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaProtos.DeviceImageRequest,
                org.opencord.voltha.VolthaProtos.DeviceImageResponse>(
                  this, METHODID_GET_IMAGE_STATUS)))
          .addMethod(
            getAbortImageUpgradeToDeviceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaProtos.DeviceImageRequest,
                org.opencord.voltha.VolthaProtos.DeviceImageResponse>(
                  this, METHODID_ABORT_IMAGE_UPGRADE_TO_DEVICE)))
          .addMethod(
            getGetOnuImagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.VolthaDevice.OnuImages>(
                  this, METHODID_GET_ONU_IMAGES)))
          .addMethod(
            getActivateImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaProtos.DeviceImageRequest,
                org.opencord.voltha.VolthaProtos.DeviceImageResponse>(
                  this, METHODID_ACTIVATE_IMAGE)))
          .addMethod(
            getCommitImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaProtos.DeviceImageRequest,
                org.opencord.voltha.VolthaProtos.DeviceImageResponse>(
                  this, METHODID_COMMIT_IMAGE)))
          .addMethod(
            getListDevicePortsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.VolthaDevice.Ports>(
                  this, METHODID_LIST_DEVICE_PORTS)))
          .addMethod(
            getListDevicePmConfigsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.VolthaDevice.PmConfigs>(
                  this, METHODID_LIST_DEVICE_PM_CONFIGS)))
          .addMethod(
            getUpdateDevicePmConfigsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaDevice.PmConfigs,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_DEVICE_PM_CONFIGS)))
          .addMethod(
            getListDeviceFlowsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.openflow13.Openflow13.Flows>(
                  this, METHODID_LIST_DEVICE_FLOWS)))
          .addMethod(
            getListDeviceFlowGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.openflow13.Openflow13.FlowGroups>(
                  this, METHODID_LIST_DEVICE_FLOW_GROUPS)))
          .addMethod(
            getListDeviceTypesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.opencord.voltha.VolthaDevice.DeviceTypes>(
                  this, METHODID_LIST_DEVICE_TYPES)))
          .addMethod(
            getGetDeviceTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.VolthaDevice.DeviceType>(
                  this, METHODID_GET_DEVICE_TYPE)))
          .addMethod(
            getListDeviceGroupsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.opencord.voltha.VolthaProtos.DeviceGroups>(
                  this, METHODID_LIST_DEVICE_GROUPS)))
          .addMethod(
            getStreamPacketsOutMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                org.opencord.voltha.openflow13.Openflow13.PacketOut,
                com.google.protobuf.Empty>(
                  this, METHODID_STREAM_PACKETS_OUT)))
          .addMethod(
            getReceivePacketsInMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.opencord.voltha.openflow13.Openflow13.PacketIn>(
                  this, METHODID_RECEIVE_PACKETS_IN)))
          .addMethod(
            getReceiveChangeEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.opencord.voltha.openflow13.Openflow13.ChangeEvent>(
                  this, METHODID_RECEIVE_CHANGE_EVENTS)))
          .addMethod(
            getGetDeviceGroupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.VolthaProtos.DeviceGroup>(
                  this, METHODID_GET_DEVICE_GROUP)))
          .addMethod(
            getCreateEventFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaProtos.EventFilter,
                org.opencord.voltha.VolthaProtos.EventFilter>(
                  this, METHODID_CREATE_EVENT_FILTER)))
          .addMethod(
            getGetEventFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.VolthaProtos.EventFilters>(
                  this, METHODID_GET_EVENT_FILTER)))
          .addMethod(
            getUpdateEventFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaProtos.EventFilter,
                org.opencord.voltha.VolthaProtos.EventFilter>(
                  this, METHODID_UPDATE_EVENT_FILTER)))
          .addMethod(
            getDeleteEventFilterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaProtos.EventFilter,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_EVENT_FILTER)))
          .addMethod(
            getListEventFiltersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                org.opencord.voltha.VolthaProtos.EventFilters>(
                  this, METHODID_LIST_EVENT_FILTERS)))
          .addMethod(
            getGetImagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.VolthaDevice.Images>(
                  this, METHODID_GET_IMAGES)))
          .addMethod(
            getSelfTestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.VolthaProtos.SelfTestResponse>(
                  this, METHODID_SELF_TEST)))
          .addMethod(
            getGetMibDeviceDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.omci.OmciMibDb.MibDeviceData>(
                  this, METHODID_GET_MIB_DEVICE_DATA)))
          .addMethod(
            getGetAlarmDeviceDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ID,
                org.opencord.voltha.omci.OmciAlarmDb.AlarmDeviceData>(
                  this, METHODID_GET_ALARM_DEVICE_DATA)))
          .addMethod(
            getSimulateAlarmMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaDevice.SimulateAlarmRequest,
                org.opencord.voltha.Common.OperationResp>(
                  this, METHODID_SIMULATE_ALARM)))
          .addMethod(
            getSubscribeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaProtos.OfAgentSubscriber,
                org.opencord.voltha.VolthaProtos.OfAgentSubscriber>(
                  this, METHODID_SUBSCRIBE)))
          .addMethod(
            getEnablePortMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaDevice.Port,
                com.google.protobuf.Empty>(
                  this, METHODID_ENABLE_PORT)))
          .addMethod(
            getDisablePortMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaDevice.Port,
                com.google.protobuf.Empty>(
                  this, METHODID_DISABLE_PORT)))
          .addMethod(
            getGetExtValueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.Common.ValueSpecifier,
                org.opencord.voltha.Common.ReturnValues>(
                  this, METHODID_GET_EXT_VALUE)))
          .addMethod(
            getSetExtValueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaProtos.ValueSet,
                com.google.protobuf.Empty>(
                  this, METHODID_SET_EXT_VALUE)))
          .addMethod(
            getStartOmciTestActionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.opencord.voltha.VolthaProtos.OmciTestRequest,
                org.opencord.voltha.VolthaProtos.TestResponse>(
                  this, METHODID_START_OMCI_TEST_ACTION)))
          .build();
    }
  }

  /**
   * <pre>
   * Voltha APIs
   * </pre>
   */
  public static final class VolthaServiceStub extends io.grpc.stub.AbstractStub<VolthaServiceStub> {
    private VolthaServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VolthaServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VolthaServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VolthaServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the membership group of a Voltha Core
     * </pre>
     */
    public void getMembership(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.Membership> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMembershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Set the membership group of a Voltha Core
     * </pre>
     */
    public void updateMembership(org.opencord.voltha.VolthaProtos.Membership request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMembershipMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get high level information on the Voltha cluster
     * </pre>
     */
    public void getVoltha(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.Voltha> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVolthaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all Voltha cluster core instances
     * </pre>
     */
    public void listCoreInstances(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.CoreInstances> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCoreInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get details on a Voltha cluster instance
     * </pre>
     */
    public void getCoreInstance(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.CoreInstance> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCoreInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all active adapters (plugins) in the Voltha cluster
     * </pre>
     */
    public void listAdapters(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaAdapter.Adapters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAdaptersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all logical devices managed by the Voltha cluster
     * </pre>
     */
    public void listLogicalDevices(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.OFLogicalDevice.LogicalDevices> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListLogicalDevicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get additional information on a given logical device
     * </pre>
     */
    public void getLogicalDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.OFLogicalDevice.LogicalDevice> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLogicalDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List ports of a logical device
     * </pre>
     */
    public void listLogicalDevicePorts(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.OFLogicalDevice.LogicalPorts> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListLogicalDevicePortsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Gets a logical device port
     * </pre>
     */
    public void getLogicalDevicePort(org.opencord.voltha.OFLogicalDevice.LogicalPortId request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.OFLogicalDevice.LogicalPort> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetLogicalDevicePortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enables a logical device port
     * </pre>
     */
    public void enableLogicalDevicePort(org.opencord.voltha.OFLogicalDevice.LogicalPortId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnableLogicalDevicePortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disables a logical device port
     * </pre>
     */
    public void disableLogicalDevicePort(org.opencord.voltha.OFLogicalDevice.LogicalPortId request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisableLogicalDevicePortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all flows of a logical device
     * </pre>
     */
    public void listLogicalDeviceFlows(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.Flows> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListLogicalDeviceFlowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update flow table for logical device
     * </pre>
     */
    public void updateLogicalDeviceFlowTable(org.opencord.voltha.openflow13.Openflow13.FlowTableUpdate request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLogicalDeviceFlowTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update meter table for logical device
     * </pre>
     */
    public void updateLogicalDeviceMeterTable(org.opencord.voltha.openflow13.Openflow13.MeterModUpdate request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLogicalDeviceMeterTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all meters of a logical device
     * </pre>
     */
    public void listLogicalDeviceMeters(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.Meters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListLogicalDeviceMetersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all flow groups of a logical device
     * </pre>
     */
    public void listLogicalDeviceFlowGroups(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.FlowGroups> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListLogicalDeviceFlowGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update group table for device
     * </pre>
     */
    public void updateLogicalDeviceFlowGroupTable(org.opencord.voltha.openflow13.Openflow13.FlowGroupTableUpdate request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateLogicalDeviceFlowGroupTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all physical devices controlled by the Voltha cluster
     * </pre>
     */
    public void listDevices(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Devices> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDevicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all physical devices IDs controlled by the Voltha cluster
     * </pre>
     */
    public void listDeviceIds(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.IDs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDeviceIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request to a voltha Core to reconcile a set of devices based on their IDs
     * </pre>
     */
    public void reconcileDevices(org.opencord.voltha.Common.IDs request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReconcileDevicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get more information on a given physical device
     * </pre>
     */
    public void getDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Device> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Pre-provision a new physical device
     * </pre>
     */
    public void createDevice(org.opencord.voltha.VolthaDevice.Device request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Device> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enable a device.  If the device was in pre-provisioned state then it
     * will transition to ENABLED state.  If it was is DISABLED state then it
     * will transition to ENABLED state as well.
     * </pre>
     */
    public void enableDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnableDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Disable a device
     * </pre>
     */
    public void disableDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisableDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Reboot a device
     * </pre>
     */
    public void rebootDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRebootDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a device
     * </pre>
     */
    public void deleteDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Forcefully delete a device
     * </pre>
     */
    public void forceDeleteDevice(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getForceDeleteDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Request an image download to the standby partition
     * of a device.
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public void downloadImage(org.opencord.voltha.VolthaDevice.ImageDownload request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownloadImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get image download status on a device
     * The request retrieves progress on device and updates db record
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public void getImageDownloadStatus(org.opencord.voltha.VolthaDevice.ImageDownload request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.ImageDownload> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImageDownloadStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get image download db record
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public void getImageDownload(org.opencord.voltha.VolthaDevice.ImageDownload request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.ImageDownload> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImageDownloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List image download db records for a given device
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public void listImageDownloads(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.ImageDownloads> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListImageDownloadsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Cancel an existing image download process on a device
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public void cancelImageDownload(org.opencord.voltha.VolthaDevice.ImageDownload request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCancelImageDownloadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Activate the specified image at a standby partition
     * to active partition.
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * activated image running on device
     * Note that the call is expected to be non-blocking.
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public void activateImageUpdate(org.opencord.voltha.VolthaDevice.ImageDownload request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateImageUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Revert the specified image at standby partition
     * to active partition, and revert to previous image
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * previous image running on device
     * Note that the call is expected to be non-blocking.
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public void revertImageUpdate(org.opencord.voltha.VolthaDevice.ImageDownload request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRevertImageUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Downloads a certain image to the standby partition of the devices
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public void downloadImageToDevice(org.opencord.voltha.VolthaProtos.DeviceImageDownloadRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDownloadImageToDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get image status on a number of devices devices
     * Polled from northbound systems to get state of download/activate/commit
     * </pre>
     */
    public void getImageStatus(org.opencord.voltha.VolthaProtos.DeviceImageRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImageStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Aborts the upgrade of an image on a device
     * To be used carefully, stops any further operations for the Image on the given devices
     * Might also stop if possible existing work, but no guarantees are given,
     * depends on implementation and procedure status.
     * </pre>
     */
    public void abortImageUpgradeToDevice(org.opencord.voltha.VolthaProtos.DeviceImageRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAbortImageUpgradeToDeviceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get Both Active and Standby image for a given device
     * </pre>
     */
    public void getOnuImages(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.OnuImages> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOnuImagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Activate the specified image from a standby partition
     * to active partition.
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * activated image running on device
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public void activateImage(org.opencord.voltha.VolthaProtos.DeviceImageRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getActivateImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Commit the specified image to be default.
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * activated image running on device upon next reboot
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public void commitImage(org.opencord.voltha.VolthaProtos.DeviceImageRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCommitImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List ports of a device
     * </pre>
     */
    public void listDevicePorts(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Ports> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDevicePortsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List pm config of a device
     * </pre>
     */
    public void listDevicePmConfigs(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.PmConfigs> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDevicePmConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update the pm config of a device
     * </pre>
     */
    public void updateDevicePmConfigs(org.opencord.voltha.VolthaDevice.PmConfigs request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateDevicePmConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all flows of a device
     * </pre>
     */
    public void listDeviceFlows(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.Flows> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDeviceFlowsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all flow groups of a device
     * </pre>
     */
    public void listDeviceFlowGroups(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.FlowGroups> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDeviceFlowGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List device types known to Voltha
     * </pre>
     */
    public void listDeviceTypes(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.DeviceTypes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDeviceTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get additional information on a device type
     * </pre>
     */
    public void getDeviceType(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.DeviceType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDeviceTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all device sharding groups
     * </pre>
     */
    public void listDeviceGroups(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceGroups> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListDeviceGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Stream control packets to the dataplane
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.PacketOut> streamPacketsOut(
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getStreamPacketsOutMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Receive control packet stream
     * </pre>
     */
    public void receivePacketsIn(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.PacketIn> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getReceivePacketsInMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * This does not have an HTTP representation
     * </pre>
     */
    public void receiveChangeEvents(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.ChangeEvent> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getReceiveChangeEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get additional information on a device group
     * </pre>
     */
    public void getDeviceGroup(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceGroup> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDeviceGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEventFilter(org.opencord.voltha.VolthaProtos.EventFilter request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.EventFilter> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEventFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all filters present for a device
     * </pre>
     */
    public void getEventFilter(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.EventFilters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEventFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEventFilter(org.opencord.voltha.VolthaProtos.EventFilter request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.EventFilter> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEventFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEventFilter(org.opencord.voltha.VolthaProtos.EventFilter request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteEventFilterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get all the filters present
     * </pre>
     */
    public void listEventFilters(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.EventFilters> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListEventFiltersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getImages(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Images> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void selfTest(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.SelfTestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSelfTestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OpenOMCI MIB information
     * </pre>
     */
    public void getMibDeviceData(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.omci.OmciMibDb.MibDeviceData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMibDeviceDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * OpenOMCI ALARM information
     * </pre>
     */
    public void getAlarmDeviceData(org.opencord.voltha.Common.ID request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.omci.OmciAlarmDb.AlarmDeviceData> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAlarmDeviceDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Simulate an Alarm
     * </pre>
     */
    public void simulateAlarm(org.opencord.voltha.VolthaDevice.SimulateAlarmRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSimulateAlarmMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subscribe(org.opencord.voltha.VolthaProtos.OfAgentSubscriber request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.OfAgentSubscriber> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enablePort(org.opencord.voltha.VolthaDevice.Port request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEnablePortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disablePort(org.opencord.voltha.VolthaDevice.Port request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDisablePortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getExtValue(org.opencord.voltha.Common.ValueSpecifier request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.Common.ReturnValues> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetExtValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setExtValue(org.opencord.voltha.VolthaProtos.ValueSet request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetExtValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * omci start and stop cli implementation
     * </pre>
     */
    public void startOmciTestAction(org.opencord.voltha.VolthaProtos.OmciTestRequest request,
        io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.TestResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartOmciTestActionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Voltha APIs
   * </pre>
   */
  public static final class VolthaServiceBlockingStub extends io.grpc.stub.AbstractStub<VolthaServiceBlockingStub> {
    private VolthaServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VolthaServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VolthaServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VolthaServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the membership group of a Voltha Core
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.Membership getMembership(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetMembershipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Set the membership group of a Voltha Core
     * </pre>
     */
    public com.google.protobuf.Empty updateMembership(org.opencord.voltha.VolthaProtos.Membership request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMembershipMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get high level information on the Voltha cluster
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.Voltha getVoltha(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetVolthaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all Voltha cluster core instances
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.CoreInstances listCoreInstances(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListCoreInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get details on a Voltha cluster instance
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.CoreInstance getCoreInstance(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetCoreInstanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all active adapters (plugins) in the Voltha cluster
     * </pre>
     */
    public org.opencord.voltha.VolthaAdapter.Adapters listAdapters(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListAdaptersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all logical devices managed by the Voltha cluster
     * </pre>
     */
    public org.opencord.voltha.OFLogicalDevice.LogicalDevices listLogicalDevices(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListLogicalDevicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get additional information on a given logical device
     * </pre>
     */
    public org.opencord.voltha.OFLogicalDevice.LogicalDevice getLogicalDevice(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetLogicalDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List ports of a logical device
     * </pre>
     */
    public org.opencord.voltha.OFLogicalDevice.LogicalPorts listLogicalDevicePorts(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getListLogicalDevicePortsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Gets a logical device port
     * </pre>
     */
    public org.opencord.voltha.OFLogicalDevice.LogicalPort getLogicalDevicePort(org.opencord.voltha.OFLogicalDevice.LogicalPortId request) {
      return blockingUnaryCall(
          getChannel(), getGetLogicalDevicePortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enables a logical device port
     * </pre>
     */
    public com.google.protobuf.Empty enableLogicalDevicePort(org.opencord.voltha.OFLogicalDevice.LogicalPortId request) {
      return blockingUnaryCall(
          getChannel(), getEnableLogicalDevicePortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disables a logical device port
     * </pre>
     */
    public com.google.protobuf.Empty disableLogicalDevicePort(org.opencord.voltha.OFLogicalDevice.LogicalPortId request) {
      return blockingUnaryCall(
          getChannel(), getDisableLogicalDevicePortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all flows of a logical device
     * </pre>
     */
    public org.opencord.voltha.openflow13.Openflow13.Flows listLogicalDeviceFlows(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getListLogicalDeviceFlowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update flow table for logical device
     * </pre>
     */
    public com.google.protobuf.Empty updateLogicalDeviceFlowTable(org.opencord.voltha.openflow13.Openflow13.FlowTableUpdate request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLogicalDeviceFlowTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update meter table for logical device
     * </pre>
     */
    public com.google.protobuf.Empty updateLogicalDeviceMeterTable(org.opencord.voltha.openflow13.Openflow13.MeterModUpdate request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLogicalDeviceMeterTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all meters of a logical device
     * </pre>
     */
    public org.opencord.voltha.openflow13.Openflow13.Meters listLogicalDeviceMeters(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getListLogicalDeviceMetersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all flow groups of a logical device
     * </pre>
     */
    public org.opencord.voltha.openflow13.Openflow13.FlowGroups listLogicalDeviceFlowGroups(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getListLogicalDeviceFlowGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update group table for device
     * </pre>
     */
    public com.google.protobuf.Empty updateLogicalDeviceFlowGroupTable(org.opencord.voltha.openflow13.Openflow13.FlowGroupTableUpdate request) {
      return blockingUnaryCall(
          getChannel(), getUpdateLogicalDeviceFlowGroupTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all physical devices controlled by the Voltha cluster
     * </pre>
     */
    public org.opencord.voltha.VolthaDevice.Devices listDevices(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListDevicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all physical devices IDs controlled by the Voltha cluster
     * </pre>
     */
    public org.opencord.voltha.Common.IDs listDeviceIds(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListDeviceIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request to a voltha Core to reconcile a set of devices based on their IDs
     * </pre>
     */
    public com.google.protobuf.Empty reconcileDevices(org.opencord.voltha.Common.IDs request) {
      return blockingUnaryCall(
          getChannel(), getReconcileDevicesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get more information on a given physical device
     * </pre>
     */
    public org.opencord.voltha.VolthaDevice.Device getDevice(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Pre-provision a new physical device
     * </pre>
     */
    public org.opencord.voltha.VolthaDevice.Device createDevice(org.opencord.voltha.VolthaDevice.Device request) {
      return blockingUnaryCall(
          getChannel(), getCreateDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enable a device.  If the device was in pre-provisioned state then it
     * will transition to ENABLED state.  If it was is DISABLED state then it
     * will transition to ENABLED state as well.
     * </pre>
     */
    public com.google.protobuf.Empty enableDevice(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getEnableDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Disable a device
     * </pre>
     */
    public com.google.protobuf.Empty disableDevice(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getDisableDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Reboot a device
     * </pre>
     */
    public com.google.protobuf.Empty rebootDevice(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getRebootDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a device
     * </pre>
     */
    public com.google.protobuf.Empty deleteDevice(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getDeleteDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Forcefully delete a device
     * </pre>
     */
    public com.google.protobuf.Empty forceDeleteDevice(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getForceDeleteDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Request an image download to the standby partition
     * of a device.
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public org.opencord.voltha.Common.OperationResp downloadImage(org.opencord.voltha.VolthaDevice.ImageDownload request) {
      return blockingUnaryCall(
          getChannel(), getDownloadImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get image download status on a device
     * The request retrieves progress on device and updates db record
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public org.opencord.voltha.VolthaDevice.ImageDownload getImageDownloadStatus(org.opencord.voltha.VolthaDevice.ImageDownload request) {
      return blockingUnaryCall(
          getChannel(), getGetImageDownloadStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get image download db record
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public org.opencord.voltha.VolthaDevice.ImageDownload getImageDownload(org.opencord.voltha.VolthaDevice.ImageDownload request) {
      return blockingUnaryCall(
          getChannel(), getGetImageDownloadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List image download db records for a given device
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public org.opencord.voltha.VolthaDevice.ImageDownloads listImageDownloads(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getListImageDownloadsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Cancel an existing image download process on a device
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public org.opencord.voltha.Common.OperationResp cancelImageDownload(org.opencord.voltha.VolthaDevice.ImageDownload request) {
      return blockingUnaryCall(
          getChannel(), getCancelImageDownloadMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Activate the specified image at a standby partition
     * to active partition.
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * activated image running on device
     * Note that the call is expected to be non-blocking.
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public org.opencord.voltha.Common.OperationResp activateImageUpdate(org.opencord.voltha.VolthaDevice.ImageDownload request) {
      return blockingUnaryCall(
          getChannel(), getActivateImageUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Revert the specified image at standby partition
     * to active partition, and revert to previous image
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * previous image running on device
     * Note that the call is expected to be non-blocking.
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public org.opencord.voltha.Common.OperationResp revertImageUpdate(org.opencord.voltha.VolthaDevice.ImageDownload request) {
      return blockingUnaryCall(
          getChannel(), getRevertImageUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Downloads a certain image to the standby partition of the devices
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.DeviceImageResponse downloadImageToDevice(org.opencord.voltha.VolthaProtos.DeviceImageDownloadRequest request) {
      return blockingUnaryCall(
          getChannel(), getDownloadImageToDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get image status on a number of devices devices
     * Polled from northbound systems to get state of download/activate/commit
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.DeviceImageResponse getImageStatus(org.opencord.voltha.VolthaProtos.DeviceImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetImageStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Aborts the upgrade of an image on a device
     * To be used carefully, stops any further operations for the Image on the given devices
     * Might also stop if possible existing work, but no guarantees are given,
     * depends on implementation and procedure status.
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.DeviceImageResponse abortImageUpgradeToDevice(org.opencord.voltha.VolthaProtos.DeviceImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getAbortImageUpgradeToDeviceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get Both Active and Standby image for a given device
     * </pre>
     */
    public org.opencord.voltha.VolthaDevice.OnuImages getOnuImages(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetOnuImagesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Activate the specified image from a standby partition
     * to active partition.
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * activated image running on device
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.DeviceImageResponse activateImage(org.opencord.voltha.VolthaProtos.DeviceImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getActivateImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Commit the specified image to be default.
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * activated image running on device upon next reboot
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.DeviceImageResponse commitImage(org.opencord.voltha.VolthaProtos.DeviceImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getCommitImageMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List ports of a device
     * </pre>
     */
    public org.opencord.voltha.VolthaDevice.Ports listDevicePorts(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getListDevicePortsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List pm config of a device
     * </pre>
     */
    public org.opencord.voltha.VolthaDevice.PmConfigs listDevicePmConfigs(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getListDevicePmConfigsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update the pm config of a device
     * </pre>
     */
    public com.google.protobuf.Empty updateDevicePmConfigs(org.opencord.voltha.VolthaDevice.PmConfigs request) {
      return blockingUnaryCall(
          getChannel(), getUpdateDevicePmConfigsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all flows of a device
     * </pre>
     */
    public org.opencord.voltha.openflow13.Openflow13.Flows listDeviceFlows(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getListDeviceFlowsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all flow groups of a device
     * </pre>
     */
    public org.opencord.voltha.openflow13.Openflow13.FlowGroups listDeviceFlowGroups(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getListDeviceFlowGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List device types known to Voltha
     * </pre>
     */
    public org.opencord.voltha.VolthaDevice.DeviceTypes listDeviceTypes(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListDeviceTypesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get additional information on a device type
     * </pre>
     */
    public org.opencord.voltha.VolthaDevice.DeviceType getDeviceType(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetDeviceTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all device sharding groups
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.DeviceGroups listDeviceGroups(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListDeviceGroupsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Receive control packet stream
     * </pre>
     */
    public java.util.Iterator<org.opencord.voltha.openflow13.Openflow13.PacketIn> receivePacketsIn(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getReceivePacketsInMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * This does not have an HTTP representation
     * </pre>
     */
    public java.util.Iterator<org.opencord.voltha.openflow13.Openflow13.ChangeEvent> receiveChangeEvents(
        com.google.protobuf.Empty request) {
      return blockingServerStreamingCall(
          getChannel(), getReceiveChangeEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get additional information on a device group
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.DeviceGroup getDeviceGroup(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetDeviceGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.opencord.voltha.VolthaProtos.EventFilter createEventFilter(org.opencord.voltha.VolthaProtos.EventFilter request) {
      return blockingUnaryCall(
          getChannel(), getCreateEventFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all filters present for a device
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.EventFilters getEventFilter(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetEventFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.opencord.voltha.VolthaProtos.EventFilter updateEventFilter(org.opencord.voltha.VolthaProtos.EventFilter request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEventFilterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteEventFilter(org.opencord.voltha.VolthaProtos.EventFilter request) {
      return blockingUnaryCall(
          getChannel(), getDeleteEventFilterMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get all the filters present
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.EventFilters listEventFilters(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListEventFiltersMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.opencord.voltha.VolthaDevice.Images getImages(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetImagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.opencord.voltha.VolthaProtos.SelfTestResponse selfTest(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getSelfTestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OpenOMCI MIB information
     * </pre>
     */
    public org.opencord.voltha.omci.OmciMibDb.MibDeviceData getMibDeviceData(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetMibDeviceDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * OpenOMCI ALARM information
     * </pre>
     */
    public org.opencord.voltha.omci.OmciAlarmDb.AlarmDeviceData getAlarmDeviceData(org.opencord.voltha.Common.ID request) {
      return blockingUnaryCall(
          getChannel(), getGetAlarmDeviceDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Simulate an Alarm
     * </pre>
     */
    public org.opencord.voltha.Common.OperationResp simulateAlarm(org.opencord.voltha.VolthaDevice.SimulateAlarmRequest request) {
      return blockingUnaryCall(
          getChannel(), getSimulateAlarmMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.opencord.voltha.VolthaProtos.OfAgentSubscriber subscribe(org.opencord.voltha.VolthaProtos.OfAgentSubscriber request) {
      return blockingUnaryCall(
          getChannel(), getSubscribeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty enablePort(org.opencord.voltha.VolthaDevice.Port request) {
      return blockingUnaryCall(
          getChannel(), getEnablePortMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty disablePort(org.opencord.voltha.VolthaDevice.Port request) {
      return blockingUnaryCall(
          getChannel(), getDisablePortMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.opencord.voltha.Common.ReturnValues getExtValue(org.opencord.voltha.Common.ValueSpecifier request) {
      return blockingUnaryCall(
          getChannel(), getGetExtValueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty setExtValue(org.opencord.voltha.VolthaProtos.ValueSet request) {
      return blockingUnaryCall(
          getChannel(), getSetExtValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * omci start and stop cli implementation
     * </pre>
     */
    public org.opencord.voltha.VolthaProtos.TestResponse startOmciTestAction(org.opencord.voltha.VolthaProtos.OmciTestRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartOmciTestActionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Voltha APIs
   * </pre>
   */
  public static final class VolthaServiceFutureStub extends io.grpc.stub.AbstractStub<VolthaServiceFutureStub> {
    private VolthaServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private VolthaServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected VolthaServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new VolthaServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get the membership group of a Voltha Core
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.Membership> getMembership(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMembershipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Set the membership group of a Voltha Core
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateMembership(
        org.opencord.voltha.VolthaProtos.Membership request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMembershipMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get high level information on the Voltha cluster
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.Voltha> getVoltha(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVolthaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all Voltha cluster core instances
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.CoreInstances> listCoreInstances(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListCoreInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get details on a Voltha cluster instance
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.CoreInstance> getCoreInstance(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCoreInstanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all active adapters (plugins) in the Voltha cluster
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaAdapter.Adapters> listAdapters(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListAdaptersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all logical devices managed by the Voltha cluster
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.OFLogicalDevice.LogicalDevices> listLogicalDevices(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListLogicalDevicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get additional information on a given logical device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.OFLogicalDevice.LogicalDevice> getLogicalDevice(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLogicalDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List ports of a logical device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.OFLogicalDevice.LogicalPorts> listLogicalDevicePorts(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getListLogicalDevicePortsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Gets a logical device port
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.OFLogicalDevice.LogicalPort> getLogicalDevicePort(
        org.opencord.voltha.OFLogicalDevice.LogicalPortId request) {
      return futureUnaryCall(
          getChannel().newCall(getGetLogicalDevicePortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enables a logical device port
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> enableLogicalDevicePort(
        org.opencord.voltha.OFLogicalDevice.LogicalPortId request) {
      return futureUnaryCall(
          getChannel().newCall(getEnableLogicalDevicePortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disables a logical device port
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> disableLogicalDevicePort(
        org.opencord.voltha.OFLogicalDevice.LogicalPortId request) {
      return futureUnaryCall(
          getChannel().newCall(getDisableLogicalDevicePortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all flows of a logical device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.openflow13.Openflow13.Flows> listLogicalDeviceFlows(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getListLogicalDeviceFlowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update flow table for logical device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateLogicalDeviceFlowTable(
        org.opencord.voltha.openflow13.Openflow13.FlowTableUpdate request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLogicalDeviceFlowTableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update meter table for logical device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateLogicalDeviceMeterTable(
        org.opencord.voltha.openflow13.Openflow13.MeterModUpdate request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLogicalDeviceMeterTableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all meters of a logical device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.openflow13.Openflow13.Meters> listLogicalDeviceMeters(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getListLogicalDeviceMetersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all flow groups of a logical device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.openflow13.Openflow13.FlowGroups> listLogicalDeviceFlowGroups(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getListLogicalDeviceFlowGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update group table for device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateLogicalDeviceFlowGroupTable(
        org.opencord.voltha.openflow13.Openflow13.FlowGroupTableUpdate request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateLogicalDeviceFlowGroupTableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all physical devices controlled by the Voltha cluster
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaDevice.Devices> listDevices(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListDevicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all physical devices IDs controlled by the Voltha cluster
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.Common.IDs> listDeviceIds(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListDeviceIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request to a voltha Core to reconcile a set of devices based on their IDs
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> reconcileDevices(
        org.opencord.voltha.Common.IDs request) {
      return futureUnaryCall(
          getChannel().newCall(getReconcileDevicesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get more information on a given physical device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaDevice.Device> getDevice(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Pre-provision a new physical device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaDevice.Device> createDevice(
        org.opencord.voltha.VolthaDevice.Device request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enable a device.  If the device was in pre-provisioned state then it
     * will transition to ENABLED state.  If it was is DISABLED state then it
     * will transition to ENABLED state as well.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> enableDevice(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getEnableDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Disable a device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> disableDevice(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getDisableDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Reboot a device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> rebootDevice(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getRebootDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteDevice(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Forcefully delete a device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> forceDeleteDevice(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getForceDeleteDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Request an image download to the standby partition
     * of a device.
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.Common.OperationResp> downloadImage(
        org.opencord.voltha.VolthaDevice.ImageDownload request) {
      return futureUnaryCall(
          getChannel().newCall(getDownloadImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get image download status on a device
     * The request retrieves progress on device and updates db record
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaDevice.ImageDownload> getImageDownloadStatus(
        org.opencord.voltha.VolthaDevice.ImageDownload request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImageDownloadStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get image download db record
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaDevice.ImageDownload> getImageDownload(
        org.opencord.voltha.VolthaDevice.ImageDownload request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImageDownloadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List image download db records for a given device
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaDevice.ImageDownloads> listImageDownloads(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getListImageDownloadsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Cancel an existing image download process on a device
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.Common.OperationResp> cancelImageDownload(
        org.opencord.voltha.VolthaDevice.ImageDownload request) {
      return futureUnaryCall(
          getChannel().newCall(getCancelImageDownloadMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Activate the specified image at a standby partition
     * to active partition.
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * activated image running on device
     * Note that the call is expected to be non-blocking.
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.Common.OperationResp> activateImageUpdate(
        org.opencord.voltha.VolthaDevice.ImageDownload request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateImageUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Revert the specified image at standby partition
     * to active partition, and revert to previous image
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * previous image running on device
     * Note that the call is expected to be non-blocking.
     * Deprecated in voltha 2.8, will be removed
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.Common.OperationResp> revertImageUpdate(
        org.opencord.voltha.VolthaDevice.ImageDownload request) {
      return futureUnaryCall(
          getChannel().newCall(getRevertImageUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Downloads a certain image to the standby partition of the devices
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.DeviceImageResponse> downloadImageToDevice(
        org.opencord.voltha.VolthaProtos.DeviceImageDownloadRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDownloadImageToDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get image status on a number of devices devices
     * Polled from northbound systems to get state of download/activate/commit
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.DeviceImageResponse> getImageStatus(
        org.opencord.voltha.VolthaProtos.DeviceImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImageStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Aborts the upgrade of an image on a device
     * To be used carefully, stops any further operations for the Image on the given devices
     * Might also stop if possible existing work, but no guarantees are given,
     * depends on implementation and procedure status.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.DeviceImageResponse> abortImageUpgradeToDevice(
        org.opencord.voltha.VolthaProtos.DeviceImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAbortImageUpgradeToDeviceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get Both Active and Standby image for a given device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaDevice.OnuImages> getOnuImages(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOnuImagesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Activate the specified image from a standby partition
     * to active partition.
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * activated image running on device
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.DeviceImageResponse> activateImage(
        org.opencord.voltha.VolthaProtos.DeviceImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getActivateImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Commit the specified image to be default.
     * Depending on the device implementation, this call
     * may or may not cause device reboot.
     * If no reboot, then a reboot is required to make the
     * activated image running on device upon next reboot
     * Note that the call is expected to be non-blocking.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.DeviceImageResponse> commitImage(
        org.opencord.voltha.VolthaProtos.DeviceImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCommitImageMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List ports of a device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaDevice.Ports> listDevicePorts(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getListDevicePortsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List pm config of a device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaDevice.PmConfigs> listDevicePmConfigs(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getListDevicePmConfigsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update the pm config of a device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateDevicePmConfigs(
        org.opencord.voltha.VolthaDevice.PmConfigs request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateDevicePmConfigsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all flows of a device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.openflow13.Openflow13.Flows> listDeviceFlows(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getListDeviceFlowsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all flow groups of a device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.openflow13.Openflow13.FlowGroups> listDeviceFlowGroups(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getListDeviceFlowGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List device types known to Voltha
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaDevice.DeviceTypes> listDeviceTypes(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListDeviceTypesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get additional information on a device type
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaDevice.DeviceType> getDeviceType(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDeviceTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all device sharding groups
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.DeviceGroups> listDeviceGroups(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListDeviceGroupsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get additional information on a device group
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.DeviceGroup> getDeviceGroup(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDeviceGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.EventFilter> createEventFilter(
        org.opencord.voltha.VolthaProtos.EventFilter request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEventFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all filters present for a device
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.EventFilters> getEventFilter(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEventFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.EventFilter> updateEventFilter(
        org.opencord.voltha.VolthaProtos.EventFilter request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEventFilterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEventFilter(
        org.opencord.voltha.VolthaProtos.EventFilter request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteEventFilterMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get all the filters present
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.EventFilters> listEventFilters(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListEventFiltersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaDevice.Images> getImages(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.SelfTestResponse> selfTest(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getSelfTestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OpenOMCI MIB information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.omci.OmciMibDb.MibDeviceData> getMibDeviceData(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMibDeviceDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * OpenOMCI ALARM information
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.omci.OmciAlarmDb.AlarmDeviceData> getAlarmDeviceData(
        org.opencord.voltha.Common.ID request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAlarmDeviceDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Simulate an Alarm
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.Common.OperationResp> simulateAlarm(
        org.opencord.voltha.VolthaDevice.SimulateAlarmRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSimulateAlarmMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.OfAgentSubscriber> subscribe(
        org.opencord.voltha.VolthaProtos.OfAgentSubscriber request) {
      return futureUnaryCall(
          getChannel().newCall(getSubscribeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> enablePort(
        org.opencord.voltha.VolthaDevice.Port request) {
      return futureUnaryCall(
          getChannel().newCall(getEnablePortMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> disablePort(
        org.opencord.voltha.VolthaDevice.Port request) {
      return futureUnaryCall(
          getChannel().newCall(getDisablePortMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.Common.ReturnValues> getExtValue(
        org.opencord.voltha.Common.ValueSpecifier request) {
      return futureUnaryCall(
          getChannel().newCall(getGetExtValueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setExtValue(
        org.opencord.voltha.VolthaProtos.ValueSet request) {
      return futureUnaryCall(
          getChannel().newCall(getSetExtValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * omci start and stop cli implementation
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.opencord.voltha.VolthaProtos.TestResponse> startOmciTestAction(
        org.opencord.voltha.VolthaProtos.OmciTestRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartOmciTestActionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MEMBERSHIP = 0;
  private static final int METHODID_UPDATE_MEMBERSHIP = 1;
  private static final int METHODID_GET_VOLTHA = 2;
  private static final int METHODID_LIST_CORE_INSTANCES = 3;
  private static final int METHODID_GET_CORE_INSTANCE = 4;
  private static final int METHODID_LIST_ADAPTERS = 5;
  private static final int METHODID_LIST_LOGICAL_DEVICES = 6;
  private static final int METHODID_GET_LOGICAL_DEVICE = 7;
  private static final int METHODID_LIST_LOGICAL_DEVICE_PORTS = 8;
  private static final int METHODID_GET_LOGICAL_DEVICE_PORT = 9;
  private static final int METHODID_ENABLE_LOGICAL_DEVICE_PORT = 10;
  private static final int METHODID_DISABLE_LOGICAL_DEVICE_PORT = 11;
  private static final int METHODID_LIST_LOGICAL_DEVICE_FLOWS = 12;
  private static final int METHODID_UPDATE_LOGICAL_DEVICE_FLOW_TABLE = 13;
  private static final int METHODID_UPDATE_LOGICAL_DEVICE_METER_TABLE = 14;
  private static final int METHODID_LIST_LOGICAL_DEVICE_METERS = 15;
  private static final int METHODID_LIST_LOGICAL_DEVICE_FLOW_GROUPS = 16;
  private static final int METHODID_UPDATE_LOGICAL_DEVICE_FLOW_GROUP_TABLE = 17;
  private static final int METHODID_LIST_DEVICES = 18;
  private static final int METHODID_LIST_DEVICE_IDS = 19;
  private static final int METHODID_RECONCILE_DEVICES = 20;
  private static final int METHODID_GET_DEVICE = 21;
  private static final int METHODID_CREATE_DEVICE = 22;
  private static final int METHODID_ENABLE_DEVICE = 23;
  private static final int METHODID_DISABLE_DEVICE = 24;
  private static final int METHODID_REBOOT_DEVICE = 25;
  private static final int METHODID_DELETE_DEVICE = 26;
  private static final int METHODID_FORCE_DELETE_DEVICE = 27;
  private static final int METHODID_DOWNLOAD_IMAGE = 28;
  private static final int METHODID_GET_IMAGE_DOWNLOAD_STATUS = 29;
  private static final int METHODID_GET_IMAGE_DOWNLOAD = 30;
  private static final int METHODID_LIST_IMAGE_DOWNLOADS = 31;
  private static final int METHODID_CANCEL_IMAGE_DOWNLOAD = 32;
  private static final int METHODID_ACTIVATE_IMAGE_UPDATE = 33;
  private static final int METHODID_REVERT_IMAGE_UPDATE = 34;
  private static final int METHODID_DOWNLOAD_IMAGE_TO_DEVICE = 35;
  private static final int METHODID_GET_IMAGE_STATUS = 36;
  private static final int METHODID_ABORT_IMAGE_UPGRADE_TO_DEVICE = 37;
  private static final int METHODID_GET_ONU_IMAGES = 38;
  private static final int METHODID_ACTIVATE_IMAGE = 39;
  private static final int METHODID_COMMIT_IMAGE = 40;
  private static final int METHODID_LIST_DEVICE_PORTS = 41;
  private static final int METHODID_LIST_DEVICE_PM_CONFIGS = 42;
  private static final int METHODID_UPDATE_DEVICE_PM_CONFIGS = 43;
  private static final int METHODID_LIST_DEVICE_FLOWS = 44;
  private static final int METHODID_LIST_DEVICE_FLOW_GROUPS = 45;
  private static final int METHODID_LIST_DEVICE_TYPES = 46;
  private static final int METHODID_GET_DEVICE_TYPE = 47;
  private static final int METHODID_LIST_DEVICE_GROUPS = 48;
  private static final int METHODID_RECEIVE_PACKETS_IN = 49;
  private static final int METHODID_RECEIVE_CHANGE_EVENTS = 50;
  private static final int METHODID_GET_DEVICE_GROUP = 51;
  private static final int METHODID_CREATE_EVENT_FILTER = 52;
  private static final int METHODID_GET_EVENT_FILTER = 53;
  private static final int METHODID_UPDATE_EVENT_FILTER = 54;
  private static final int METHODID_DELETE_EVENT_FILTER = 55;
  private static final int METHODID_LIST_EVENT_FILTERS = 56;
  private static final int METHODID_GET_IMAGES = 57;
  private static final int METHODID_SELF_TEST = 58;
  private static final int METHODID_GET_MIB_DEVICE_DATA = 59;
  private static final int METHODID_GET_ALARM_DEVICE_DATA = 60;
  private static final int METHODID_SIMULATE_ALARM = 61;
  private static final int METHODID_SUBSCRIBE = 62;
  private static final int METHODID_ENABLE_PORT = 63;
  private static final int METHODID_DISABLE_PORT = 64;
  private static final int METHODID_GET_EXT_VALUE = 65;
  private static final int METHODID_SET_EXT_VALUE = 66;
  private static final int METHODID_START_OMCI_TEST_ACTION = 67;
  private static final int METHODID_STREAM_PACKETS_OUT = 68;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final VolthaServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(VolthaServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MEMBERSHIP:
          serviceImpl.getMembership((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.Membership>) responseObserver);
          break;
        case METHODID_UPDATE_MEMBERSHIP:
          serviceImpl.updateMembership((org.opencord.voltha.VolthaProtos.Membership) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_VOLTHA:
          serviceImpl.getVoltha((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.Voltha>) responseObserver);
          break;
        case METHODID_LIST_CORE_INSTANCES:
          serviceImpl.listCoreInstances((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.CoreInstances>) responseObserver);
          break;
        case METHODID_GET_CORE_INSTANCE:
          serviceImpl.getCoreInstance((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.CoreInstance>) responseObserver);
          break;
        case METHODID_LIST_ADAPTERS:
          serviceImpl.listAdapters((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaAdapter.Adapters>) responseObserver);
          break;
        case METHODID_LIST_LOGICAL_DEVICES:
          serviceImpl.listLogicalDevices((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.OFLogicalDevice.LogicalDevices>) responseObserver);
          break;
        case METHODID_GET_LOGICAL_DEVICE:
          serviceImpl.getLogicalDevice((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.OFLogicalDevice.LogicalDevice>) responseObserver);
          break;
        case METHODID_LIST_LOGICAL_DEVICE_PORTS:
          serviceImpl.listLogicalDevicePorts((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.OFLogicalDevice.LogicalPorts>) responseObserver);
          break;
        case METHODID_GET_LOGICAL_DEVICE_PORT:
          serviceImpl.getLogicalDevicePort((org.opencord.voltha.OFLogicalDevice.LogicalPortId) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.OFLogicalDevice.LogicalPort>) responseObserver);
          break;
        case METHODID_ENABLE_LOGICAL_DEVICE_PORT:
          serviceImpl.enableLogicalDevicePort((org.opencord.voltha.OFLogicalDevice.LogicalPortId) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DISABLE_LOGICAL_DEVICE_PORT:
          serviceImpl.disableLogicalDevicePort((org.opencord.voltha.OFLogicalDevice.LogicalPortId) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_LOGICAL_DEVICE_FLOWS:
          serviceImpl.listLogicalDeviceFlows((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.Flows>) responseObserver);
          break;
        case METHODID_UPDATE_LOGICAL_DEVICE_FLOW_TABLE:
          serviceImpl.updateLogicalDeviceFlowTable((org.opencord.voltha.openflow13.Openflow13.FlowTableUpdate) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_LOGICAL_DEVICE_METER_TABLE:
          serviceImpl.updateLogicalDeviceMeterTable((org.opencord.voltha.openflow13.Openflow13.MeterModUpdate) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_LOGICAL_DEVICE_METERS:
          serviceImpl.listLogicalDeviceMeters((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.Meters>) responseObserver);
          break;
        case METHODID_LIST_LOGICAL_DEVICE_FLOW_GROUPS:
          serviceImpl.listLogicalDeviceFlowGroups((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.FlowGroups>) responseObserver);
          break;
        case METHODID_UPDATE_LOGICAL_DEVICE_FLOW_GROUP_TABLE:
          serviceImpl.updateLogicalDeviceFlowGroupTable((org.opencord.voltha.openflow13.Openflow13.FlowGroupTableUpdate) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_DEVICES:
          serviceImpl.listDevices((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Devices>) responseObserver);
          break;
        case METHODID_LIST_DEVICE_IDS:
          serviceImpl.listDeviceIds((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.Common.IDs>) responseObserver);
          break;
        case METHODID_RECONCILE_DEVICES:
          serviceImpl.reconcileDevices((org.opencord.voltha.Common.IDs) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_DEVICE:
          serviceImpl.getDevice((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Device>) responseObserver);
          break;
        case METHODID_CREATE_DEVICE:
          serviceImpl.createDevice((org.opencord.voltha.VolthaDevice.Device) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Device>) responseObserver);
          break;
        case METHODID_ENABLE_DEVICE:
          serviceImpl.enableDevice((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DISABLE_DEVICE:
          serviceImpl.disableDevice((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REBOOT_DEVICE:
          serviceImpl.rebootDevice((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_DEVICE:
          serviceImpl.deleteDevice((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FORCE_DELETE_DEVICE:
          serviceImpl.forceDeleteDevice((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DOWNLOAD_IMAGE:
          serviceImpl.downloadImage((org.opencord.voltha.VolthaDevice.ImageDownload) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp>) responseObserver);
          break;
        case METHODID_GET_IMAGE_DOWNLOAD_STATUS:
          serviceImpl.getImageDownloadStatus((org.opencord.voltha.VolthaDevice.ImageDownload) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.ImageDownload>) responseObserver);
          break;
        case METHODID_GET_IMAGE_DOWNLOAD:
          serviceImpl.getImageDownload((org.opencord.voltha.VolthaDevice.ImageDownload) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.ImageDownload>) responseObserver);
          break;
        case METHODID_LIST_IMAGE_DOWNLOADS:
          serviceImpl.listImageDownloads((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.ImageDownloads>) responseObserver);
          break;
        case METHODID_CANCEL_IMAGE_DOWNLOAD:
          serviceImpl.cancelImageDownload((org.opencord.voltha.VolthaDevice.ImageDownload) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp>) responseObserver);
          break;
        case METHODID_ACTIVATE_IMAGE_UPDATE:
          serviceImpl.activateImageUpdate((org.opencord.voltha.VolthaDevice.ImageDownload) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp>) responseObserver);
          break;
        case METHODID_REVERT_IMAGE_UPDATE:
          serviceImpl.revertImageUpdate((org.opencord.voltha.VolthaDevice.ImageDownload) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp>) responseObserver);
          break;
        case METHODID_DOWNLOAD_IMAGE_TO_DEVICE:
          serviceImpl.downloadImageToDevice((org.opencord.voltha.VolthaProtos.DeviceImageDownloadRequest) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse>) responseObserver);
          break;
        case METHODID_GET_IMAGE_STATUS:
          serviceImpl.getImageStatus((org.opencord.voltha.VolthaProtos.DeviceImageRequest) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse>) responseObserver);
          break;
        case METHODID_ABORT_IMAGE_UPGRADE_TO_DEVICE:
          serviceImpl.abortImageUpgradeToDevice((org.opencord.voltha.VolthaProtos.DeviceImageRequest) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse>) responseObserver);
          break;
        case METHODID_GET_ONU_IMAGES:
          serviceImpl.getOnuImages((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.OnuImages>) responseObserver);
          break;
        case METHODID_ACTIVATE_IMAGE:
          serviceImpl.activateImage((org.opencord.voltha.VolthaProtos.DeviceImageRequest) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse>) responseObserver);
          break;
        case METHODID_COMMIT_IMAGE:
          serviceImpl.commitImage((org.opencord.voltha.VolthaProtos.DeviceImageRequest) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceImageResponse>) responseObserver);
          break;
        case METHODID_LIST_DEVICE_PORTS:
          serviceImpl.listDevicePorts((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Ports>) responseObserver);
          break;
        case METHODID_LIST_DEVICE_PM_CONFIGS:
          serviceImpl.listDevicePmConfigs((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.PmConfigs>) responseObserver);
          break;
        case METHODID_UPDATE_DEVICE_PM_CONFIGS:
          serviceImpl.updateDevicePmConfigs((org.opencord.voltha.VolthaDevice.PmConfigs) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_DEVICE_FLOWS:
          serviceImpl.listDeviceFlows((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.Flows>) responseObserver);
          break;
        case METHODID_LIST_DEVICE_FLOW_GROUPS:
          serviceImpl.listDeviceFlowGroups((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.FlowGroups>) responseObserver);
          break;
        case METHODID_LIST_DEVICE_TYPES:
          serviceImpl.listDeviceTypes((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.DeviceTypes>) responseObserver);
          break;
        case METHODID_GET_DEVICE_TYPE:
          serviceImpl.getDeviceType((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.DeviceType>) responseObserver);
          break;
        case METHODID_LIST_DEVICE_GROUPS:
          serviceImpl.listDeviceGroups((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceGroups>) responseObserver);
          break;
        case METHODID_RECEIVE_PACKETS_IN:
          serviceImpl.receivePacketsIn((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.PacketIn>) responseObserver);
          break;
        case METHODID_RECEIVE_CHANGE_EVENTS:
          serviceImpl.receiveChangeEvents((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.openflow13.Openflow13.ChangeEvent>) responseObserver);
          break;
        case METHODID_GET_DEVICE_GROUP:
          serviceImpl.getDeviceGroup((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.DeviceGroup>) responseObserver);
          break;
        case METHODID_CREATE_EVENT_FILTER:
          serviceImpl.createEventFilter((org.opencord.voltha.VolthaProtos.EventFilter) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.EventFilter>) responseObserver);
          break;
        case METHODID_GET_EVENT_FILTER:
          serviceImpl.getEventFilter((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.EventFilters>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT_FILTER:
          serviceImpl.updateEventFilter((org.opencord.voltha.VolthaProtos.EventFilter) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.EventFilter>) responseObserver);
          break;
        case METHODID_DELETE_EVENT_FILTER:
          serviceImpl.deleteEventFilter((org.opencord.voltha.VolthaProtos.EventFilter) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_EVENT_FILTERS:
          serviceImpl.listEventFilters((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.EventFilters>) responseObserver);
          break;
        case METHODID_GET_IMAGES:
          serviceImpl.getImages((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaDevice.Images>) responseObserver);
          break;
        case METHODID_SELF_TEST:
          serviceImpl.selfTest((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.SelfTestResponse>) responseObserver);
          break;
        case METHODID_GET_MIB_DEVICE_DATA:
          serviceImpl.getMibDeviceData((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.omci.OmciMibDb.MibDeviceData>) responseObserver);
          break;
        case METHODID_GET_ALARM_DEVICE_DATA:
          serviceImpl.getAlarmDeviceData((org.opencord.voltha.Common.ID) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.omci.OmciAlarmDb.AlarmDeviceData>) responseObserver);
          break;
        case METHODID_SIMULATE_ALARM:
          serviceImpl.simulateAlarm((org.opencord.voltha.VolthaDevice.SimulateAlarmRequest) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.Common.OperationResp>) responseObserver);
          break;
        case METHODID_SUBSCRIBE:
          serviceImpl.subscribe((org.opencord.voltha.VolthaProtos.OfAgentSubscriber) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.OfAgentSubscriber>) responseObserver);
          break;
        case METHODID_ENABLE_PORT:
          serviceImpl.enablePort((org.opencord.voltha.VolthaDevice.Port) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DISABLE_PORT:
          serviceImpl.disablePort((org.opencord.voltha.VolthaDevice.Port) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_EXT_VALUE:
          serviceImpl.getExtValue((org.opencord.voltha.Common.ValueSpecifier) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.Common.ReturnValues>) responseObserver);
          break;
        case METHODID_SET_EXT_VALUE:
          serviceImpl.setExtValue((org.opencord.voltha.VolthaProtos.ValueSet) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_START_OMCI_TEST_ACTION:
          serviceImpl.startOmciTestAction((org.opencord.voltha.VolthaProtos.OmciTestRequest) request,
              (io.grpc.stub.StreamObserver<org.opencord.voltha.VolthaProtos.TestResponse>) responseObserver);
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
        case METHODID_STREAM_PACKETS_OUT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamPacketsOut(
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class VolthaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    VolthaServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.opencord.voltha.VolthaProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("VolthaService");
    }
  }

  private static final class VolthaServiceFileDescriptorSupplier
      extends VolthaServiceBaseDescriptorSupplier {
    VolthaServiceFileDescriptorSupplier() {}
  }

  private static final class VolthaServiceMethodDescriptorSupplier
      extends VolthaServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    VolthaServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (VolthaServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new VolthaServiceFileDescriptorSupplier())
              .addMethod(getGetMembershipMethod())
              .addMethod(getUpdateMembershipMethod())
              .addMethod(getGetVolthaMethod())
              .addMethod(getListCoreInstancesMethod())
              .addMethod(getGetCoreInstanceMethod())
              .addMethod(getListAdaptersMethod())
              .addMethod(getListLogicalDevicesMethod())
              .addMethod(getGetLogicalDeviceMethod())
              .addMethod(getListLogicalDevicePortsMethod())
              .addMethod(getGetLogicalDevicePortMethod())
              .addMethod(getEnableLogicalDevicePortMethod())
              .addMethod(getDisableLogicalDevicePortMethod())
              .addMethod(getListLogicalDeviceFlowsMethod())
              .addMethod(getUpdateLogicalDeviceFlowTableMethod())
              .addMethod(getUpdateLogicalDeviceMeterTableMethod())
              .addMethod(getListLogicalDeviceMetersMethod())
              .addMethod(getListLogicalDeviceFlowGroupsMethod())
              .addMethod(getUpdateLogicalDeviceFlowGroupTableMethod())
              .addMethod(getListDevicesMethod())
              .addMethod(getListDeviceIdsMethod())
              .addMethod(getReconcileDevicesMethod())
              .addMethod(getGetDeviceMethod())
              .addMethod(getCreateDeviceMethod())
              .addMethod(getEnableDeviceMethod())
              .addMethod(getDisableDeviceMethod())
              .addMethod(getRebootDeviceMethod())
              .addMethod(getDeleteDeviceMethod())
              .addMethod(getForceDeleteDeviceMethod())
              .addMethod(getDownloadImageMethod())
              .addMethod(getGetImageDownloadStatusMethod())
              .addMethod(getGetImageDownloadMethod())
              .addMethod(getListImageDownloadsMethod())
              .addMethod(getCancelImageDownloadMethod())
              .addMethod(getActivateImageUpdateMethod())
              .addMethod(getRevertImageUpdateMethod())
              .addMethod(getDownloadImageToDeviceMethod())
              .addMethod(getGetImageStatusMethod())
              .addMethod(getAbortImageUpgradeToDeviceMethod())
              .addMethod(getGetOnuImagesMethod())
              .addMethod(getActivateImageMethod())
              .addMethod(getCommitImageMethod())
              .addMethod(getListDevicePortsMethod())
              .addMethod(getListDevicePmConfigsMethod())
              .addMethod(getUpdateDevicePmConfigsMethod())
              .addMethod(getListDeviceFlowsMethod())
              .addMethod(getListDeviceFlowGroupsMethod())
              .addMethod(getListDeviceTypesMethod())
              .addMethod(getGetDeviceTypeMethod())
              .addMethod(getListDeviceGroupsMethod())
              .addMethod(getStreamPacketsOutMethod())
              .addMethod(getReceivePacketsInMethod())
              .addMethod(getReceiveChangeEventsMethod())
              .addMethod(getGetDeviceGroupMethod())
              .addMethod(getCreateEventFilterMethod())
              .addMethod(getGetEventFilterMethod())
              .addMethod(getUpdateEventFilterMethod())
              .addMethod(getDeleteEventFilterMethod())
              .addMethod(getListEventFiltersMethod())
              .addMethod(getGetImagesMethod())
              .addMethod(getSelfTestMethod())
              .addMethod(getGetMibDeviceDataMethod())
              .addMethod(getGetAlarmDeviceDataMethod())
              .addMethod(getSimulateAlarmMethod())
              .addMethod(getSubscribeMethod())
              .addMethod(getEnablePortMethod())
              .addMethod(getDisablePortMethod())
              .addMethod(getGetExtValueMethod())
              .addMethod(getSetExtValueMethod())
              .addMethod(getStartOmciTestActionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
