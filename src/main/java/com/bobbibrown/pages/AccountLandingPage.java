package com.bobbibrown.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bobbibrown.webutilites.Verifications;

public class AccountLandingPage {
	
	Logger log = Logger.getLogger(AccountLandingPage.class);
	private WebDriver driver;

	@FindBy(xpath = "//html")
	private WebElement myAccount;

	public AccountLandingPage(WebDriver driver) {
		this.driver = driver;
		log.info("Initializing The Elements of MyAccountLandingPage");
		PageFactory.initElements(driver, this);
		
	}

	public void verifyTitileOfAccountLandingPage(String title,String featureName, String scenario, String gherkinKeyword, String stepDescription, String stepPassMessage) {
		log.info("Verifying Titile Of Account Landing Page");
		Verifications.verifyTitileOfPage(title,driver, featureName, scenario, gherkinKeyword, stepDescription,
				stepPassMessage);

	}

}
