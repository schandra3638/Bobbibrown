package com.bobbibrown.webutilites;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.apache.log4j.Logger;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bobbibrown.helper.LoggerHelper;

public class WaitForElement {

	private Logger log = LoggerHelper.getLogger(WaitForElement.class);
	WebDriver driver;

	public WaitForElement(WebDriver driver) {
		this.driver = driver;

	}

	public WebDriverWait webDriverWait(int timeOutInSeconds, long pollingEveryInMiliSec) {

		log.info("Setting WebDriverWait :" + timeOutInSeconds);
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.pollingEvery(Duration.ofMillis(pollingEveryInMiliSec));
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(StaleElementReferenceException.class);
		wait.ignoring(NoSuchFrameException.class);
		return wait;

	}

	public void waitUntilElementVisible(WebElement element, int timeOutInSeconds, long pollingEveryInMiliSec) {
		log.info("Waiting Until Element : "+ element + "Visible");
		WebDriverWait wait = webDriverWait(timeOutInSeconds, pollingEveryInMiliSec);
		
		try {
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			
			log.info("Element "+element+" Is Not Visible Due To : "+e);
		}
	}

	public void waitUntilElementToBeClickable(WebElement element, int timeOutInSeconds, int pollingEveryInMiliSec) {
		log.info("Waiting Until Element "+element+ " To Be Clickable");
		WebDriverWait wait = webDriverWait(timeOutInSeconds, pollingEveryInMiliSec);
		
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			log.info("Element "+element+" Is Not Clickable Due To : "+e);
		}
	}

}
