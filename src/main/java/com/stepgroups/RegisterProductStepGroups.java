package com.stepgroups;

import net.thucydides.core.annotations.StepGroup;

public class RegisterProductStepGroups extends AbstractStepGroups {

	@StepGroup
	public void registerProduct(String productCategory,
			String smallProductImage, String bigProductImage,
			String productBrand, String productModel,
			String productCharacteristics, Double productPrice) {
		adminSteps.clickOnAddProductButton();
		registerProductSteps.selectProductCategory(productCategory);
		registerProductSteps.insertSmallProductImage(smallProductImage);
		registerProductSteps.insertBigProductImage(bigProductImage);
		registerProductSteps.insertProductBrand(productBrand);
		registerProductSteps.insertProductModel(productModel);
		registerProductSteps
				.insertProductCaracteristics(productCharacteristics);
		registerProductSteps.insertProductPrice(productPrice);
		registerProductSteps.clickOnAddProductButton();
	}
}
