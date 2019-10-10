package com.bobbibrown.testrunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@CucumberOptions(
		features = ".\\src\\test\\resources\\com\\bobbibrown\\features", 
		glue = {"com.bobbibrown.stepdefinitions", "com.bobbibrown.hooks" }, 
		plugin = { "pretty", "html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReport.json",
				 "rerun:target/cucumber-reports/rerun.txt" }, 
		monochrome = true, 																	
		strict = true, 
		dryRun = false
		)
public class TestRunner {
	
	private static TestNGCucumberRunner testNGCucumberRunner;
	   
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		
	}

	@Test(dataProvider = "features")
	public void scenario(PickleEventWrapper pickleEvent, CucumberFeatureWrapper cucumberFeature) throws Throwable {
		testNGCucumberRunner.runScenario(pickleEvent.getPickleEvent());
	}

	@DataProvider(parallel = true)
	public Object[][] features() {
		
		return testNGCucumberRunner.provideScenarios();
	}

	@AfterClass(alwaysRun = false)
	public void testDownClass() {
		testNGCucumberRunner.finish();
	}

}
