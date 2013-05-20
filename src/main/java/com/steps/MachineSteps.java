package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class MachineSteps extends AbstractSteps{

	public MachineSteps(Pages pages) {
		super(pages);
	}

	private static final long serialVersionUID = 1L;

	@Step
	public void clickOnBuyButton(){
		machinePage().clickOnBuyButton();
	}
}
