package com.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class RegisterClientSteps extends AbstractSteps{

	public RegisterClientSteps(Pages pages) {
		super(pages);
	}

	private static final long serialVersionUID = 1L;

	@Step
	public void insertClientLastName(String lastName){
		registerClientPage().insertClientLastName(lastName);
	}

	@Step
	public void insertClientFirstName(String firstName){
		registerClientPage().insertClientFirstName(firstName);
	}

	@Step
	public void insertClientAddress(String address){
		registerClientPage().insertClientAddress(address);
	}

	@Step
	public void insertClientPhone(String phone){
		registerClientPage().insertClientPhone(phone);
	}

	@Step
	public void insertClientEmail(String email){
		registerClientPage().insertClientEmail(email);
	}

	@Step
	public void insertClientPassword(String password){
		registerClientPage().insertClientPassword(password);
	}
	
	@Step
	public void clickOnSubmitNewClientButton(){
		registerClientPage().clickOnSubmitNewClientButton();
	}
	
	@Step
	public void clickOnSubmitExistingClientButton(){
		registerClientPage().clickOnSubmitExistingClientButton();
	}
}
