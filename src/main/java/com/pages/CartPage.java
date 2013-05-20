package com.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends AbstractPage{

	public CartPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "div.body-middle table tr")
	private List<WebElement> productsList;
	
	public void verifyProductPrice(String productName, String productPrice){
		boolean foundProduct = false;
		for(WebElement currentProduct : productsList){
			String currentProductName = currentProduct.findElement(By.cssSelector("td > h2")).getText();
			if(currentProductName.contains(productPrice)){
				foundProduct = true;
				String currentProductPrice = currentProduct.findElement(By.cssSelector("td:nth-child(2) > h2")).getText();
				Assert.assertTrue("Product price should be '" + productPrice + "' and it is '" + currentProductPrice + "'!", productPrice)
			}
		}
	}
}
