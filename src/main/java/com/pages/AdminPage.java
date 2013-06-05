package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage extends AbstractPage {

	public AdminPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "input[name='numeletau']")
	private WebElement usernameInput;

	@FindBy(css = "input[name='parolata']")
	private WebElement passwordInput;

	@FindBy(css = "input[name='trimite']")
	private WebElement submitButton;

	@FindBy(css = "input[value='Adaugare produs']")
	private WebElement addProductButton;

	@FindBy(css = "input[value='Afisare comenzi']")
	private WebElement listOrdersButton;

	@FindBy(css = "input[value='Stergere produs']")
	private WebElement deleteProductButton;

	@FindBy(css = "a[href='delogare.php']")
	private WebElement logOutLink;

	@FindBy(css = "div.body-middle > h3[align='right']")
	private WebElement logInMessageContainer;

	/**
	 * Inserts the username
	 * 
	 * @param username
	 */
	public void insertUsername(String username) {
		usernameInput.sendKeys(username);
	}

	/**
	 * Inserts the username
	 * 
	 * @param password
	 */
	public void insertPassword(String password) {
		passwordInput.sendKeys(password);
	}

	/**
	 * Clicks on the "Submit" button
	 */
	public void clickOnSubmitButton() {
		submitButton.click();
	}

	/**
	 * Clicks on the "Add Product" button
	 */
	public void clickOnAddProductButton() {
		addProductButton.click();
	}

	/**
	 * Clicks on the "List Orders" button
	 */
	public void clickOnListOrdersButton() {
		listOrdersButton.click();
	}

	/**
	 * Clicks on the "Delete Product" button
	 */
	public void clickOnDeleteProductButton() {
		deleteProductButton.click();
	}

	/**
	 * Clicks on the "Log Out" link
	 */
	public void clickOnLogOutLink() {
		logOutLink.click();
	}

	/**
	 * Verifies that the login was successful and that the welcome message is
	 * the expected one
	 * 
	 * @param username
	 * @param message
	 */
	public void verifyLoginMessage(String username, String message) {
		String actualLoginMessage = logInMessageContainer.getText();
		Assert.assertTrue(
				"Login message is '" + actualLoginMessage.toLowerCase()
						+ "' and it should contain '" + username.toLowerCase()
						+ "'!",
				actualLoginMessage.toLowerCase().contains(
						username.toLowerCase()));
		Assert.assertTrue("Login message is '" + actualLoginMessage
				+ "' and it should contain '" + message + "'!",
				actualLoginMessage.contains(message));
	}
}
