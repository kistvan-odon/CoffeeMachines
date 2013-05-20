package com.stepgroups;

import net.thucydides.core.annotations.StepGroup;

public class MachinesStepGroups extends AbstractStepGroups{

	@StepGroup
	public void addMachineToCart(String machineCategory, String machineName){
		menuSteps.selectMenuEntry(machineCategory);
		machinesSteps.selectDesiredMachine(machineName);
		machineSteps.clickOnAddToCartButton();
	}
}
