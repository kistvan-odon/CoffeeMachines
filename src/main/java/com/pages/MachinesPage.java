package com.pages;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MachinesPage extends AbstractPage {

	public MachinesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "div.body-middle td")
	public List<WebElement> machinesList;

	/**
	 * Clicks on the desired machine name
	 * @param machineName
	 */
	public void selectDesiredMachine(String machineName) {
		boolean foundMachine = false;
		for (WebElement currentMachine : machinesList) {
			String currentMachineName = currentMachine.findElement(
					By.tagName("p")).getText();
			if (currentMachineName.contains(machineName)) {
				foundMachine = true;
				currentMachine.findElement(By.tagName("img")).click();
				break;
			}
		}
		Assert.assertTrue("Couldn't find machine named '" + machineName + "'!",
				foundMachine);
	}

}
