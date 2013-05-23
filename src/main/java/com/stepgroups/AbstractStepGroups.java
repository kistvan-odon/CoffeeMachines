package com.stepgroups;

import com.steps.AbstractSteps;
import com.steps.AddProductSteps;
import com.steps.CartSteps;
import com.steps.ProductSteps;
import com.steps.MenuSteps;
import com.steps.ProductsSteps;

import net.thucydides.core.annotations.Steps;

public class AbstractStepGroups {

	@Steps
	public AbstractSteps abstractSteps;

	@Steps
	public MenuSteps menuSteps;

	@Steps
	public ProductsSteps productsSteps;

	@Steps
	public ProductSteps productSteps;

	@Steps
	public CartSteps cartSteps;
	
	@Steps
	public AddProductSteps addProductSteps;
}
