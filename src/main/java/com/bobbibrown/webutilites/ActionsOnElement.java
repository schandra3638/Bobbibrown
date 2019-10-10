package com.bobbibrown.webutilites;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.bobbibrown.helper.LoggerHelper;
import com.bobbibrown.listeners.ExtentReportListener;

public class ActionsOnElement extends ExtentReportListener {

	Logger log = LoggerHelper.getLogger(ActionsOnElement.class);

	static List<String> features = new ArrayList<String>();

	public static void click(WebElement element, WebDriver driver, String featureName, String scenariodes,
			String gherkinKeyword, String stepDescription, String stepPassMessage) {

		if (gherkinKeyword.equalsIgnoreCase("Given")) {

			try {
				if (true != features.contains(featureName)) {
					feature = extent.createTest(Feature.class, featureName);
					features.add(featureName);
				}

				scenario = feature.createNode(Scenario.class, scenariodes);
				step = scenario.createNode(new GherkinKeyword(gherkinKeyword), stepDescription);
				element.click();
				step.pass(stepPassMessage);
				step.addScreenCaptureFromPath(ExtentReportListener.captureScreenShot(driver));
			} catch (Exception e) {
				ExtentReportListener.testStepHandle("FAIL", driver, step, e);
			}

		} else {
			ExtentTest step = null;

			try {
				step = scenario.createNode(new GherkinKeyword(gherkinKeyword), stepDescription);
				element.click();
				step.pass(stepPassMessage);
				step.addScreenCaptureFromPath(ExtentReportListener.captureScreenShot(driver));
			} catch (Exception e) {
				ExtentReportListener.testStepHandle("FAIL", driver, step, e);
			}
		}

	}

	public static void setData(WebElement element, String data, WebDriver driver, String featureName,
			String scenariodes, String gherkinKeyword, String stepDescription, String stepPassMessage) {

		if (gherkinKeyword.equalsIgnoreCase("Given")) {

			try {

				if (true != features.contains(featureName)) {
					feature = extent.createTest(Feature.class, featureName);

				}

				scenario = feature.createNode(Scenario.class, scenariodes);
				step = scenario.createNode(new GherkinKeyword(gherkinKeyword), stepDescription);
				element.sendKeys(data);
				step.pass(stepPassMessage);
				step.addScreenCaptureFromPath(ExtentReportListener.captureScreenShot(driver));
			} catch (Exception e) {
				ExtentReportListener.testStepHandle("FAIL", driver, step, e);
			}

		} else {
			ExtentTest step = null;

			try {
				step = scenario.createNode(new GherkinKeyword(gherkinKeyword), stepDescription);
				element.sendKeys(data);
				step.pass(stepPassMessage);
				step.addScreenCaptureFromPath(ExtentReportListener.captureScreenShot(driver));
			} catch (Exception e) {
				ExtentReportListener.testStepHandle("FAIL", driver, step, e);
			}
		}

	}

}
