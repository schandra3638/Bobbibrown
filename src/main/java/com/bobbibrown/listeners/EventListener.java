package com.bobbibrown.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;

public class EventListener extends ExtentReportListener implements ITestListener {
	private static ExtentReports eventExtent;

	public void onFinish(ITestContext arg0) {
		eventExtent.flush();

	}

	public void onStart(ITestContext arg0) {
		eventExtent = setUp();

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	public void onTestFailure(ITestResult arg0) {

	}

	public void onTestSkipped(ITestResult arg0) {

	}

	public void onTestStart(ITestResult arg0) {
		
		

	}

	public void onTestSuccess(ITestResult arg0) {
		

	}

}
