package com.stepgroups;

import com.steps.AbstractSteps;
import com.steps.MenuSteps;
import com.steps.MachinesSteps;

import net.thucydides.core.annotations.Steps;

public class AbstractStepGroups {

	@Steps
	public AbstractSteps abstractSteps;
	
	@Steps
	public MenuSteps menuSteps;
	
	@Steps
	public MachinesSteps machinesSteps;
}
