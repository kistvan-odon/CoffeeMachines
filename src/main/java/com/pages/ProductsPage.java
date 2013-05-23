package com.pages;

import java.util.List;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends AbstractPage {

	public ProductsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "div.body-middle td")
	public List<WebElement> productsList;

	/**
	 * Clicks on the desired product
	 * @param productName
	 */
	public void selectDesiredProduct(String productName) {
		boolean foundProduct = false;
		for (WebElement currentProduct : productsList) {
			String currentMachineName = currentProduct.findElement(
					By.tagName("p")).getText();
			if (currentMachineName.contains(productName)) {
				foundProduct = true;
				currentProduct.findElement(By.tagName("img")).click();
				break;
			}
		}
		Assert.assertTrue("Couldn't find product named '" + productName + "'!",
				foundProduct);
	}

}
