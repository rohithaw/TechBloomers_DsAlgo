package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Driver.Driver_Factory;
import context.Textcontext;
import io.cucumber.java.en.*;
import pageObjects.DsAlgoHomePage;
import pageObjects.DsAlgoRegisterPage;
//import utilities.CommonMethods;
import utilities.Loggerload;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;

public class RegisterSteps {
	
	WebDriver driver;
	DsAlgoHomePage hp;
	DsAlgoRegisterPage rp;
	Textcontext textContext;
	
	//private dsAlgoRegisterPage rp = new dsAlgoRegisterPage(Driver_Factory.getDriver());
	
	public RegisterSteps(Textcontext textContext) { 
		this.textContext = textContext;
		this.driver = textContext.getDriver();
		this.rp = textContext.getRp();
	}
	
	

	@When("The user clicks Register button with {string},{string} and {string} empty")
	public void the_user_clicks_register_button_with_and_empty(String string, String string2, String string3) {
		
		//Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		rp.all_empty(string, string2, string3);
		
	}

	@Then("It should display an error Please fill out this field. below Username textbox")
	public void it_should_display_an_error_please_fill_out_this_field_below_username_textbox() {
	    
		String message=rp.err_username();
	    Loggerload.warn("Warning mess is:" + message);
		
		//String warningMessage = CommonMethods.getActiveElementAttribute(driver);
		Assert.assertEquals(message, "Please fill out this field.");
	}

	@When("User enters Username leaving other fields empty")
	public void user_enters_username_leaving_other_fields_empty() {
		
		rp.username_Register.sendKeys("Rohitha");
		
	}

	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {
	    
		rp.registerButton.click();
	}

	@Then("It should display an error - Please fill out this field below Password textbox")
	public void it_should_display_an_error_please_fill_out_this_field_below_password_textbox() {
	   
		String message=rp.err_password();
		Assert.assertEquals(message, "Please fill out this field.");
	}

	@When("User enters Username, Password leaving other fields empty")
	public void user_enters_username_password_leaving_other_fields_empty() {
	   
		rp.username_Register.sendKeys("Rohitha");
		rp.password_Register.sendKeys("Test");
		
	}

	@Then("It should display an error - Please fill out this field below Confirm Password textbox")
	public void it_should_display_an_error_please_fill_out_this_field_below_confirm_password_textbox() {
	   
		String message=rp.err_confirmpassword();
		Assert.assertEquals(message, "Please fill out this field.");
		
	}

	@When("user enters username password confirm-password and click Register with below status message")
	public void user_enters_username_password_confirm_password_and_click_register_with_below_status_message(DataTable dataTable) throws IOException {
		
		 List<Map<String, String>> user = dataTable.asMaps(String.class, String.class);
		 for (Map<String, String> form : user) {
			 String uname=form.get("username");
			 rp.username_Register.sendKeys(uname);
			 String pwd=form.get("password");
			 rp.password_Register.sendKeys(pwd);
			 String cnfpwd=form.get("confirm-password");
			 rp.confirmPassword_Register.sendKeys(cnfpwd);
			 rp.registerButton.click();
			 String Message=rp.err_Alert();
			 Loggerload.info(Message);
//			 rp.Sshot();
//			 String expectedmessage=form.get("status");
//			 Assert.assertEquals(Message, expectedmessage);
			 
		 }
	}

	

}
