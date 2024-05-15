package StepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Driver.Driver_Factory;
import io.cucumber.java.en.*;
import pageObjects.dsAlgoHomePage;
import pageObjects.dsAlgoLoginPage;
import utilities.ConfigReader;

public class HomePageStepDef {
	
	//dsAlgoHomePage hp;
	
	private dsAlgoHomePage hp = new dsAlgoHomePage(Driver_Factory.getDriver());
	
	
	@Given("User enters homepage url")
	public void user_enters_homepage_url() {
		
//		String url = ConfigReader.init_prop("HomePageUrl");
//		driver.get(url);
//		
//		System.setProperty("webdriver.chrome.driver","/Users/ark/Downloads/chromedriver");
//		ChromeOptions opt =new ChromeOptions();
//		opt.addArguments("--remote-allow-origins=*");
//		WebDriver driver=new ChromeDriver(opt);
		//driver.get("https://dsportalapp.herokuapp.com/");
     	//driver.get("https://dsportalapp.herokuapp.com/");
//		driver.manage().window().maximize();
//	   
	}

	@Then("User should be able to navigate to the home page and see the text - Preparing for the Interviews You are at the right place")
	public void user_should_be_able_to_navigate_to_the_home_page_and_see_the_text_preparing_for_the_interviews_you_are_at_the_right_place() {
	   
		String homeText=hp.homePageText.getText();
		assertEquals("Preparing for the Interviews", homeText); 
		
	}

	@Then("User should see the Get Started button")
	public void user_should_see_the_get_started_button() {
		
		assertTrue(hp.getStartedButtonHP.isDisplayed());
	}

	@When("User Clicks on Get Started button")
	public void user_clicks_on_get_started_button() {
		
		hp.clickgetstarted();
	   
	}

	@Then("Home Page is displayed with the all the seven datastructure modules")
	public void home_page_is_displayed_with_the_all_the_seven_datastructure_modules() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be able to see the Register link")
	public void user_should_be_able_to_see_the_register_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be able to see the Sign in link")
	public void user_should_be_able_to_see_the_sign_in_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be able to see the datastructures dropdown")
	public void user_should_be_able_to_see_the_datastructures_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on dropdown {string} without login")
	public void the_user_clicks_on_dropdown_without_login(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user get warning message again {string}")
	public void the_user_get_warning_message_again(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the Sign in link")
	public void user_clicks_on_the_sign_in_link() {
	   
		hp.signinClick();
	}

	@Then("User gets redirected to the Sign in page and see the username field and password field")
	public void user_gets_redirected_to_the_sign_in_page_and_see_the_username_field_and_password_field() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should be able to see the message - If you don't have an account, please Register!")
	public void user_should_be_able_to_see_the_message_if_you_don_t_have_an_account_please_register() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on the Register Link")
	public void user_clicks_on_the_register_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User is redirected on the Register Page and should be able to see the Register button")
	public void user_is_redirected_on_the_register_page_and_should_be_able_to_see_the_register_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
