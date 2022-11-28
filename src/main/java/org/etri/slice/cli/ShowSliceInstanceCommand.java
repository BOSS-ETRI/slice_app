package org.etri.slice.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.etri.slice.api.SliceCtrlService;
import org.etri.slice.impl.SliceInstance;
import org.onosproject.cli.AbstractShellCommand;

@Service
@Command(scope="boss", name="show-slice", description="Search and Show a Slice Instance")
public class ShowSliceInstanceCommand extends AbstractShellCommand {
    @Argument(index = 0, name = "groupName", description = "Unique slice group name", required = true, multiValued = false)
    private String groupName = null;
    @Argument(index = 1, name = "sliceName", description = "Unique slice name", required = true, multiValued = false)
    private String sliceName = null;

    @Override
    protected void doExecute() {
        SliceCtrlService service = AbstractShellCommand.get(SliceCtrlService.class);
        SliceInstance sliceInstance = service.getSliceInstance(groupName, sliceName);
        System.out.println(sliceInstance);
    }
}
