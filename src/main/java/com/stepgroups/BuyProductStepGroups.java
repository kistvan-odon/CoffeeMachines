package com.stepgroups;

import tools.Constants;
import net.thucydides.core.annotations.StepGroup;

public class BuyProductStepGroups extends AbstractStepGroups{

	@StepGroup
	public void addProductToCart(String productCategory, String productName){
		abstractSteps.navigateToURL(Constants.BASE_URL);
		menuSteps.selectMenuEntry(productCategory);
		productsSteps.selectDesiredProduct(productName);
		productSteps.clickOnAddToCartButton();
	}
}
