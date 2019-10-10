package com.bobbibrown.hooks;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.bobbibrown.helper.LoggerHelper;
import com.bobbibrown.webutilites.Browser;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class ServiceHooks 
{
	
	Logger log = LoggerHelper.getLogger(ServiceHooks.class);
	private Browser browser;
	public static WebDriver driver;
	
	@Before
	public void launchApplication() throws FileNotFoundException, IOException {
		
		log.info("Launching Service Hook");
	    browser = new Browser();
		driver = browser.openApplication();
	}
	
	@After
	public void closeApplication() {
		log.info("Closing Service Hook");
		browser.closeApplication();
	}

}
