package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductPage extends AbstractPage{

	public AddProductPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(name = "combo")
	private WebElement productCategoryDropdown;
	
	@FindBy(name = "poza")
	private WebElement productSmallImageInput;
	
	@FindBy(name = "poza_mare")
	private WebElement productBigImageInput;
	
	@FindBy(name = "marca")
	private WebElement productBrandInput;
	
	@FindBy(name = "model")
	private WebElement productModelInput;
	
	@FindBy(name = "caracteristici")
	private WebElement productCharacteristicsInput;
	
	@FindBy(name = "pret")
	private WebElement productPriceInput;
	
	@FindBy(css = "input[value='Adauga']")
	private WebElement addProductButton;
	
	@FindBy(css = "input[value='reset']")
	private WebElement deleteProductButton;
	
	/**
	 * Selects the desired product category 
	 * @param productCategory
	 */
	public void selectProductCategory(String productCategory){
		element(productCategoryDropdown).selectByVisibleText(productCategory);
	}
	
	/**
	 * Inserts the small product image
	 * @param smallProductImage
	 */
	public void insertSmallProductImage(String smallProductImage){
		productSmallImageInput.sendKeys(smallProductImage);
	}
	
	/**
	 * Inserts the big product image
	 * @param bigProductImage
	 */
	public void insertBigProductImage(String bigProductImage){
		productBigImageInput.sendKeys(bigProductImage);
	}
	
	/**
	 * Inserts the brand of the product
	 * @param productBrand
	 */
	public void insertProductBrand(String productBrand){
		productBrandInput.sendKeys(productBrand);
	}
	
	/**
	 * Inserts the model of the product
	 * @param productModel
	 */
	public void insertProductModel(String productModel){
		productModelInput.sendKeys(productModel);
	}
	
	/**
	 * Inserts the characteristics of the product
	 * @param productCharacteristics
	 */
	public void insertProductCaracteristics(String productCharacteristics){
		productCharacteristicsInput.sendKeys(productCharacteristics);
	}
	
	/**
	 * Inserts the price of the product
	 * @param productPrice
	 */
	public void insertProductPrice(String productPrice){
		productPriceInput.sendKeys(productPrice);
	}
	
	/**
	 * Clicks on the "Add product" button
	 */
	public void clickOnAddProductButton(){
		addProductButton.click();
	}
	
	/**
	 * Clicks on the "Delete product" button
	 */
	public void clickOnDeleteProductButton(){
		deleteProductButton.click();
	}
}
