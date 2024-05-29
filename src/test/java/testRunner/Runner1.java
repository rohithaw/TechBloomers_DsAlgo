package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	
@RunWith(Cucumber.class) //Junit execution
@CucumberOptions(
		monochrome = false, //console output formatting
		tags = "@DSAlgo", //tags from feature file
		features = {"src/test/resources/features/Home.feature"}, //location of feature files
		glue = {"StepDefinition", "AppHooks"}, //location of step definition files
				plugin = {"pretty","html:target/Cucumber-Reports/Team19-SeleniumSurfers.html", //For the Detailed output and generating reports.
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
						"json:target/Cucumber-Reports/Team19-SeleniumSurfers.json" ,
						"junit:target/Cucumber-Reports/Team19-SeleniumSurfers.xml",},
		dryRun=false
		
		
		)
	public class Runner1 {

	}