package com.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractPage {

	public CartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "div.body-middle table tr")
	private List<WebElement> productsList;

	/**
	 * Verifies that the expected product exists in the cart and that it has the
	 * right price
	 * 
	 * @param productName
	 * @param productPrice
	 */
	public void verifyProductPrice(String productName, String productPrice) {
		boolean foundProduct = false;
		for (WebElement currentProduct : productsList) {
			String currentProductName = currentProduct.findElement(
					By.cssSelector("td > h2")).getText();
			if (currentProductName.contains(productPrice)) {
				foundProduct = true;
				String currentProductPrice = currentProduct.findElement(
						By.cssSelector("td:nth-child(2) > h2")).getText();
				Assert.assertTrue("Product price should be '" + productPrice
						+ "' and it is '" + currentProductPrice + "'!",
						currentProductPrice.contains(productPrice));
				break;
			}
		}
		Assert.assertTrue("Product named '" + productName
				+ "' was not found in the cart!", foundProduct);
	}
}
