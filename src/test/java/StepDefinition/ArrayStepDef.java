package StepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Driver.Driver_Factory;
import io.cucumber.java.en.*;
import pageObjects.dsAlgoArrayPage;
import pageObjects.dsAlgoHomePage;
import pageObjects.dsAlgoLoginPage;
import utilities.CommonMethods;
import utilities.ExcelReader;

public class ArrayStepDef {
	
	WebDriver driver;
	dsAlgoHomePage hp;
	dsAlgoLoginPage lp;
	

	
	private dsAlgoArrayPage ap = new dsAlgoArrayPage(Driver_Factory.getDriver());
	

	@When("Click on the Get Started button for Array  Datastructures")
	public void click_on_the_get_started_button_for_array_datastructures() {
		
		
	   ap.arrayPageGetStarted.click();
	}
	
	@When("The user select Arrays from the drop down menu")
	public void the_user_select_arrays_from_the_drop_down_menu() {
	    
		ap.dsDropDown.click();
	    ap.arrayDropDownElement.click();
		
	}

	@Then("The user should be navigated to the Array Page")
	public void the_user_should_be_navigated_to_the_array_page() {
	   
		assertEquals(ap.arrayPage.getText(),"Array");
		
	}
	
	@When("The User clicks on {string} link")
	public void the_user_clicks_on_link(String string) {
		
	   ap.arraylinkselect(string);
	}

	@Then("user should be redirected to that {string} page")
	public void user_should_be_redirected_to_that_particular_page(String string) {
	     
		ap.arraylinktextdisplay(string);
		
	}

	@Then("User clicks on Try here button")
	public void user_clicks_on_try_here_button() {
	    
		ap.displayTryHerebtn();
		ap.clkTryHerebtn();
		
	}

	@Then("user should be redirected to a page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		
		ap.displyRunBtn();
	   
		
	}
	
	@When("The user enter a valid python code in tryEditor from sheet {string} and {int}")
	public void the_user_enter_a_valid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
	   
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("ArraypythonCode");
		System.out.println(code1);
		ap.Arr_valid_phyton_code(code1);
		//Actions action=new Actions(driver);
	    //action.moveToElement(ap.CodeTxtEditor1).doubleClick().click().sendKeys(code1).build().perform();
		
	}

	@Then("The user clicks on run button")
	public void the_user_clicks_on_run_button() throws InterruptedException {
	    
		
     	//ap.Runbtn.click();
//		Thread.sleep(1000);
	ap.run_bttn_click();
		
	}

	@Then("The user should be presented with Run result")
	public void the_user_should_be_presented_with_run_result() {
	   
		ap.outputdisplay.getText();
		assertEquals(ap.outputdisplay.getText(),"This is Array in python");
	}
	
	@Then("The user should be presented with Error popup")
	public void the_user_should_be_presented_with_error_popup() {
	    
		//ap.alert_invalid(driver);
		//ap.error_alert_handle();
		//ap.acceptBrowserAlert(driver);
		//ap.alertMsgPopup();
		
	}


}
