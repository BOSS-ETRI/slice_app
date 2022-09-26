package org.etri.slice.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.etri.slice.api.SliceCtrlService;
import org.etri.slice.impl.C;
import org.onosproject.cli.AbstractShellCommand;
import org.onosproject.net.ConnectPoint;
import org.onosproject.net.Device;
import org.onosproject.net.DeviceId;
import org.onosproject.net.PortNumber;

@Service
@Command(scope="boss", name="add-device", description="Add a Logical OLT Device")
public class OLTDeviceAddCommand extends AbstractShellCommand {
    @Argument(index = 0, name = "deviceId", required = true, multiValued = false)
    private String deviceId = null;

    @Argument(index = 1, name = "wbType", required = true, multiValued = false)
    private C.WB_TYPE wbType = null;

    @Override
    protected void doExecute() {
        SliceCtrlService service = get(SliceCtrlService.class);

        DeviceId device = DeviceId.deviceId(deviceId);
        C.RESULTS result = service.addOLTDevice(device, wbType);

        switch (result) {
            case DUPLICATE:
                System.out.println(deviceId + " already exists!");
                break;

            case SUCCESS:
                System.out.println("successfully added device " + deviceId);
                break;
        }
    }
}
