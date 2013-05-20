package com.stepgroups;

import net.thucydides.core.annotations.StepGroup;

public class MachinesStepGroups extends AbstractStepGroups{

	@StepGroup
	public void selectMachine(String machineCategory, String machineName){
		menuSteps.selectMenuEntry(machineCategory);
		machinesSteps.selectDesiredMachine(machineName);
	}
}
