package org.etri.slice.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.etri.slice.api.SliceCtrlService;
import org.etri.slice.impl.C;
import org.onosproject.cli.AbstractShellCommand;
import org.onosproject.net.Device;
import org.onosproject.net.DeviceId;

@Service
@Command(scope="boss", name="add-ponport", description="Add a Logical Pon Port")
public class PonPortAddCommand extends AbstractShellCommand{
    @Argument(index = 0, name = "deviceId", required = true, multiValued = false)
    private String deviceId = null;

    @Argument(index = 1, name = "portName", required = true, multiValued = false)
    private String portName = null;

    @Override
    protected void doExecute() throws Exception {
        SliceCtrlService service = get(SliceCtrlService.class);

        DeviceId device = DeviceId.deviceId(deviceId);
        C.RESULTS result = service.addPonPort(device, portName);

        switch (result) {
            case DUPLICATE:
                System.out.println("Pon Port " + portName + " already exists!");
                break;

            case ENTRY_NOT_FOUND:
                System.out.println("Device " + deviceId + " doesn't exists!");
                break;

            case SUCCESS:
                System.out.println("successfully added Pon Port " + portName + " to Device " + deviceId);
                break;
        }
    }
}
