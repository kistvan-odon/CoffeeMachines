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

import com.stepgroups.BuyProductStepGroups;
import com.stepgroups.RegisterClientStepGroups;

@Story(Application.Products.BuyProducts.class)
@RunWith(ThucydidesRunner.class)
public class BuyProductWithNewClientTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	@ManagedPages(defaultUrl = Constants.BASE_URL)
	public Pages pages;

	@Steps
	private BuyProductStepGroups buyMachinesStepGroups;
	@Steps
	private RegisterClientStepGroups registerClientStepGroups;

	@Test
	public void buyProductWithNewClient() {
		Product product = Product.getRandomExistingProduct();
		buyMachinesStepGroups.addProductToCart(product.category, product.brand
				+ " " + product.model, product.characteristics, product.price);
		buyMachinesStepGroups.verifyProductInCart(1, product.brand + " "
				+ product.model, product.price, product.price);
		buyMachinesStepGroups.selectClientTypeAndGoToCheckout(true);
		Client client = Client.generateNewClient();
		registerClientStepGroups.registerClient(client.lastName,
				client.firstName, client.address, client.phone, client.email,
				client.password);
	}
}
