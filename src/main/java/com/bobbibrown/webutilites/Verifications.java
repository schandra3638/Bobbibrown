package com.bobbibrown.webutilites;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.bobbibrown.helper.LoggerHelper;
import com.bobbibrown.listeners.ExtentReportListener;

public class Verifications extends ExtentReportListener {
	private static Logger log = LoggerHelper.getLogger(Verifications.class);

	static List<String> features = new ArrayList<String>();

	public static void verifyTestPresentOnPage(String text, WebDriver driver) {
		log.info("Getting Text Present On Page");
		driver.findElement(By.tagName("html")).getText().contains(text);

	}

	public static void verifyTitileOfPage(String titile, WebDriver driver, String featureName, String scenariodes,
			String gherkinKeyword, String stepDescription, String stepPassMessage) {
		log.info("Getting Titile Of The Page");

		if (gherkinKeyword.equalsIgnoreCase("Given")) {

			try {

				if (true != features.contains(featureName)) {
					feature = extent.createTest(Feature.class, featureName);
					features.add(featureName);
				}

				scenario = feature.createNode(Scenario.class, scenariodes);
				step = scenario.createNode(new GherkinKeyword(gherkinKeyword), stepDescription);
				SoftAssert asse = new SoftAssert();
				asse.assertEquals(driver.getTitle(), titile);
				step.pass(stepPassMessage);
				step.addScreenCaptureFromPath(ExtentReportListener.captureScreenShot(driver));
			} catch (Exception e) {
				ExtentReportListener.testStepHandle("FAIL", driver, step, e);
			}

		} else {

			try {
				step = scenario.createNode(new GherkinKeyword(gherkinKeyword), stepDescription);
				SoftAssert asse = new SoftAssert();
				asse.assertEquals(driver.getTitle(), titile);
				step.pass(stepPassMessage);
				step.addScreenCaptureFromPath(ExtentReportListener.captureScreenShot(driver));
			} catch (Exception e) {
				ExtentReportListener.testStepHandle("FAIL", driver, step, e);
			}
		}

	}

}
