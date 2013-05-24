package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class RegisterProductSteps extends AbstractSteps {

	public RegisterProductSteps(Pages pages) {
		super(pages);
	}

	private static final long serialVersionUID = 1L;

	@Step
	public void selectProductCategory(String productCategory) {
		registerProductPage().selectProductCategory(productCategory);
	}

	@Step
	public void insertSmallProductImage(String smallProductImage) {
		registerProductPage().insertSmallProductImage(smallProductImage);
	}

	@Step
	public void insertBigProductImage(String bigProductImage) {
		registerProductPage().insertBigProductImage(bigProductImage);
	}

	@Step
	public void insertProductBrand(String productBrand) {
		registerProductPage().insertProductBrand(productBrand);
	}

	@Step
	public void insertProductModel(String productModel) {
		registerProductPage().insertProductModel(productModel);
	}

	@Step
	public void insertProductCaracteristics(String productCharacteristics) {
		registerProductPage().insertProductCaracteristics(productCharacteristics);
	}

	@Step
	public void insertProductPrice(Double productPrice) {
		registerProductPage().insertProductPrice(productPrice);
	}

	@Step
	public void clickOnAddProductButton() {
		registerProductPage().clickOnAddProductButton();
	}

	@Step
	public void clickOnDeleteProductButton() {
		registerProductPage().clickOnDeleteProductButton();
	}
}
