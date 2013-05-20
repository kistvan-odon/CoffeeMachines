package com.steps;

import com.pages.AbstractPage;
import com.pages.CartPage;
import com.pages.MachinePage;
import com.pages.MenuPage;
import com.pages.MachinesPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class AbstractSteps extends ScenarioSteps {

	public AbstractSteps(Pages pages) {
		super(pages);
		getDriver().manage().window().maximize();
	}

	private static final long serialVersionUID = 1L;

	@Step
	public void navigateToURL(String pageURL) {
		getDriver().get(pageURL);
	}

	public AbstractPage abstractPage() {
		return getPages().currentPageAt(AbstractPage.class);
	}

	public MenuPage menuPage() {
		return getPages().currentPageAt(MenuPage.class);
	}

	public MachinesPage machinesPage() {
		return getPages().currentPageAt(MachinesPage.class);
	}

	public MachinePage machinePage() {
		return getPages().currentPageAt(MachinePage.class);
	}

	public CartPage cartPage() {
		return getPages().currentPageAt(CartPage.class);
	}
}
