package com.bobbibrown.webutilites;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bobbibrown.configreader.ConfigReader;
import com.bobbibrown.configreader.PropertyFileReader;
import com.bobbibrown.helper.LoggerHelper;

public class Browser {

	private Logger log = LoggerHelper.getLogger(Browser.class);
	WebDriver driver;
	public Browser() {
		System.setProperty(ConfigReader.chromeDriver_Key, ConfigReader.chromeDriver_Value);
		System.setProperty(ConfigReader.fireFoxDriver_Key, ConfigReader.fireFoxDriver_Value);
		log.info("Set Driver Executable Path");

	}

	private WebDriver browserSetUp(String browser) {
		if ("Chrome".equalsIgnoreCase(browser)) {
			log.info("Launching Chrome Browser");
			return new ChromeDriver();
		} else if ("Firefox".equalsIgnoreCase(browser)) {
			log.info("Launching Firefox Browser");
			return new FirefoxDriver();
		} else {
			log.info("Invalid Browser Type");

		}

		return null;
	}

	public WebDriver openApplication() throws FileNotFoundException, IOException {
		PropertyFileReader propertyFileReader = new PropertyFileReader();
		driver = browserSetUp(propertyFileReader.getBrowser());
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		log.info("Opening site : "+propertyFileReader.getWebSite());
		driver.get(propertyFileReader.getWebSite());
		log.info("Setting implicitly Wait");
		driver.manage().timeouts().implicitlyWait(propertyFileReader.getImplcitWaitTime(), TimeUnit.SECONDS);
		log.info("Setting Page Load Timeout");
		driver.manage().timeouts().pageLoadTimeout(propertyFileReader.getPageLoadTimeOut(), TimeUnit.SECONDS);
		driver.navigate().refresh();
		return driver;

	}
	
	public void closeApplication() {
		driver.close();
		log.info("Closed Application");
		
	}

}
