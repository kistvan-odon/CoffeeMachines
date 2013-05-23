package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class AddProductSteps extends AbstractSteps {

	public AddProductSteps(Pages pages) {
		super(pages);
	}

	private static final long serialVersionUID = 1L;

	@Step
	public void selectProductCategory(String productCategory) {
		addProductPage().selectProductCategory(productCategory);
	}

	@Step
	public void insertSmallProductImage(String smallProductImage) {
		addProductPage().insertSmallProductImage(smallProductImage);
	}

	@Step
	public void insertBigProductImage(String bigProductImage) {
		addProductPage().insertBigProductImage(bigProductImage);
	}

	@Step
	public void insertProductBrand(String productBrand) {
		addProductPage().insertProductBrand(productBrand);
	}

	@Step
	public void insertProductModel(String productModel) {
		addProductPage().insertProductModel(productModel);
	}

	@Step
	public void insertProductCaracteristics(String productCharacteristics) {
		addProductPage().insertProductCaracteristics(productCharacteristics);
	}

	@Step
	public void insertProductPrice(String productPrice) {
		addProductPage().insertProductPrice(productPrice);
	}

	@Step
	public void clickOnAddProductButton() {
		addProductPage().clickOnAddProductButton();
	}

	@Step
	public void clickOnDeleteProductButton() {
		addProductPage().clickOnDeleteProductButton();
	}
}
