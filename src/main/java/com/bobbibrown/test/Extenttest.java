package com.bobbibrown.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;
import com.bobbibrown.listeners.ExtentReportListener;

public class Extenttest extends ExtentReportListener

{
	private static ExtentReports eventExtent;

	public static void test1() throws ClassNotFoundException {


		feature = extent.createTest(Feature.class, "My Account");
		scenario = feature.createNode(Scenario.class, "Return User Sign-in");
		scenario.createNode(new GherkinKeyword("Given"), "User is on Sign-in Page");
		scenario.createNode(new GherkinKeyword("Then"), "Enter username \"csstester114@gmail.com\"");
		scenario.createNode(new GherkinKeyword("Then"), "Enter Password \"Tester@123\"");
		scenario.createNode(new GherkinKeyword("Then"), "Click on Sign-in button");
		scenario.pass("User signed-in successfully");

		scenario = feature.createNode(Scenario.class, "Create New User Account");
		scenario.createNode(new GherkinKeyword("Given"), "User is on Sign-in Page");
		scenario.createNode(new GherkinKeyword("Then"), "Enter username \"csstester114@gmail.com\"");
		scenario.createNode(new GherkinKeyword("Then"), "Enter Password \"Tester@123\"");
		scenario.createNode(new GherkinKeyword("Then"), "Click on Sign-in button");
		scenario.pass("User signed-in successfully");

		scenario.createNode(Scenario.class, "Create New User Account Two");
		scenario.createNode(new GherkinKeyword("Given"), "User is on Sign-in Page");
		scenario.createNode(new GherkinKeyword("Then"), "Enter username \"csstester114@gmail.com\"");
		scenario.createNode(new GherkinKeyword("Then"), "Enter Password \"Tester@123\"");
		scenario.createNode(new GherkinKeyword("Then"), "Click on Sign-in button");
		scenario.pass("User signed-in successfully");
	}

	public static void main(String[] args) throws ClassNotFoundException {

		eventExtent = setUp();
		test1();
		eventExtent.flush();

	}

}
