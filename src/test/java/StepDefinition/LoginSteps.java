package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Driver.Driver_Factory;
import context.Textcontext;
import io.cucumber.java.en.*;
import pageObjects.DsAlgoLoginPage;
import utilities.ExcelReader;
import utilities.Loggerload;
import utilities.PropertiesFile;

public class LoginSteps {
	
	WebDriver driver;
	DsAlgoLoginPage lp;
	Textcontext textContext;
	
	//private dsAlgoLoginPage lp = new dsAlgoLoginPage(Driver_Factory.getDriver());
	
	public LoginSteps(Textcontext textContext) { 
		this.textContext = textContext;
		this.driver = textContext.getDriver();
		this.lp = textContext.getLp();
	}
	
	
	@When("Click on Login with Valid Username and Password")
	public void click_on_login_with_valid_username_and_password() {
	    
		lp.loginsucess();
		Loggerload.info("******* User Succesfully logs into DSAlgo Portal *******");
	}


	@Then("You are logged in message should be displayed")
	public void you_are_logged_in_message_should_be_displayed() {
	    
		lp.dispMsg();
		
	}
	
	@Given("The user is on signin page")
	public void the_user_is_on_signin_page() {
	   
		String url = PropertiesFile.readPropertiesFile("LoginPageUrl");
		driver.get(url);
		
		
	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
	   
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", Sheetname);
		String uname=testData.get(RowNumber).get("username");
		String pwd=testData.get(RowNumber).get("password");
		Loggerload.info("**** Username entered ****" +uname);
		Loggerload.info("***** Password entered ****" +pwd);
		lp.signin_excel(uname, pwd);
	}

	@Then("click login button to verify error Message")
	public void click_login_button_to_verify_login() {
	    
		lp.click_login();
		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		Loggerload.info("Actual message appeared on screen: " + messageStr);
		
	}
	
	@Then("click login button to display login message")
	public void click_login_button_to_display_login_message() {
	    
		lp.click_login();
		Loggerload.info("User click on Login Button");
		lp.dispMsg();
		
	}



}
