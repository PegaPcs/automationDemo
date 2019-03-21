package com.excellus.bdd.aut.pcs.trigger;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;
import com.excellus.bdd.aut.pcs.core.Constants;
import com.github.mkolisnyk.cucumber.runner.RetryAcceptance;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
					 plugin = { "pretty", "html:target/htmlreports",
	                 "json:target/cucumber.json",
	                // "usage:reports/cucumber-usage.json",
	                "com.cucumber.listener.ExtentCucumberFormatter:reports/cucumber-reports/extentreport.html",
	                 //"junit:reports/cucumber-junit.xml",
	                 //"pretty:reports/cucumber-pretty.txt",
	                },
					 features = { "../AutomationSuite/src/test/java/com/excellus/bdd/aut/pcs/regsuite/smoke/F01_00_benefit_creation.feature" },
					 glue = { "com.excellus.bdd.aut.pcs.testasserts" },
					 tags = { "@SmokeTest" },
					 monochrome = true, //display the console output in a proper readable format
					 strict = true, //it will check if any step is not defined in step definition file
					 dryRun = false //to check the mapping is proper between feature file and step def file
					)
public class TestRunner 
{

	public static int retries = 0;
	
	public TestRunner()	{ }
		@RetryAcceptance
		public static boolean retryCheck(Throwable e)
		{
			//Does not allow re-run if error message contains "Configuration failed" phrase
			return !e.getMessage().contains("Configuration failed");
		}
				
		@AfterClass()
		public static void writeExtentReport()
		{
			 Reporter.loadXMLConfig(new File (Constants.EXTENTCONFIG_DIR));
		}
		
}

//ORed: tags = {"@SmokeTest, @RegressionTest"} --- execute all tests tagged as @SmokeTest OR @RegressionTest
//ANDed: tags = {"@SmokeTest", "@RegressionTest"} --- execute all tests tagged as @SmokeTest AND @RegressionTest
