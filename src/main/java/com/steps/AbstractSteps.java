package com.steps;

import com.pages.AbstractPage;
import com.pages.AddProductPage;
import com.pages.CartPage;
import com.pages.ProductPage;
import com.pages.MenuPage;
import com.pages.ProductsPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class AbstractSteps extends ScenarioSteps {

	public AbstractSteps(Pages pages) {
		super(pages);
		getDriver().manage().window().maximize();
	}

	private static final long serialVersionUID = 1L;

	@Step
	public void navigateToURL(String pageURL) {
		getDriver().get(pageURL);
	}

	public AbstractPage abstractPage() {
		return getPages().currentPageAt(AbstractPage.class);
	}

	public MenuPage menuPage() {
		return getPages().currentPageAt(MenuPage.class);
	}

	public ProductsPage productsPage() {
		return getPages().currentPageAt(ProductsPage.class);
	}

	public ProductPage productPage() {
		return getPages().currentPageAt(ProductPage.class);
	}

	public CartPage cartPage() {
		return getPages().currentPageAt(CartPage.class);
	}
	
	public AddProductPage addProductPage() {
		return getPages().currentPageAt(AddProductPage.class);
	}
}
