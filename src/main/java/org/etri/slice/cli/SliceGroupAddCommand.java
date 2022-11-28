package org.etri.slice.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.etri.slice.api.SliceCtrlService;
import org.etri.slice.impl.C;
import org.onosproject.cli.AbstractShellCommand;
import org.onosproject.net.DeviceId;

@Service
@Command(scope="boss", name="add-slice-group", description="Add a Logical Slice Group Instance")
public class SliceGroupAddCommand extends AbstractShellCommand {
    @Argument(index = 0, name = "groupName", required = true, multiValued = false)
    private String groupName = null;

    @Argument(index = 1, name = "deviceId", required = true, multiValued = false)
    private String deviceId = null;

    @Argument(index = 2, name = "ponPortName", required = true, multiValued = false)
    private String ponPortName = null;

    @Argument(index = 3, name = "totalBandwidth", required = true, multiValued = false)
    private int totalBandwidth = 0;

    @Override
    protected void doExecute() {
        SliceCtrlService service = get(SliceCtrlService.class);

        DeviceId devId = DeviceId.deviceId(deviceId);
        C.RESULTS result = service.addSliceGroup(
                groupName, devId, ponPortName, totalBandwidth
        );
//        C.RESULTS result = service.addSliceInstance(
//                sliceName, device, ponPortName, uniPortName, fixedBW, assuredBW, surplusBW, dba
//        );

        switch (result) {
            case DUPLICATE:
                System.out.println("Slice group already exists!");
                break;

            case WRONG_INPUT:
                System.out.println("Something went wrong!");
                break;

            case SUCCESS:
                System.out.println("successfully added the slice group!");
                break;
        }
    }
}
