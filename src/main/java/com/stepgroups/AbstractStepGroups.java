package com.stepgroups;

import com.steps.AbstractSteps;
import com.steps.RegisterClientSteps;
import com.steps.RegisterProductSteps;
import com.steps.CartSteps;
import com.steps.ProductSteps;
import com.steps.MenuSteps;
import com.steps.ProductsSteps;

import net.thucydides.core.annotations.Steps;

public class AbstractStepGroups {

	@Steps
	protected AbstractSteps abstractSteps;

	@Steps
	protected MenuSteps menuSteps;

	@Steps
	protected ProductsSteps productsSteps;

	@Steps
	protected ProductSteps productSteps;

	@Steps
	protected CartSteps cartSteps;
	
	@Steps
	protected RegisterProductSteps registerProductSteps;
	
	@Steps
	protected RegisterClientSteps registerClientSteps;
}
