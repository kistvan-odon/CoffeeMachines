package com.stepgroups;

import tools.Constants;

public class AdminStepGroups extends AbstractStepGroups {

	public void loginAdminUser(String username, String password) {
		abstractSteps.navigateToURL(Constants.BASE_URL);
		menuSteps.openMenuEntry(Constants.ADMIN);
		adminSteps.insertUsername(username);
		adminSteps.insertPassword(password);
		adminSteps.clickOnSubmitButton();
		adminSteps.verifyLoginMessage(username,
				Constants.SITE_LOGIN_WELCOME_MESSAGE);
	}
}
