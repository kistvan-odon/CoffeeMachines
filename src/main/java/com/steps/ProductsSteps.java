package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class ProductsSteps extends AbstractSteps{

	public ProductsSteps(Pages pages) {
		super(pages);
	}

	private static final long serialVersionUID = 1L;

	@Step
	public void selectDesiredProduct(String productName) {
		productsPage().selectDesiredProduct(productName);
	}
}
