package org.etri.slice.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.etri.slice.api.SliceCtrlService;
import org.etri.slice.impl.C;
import org.onosproject.cli.AbstractShellCommand;
import org.onosproject.net.DeviceId;

@Service
@Command(scope="boss", name="update-slice-bandwidth", description="Update Bandwidth of a Slice Instance")
public class SliceInstanceBWUpdateCommand extends AbstractShellCommand {

    @Argument(index = 0, name = "sliceName", required = true, multiValued = false)
    private String sliceName = null;

    @Argument(index = 1, name = "deviceId", required = true, multiValued = false)
    private String deviceId = null;

    @Argument(index = 2, name = "ponPortName", required = true, multiValued = false)
    private String ponPortName = null;

    @Argument(index = 3, name = "uniPortName", required = true, multiValued = false)
    private String uniPortName = null;

    @Argument(index = 4, name = "bandwidth", required = true, multiValued = false)
    private int bandwidth = 0;


    @Override
    protected void doExecute() throws Exception {
        SliceCtrlService service = get(SliceCtrlService.class);

        DeviceId device = DeviceId.deviceId(deviceId);
        C.RESULTS result = service.updateBWOfSliceInstance(
                sliceName, device, ponPortName, bandwidth
        );

        switch (result) {
            case ENTRY_NOT_FOUND:
                System.out.println("There is no existing device, ponPort, or sliceInstance!");
                break;

            case INSUFFICIENT_BANDWIDTH:
                System.out.println("there is not enough bandwidth remained to expand!");
                break;

            case OVERFLOW_BANDWIDTH:
                System.out.println("there is not enough bandwidth remained to shrink!");
                break;

            case SUCCESS:
                System.out.println("successfully updated the slice instance!");
                break;
        }
    }
}

