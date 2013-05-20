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

import com.stepgroups.MachinesStepGroups;

@Story(Application.Machines.NewMachine.class)
@RunWith(ThucydidesRunner.class)
public class BuyNewMachineTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.BASE_URL)
	public Pages pages;
	
	@Steps
	private MachinesStepGroups machinesStepGroups;
	
	@Test
	public void buyNewMachine(){
		machinesStepGroups.addMachineToCart(Constants.AUTOMATE_NOI, "Bianchi Iris");
	}
}
