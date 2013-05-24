package com.stepgroups;

import tools.Constants;
import net.thucydides.core.annotations.StepGroup;

public class BuyProductStepGroups extends AbstractStepGroups {

	@StepGroup
	public void addProductToCart(String productCategory, String productName,
			String productCharacteristics, Double productPrice) {
		abstractSteps.navigateToURL(Constants.BASE_URL);
		menuSteps.selectMenuEntry(productCategory);
		productsSteps.selectDesiredProduct(productName);
		productSteps.verifyProductName(productName);
		productSteps.verifyProductCharacteristics(productCharacteristics);
		productSteps.verifyProductPrice(productPrice);
		productSteps.clickOnAddToCartButton();
	}

	@StepGroup
	public void verifyProductInCart(int quantity, String productName,
			Double productPrice, Double totalPrice) {
		cartSteps.verifyNumberOfProducts(quantity);
		cartSteps.verifyCartTotal(totalPrice);
		cartSteps.verifyProductPrice(productName, productPrice);
	}
	
	@StepGroup
	public void selectClientTypeAndGoToCheckout(boolean newClient) {
		cartSteps.clickOnBuyProductsButton();
		cartSteps.selectClientType(newClient);
		cartSteps.clickOnGoToCheckoutButton();
	}
}
