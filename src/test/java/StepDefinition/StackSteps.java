package StepDefinition;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
//import Driver.Driver_Factory;
import context.Textcontext;
import io.cucumber.java.en.*;
import pageObjects.DsAlgoStackPage;
import pageObjects.DsAlgoHomePage;
import pageObjects.DsAlgoLoginPage;
import utilities.ExcelReader;
import utilities.Loggerload;

public class StackSteps {
	
	 WebDriver driver;
	 DsAlgoLoginPage lp;
	 DsAlgoHomePage hp;
	 DsAlgoStackPage sp;
	 Textcontext textContext;
		 
	//private DsAlgoStackPage sp = new DsAlgoStackPage(Driver_Factory.getDriver());
	 
	 public StackSteps(Textcontext textContext) { 
			this.textContext = textContext;
			this.driver = textContext.getDriver();
			this.sp = textContext.getSp();
		}
		

	
	@And ("Click on the Get Started button for Stack Datastructures")
	public void click_on_the_get_started_button_for_stack_datastructures() {
	
		sp.getStartedStackPage.click();
}
	@When("User select Stack from the drop down menu")
	public void user_select_stack_from_the_drop_down_menu() {
		sp.dsDropDown.click();
		sp.stackDropDownElement.click();
}

	@Then("User should be navigated to the stack page")
	public void user_should_be_navigated_to_the_stack_page() {
	    assertEquals(sp.StackPage.getText(),"Stack");
	}
	
	@Then("User clicks on Operations in Stack on Stack Page")
	public void user_clicks_on_operations_in_stack_on_stack_page() {
		sp.opInstack.click();
	}
	
	@Then("user clicks on the Practice Questions on Stack Page")
	public void user_clicks_on_the_practice_questions_on_stack_page() {
	    sp.prac_ques.click();
	}

	@Then("user navigates to the blank page on Stack Page")
	public void user_navigates_to_the_blank_page_on_stack_page() {
	    sp.pagedisp();
	}
		
	@When("User clicks on {string} link in Stack Page")
	public void user_clicks_on_link_in_stack_page(String string) {
		sp.stacklinkselect(string);
	}
	
	@Then("user should be redirected to that {string} page in Stack Page")
	public void user_should_be_redirected_to_that_page_in_stack_page(String string) {
		sp.stacklinktextdisplay(string);
	}
	
	@Then("User clicks on Try here button in Stack Page")
	public void user_clicks_on_try_here_button_in_stack_page() {
	    
		sp.displayTryHerebtn();
		sp.clkTryHerebtn();
		
	}
	
	@And("user should be redirected to a page having a tryEditor with a Run button to test in Stack Page")
	public void user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test_in_stack_page() {
		
		sp.displayRunBtn();
	   	}
	
	@When("The user enters a valid python code in tryEditor from sheet {string} and {int} in Stack Page")
	public void the_user_enters_a_valid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
	   
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("StackpythonCode");
		Loggerload.info("validcode entered into tryEditor : "+ code1);
		sp.Stack_valid_python_code(code1);
				
	}

	@Then("The user clicks on run button in Stack Page")
	public void the_user_clicks_on_run_button_in_stack_page(){
       sp.run_bttn_click();
		
	}

	@Then("The user should be presented with Run result in Stack Page")
	public void the_user_should_be_presented_with_run_result_in_stack_page() {
	   
		sp.outputdisplay.getText();
		assertEquals(sp.outputdisplay.getText(),"This is Stack in python");
		}
	
	@When("User enters a invalid python code in tryEditor from sheet {string} and {int} in Stack Page")
	public void user_enters_a_invalid_python_code_in_try_editor_from_sheet_and_in_stack_page(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("StackpythonCode");
		Loggerload.info("invalidcode entered into tryEditor : "+ code1);
		sp.Stack_invalid_python_code(code1);
	}

	@Then("User clicks on run button in Stack Page")
	public void user_clicks_on_run_button_in_stack_page() {
		sp.run_bttn_click();  
	}

	@Then("User should be presented with Error popup in Stack Page")
	public void user_should_be_presented_with_error_popup_in_stack_page() {
	    sp.acceptBrowserAlert();
	}
	
	}






