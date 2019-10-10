package com.bobbibrown.stepdefinitions;

import com.bobbibrown.hooks.ServiceHooks;
import com.bobbibrown.pages.AccountSignInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AccountSignInPageStepDefinition {

	private String featureName = "My Account";

	AccountSignInPage accountSignInPage = new AccountSignInPage(ServiceHooks.driver);

	@Given("^User is on Sign-in Page$")
	public void user_is_on_Sign_in_Page() throws Throwable {

		String scenario = "Return User Sign-in";
		String gherkinKeyword = "Given";
		String stepDescription = "user_is_on_Sign_in_Page";
		String stepPassMessage = "Title Of Account Sign Is Page Is Matched";

		accountSignInPage.verifyTitleOfAccountSignInPage("Sign In", featureName, scenario, gherkinKeyword,
				stepDescription, stepPassMessage);

	}

	@Then("^Enter username \"([^\"]*)\"$")
	public void enter_username(String username) throws Throwable {
		String scenario = "Return User Sign-in";
		String gherkinKeyword = "Then";
		String stepDescription = "enter_username";
		String stepPassMessage = "Enterd user";

		accountSignInPage.enterUserName(username, featureName, scenario, gherkinKeyword, stepDescription,
				stepPassMessage);

	}

	@Then("^Enter Password \"([^\"]*)\"$")
	public void enter_Password(String Password) throws Throwable {
		String scenario = "Return User Sign-in";
		String gherkinKeyword = "Then";
		String stepDescription = "enter_Password";
		String stepPassMessage = "Enterd Password";
		
		accountSignInPage.enterPassword(Password, featureName, scenario, gherkinKeyword, stepDescription,
				stepPassMessage);

	}

	@Then("^Click on Sign-in button$")
	public void click_on_Sign_in_button() throws Throwable {
		String scenario = "Return User Sign-in";
		String gherkinKeyword = "Then";
		String stepDescription = "Click_on_Sign_in_button";
		String stepPassMessage = "Clicked On Sign-in Button";

		accountSignInPage.clickOnSignIn(featureName, scenario, gherkinKeyword, stepDescription, stepPassMessage);

	}

}
