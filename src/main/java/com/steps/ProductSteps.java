package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class ProductSteps extends AbstractSteps{

	public ProductSteps(Pages pages) {
		super(pages);
	}

	private static final long serialVersionUID = 1L;
	
	@Step
	public void verifyProductName(String productName) {
		productPage().verifyProductName(productName);
	}
	
	@Step
	public void verifyProductCharacteristics(String productCharacteristics) {
		productPage().verifyProductCharacteristics(productCharacteristics);
	}

	@Step
	public void clickOnAddToCartButton(){
		productPage().clickOnAddToCartButton();
	}
}
