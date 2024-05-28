package StepDefinition;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import Driver.Driver_Factory;
import context.Textcontext;
import io.cucumber.java.en.*;
import pageObjects.DsAlgoGraphPage;
import pageObjects.DsAlgoHomePage;
import pageObjects.DsAlgoLoginPage;
import utilities.ExcelReader;
import utilities.Loggerload;


public class GraphSteps {
	
	 WebDriver driver;
	 DsAlgoLoginPage lp;
	 DsAlgoHomePage hp;
	 DsAlgoGraphPage gp;
	 Textcontext textContext;
	 
	// private DsAlgoGraphPage gp = new DsAlgoGraphPage(Driver_Factory.getDriver());
	 
	 public GraphSteps(Textcontext textContext) { 
			this.textContext = textContext;
			this.driver = textContext.getDriver();
			this.gp = textContext.getGp();
		}
	
	@Given("User is Signed-in")
	public void user_is_signed_in() {
	}
	
	@When("Clicks on the Get Started button for Graph Datastructures")
	public void clicks_on_the_get_started_button_for_graph_datastructures() {
		gp.GraphPageGetStarted.click();
	}
	
	@When("User select Graph from the drop down menu")
	public void user_select_graph_from_the_drop_down_menu() {
		gp.dsDropDown.click();
		gp.graphDropDownElement.click();	
	}

	@Then("User should be navigated to the graph page")
	public void user_should_be_navigated_to_the_graph_page() {
		assertEquals(gp.GraphPage.getText(),"Graph");
	}
	
	@Then("User clicks on Graph on Graph Page")
	public void user_clicks_on_graph_on_graph_page() {
		gp.graph.click();
	}
	
	@Then("user clicks on the Practice Questions on Graph Page")
	public void user_clicks_on_the_practice_questions_on_graph_page() {
	    gp.prac_ques.click();
	}

	@Then("user navigates to the blank page on Graph Page")
	public void user_navigates_to_the_blank_page_on_graph_page() {
	    gp.pagedisp();
	}

	@Given("User clicks on {string} link in Graph Page")
	public void user_clicks_on_link_graph_page(String string) {
		gp.graphlinkselect(string);
	}
	
	@Then("user should be redirected to that {string} link in Graph Page")
	public void user_should_be_redirected_to_that_particular_page(String string) {
		gp.graphlinktextdisplay(string);
	}
	
	@Given("User clicks on Try here button in Graph Page")
	public void user_clicks_on_try_here_button() {
		gp.displayTryherebtn();
		gp.clkTryHerebtn();
		}
	
	@Then("user should be redirected to a page having an tryEditor with a Run button to test in Graph Page")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test_in_graph_page() {
		gp.displayRunBtn();
		}
	
	@When("The user enters a valid python code in tryEditor from sheet {string} and {int} in Graph Page")
	public void the_user_enters_a_valid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {  

		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("GraphpythonCode");
		Loggerload.info("validcode entered into tryEditor : "+ code1);
		gp.Graph_valid_python_code(code1);
			
}
	@Then("The user clicks on run button in Graph Page")
	public void the_user_clicks_on_run_button_in_graph_page() {
	    gp.run_bttn_click();
	}

	@Then("The user should be presented with Run result in Graph Page")
	public void the_user_should_be_presented_with_run_result_in_graph_page() {
	    gp.outputdisplay.getText();
	    assertEquals(gp.outputdisplay.getText(),"This is Graph");
	}

	@When("User enters a invalid python code in tryEditor from sheet {string} and {int} in Graph Page")
	public void user_enters_a_invalid_python_code_in_try_editor_from_sheet_and(String Sheetname, Integer RowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader=new ExcelReader();
		List<Map<String,String>> testData=reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", Sheetname);
		String code1=testData.get(RowNumber).get("GraphpythonCode");
		Loggerload.info("invalidcode entered into tryEditor : "+ code1);
		gp.Graph_invalid_python_code(code1);
	}

	@Then("User clicks on run button in Graph Page")
	public void user_clicks_on_run_button_in_graph_page() {
		gp.run_bttn_click();
	}

	@Then("User should be presented with Error popup in Graph Page")
	public void user_should_be_presented_with_error_popup_in_graph_page() {
	    gp.acceptBrowserAlert();
	}
	
	}


	

	