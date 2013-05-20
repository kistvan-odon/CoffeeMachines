package com.pages;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuPage extends AbstractPage {

	public MenuPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "div.body-left a")
	public List<WebElement> menuEntries;

	/**
	 * Clicks on the desired menu entry
	 * @param menuEntry
	 */
	public void selectMenuEntry(String menuEntry) {
		boolean foundMenuEntry = false;
		for (WebElement currentMenuEntry : menuEntries) {
			String menuEntryText = currentMenuEntry.getText();
			if (menuEntryText.contains(menuEntry)) {
				foundMenuEntry = true;
				currentMenuEntry.click();
				break;
			}
		}
		Assert.assertTrue(
				"Couldn't find menu entry named '" + menuEntry + "'!",
				foundMenuEntry);
	}
}
