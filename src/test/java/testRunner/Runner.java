package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"src/test/resources/features"},
			glue = {"StepDefinition", "AppHooks"},
			plugin = {"pretty","html:target/DsAlgo.html"},
//					"junit:target/cucumber-reports/cucumber.xml",
//				"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
			dryRun=false
			
			
			)
	public class Runner {

	}



