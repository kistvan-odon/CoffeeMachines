package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class MenuSteps extends AbstractSteps{

	public MenuSteps(Pages pages) {
		super(pages);
	}

	private static final long serialVersionUID = 1L;

	@Step
	public void openMenuEntry(String menuEntry) {
		menuPage().openMenuEntry(menuEntry);
	}
	
}
