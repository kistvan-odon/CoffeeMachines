package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class AdminSteps extends AbstractSteps {

	public AdminSteps(Pages pages) {
		super(pages);
	}

	private static final long serialVersionUID = 1L;

	@Step
	public void insertUsername(String username) {
		adminPage().insertUsername(username);
	}

	@Step
	public void insertPassword(String password) {
		adminPage().insertPassword(password);
	}

	@Step
	public void clickOnSubmitButton() {
		adminPage().clickOnSubmitButton();
	}

	@Step
	public void clickOnAddProductButton() {
		adminPage().clickOnAddProductButton();
	}

	@Step
	public void clickOnListOrdersButton() {
		adminPage().clickOnListOrdersButton();
	}

	@Step
	public void clickOnDeleteProductButton() {
		adminPage().clickOnDeleteProductButton();
	}
	
	@Step
	public void clickOnLogOutLink() {
		adminPage().clickOnLogOutLink();
	}
	
	@Step
	public void verifyLoginMessage(String username, String message) {
		adminPage().verifyLoginMessage(username, message);
	}
}
