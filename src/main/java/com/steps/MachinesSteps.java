package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class MachinesSteps extends AbstractSteps{

	public MachinesSteps(Pages pages) {
		super(pages);
	}

	private static final long serialVersionUID = 1L;

	@Step
	public void selectDesiredMachine(String machineName) {
		machinesPage().selectDesiredMachine(machineName);
	}
}
