package com.stepgroups;

import tools.Constants;
import tools.FileUtils;
import net.thucydides.core.annotations.StepGroup;

public class RegisterProductStepGroups extends AbstractStepGroups {

	@StepGroup
	public void registerProduct(String productCategory,
			String smallProductImage, String bigProductImage,
			String productBrand, String productModel,
			String productCharacteristics, Double productPrice) {
		abstractSteps.navigateToURL(Constants.REGISTER_PRODUCT_URL);
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
