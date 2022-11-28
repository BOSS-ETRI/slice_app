package org.etri.slice.cli;

import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.etri.slice.api.SliceCtrlService;
import org.etri.slice.impl.C;
import org.onosproject.cli.AbstractShellCommand;
import org.onosproject.net.DeviceId;

@Service
@Command(scope="boss", name="add-slice", description="Add a Logical Slice Instance")
public class SliceInstanceAddCommand extends AbstractShellCommand {
	@Argument(index = 0, name = "groupName", required = true, multiValued = false)
	private String groupName = null;

	@Argument(index = 1, name = "sliceName", required = true, multiValued = false)
	private String sliceName = null;

	@Argument(index = 2, name = "uniPortName", required = true, multiValued = false)
	private String uniPortName = null;

	@Argument(index = 3, name = "fixed-bw", required = true, multiValued = false)
	private int fixedBW = 0;

	@Argument(index = 4, name = "assured-bw", required = true, multiValued = false)
	private int assuredBW = 0;

	@Argument(index = 5, name = "surplus-bw", required = true, multiValued = false)
	private int surplusBW = 0;

	@Argument(index = 6, name = "dba", required = true, multiValued = false)
	private C.DBA_ALG dba = null;

	@Override
	protected void doExecute() {
		SliceCtrlService service = get(SliceCtrlService.class);

		C.RESULTS result = service.addSliceInstance(
				groupName, sliceName, uniPortName, fixedBW, assuredBW, surplusBW, dba
		);

		switch (result) {
			case DUPLICATE:
				System.out.println("Slice Instance already exists!");
				break;

			case ENTRY_NOT_FOUND:
				System.out.println("There is no existing device or ponPort!");
				break;

			case WRONG_INPUT:
				System.out.println("Something went wrong!");
				break;

			case SUCCESS:
				System.out.println("successfully added the slice instance!");
				break;
		}
	}
}
