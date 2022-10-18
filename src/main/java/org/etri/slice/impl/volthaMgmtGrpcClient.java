package org.etri.slice.impl;

import org.etri.onosslice.sliceservice.ONOSSliceService;
import org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusRequest;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceRequest;
import org.etri.onosslice.sliceservice.ONOSSliceService.AddSliceResponse;
import org.etri.onosslice.sliceservice.SliceServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.internal.DnsNameResolverProvider;
import io.grpc.netty.NettyChannelBuilder;
import org.slf4j.Logger;

public class volthaMgmtGrpcClient {
	//private final VolthaServiceGrpc.VolthaServiceBlockingStub core;
	private final SliceServiceGrpc.SliceServiceBlockingStub core;
	private final SliceServiceGrpc.SliceServiceStub noti;
	private final ManagedChannel chan;
	
	public volthaMgmtGrpcClient(Logger logger) {
		chan = NettyChannelBuilder.forTarget("voltha-voltha-api.voltha.svc:55555")
				.nameResolverFactory(new DnsNameResolverProvider()).usePlaintext(true).build();
		
		core = SliceServiceGrpc.newBlockingStub(chan);
		noti = SliceServiceGrpc.newStub(chan);
	}
	
	public AddSliceResponse AddSlice(AddSliceRequest request) {
		AddSliceResponse response = core.addSlice(request);
		return response;
	}

	public void RequestDeviceStatus(Manager manager) {
		noti.deviceReport(
				DeviceStatusRequest.getDefaultInstance(),
				new DeviceReportStreamObserver(manager));
	}

	public void shutdown() {
		chan.shutdownNow();
		System.out.println("Shutdown Channel");
	}
}
