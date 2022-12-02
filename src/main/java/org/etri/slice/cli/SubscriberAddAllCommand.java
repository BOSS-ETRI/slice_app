package org.etri.slice.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.Completion;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.etri.slice.api.SliceCtrlService;
import org.etri.slice.impl.C;
import org.onosproject.cli.AbstractShellCommand;
import org.onosproject.cli.net.DeviceIdCompleter;
import org.onosproject.net.ConnectPoint;
import org.onosproject.net.DeviceId;
import org.onosproject.net.PortNumber;
import org.onosproject.net.device.DeviceService;

@Service
@Command(scope = "boss", name = "volt-add-all-subscriber-access",
        description = "Adds a subscriber to an access device")
public class SubscriberAddAllCommand extends AbstractShellCommand {
    @Argument(index = 0, name = "deviceId", description = "Access device ID",
            required = true, multiValued = false)
    @Completion(DeviceIdCompleter.class)
    private String strDeviceId = null;

    @Override
    protected void doExecute() {
        SliceCtrlService service = get(SliceCtrlService.class);

        DeviceId deviceId = DeviceId.deviceId(strDeviceId);
        DeviceService deviceService = AbstractShellCommand.get(DeviceService.class);

        deviceService.getPorts(deviceId).forEach(p -> {
            if (p.isEnabled()) {
                PortNumber port = p.number();
                ConnectPoint connectPoint = new ConnectPoint(deviceId, port);
                C.RESULTS result = service.provisionSubscriber(connectPoint);

                switch(result) {
                    case SUCCESS:
                        System.out.println("Successfully installed the subscriber");
                        break;

                    case ENTRY_NOT_FOUND:
                        System.out.println("Some entries are missing from (AAA, SADIS, SIS)");
                        break;

                    case INSUFFICIENT_BANDWIDTH:
                        System.out.println("Designated slice instance doesn't have sufficient remaining bandwidth for this subscriber");
                        break;
                }
            }
        });
    }
}







