package testRunner;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.TestNgConfigReader;

 
 
@CucumberOptions(tags = "", features = {"src/test/resources/features/Array.feature",}, 
        glue = { "StepDefinition","AppHooks" },
		monochrome = false,
		dryRun = false,
				plugin = {"pretty", //For the Detailed output and generating reports.
						"html:target/Cucumber-Reports/TechBloomers1.html" , 
						"json:target/Cucumber-Reports/TechBloomers1.json" , 
						"junit:target/Cucumber-Reports/TechBloomers1.xml",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
 
		"rerun:target/failed_scenarios.txt"})
 
public class Runner extends AbstractTestNGCucumberTests {
 

	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios() {
		return super.scenarios();
	}
	
//	@BeforeTest
//
//	@Parameters({"browser"})
//
//	public void defineBrowser(String browser) throws Throwable {
//
//		TestNgConfigReader.setBrowserType(browser);
//
//
//}
}


