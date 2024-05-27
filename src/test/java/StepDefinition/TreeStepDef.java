package StepDefinition;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import Driver.Driver_Factory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DsAlgoTreePage;
import pageObjects.dsAlgoHomePage;
import pageObjects.dsAlgoLoginPage;
import utilities.Loggerload;

public class TreeStepDef {
	
	private DsAlgoTreePage tP =new DsAlgoTreePage(Driver_Factory.getDriver());
	dsAlgoHomePage hp;
	dsAlgoLoginPage lp;
	
	
	
	@When("User finds the Tree pane and clicks on Get Started button")
	public void user_finds_the_tree_pane_and_clicks_on_get_started_button() {
		tP.clickonGetStartedTreePane();
	}

	@Then("User navigated to Tree page")
	public void user_navigated_to_tree_page() {
		tP.treePage.click();
		assertEquals(tP.treePage.getText(), "Tree");
		
	}

	
	@When("User clicks on {string} in the tree page")
	public void user_clicks_on_in_the_tree_page(String string) {
	  tP.clickontreelinks(string);
		
	}
	

	@Then("User should navigated to {string} page")
	public void user_should_navigated_to_page(String string) {
		tP.treelinktextdisplay(string);
	}
	

	@When ("User clicks on Overview of Trees link in Tree page")
	public void User_clicks_on_Overview_of_Trees_link_in_Tree_page() {
		tP.overview.isDisplayed();
		tP.overview.click();
	    
	}


	@When("User clicks on TryHere button")
	public void user_clicks_on_try_here_button() {
	   tP.clickOnTryHereLink();
	    
	}

	@Then("User should redirected to Try Editor with Run button to test")
	public void user_should_redirected_to_try_editor_with_run_button_to_test() {
	    tP.TryEditorwithRunbuttondisplayed();
	   
	}

   
		
	@When("user enter a valid python code from sheet {string} and {int} tryEditor of Tree page")
	public void user_enter_a_valid_python_code_from_sheet_and_try_editor_of_tree_page(String sheetName, Integer RowNumber) throws InvalidFormatException, IOException   {
		utilities.ExcelReader reader=new utilities.ExcelReader();
		List<Map<String,String>> testData=reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", sheetName);
		String code1=testData.get(RowNumber).get("TreepythonCode");
		Loggerload.info(code1);
		
		tP.enterValidCodeTryEditorTextArea(code1);
		
	}

	@Then("user clicks on run button")
	public void user_clicks_on_run_button() {
		tP.clickOnRunButton();
	    
	}

	@Then("user should be presented with Run result")
	public void user_should_be_presented_with_run_result() {
	   tP.output.getText();
	
	   assertEquals(tP.output.getText(),"TreeData in python");
	    
	}
	
	@When("The user enter a Invalid python code from sheet {string} and {int} tryEditor of Tree page")
	public void the_user_enter_a_invalid_python_code_from_sheet_and_try_editor_of_tree_page(String sheetName, Integer RowNumber)throws InvalidFormatException, IOException {
		utilities.ExcelReader reader=new utilities.ExcelReader();
		List<Map<String,String>> testData=reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", sheetName);
		String code1=testData.get(RowNumber).get("TreepythonCode");
		Loggerload.info(code1);
		tP.enterinvalidCodeTryEditorTextArea(code1);
	}

	@Then("The user should be presented with Error popup")
	public void the_user_should_be_presented_with_error_popup() {
		tP.acceptBrowserAlert();
	   
	}
	@And ("User clicks on Practice questions in over view of trees")
	public void User_clicks_on_Practice_questions_in_over_view_of_trees(){
		
		tP.practiceQuestionsDataStructure();
		tP.pagedisp();
	}



}
