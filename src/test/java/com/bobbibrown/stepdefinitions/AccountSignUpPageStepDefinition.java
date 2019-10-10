package com.bobbibrown.stepdefinitions;

import com.bobbibrown.hooks.ServiceHooks;
import com.bobbibrown.pages.AccountSignUpPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AccountSignUpPageStepDefinition 
{
	private String featureName = "My Account";
	
	AccountSignUpPage  accountSignUpPage = new AccountSignUpPage(ServiceHooks.driver);

	@Given("^User is on Sign-Up Page$")
	public void user_is_on_Sign_Up_Page() throws Throwable {
	   
		String scenario = "Create New Account";
		String gherkinKeyword = "Given";
		String stepDescription = "User_is_on_Sign_Up_Page";
		String stepPassMessage = "Title Of Account Sign Up Page is Matched";
		
		accountSignUpPage.verifyUserIsOnAccountSignUpPage("Sign In", featureName, scenario, gherkinKeyword, stepDescription, stepPassMessage);
		
		
	}

	@Then("^Enter New User Email Address \"([^\"]*)\"$")
	public void enter_New_User_Email_Address(String newUserEmailAddress ) throws Throwable {
		String scenario = "Create New Account";
		String gherkinKeyword = "Then";
		String stepDescription = "Enter_New_User_Email_Address";
		String stepPassMessage = "Entered New User Email Address";
		
		accountSignUpPage.enterNewUserEmailAddress(newUserEmailAddress, featureName, scenario, gherkinKeyword, stepDescription, stepPassMessage);
	    
	}

	@Then("^Enter New User Password \"([^\"]*)\"$")
	public void enter_New_User_Password(String newUserPassword) throws Throwable {
		String scenario = "Create New Account";
		String gherkinKeyword = "Then";
		String stepDescription = "Enter_New_User_Password";
		String stepPassMessage = "Entered New User Password";
		
		accountSignUpPage.enterNewUserPassword(newUserPassword, featureName, scenario, gherkinKeyword, stepDescription, stepPassMessage);
	   
	}

	@Then("^Agree Terms & Conditions$")
	public void agree_Terms_Conditions() throws Throwable {
		String scenario = "Create New Account";
		String gherkinKeyword = "Then";
		String stepDescription = "Agree_Terms_Conditions";
		String stepPassMessage = "Agreed Terms Conditions";
		
		accountSignUpPage.agreeTermsAndConditions(featureName, scenario, gherkinKeyword, stepDescription, stepPassMessage);
	}

	@Then("^Click On Sig-Up Button$")
	public void click_On_Sig_Up_Button() throws Throwable {
	    
		String scenario = "Create New Account";
		String gherkinKeyword = "Then";
		String stepDescription = "Click_On_Sig_Up_Button";
		String stepPassMessage = "Clicked On Sig_Up Button";
		
		accountSignUpPage.clickOnSigUpButton(featureName, scenario, gherkinKeyword, stepDescription, stepPassMessage);
	}

}
