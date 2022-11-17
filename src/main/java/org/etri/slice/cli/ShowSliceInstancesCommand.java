package org.etri.slice.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.etri.slice.api.SliceCtrlService;
import org.etri.slice.impl.SliceInstance;
import org.onosproject.cli.AbstractShellCommand;

import java.util.List;

@Service
@Command(scope="boss", name="show-slice-list", description="Search and Show a Slice Instance")
public class ShowSliceInstancesCommand extends AbstractShellCommand {
    @Override
    protected void doExecute() {
        SliceCtrlService service = AbstractShellCommand.get(SliceCtrlService.class);
        List<SliceInstance> sliceInstances = service.getSliceInstances();

        for( SliceInstance instance : sliceInstances ) {
            System.out.println(instance);
        }
    }
}
