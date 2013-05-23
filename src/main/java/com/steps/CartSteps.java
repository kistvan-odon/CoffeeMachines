package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class CartSteps extends AbstractSteps {

	public CartSteps(Pages pages) {
		super(pages);
	}

	private static final long serialVersionUID = 1L;

	@Step
	public void verifyNumberOfProducts(int noOfProducts) {
		cartPage().verifyNumberOfProducts(noOfProducts);
	}

	@Step
	public void verifyProductPrice(String productName, Double productPrice) {
		cartPage().verifyProductPrice(productName, productPrice);
	}
}
