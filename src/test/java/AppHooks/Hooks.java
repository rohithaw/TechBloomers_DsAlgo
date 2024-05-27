package AppHooks;

import java.io.ByteArrayInputStream;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Driver.Driver_Factory;
import context.Textcontext;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import utilities.ConfigReader;

public class Hooks {
	
	
	Textcontext textContext;
	static WebDriver driver;
	
	public Hooks(Textcontext textContext) {
		this.textContext = textContext;
	}
	
	@Before
	public void setUp1(){
		textContext.setDriver(driver);
		driver = textContext.getDriver();
		textContext.initializePageObjects(driver);		
		
	}
	
	@After 
	public void tearDown(Scenario scenario) {
		
//		To take a screenshot if there is any failed scenario. 
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			Allure.addAttachment("Failed Screenshot", new ByteArrayInputStream(screenshot));//Allure report screenshot
			scenario.attach(screenshot, "image/png", "image");//Extent report screenshot
		}
		
		textContext.getDriver().quit();
	}

}
	
	
	
	
//	private Driver_Factory driverFactory;
//	private WebDriver driver;
//	private ConfigReader configReader;
//	Properties prop;
//	
//	@Before(order = 0)
//	public void getProperty(){
//	configReader = new ConfigReader();
//	//prop = configReader.ConfigReader();
//	
//	}
//	@Before(order =1)
//	public void launchBrowser() {
//	String browserName = prop.getProperty("browser");
//	driverFactory = new Driver_Factory();
//	driver = driverFactory.init_driver(browserName);
//	}
//	@After(order = 0)
//	public void quitBrowser(){
//	driver.quit();
//	}
//	@After(order = 1)
//	public void teardown(Scenario scenario){
//	 if(scenario.isFailed()){
//	  //take screenshot:
//	String screenshotName = scenario.getName().replaceAll(" ", "_");
//	byte[] sourcePath = ((TakesScreenshot)driver). getScreenshotAs(OutputType.BYTES);
//	scenario.attach(sourcePath, "image/png", screenshotName);
//	}

	
	

