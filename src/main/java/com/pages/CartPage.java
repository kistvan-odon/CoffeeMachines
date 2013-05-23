package com.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tools.MathUtils;
import tools.StringUtils;

public class CartPage extends AbstractPage {

	public CartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "div.body-middle table tr")
	private List<WebElement> productsList;

	/**
	 * Verifies that the no. of products in the cart is the expected one
	 * 
	 * @param noOfProducts
	 */
	public void verifyNumberOfProducts(int noOfProducts) {
		Assert.assertTrue("There were supposed to be " + noOfProducts
				+ " products in the shopping cart and there were found "
				+ productsList.size() + " !",
				noOfProducts == productsList.size());
	}

	/**
	 * Verifies that the expected product exists in the cart and that it has the
	 * right price
	 * 
	 * @param productName
	 * @param productPrice
	 */
	public void verifyProductPrice(String productName, Double productPrice) {
		boolean foundProduct = false;
		for (WebElement currentProduct : productsList) {
			String currentProductName = currentProduct.findElement(
					By.cssSelector("td > h2")).getText();
			if (currentProductName.contains(productPrice.toString())) {
				foundProduct = true;
				String currentProductPriceContainer = currentProduct
						.findElement(By.cssSelector("td:nth-child(2) > h2"))
						.getText();
				Double currentProductPrice = StringUtils
						.getFirstDoubleNumberFromString(currentProductPriceContainer);
				Assert.assertTrue("Product price should be '" + productPrice
						+ "' and it is '" + currentProductPrice + "'!",
						currentProductPrice == productPrice);
				break;
			}
		}
		Assert.assertTrue("Product named '" + productName
				+ "' was not found in the cart!", foundProduct);
	}
}
