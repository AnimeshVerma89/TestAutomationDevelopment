package com.automation.testrunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features =".//Features/Login.feature",
		glue = "com.automation.stepdefinitions",
		dryRun = false,
		monochrome=true,
		plugin = {"pretty","html:test-output"})
	


public class TestRun {

}
