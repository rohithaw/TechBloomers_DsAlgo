package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	
@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			monochrome = false,  //console output formatting
			tags = "@DSALGO", //tags from feature file
			features = {"src/test/resources/features"}, //location of feature files
			glue= {"StepDefinition","AppHooks"}, //location of step definition files
			plugin = {"pretty", //For the Detailed output and generating reports.
						"html:target/Cucumber-Reports/TechBloomers.html" , 
						"json:target/Cucumber-Reports/TechBloomers.json" , 
						"junit:target/Cucumber-Reports/TechBloomers.xml",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
			"rerun:target/failed_scenarios.txt"})
		
	public class Runner1 {

	}
