package com.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import tools.Application;
import tools.Constants;

import com.stepgroups.BuyProductStepGroups;
import com.steps.CartSteps;

@Story(Application.Machines.NewMachine.class)
@RunWith(ThucydidesRunner.class)
public class BuyNewMachineTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.BASE_URL)
	public Pages pages;
	
	@Steps
	private BuyProductStepGroups buyMachinesStepGroups;

	@Steps
	public CartSteps cartSteps;
	
	@Test
	public void buyNewMachine(){
		buyMachinesStepGroups.addProductToCart(Constants.AUTOMATE_NOI, "Bianchi Iris");
		cartSteps.verifyNumberOfProducts(1);
		cartSteps.verifyProductPrice("", 124.5);
	}
}
