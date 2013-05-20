package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MachinePage extends AbstractPage{

	public MachinePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "span.decalat > a")
	private WebElement buyButton;
	
	/**
	 * Clicks on the "Buy" button
	 */
	public void clickOnBuyButton(){
		buyButton.click();
	}
}
