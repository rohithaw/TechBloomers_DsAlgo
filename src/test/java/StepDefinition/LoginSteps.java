package StepDefinition;

import Driver.Driver_Factory;
import io.cucumber.java.en.*;
import pageObjects.dsAlgoLoginPage;

public class LoginSteps {
	
	private dsAlgoLoginPage lp = new dsAlgoLoginPage(Driver_Factory.getDriver());
	
	@When("Type Valid Numpy4 and Testers@{int}")
	public void type_valid_numpy4_and_testers(Integer int1) {
		
		
	}

	@When("Clicks on Login")
	public void clicks_on_login() {
	   
		lp.loginsucess();
	}

	@Then("You are logged in message should be displayed")
	public void you_are_logged_in_message_should_be_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
