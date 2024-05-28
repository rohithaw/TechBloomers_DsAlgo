package StepDefinition;




import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Driver.Driver_Factory;
import context.Textcontext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DsAlgoDataStructureIntroPage;
import pageObjects.DsAlgoHomePage;
import pageObjects.DsAlgoLoginPage;


public class DataStructureIntroStepDef {
	
	
	WebDriver driver;
	Textcontext textContext;	
	DsAlgoHomePage hp;
	DsAlgoLoginPage lp;
	DsAlgoDataStructureIntroPage dSIP;
	
	
	//private DsAlgoDataStructureIntroPage dSIP = new DsAlgoDataStructureIntroPage(Driver_Factory.getDriver());
	
	public DataStructureIntroStepDef(Textcontext textContext) { 
		this.textContext = textContext;
		this.driver = textContext.getDriver();
		this.dSIP = textContext.getDSIP();
	}
	

	@When("User finds the DataStructure pane and clicks on Get Started button")
	public void user_finds_the_data_structure_pane_and_clicks_on_get_started_button() {
		
		dSIP.clickGetStartedDataStructurePane();
	    
	}

	@Then("User navigated to Datastructure-Introductuion page")
	public void user_navigated_to_datastructure_introductuion_page() {
		dSIP.getDataStructureTextHead();
		assertEquals(dSIP.DataStructureText.getText(),"Data Structures-Introduction");
	    
	}

	
	@When("User clicks on Time Complexity button")
	public void user_clicks_on_time_complexity_button() throws InterruptedException {
		
		dSIP.clickontimecomplexity();
	    
	}

	@Then("User should be navigated to Time Complexity page")
	public void user_should_be_navigated_to_time_complexity_page(){
	   dSIP.getTimeComplexityTextHead();
	   assertEquals(dSIP.timecompTextHead.getText(),"Time Complexity"); 
	}

	
	@When("User clicks on Try Here button")
	public void user_clicks_on_try_here_button()throws InterruptedException {
		
		dSIP.clickontryhere();
	   
	}
	@When("enters validcode and clicks on Run button")
	public void enters_validcode_and_clicks_on_Run_button() {

       dSIP.clickOnTryEditorTextArea();
       dSIP.clickOnRunButton();
     	
	}
	
	@And("enters Invalidcode and clicks on run button")
	public void enters_Invalidcode_and_clicks_on_run_button() {
		dSIP.EnterInValidPythonCode();
		dSIP.clickOnRunButton();
	}
	
		
	@Then("User sees the output")
	public void user_sees_the_output() {
	  
		//dSIP.acceptBrowserAlert();
		dSIP.outputdisplay.getText();
		assertEquals(dSIP.outputdisplay.getText(),"Data in python");
	 		
	}
	
	
	@When("User clicks on Practice questions")
	public void user_clicks_on_practice_questions() {
	   
		dSIP.practiceQuestionsDataStructure();
	}

	@Then("User should be navigated to Blank page")
	public void User_should_be_navigated_to_Blank_page() {
		dSIP.pagedisp();
	    
	}
	

}
