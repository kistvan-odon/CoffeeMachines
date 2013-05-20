package com.pages;

import org.openqa.selenium.WebDriver;

import net.thucydides.core.pages.PageObject;

public class AbstractPage extends PageObject {

	public AbstractPage(WebDriver driver) {
		super(driver);
	}
	
	/**
	 * Navigates to the desired URL
	 * @param pageURL
	 */
	public void navigateToURL(String pageURL){
		getDriver().get(pageURL);
	}

}
