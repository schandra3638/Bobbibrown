package com.bobbibrown.stepdefinitions;

import com.bobbibrown.hooks.ServiceHooks;
import com.bobbibrown.pages.AccountLandingPage;

import cucumber.api.java.en.Then;

public class AccountLandingPageStepDefinition {
	
	private String featureName = "My Account";

	AccountLandingPage accountLandingPage = new AccountLandingPage(ServiceHooks.driver);

	@Then("^Verify whether user is on Account landing page$")
	public void verify_whether_user_is_on_Account_landing_page() throws Throwable {
		String scenario = "Return User Sign-in";
		String gherkinKeyword = "Then";
		String stepDescription = "erify_whether_user_is_on_Account_landing_page";
		String stepPassMessage = "Title Of Account Landing Page Is Matched";
		
		accountLandingPage.verifyTitileOfAccountLandingPage("My Account",featureName, scenario, gherkinKeyword,stepDescription,stepPassMessage);
	}

	@Then("^Click on Sign-out link$")
	public void click_on_Sign_out_link() throws Throwable {

	}

}
