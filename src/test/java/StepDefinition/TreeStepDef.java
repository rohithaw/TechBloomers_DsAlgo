package StepDefinition;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;

import Driver.Driver_Factory;
import context.Textcontext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DsAlgoTreePage;
import pageObjects.DsAlgoHomePage;
import pageObjects.DsAlgoLoginPage;
import utilities.Loggerload;

public class TreeStepDef {
	
	//private DsAlgoTreePage tP =new DsAlgoTreePage(Driver_Factory.getDriver());
	
	WebDriver driver;
	DsAlgoHomePage hp;
	DsAlgoLoginPage lp;
	DsAlgoTreePage tp;
	Textcontext textContext;
	
	public TreeStepDef(Textcontext textContext) { 
		this.textContext = textContext;
		this.driver = textContext.getDriver();
		this.tp = textContext.getTp();
	}
	
	
	@When("User finds the Tree pane and clicks on Get Started button")
	public void user_finds_the_tree_pane_and_clicks_on_get_started_button() {
		tp.clickonGetStartedTreePane();
	}

	@Then("User navigated to Tree page")
	public void user_navigated_to_tree_page() {
		tp.treePage.click();
		assertEquals(tp.treePage.getText(), "Tree");
		
	}

	
	@When("User clicks on {string} in the tree page")
	public void user_clicks_on_in_the_tree_page(String string) {
		tp.clickontreelinks(string);
		
	}
	

	@Then("User should navigated to {string} page")
	public void user_should_navigated_to_page(String string) {
		tp.treelinktextdisplay(string);
	}
	

	@When ("User clicks on Overview of Trees link in Tree page")
	public void User_clicks_on_Overview_of_Trees_link_in_Tree_page() {
		tp.overview.isDisplayed();
		tp.overview.click();
	    
	}


	@When("User clicks on TryHere button")
	public void user_clicks_on_try_here_button() {
		tp.clickOnTryHereLink();
	    
	}

	@Then("User should redirected to Try Editor with Run button to test")
	public void user_should_redirected_to_try_editor_with_run_button_to_test() {
		tp.TryEditorwithRunbuttondisplayed();
	   
	}

   
		
	@When("user enter a valid python code from sheet {string} and {int} tryEditor of Tree page")
	public void user_enter_a_valid_python_code_from_sheet_and_try_editor_of_tree_page(String sheetName, Integer RowNumber) throws InvalidFormatException, IOException   {
		utilities.ExcelReader reader=new utilities.ExcelReader();
		List<Map<String,String>> testData=reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", sheetName);
		String code1=testData.get(RowNumber).get("TreepythonCode");
		Loggerload.info(code1);
		
		tp.enterValidCodeTryEditorTextArea(code1);
		
	}

	@Then("user clicks on run button")
	public void user_clicks_on_run_button() {
		tp.clickOnRunButton();
	    
	}

	@Then("user should be presented with Run result")
	public void user_should_be_presented_with_run_result() {
		tp.output.getText();
	
	   assertEquals(tp.output.getText(),"This is Tree in python");
	    
	}
	
	@When("The user enter a Invalid python code from sheet {string} and {int} tryEditor of Tree page")
	public void the_user_enter_a_invalid_python_code_from_sheet_and_try_editor_of_tree_page(String sheetName, Integer RowNumber)throws InvalidFormatException, IOException {
		utilities.ExcelReader reader=new utilities.ExcelReader();
		List<Map<String,String>> testData=reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", sheetName);
		String code1=testData.get(RowNumber).get("TreepythonCode");
		Loggerload.info(code1);
		tp.enterinvalidCodeTryEditorTextArea(code1);
	}

	@Then("The user should be presented with Error popup")
	public void the_user_should_be_presented_with_error_popup() {
		tp.acceptBrowserAlert();
	   
	}
	@And ("User clicks on Practice questions in over view of trees")
	public void User_clicks_on_Practice_questions_in_over_view_of_trees(){
		
		tp.practiceQuestionsDataStructure();
		tp.pagedisp();
	}



}
