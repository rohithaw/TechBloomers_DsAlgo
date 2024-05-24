package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import context.Textcontext;
import io.cucumber.java.en.*;
import pageObjects.dsAlgoArrayPage;
import pageObjects.dsAlgoHomePage;
import pageObjects.dsAlgoLoginPage;
import utilities.ExcelReader;
import utilities.Loggerload;

public class ArrayStepDef {
	
	WebDriver driver;
	dsAlgoHomePage hp;
	dsAlgoLoginPage lp;
	dsAlgoArrayPage ap;
	Textcontext textContext;
	
	
	//private dsAlgoArrayPage ap = new dsAlgoArrayPage(Driver_Factory.getDriver());
	
	public ArrayStepDef(Textcontext textContext) { 
		this.textContext = textContext;
		this.driver = textContext.getDriver();
		this.ap = textContext.getAp();
	}
	

	@When("Click on the Get Started button for Array  Datastructures")
	public void click_on_the_get_started_button_for_array_datastructures() {
		
		
	   ap.arrayPageGetStarted.click();
	   Loggerload.info("User is in Arrays Module");
	}
	
	@When("The user select Arrays from the drop down menu in Array Page")
	public void the_user_select_arrays_from_the_drop_down_menu() {
	    
		ap.dsDropDown.click();
	    ap.arrayDropDownElement.click();
	    Loggerload.info("User select Array from dropdown");
		
	}

	@Then("The user should be navigated to the Array Page in Array Page")
	public void the_user_should_be_navigated_to_the_array_page() {
	   
		assertEquals(ap.arrayPage.getText(),"Array");
		Loggerload.info("User is navigated to Array from from dropdown");
		
	}
	
	@When("The User clicks on {string} link in Array Page")
	public void the_user_clicks_on_link(String string) {
		
	   ap.arraylinkselect(string);
	   Loggerload.info("User Selects following link in Array Page" +string);
	}

	@Then("user should be redirected to that {string} page in Array Page")
	public void user_should_be_redirected_to_that_particular_page(String string) {
	     
		ap.arraylinktextdisplay(string);
		Loggerload.info("User is redirected to the Page");
		
	}

	@Then("User clicks on Try here button in Array Page")
	public void user_clicks_on_try_here_button() {
	    
		ap.displayTryHerebtn();
		ap.clkTryHerebtn();
		Loggerload.info("User clicks Try Here button");
		
	}

	@Then("user should be redirected to a page having an tryEditor with a Run button to test in Array Page")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		
		ap.displyRunBtn();
	   
		
	}
	
	@When("The user enter a valid python code in tryEditor from sheet {string} and {int} in Array Page")
	public void the_user_enter_a_valid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
	   
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("ArraypythonCode");
		System.out.println(code1);
		ap.Arr_valid_phyton_code(code1);
		//Actions action=new Actions(driver);
	    //action.moveToElement(ap.CodeTxtEditor1).doubleClick().click().sendKeys(code1).build().perform();
		
	}

	@Then("The user clicks on run button in Array Page")
	public void the_user_clicks_on_run_button() throws InterruptedException {
	    
		
     ap.Runbtn.click();	
		
	}

	@Then("The user should be presented with Run result in Array Page")
	public void the_user_should_be_presented_with_run_result() {
	   
		ap.outputdisplay.getText();
		assertEquals(ap.outputdisplay.getText(),"This is Array in python");
	}
	
	@Then("The user should be presented with Error popup in Array Page")
	public void the_user_should_be_presented_with_error_popup() {
	    
		
		ap.acceptBrowserAlert();
		
		
	}
	
	@When("The User clicks on Array in Python link in Array Page")
	public void the_user_clicks_on_array_in_python_link() {
	    
		ap.arrayinpythonLink.click();
	}

	@When("User clicks on Practice Questions Link in Array Page")
	public void user_clicks_on_practice_questions_link() {
	    
		ap.practiceLink.click();
		
	}


	@Then("User click on {string} from practice Page in Array")
	public void user_click_on_from_practice_page_in_array(String string) {
		
		ap.practiceQueslinkselect(string);
	    
	}

	@Then("user enters a valid code in tryEditor from sheet {string} and {int} for the question in Array Page")
	public void user_enters_a_valid_code_in_try_editor_from_sheet_and_row_number_for_the_question(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		
//		ExcelReader reader=new ExcelReader();
//		List<Map<String,String>> testData=reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", Sheetname);
//		String code1=testData.get(RowNumber).get("ArraypythonCode");
//		ap.enterCodePractice(code1,ap.editorInput);
//		ap.getCodefromExcel(Sheetname,RowNumber);
		ap.enterPythonCodePractice(Sheetname, RowNumber);
		String expectedMsg=ap.getExpectedResult(Sheetname, RowNumber);
	   
	}

	@Then("The user clicks on Run button in Array Page")
	public void the_user_clicks_on_Run_button() {
		
		ap.clkRunBtn();
	    
	}

	@Then("The user should be presented with successful submission message in Array Page")
	public void the_user_should_be_presented_with_successful_submission_message() {
		
		
		ap.outputdisp();
	   
	}




}
