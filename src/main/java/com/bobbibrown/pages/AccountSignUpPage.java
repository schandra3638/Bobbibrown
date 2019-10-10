package com.bobbibrown.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bobbibrown.webutilites.ActionsOnElement;
import com.bobbibrown.webutilites.Verifications;

public class AccountSignUpPage 
{
	private WebDriver driver;
	
	@FindBy(xpath="//input[@data-test-id='form_email']")
	private WebElement newUserEmailAddress;
	
	@FindBy(xpath="//input[@data-test-id='form_password']")
	private WebElement newUserPassword;
	
	@FindBy(xpath="(//div[@class='new-account__item checkbox__content'])[2]/label")
	private WebElement termsAndConditions;
	
	@FindBy(xpath="//input[@data-test-id='form_registration_continue']")
	private WebElement sinUpButton; 
	

	public AccountSignUpPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void verifyUserIsOnAccountSignUpPage(String title, String featureName, String scenario, String gherkinKeyword, String stepDescription, String stepPassMessage )
	{
		Verifications.verifyTitileOfPage(title, driver, featureName, scenario, gherkinKeyword, stepDescription, stepPassMessage);
		
	}
	
	public void enterNewUserEmailAddress(String newUserEmailAddress, String featureName, String scenario, String gherkinKeyword, String stepDescription, String stepPassMessage  )
	{
		ActionsOnElement.setData(this.newUserEmailAddress, newUserEmailAddress, driver, featureName, scenario, gherkinKeyword, stepDescription, stepPassMessage);
		
	}
	
	public void enterNewUserPassword(String newUserPassword, String featureName, String scenario, String gherkinKeyword, String stepDescription, String stepPassMessage) {
		ActionsOnElement.setData(this.newUserPassword, newUserPassword, driver, featureName, scenario, gherkinKeyword, stepDescription, stepPassMessage);
	}
	
	public void agreeTermsAndConditions(String featureName, String scenario, String gherkinKeyword, String stepDescription, String stepPassMessage){
		
		ActionsOnElement.click(this.termsAndConditions, driver, featureName, scenario, gherkinKeyword, stepDescription, stepPassMessage);
	}
	
	public void clickOnSigUpButton(String featureName, String scenario, String gherkinKeyword, String stepDescription, String stepPassMessage) {
		ActionsOnElement.click(this.sinUpButton, driver, featureName, scenario, gherkinKeyword, stepDescription, stepPassMessage);
	}

	

}
