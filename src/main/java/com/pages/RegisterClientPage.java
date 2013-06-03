package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterClientPage extends AbstractPage {

	public RegisterClientPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "input[name='num']")
	private WebElement clientLastNameInput;

	@FindBy(css = "input[name='prenum']")
	private WebElement clientFirstNameInput;

	@FindBy(css = "input[name='adr']")
	private WebElement clientAddressInput;

	@FindBy(css = "input[name='tel']")
	private WebElement clientPhoneInput;

	@FindBy(css = "input[name='mail']")
	private WebElement clientEmailInput;

	@FindBy(css = "input[name='pw']")
	private WebElement clientPasswordInput;

	@FindBy(css = "input[name='trimit']")
	private WebElement submitNewClientButton;

	@FindBy(css = "input[name='trimit1']")
	private WebElement submitExistingClientButton;

	/**
	 * Inserts the client's last name
	 * 
	 * @param lastName
	 */
	public void insertClientLastName(String lastName) {
		clientLastNameInput.sendKeys(lastName);
	}

	/**
	 * Inserts the client's first name
	 * 
	 * @param firstName
	 */
	public void insertClientFirstName(String firstName) {
		clientFirstNameInput.sendKeys(firstName);
	}

	/**
	 * Inserts the client's address
	 * 
	 * @param lastName
	 */
	public void insertClientAddress(String address) {
		clientAddressInput.sendKeys(address);
	}

	/**
	 * Inserts the client's phone
	 * 
	 * @param phone
	 */
	public void insertClientPhone(String phone) {
		clientPhoneInput.sendKeys(phone);
	}

	/**
	 * Inserts the client's email
	 * 
	 * @param email
	 */
	public void insertClientEmail(String email) {
		clientEmailInput.sendKeys(email);
	}

	/**
	 * Inserts the client's password
	 * 
	 * @param password
	 */
	public void insertClientPassword(String password) {
		clientPasswordInput.sendKeys(password);
	}

	/**
	 * Clicks on the "Submit" button for new client
	 */
	public void clickOnSubmitNewClientButton() {
		submitNewClientButton.click();
	}

	/**
	 * Clicks on the "Submit" button for existing client
	 */
	public void clickOnSubmitExistingClientButton() {
		submitExistingClientButton.click();
	}
}
