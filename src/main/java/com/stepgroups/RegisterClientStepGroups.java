package com.stepgroups;

import net.thucydides.core.annotations.StepGroup;

public class RegisterClientStepGroups extends AbstractStepGroups {

	@StepGroup
	public void registerClient(String lastName, String firstName,
			String address, String phone, String email, String password) {
		registerClientSteps.insertClientLastName(lastName);
		registerClientSteps.insertClientFirstName(firstName);
		registerClientSteps.insertClientAddress(address);
		registerClientSteps.insertClientPhone(phone);
		registerClientSteps.insertClientEmail(email);
		registerClientSteps.insertClientPassword(password);
		registerClientSteps.clickOnSubmitNewClientButton();
	}
	
	@StepGroup
	public void loginExistingClient(String email, String password) {
		registerClientSteps.insertClientEmail(email);
		registerClientSteps.insertClientPassword(password);
		registerClientSteps.clickOnSubmitExistingClientButton();
	}
}
