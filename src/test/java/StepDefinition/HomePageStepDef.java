package StepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebDriver;
import context.Textcontext;
import io.cucumber.java.en.*;
import pageObjects.DsAlgoHomePage;
import pageObjects.DsAlgoLoginPage;
import utilities.CommonMethods;
import utilities.Loggerload;
import utilities.PropertiesFile;

public class HomePageStepDef {
	
	DsAlgoHomePage hp;
	WebDriver driver;
	Textcontext textContext;
	
	//private dsAlgoHomePage hp = new dsAlgoHomePage(Driver_Factory.getDriver());
	
	public HomePageStepDef(Textcontext textContext) { 
		this.textContext = textContext;
		this.driver = textContext.getDriver();
		this.hp = textContext.getHp();
	}
	
	
	@Given("User enters homepage url")
	public void user_enters_homepage_url() {
	  
		String url = PropertiesFile.readPropertiesFile("MainPageUrl");
		driver.get(url);
	}

	@Then("User should be able to navigate to the home page and see the text - Preparing for the Interviews You are at the right place")
	public void user_should_be_able_to_navigate_to_the_home_page_and_see_the_text_preparing_for_the_interviews_you_are_at_the_right_place() {
	   
		String homeText=hp.homePageText.getText();
		assertEquals("Preparing for the Interviews", homeText); 
		Loggerload.info("******************* Launching Home Page******************");
		
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
		
		List<String> moduleNames = CommonMethods.printTextForWebElements(hp.dsModuleTitles);
		System.out.println(moduleNames);
		assertEquals(7, moduleNames.size());
	}

	@Then("User should be able to see the Register link")
	public void user_should_be_able_to_see_the_register_link() {
		
		assertTrue(hp.registerLink.isDisplayed());
	}

	@Then("User should be able to see the Sign in link")
	public void user_should_be_able_to_see_the_sign_in_link() {
		
		assertTrue(hp.SigninPageText.isDisplayed());
	}

	@Then("User should be able to see the datastructures dropdown with all six modules")
	public void user_should_be_able_to_see_the_datastructures_dropdown() {
		
		assertTrue(hp.dsDropDown.isDisplayed());
		List<String> options = CommonMethods.printTextForWebElements(hp.dsDropDownOptions);
		System.out.println(options);
		assertEquals(6, options.size());
	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String option) {
		
		//Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		String url1 = PropertiesFile.readPropertiesFile("HomePageUrl");
		driver.get(url1);
	   	hp.Getstart_click(option);
		
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String Message) throws IOException {
	    
	     hp.warning_mess(Message);
	     Loggerload.warn("******************You have got a login failure warning*********************");
	}

	@When("The user clicks on dropdown {string} without login")
	public void the_user_clicks_on_dropdown_without_login(String string) {
	  
		//Driver_Factory.getDriver().get("https://dsportalapp.herokuapp.com/home");
		String url1 = PropertiesFile.readPropertiesFile("HomePageUrl");
		driver.get(url1);
		hp.droplist(string);
	}

	@Then("The user get warning message again {string}")
	public void the_user_get_warning_message_again(String Message) throws IOException {
		
		 hp.warning_mess(Message);
	     Loggerload.warn("******************You have got a login failure warning*********************");
	   
		
	}

	@When("User clicks on the Sign in link")
	public void user_clicks_on_the_sign_in_link() {
	   
		hp.signinClick();
		Loggerload.info("*************Launching Signin Page*******************");
	}

	@Then("User gets redirected to the Sign in page and see the username field and password field")
	public void user_gets_redirected_to_the_sign_in_page_and_see_the_username_field_and_password_field() {
	   
		if(hp.username.isDisplayed()&& hp.password.isDisplayed()) {
			assertTrue(true);
		}
		else {
			assertTrue(false);

		}
		
	}

	@Then("User should be able to see the message - If you don't have an account, please Register!")
	public void user_should_be_able_to_see_the_message_if_you_don_t_have_an_account_please_register() {
		
//		String Actualmsg=hp.pleaseRegisterMessageLink.getText();
//		System.out.println(Actualmsg);
//		String ExpectedMsg="Register!";
//		assertEquals(ExpectedMsg,Actualmsg );
		
		assertEquals("Register!", hp.pleaseRegisterMessageLink.getText());
	   
	}

	@When("User clicks on the Register Link")
	public void user_clicks_on_the_register_link() {
	    
		hp.registerLink.click();
		Loggerload.info("*************Launching Register Page*******************");
	}

	@Then("User is redirected on the Register Page and should be able to see the Register button")
	public void user_is_redirected_on_the_register_page_and_should_be_able_to_see_the_register_button() {
	   
		assertTrue(hp.registerButton.isDisplayed());
	}

}
