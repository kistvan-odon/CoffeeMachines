package com.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import tools.Application;
import tools.Client;
import tools.Constants;
import tools.Product;

import com.stepgroups.RegisterProductStepGroups;

@Story(Application.Products.RegisterProducts.class)
@RunWith(ThucydidesRunner.class)
public class RegisterProductTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.REGISTER_PRODUCT_URL)
	public Pages pages;

	@Steps
	private RegisterProductStepGroups registerProductStepGroups;

	@Test
	public void registerProduct() {
		Product product = Product.generateNewProduct();
		registerProductStepGroups.registerProduct(product.category,
				product.smallImage, product.bigImage, product.brand,
				product.model, product.characteristics, product.price);
		Client client = Client.generateNewClient();
	}
}
