package org.etri.slice.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.etri.slice.api.SliceCtrlService;
import org.etri.slice.impl.SliceGroup;
import org.etri.slice.impl.SliceInstance;
import org.etri.slice.impl.utils.TableList;
import org.onosproject.cli.AbstractShellCommand;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Service
@Command(scope="boss", name="show-slice-group", description="Search and Show a Slice Group")
public class ShowSliceGroupCommand extends AbstractShellCommand {
    @Argument(index = 0, name = "groupName", description = "Unique slice group name", required = true, multiValued = false)
    private String groupName = null;

    @Override
    protected void doExecute() {
        SliceCtrlService service = AbstractShellCommand.get(SliceCtrlService.class);
        SliceGroup sliceGroup = service.getSliceGroup(groupName);

        TableList tl = new TableList(6,
                "Group", "Slice ID", "OLT", "PON Port", "Alloc/Remained BW(kbps)", "Slice Instances").sortBy(0).withUnicode(true);
        if( sliceGroup != null) {
            List<SliceInstance> sliceInstances = sliceGroup.getSliceInstances();
            AtomicReference<String> sliceInstancesStr = new AtomicReference<>("");
            sliceInstances.forEach(sliceInstance -> {
                sliceInstancesStr.set(sliceInstancesStr + sliceInstance.getName() + ",");
            });

            tl.addRow(
                    sliceGroup.getName(),
                    Integer.toString(sliceGroup.getSliceId()),
                    sliceGroup.getDeviceId(),
                    sliceGroup.getPonPort().getPortName(),
                    sliceGroup.getAllocatedBandwidth() + "/" + sliceGroup.getRemainedBandwidth(),
                    sliceInstancesStr.get()
            );
        }
        tl.print();
    }
}
