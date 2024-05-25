package StepDefinition;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Driver.Driver_Factory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DsAlgoLinked_listPage;
import pageObjects.DsAlgoQueuePage;
import pageObjects.dsAlgoHomePage;
import pageObjects.dsAlgoLoginPage;
import utilities.ExcelReader;

public class Linked_liststeps {

	private DsAlgoLinked_listPage Lp = new DsAlgoLinked_listPage(Driver_Factory.getDriver());
	WebDriver driver;
	dsAlgoHomePage hp;
	dsAlgoLoginPage lp;

	@When("User signs In to the application")
	public void user_signs_in_to_the_application() {

		lp.UsernameText.sendKeys("Numpy4");
		lp.PasswordText.sendKeys("Testers@4");
		lp.Loginbtn.click();

	}

	@Then("User clicks on the Get Started button in Linked list pane")
	public void user_clicks_on_the_get_started_button_in_Linked_list_pane() {
		
		Lp.GetStartedLp.click();
	}

	@Then("User is navigated to the Linked list page")
	public void user_is_navigated_to_the_linked_list_page() {
		
		assertEquals(Lp.LinkedlistPage.getText(), "Linked List");
	}

	@When("User selects Linked list from the drop down menu")
	public void user_selects_Linked_list_from_the_drop_down_menu() {
		
		Lp.DataStDropdown.click();
		Lp.LLDropdown.click();
	}

	@And("User clicks on Introduction link on Linked list page")
	public void user_clicks_on_Introduction_link_on_Linked_list_page() {
		
		Lp.Introduction.click();
	}

	@Then("User clicks on the practice Questions link on Linked list page")
	public void user_clicks_on_the_practice_questions_link_on_Linked_list_page() {
		
		Lp.Practice.click();
	}

	@And("User is navigated to a blank page from Linked list page")
	public void user_is_navigated_to_a_blank_page_from_Linked_list_page() {
		
		Lp.practiceblank_page.isDisplayed();
	}

	@When("User clicks on the {string} links on Linked list page")
	public void user_clicks_on_the_links_on_linked_list_page(String string) {
		
		Lp.Linkedlist_linksDisplay(string);
	}

	@Then("User navigated to the {string} links Linked list page")
	public void user_navigated_to_the_links_linked_list_page(String string) {
		
		Lp.Linkedlist_linkspageDisplay(string);
	}

	@Then("User clicks on  Try here button on the links page")
	public void user_clicks_on_try_here_button_on_the_links_page() throws InterruptedException {

		Thread.sleep(3000);
		Lp.Tryherebtn.isDisplayed();
		Lp.Tryherebtn.click();
	}

	@Then("User is directed to tryEditor Page with a run button to test on Links page")
	public void user_is_directed_to_try_editor_page_with_a_run_button_to_test_on_links_page()
			throws InterruptedException {
		
		Thread.sleep(3000);
		Lp.Run.isDisplayed();
	}

	@When("User enters a code in Linkedlist try Editor from sheet {string} and {int}")
	public void user_enters_a_code_in_try_editor_from_sheet_and(String sheetname, Integer RowNumber)
		throws InvalidFormatException, IOException {
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			e.printStackTrace();
		}
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testData = reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx",
				sheetname);
		String code1 = testData.get(RowNumber).get("Linkedlistcode");
		System.out.println("The valid inputis : "+code1);
		Lp.Linkedlist_validcode(code1);

	}

	@Then("User clicks on run button on Linkedlist try Editor")
	public void user_clicks_on_run_button_on_linkedlist_try_Editor() {

		Lp.Run.click();
	}

	@Then("User can see the output on Linkedlist")
	public void user_can_see_the_output_on_linkedlist() {

		Lp.Output.isDisplayed();
		assertEquals(Lp.Output.getText(), "This is Linkedlist in python");
	}

	@Then("User can see the Errormessage alert on Linkedlist")
	public void user_can_see_the_errormessage_alert() {

		Lp.acceptBrowserAlert();

	}

}
