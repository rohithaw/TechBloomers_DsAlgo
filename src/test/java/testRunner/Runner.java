package testRunner;

import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

 
 
@CucumberOptions(tags = "", features = {"src/test/resources/features",}, 
        glue = { "StepDefinition","AppHooks" },
		monochrome = false,
		dryRun = false, plugin = { "pretty",
		"html:target/HtmlReport/htmlreport.html",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
 
		"rerun:target/failed_scenarios.txt"})
 
public class Runner extends AbstractTestNGCucumberTests {
 

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}


