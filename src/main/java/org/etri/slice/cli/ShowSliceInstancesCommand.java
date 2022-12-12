package org.etri.slice.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.etri.slice.api.SliceCtrlService;
import org.etri.slice.impl.SliceInstance;
import org.etri.slice.impl.utils.TableList;
import org.onosproject.cli.AbstractShellCommand;

import java.util.List;

@Service
@Command(scope="boss", name="show-slice-all", description="Search and Show a Slice Instance")
public class ShowSliceInstancesCommand extends AbstractShellCommand {
    @Override
    protected void doExecute() {
        SliceCtrlService service = AbstractShellCommand.get(SliceCtrlService.class);
        List<SliceInstance> sliceInstances = service.getSliceInstances();

        TableList tl = new TableList(5,
                "Group", "Name", "UNI Port", "DBA", "Alloc/Remained BW(kbps)")
                .sortBy(0)
                .withUnicode(true);

        sliceInstances.forEach(sliceInstance -> {
            tl.addRow(sliceInstance.getGroupName(),
                    sliceInstance.getName(),
                    sliceInstance.getUniPortName(),
                    sliceInstance.getDBAType(),
                    sliceInstance.getAllocatedBandwidth() + "/" + sliceInstance.getRemainedBandwidth());
        });

        tl.print();
    }
}
