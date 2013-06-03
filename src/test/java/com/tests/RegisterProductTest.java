package com.tests;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import tools.Application;
import tools.Constants;
import tools.FileUtils;
import tools.Product;

import com.stepgroups.RegisterClientStepGroups;
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
	@Steps
	private RegisterClientStepGroups registerClientStepGroups;

	private Product product;
	
	@Test
	public void registerProduct() {
		product = Product.generateNewProduct();
		registerProductStepGroups.registerProduct(product.category,
				product.smallImage, product.bigImage, product.brand,
				product.model, product.characteristics, product.price);
	}
	
	@After
	public void tearDown(){
		FileUtils.deleteFileOrDirectory(product.smallImage);
		FileUtils.deleteFileOrDirectory(product.bigImage);
	}
}
