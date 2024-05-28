package StepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import Driver.Driver_Factory;
import context.Textcontext;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import pageObjects.DsAlgoQueuePage;
import pageObjects.DsAlgoHomePage;
import pageObjects.DsAlgoLoginPage;
import utilities.ExcelReader;
import utilities.Loggerload;

public class Queuesteps {
	
	WebDriver driver;
	DsAlgoHomePage hp;
	DsAlgoLoginPage lp;
	DsAlgoQueuePage qp;
	Textcontext textContext;
	
	public Queuesteps(Textcontext textContext) { 
		this.textContext = textContext;
		this.driver = textContext.getDriver();
		this.qp = textContext.getQp();
	}

	@Then("User clicks on the Get Started button in Queue pane")
	public void user_clicks_on_the_get_started_button_in_queue_pane() {
		qp.GetStartedQp.click();
	}

	@Then("User is navigated to Queue Page")
	public void user_is_navigated_to_queue_page() {
		assertEquals(qp.QueuePage.getText(), "Queue");
	}

	@When("User selects Queue from the drop down menu")
	public void user_selects_queue_from_the_drop_down_menu() {

		qp.DataDropdown.click();
		qp.QueueDropdown.click();
	}

	@Then("User is navigated to the queue page")
	public void user_is_navigated_to_the_queue_page() {

		assertEquals(qp.QueuePage.getText(), "Queue");
	}

	@Given("User is on the queue page")
	public void user_is_on_the_queue_page() {

		qp.GetStartedQp.click();
	}

	@Then("User clicks on Implementation of Queue in Python link on queue page")
	public void user_clicks_on_implementation_of_queue_in_python_link_on_queue_page() {

		qp.Implementation.click();
	}

	@Then("User clicks on the practice Questions link on queue page")
	public void user_clicks_on_the_practice_questions_link_on_queue_page() {

		qp.Practice.click();
	}

	@Then("User is navigated to a blank page from queue page")
	public void user_is_navigated_to_a_blank_page_from_queue_page() {

		qp.practiceblank_page.isDisplayed();
	}

	@When("User clicks on the {string} links on queue page")
	public void user_clicks_on_the_links_on_queue_page(String String) throws InterruptedException {

		Thread.sleep(2000);
		qp.Queuelinks(String);

	}

	@Then("User navigated to the {string} links queue page")
	public void user_navigated_to_the_links_queue_page(String string) {
		qp.QueuelinksDisplay(string);
	}

	@Then("User clicks on  Try here button on queue page")
	public void user_clicks_on_try_here_button() throws InterruptedException {


		Thread.sleep(3000);
		qp.Tryherebtn.isDisplayed();
		qp.Tryherebtn.click();
	}

	@Then("User is directed to Queue tryEditor Page with a run button to test")
	public void user_is_directed_to_try_editor_page_with_a_run_button_to_test() throws InterruptedException {

		Thread.sleep(3000);
		qp.Run.isDisplayed();
	}

	@When("User enters a code in Queue try Editor from sheet {string} and {int}")
	public void user_enters_a_code_in_try_editor_from_sheet_and(String sheetname, Integer RowNumber)
		throws InvalidFormatException, IOException {
		try {Thread.sleep(1000);
		} 
		catch (InterruptedException e) {
	
			e.printStackTrace();
		}
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx",
				sheetname);
		String code1 = testData.get(RowNumber).get("Queuecode");
		Loggerload.info("The valid input is :"+code1);
		qp.Queue_validcode(code1);

	}

	@Then("User clicks on run button on queue page")
	public void user_clicks_on_run_button() {

		qp.Run.click();
	}

	@Then("User can see the output on queue page")
	public void user_can_see_the_output() {

		qp.Output.isDisplayed();
		assertEquals(qp.Output.getText(), "This is Queue in python");
	}

	@Then("User can see the Errormessage alert on queue page")
	public void user_can_see_the_errormessage_alert() {
		qp.acceptBrowserAlert();

	}

}
