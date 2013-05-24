package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tools.StringUtils;

public class ProductPage extends AbstractPage {

	public ProductPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "div.body-middle > h2")
	private WebElement productNameContainer;

	@FindBy(css = "div.body-middle > table td[valign='top'] > p")
	private WebElement productCharacteristicsContainer;

	@FindBy(css = "div.body-middle > center > p > span")
	private WebElement productPriceContainer;

	@FindBy(css = "span.decalat > a")
	private WebElement addToCartButton;

	/**
	 * Verifies that the product name is the expected one
	 * 
	 * @param productName
	 */
	public void verifyProductName(String productName) {
		String actualProductName = productNameContainer.getText();
		Assert.assertTrue("The product name should be '" + productName
				+ "' and it is '" + actualProductName + "'!",
				actualProductName.contains(productName));
	}

	/**
	 * Verifies that the product characteristics are as expected
	 * 
	 * @param productCharacteristics
	 */
	public void verifyProductCharacteristics(String productCharacteristics) {
		String actualProductCharacteristics = productCharacteristicsContainer
				.getText();
		Assert.assertTrue("Product characteristics should be '"
				+ productCharacteristics + "' and they are '"
				+ actualProductCharacteristics + "'!",
				actualProductCharacteristics.contains(productCharacteristics));
	}

	/**
	 * Verifies that the product has the right price
	 * 
	 * @param productPrice
	 */
	public void verifyProductPrice(Double productPrice) {
		String actualProductPriceContainer = productPriceContainer.getText();
		Double actualProductPrice = StringUtils
				.getFirstDoubleNumberFromString(actualProductPriceContainer);
		Assert.assertTrue("Product price should be '" + productPrice
				+ "' and it is '" + actualProductPrice + "'!",
				actualProductPrice.equals(productPrice));
	}

	/**
	 * Clicks on the "Add To Cart" button
	 */
	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}
}
