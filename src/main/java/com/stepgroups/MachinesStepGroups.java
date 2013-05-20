package com.stepgroups;

import tools.Constants;
import net.thucydides.core.annotations.StepGroup;

public class MachinesStepGroups extends AbstractStepGroups{

	@StepGroup
	public void addMachineToCart(String machineCategory, String machineName){
		abstractSteps.navigateToURL(Constants.BASE_URL);
		menuSteps.selectMenuEntry(machineCategory);
		machinesSteps.selectDesiredMachine(machineName);
		machineSteps.clickOnAddToCartButton();
	}
}
