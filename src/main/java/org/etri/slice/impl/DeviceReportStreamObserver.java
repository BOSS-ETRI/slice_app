package org.etri.slice.impl;

import io.grpc.stub.StreamObserver;
import org.etri.slice.impl.C.WB_TYPE;
import org.etri.slice.impl.C.RESULTS;
import org.etri.onosslice.sliceservice.ONOSSliceService;
import org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatusResponse;
import org.etri.onosslice.sliceservice.ONOSSliceService.DeviceStatus;
import org.etri.onosslice.sliceservice.ONOSSliceService.DeviceType;
import org.etri.onosslice.sliceservice.ONOSSliceService.PortStatus;
import org.onosproject.net.Device;
import org.onosproject.net.DeviceId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class DeviceReportStreamObserver implements StreamObserver<DeviceStatusResponse> {
    private final Logger log = LoggerFactory.getLogger(getClass());
    private Manager manager;

    public DeviceReportStreamObserver(Manager manager) {
        this.manager = manager;
    }

    private WB_TYPE getWhitboxType(DeviceType typeFromVoltha) {
        WB_TYPE type = WB_TYPE.OLT_25G;

        switch(typeFromVoltha) {
            case WB_OLT_1G:
                type = WB_TYPE.OLT_1G;
                break;

            case WB_OLT_10G:
                type = WB_TYPE.OLT_10G;
                break;

            case WB_OLT_25G:
                type = WB_TYPE.OLT_25G;
                break;

            case WB_OLT_50G:
                type = WB_TYPE.OLT_50G;
                break;
        }

        return type;
    }

    private void addPorts(Manager manager, DeviceId devId, List<PortStatus> portStatuses) {
        for( PortStatus portStatus : portStatuses ) {
            String portId = portStatus.getIdentifier();
            DeviceStatus status = portStatus.getStatus();

            switch(status) {
                case UP:
                    RESULTS result = manager.addPonPort(devId, portId);

                    if( result == RESULTS.ENTRY_NOT_FOUND ) {
                        log.info("OLT Device(" + devId + ") to add port is not found");
                    }
                    else if( result == RESULTS.DUPLICATE ) {
                        log.info("Port(" + portId + ") is already in the list on OLT Device(" + devId + ")");
                    }
                    else {
                        log.info("Port(" + portId + ") is successfully added the list on OLT Device(" + devId + ")");
                    }
                    break;

                case DOWN:
                    // not implemented yet
                    break;
            }
        }
    }

    @Override
    public void onNext(DeviceStatusResponse report) {
        String oltId = report.getIdentifier();
        WB_TYPE oltType = getWhitboxType(report.getType());
        DeviceStatus status = report.getStatus();

        switch(status) {
            case UP:
                // "0000" is appended due to ONF policy
                // check ONF's vOLT CLI use case for volt-add-subscriber command
                // essentially oltId is going to be "0000" + mac address of the device
                oltId = "0000" + oltId;
                DeviceId devId = DeviceId.deviceId(oltId);
                RESULTS result = manager.addOLTDevice(devId, oltType);

                if( result == RESULTS.DUPLICATE ) {
                    log.info("OLT Device(" + oltId + ") is already in the list");
                }
                else {
                    log.info("OLT Device(" + oltId + ") is successfully added to the list");
                    List<PortStatus> portStatuses = report.getPortStatusList();
                    addPorts(manager, devId, portStatuses);
                }
                break;

            case DOWN:
                // not implemented yet
                break;
        }
    }

    @Override
    public void onError(Throwable t) {

    }

    @Override
    public void onCompleted() {

    }
}
