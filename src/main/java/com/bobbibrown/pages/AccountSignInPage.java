package com.bobbibrown.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bobbibrown.configreader.PropertyFileReader;
import com.bobbibrown.helper.LoggerHelper;
import com.bobbibrown.webutilites.ActionsOnElement;
import com.bobbibrown.webutilites.Verifications;
import com.bobbibrown.webutilites.WaitForElement;

public class AccountSignInPage {

	private Logger log = LoggerHelper.getLogger(Verifications.class);
	private WebDriver driver;

	@FindBy(xpath = "//input[@data-test-id='form_signin_email']")
	private WebElement userName;

	@FindBy(xpath = "//input[@data-test-id='form_signin_password']")
	private WebElement passwod;

	@FindBy(xpath = "	//input[@data-test-id='form_signin_continue']")
	private WebElement signIn;

	public AccountSignInPage(WebDriver driver) {
		this.driver = driver;
		log.info("Initializing The Elements of MyAccountSignInPage ");
		PageFactory.initElements(driver, this);

	}

	public void verifyTitleOfAccountSignInPage(String titile, String featureName, String scenario, String gherkinKeyword, String stepDescription, String stepPassMessage) {
		log.info("Verifying Title Of AccountSignIn Page");
		Verifications.verifyTitileOfPage(titile,driver, featureName, scenario, gherkinKeyword, stepDescription,
				stepPassMessage );
	}

	public void enterUserName(String userName, String featureName, String scenario, String gherkinKeyword,
			String stepDescription, String stepPassMessage) throws FileNotFoundException, IOException {
		
		WaitForElement wait = new WaitForElement(driver);
		PropertyFileReader propertyFileReader = new PropertyFileReader();
		
		wait.waitUntilElementVisible(this.userName, propertyFileReader.getExplicitWaitTime(),
				propertyFileReader.getPollingEveryInMiliSec());
		
		log.info("Enter User Name : " + userName);
		ActionsOnElement.setData(this.userName, userName, driver, featureName, scenario, gherkinKeyword, stepDescription,
				stepPassMessage);
	}

	public void enterPassword(String password, String featureName, String scenario, String gherkinKeyword,
			String stepDescription, String stepPassMessage) {
		log.info("Enter Password : " + password);
		ActionsOnElement.setData(this.passwod, password, driver, featureName, scenario, gherkinKeyword, stepDescription,
				stepPassMessage);
	}

	public AccountLandingPage clickOnSignIn(String featureName, String scenario, String gherkinKeyword,
			String stepDescription, String stepPassMessage) {
		log.info("Click On SignIn Button");
		ActionsOnElement.click(this.signIn, driver, featureName, scenario, gherkinKeyword, stepDescription,
				stepPassMessage);
		return new AccountLandingPage(driver);
	}

}
