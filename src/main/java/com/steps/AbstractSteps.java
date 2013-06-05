package com.steps;

import com.pages.AbstractPage;
import com.pages.AdminPage;
import com.pages.RegisterClientPage;
import com.pages.RegisterProductPage;
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

	protected AbstractPage abstractPage() {
		return getPages().currentPageAt(AbstractPage.class);
	}

	protected MenuPage menuPage() {
		return getPages().currentPageAt(MenuPage.class);
	}

	protected ProductsPage productsPage() {
		return getPages().currentPageAt(ProductsPage.class);
	}

	protected ProductPage productPage() {
		return getPages().currentPageAt(ProductPage.class);
	}

	protected CartPage cartPage() {
		return getPages().currentPageAt(CartPage.class);
	}
	
	protected RegisterProductPage registerProductPage() {
		return getPages().currentPageAt(RegisterProductPage.class);
	}
	
	protected RegisterClientPage registerClientPage() {
		return getPages().currentPageAt(RegisterClientPage.class);
	}
	
	protected AdminPage adminPage() {
		return getPages().currentPageAt(AdminPage.class);
	}
}
