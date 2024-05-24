package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Linked_List {
	
	
	public static WebDriver driver;
	String URL= "https://dsportalapp.herokuapp.com/home";
	
	By  getstartedbuttn= By.linkText("Get Started");
	By    dropdownbuttn= By.xpath("//*[@id=\"navbarCollapse\"]/div[1]/div/div/a[2]");
	By   Introduction   = By.linkText("Introduction");
	By   CreatingLinkedList= By.xpath("/html/body/div[2]/ul[2]");
	By   TypesofLinkedList= By.xpath("/html/body/div[2]/ul[3]/a");
	By   ImpLinkedListPython= By.xpath("/html/body/div[2]/ul[4]");
	By   Traversal= By.linkText("Traversal");
	By   Insertion= By.linkText("Insertion");
	By   Deletion=  By.linkText("Deletion");
	By  TryHereBtn= By.xpath("/html/body/div[2]/div/div[2]/a");
	By  Practice= By.xpath("//*[@id=\"content\"]/a");
	By  Tryeditor= By.xpath("//*[@id=\"answer_form\"]/div/div/div[6]");
	By  runbtn= By.linkText("Run");
	By output= By.id("output");
	
	
	
	
	@Given("User clicks the Get Started button in <Linked List> pane or select <Linked List> from the drop down menu")
	public void user_clicks_the_get_started_button_in_linked_list_pane_or_select_linked_list_from_the_drop_down_menu() {
	  driver=new ChromeDriver();
	  driver.get("URL");
	  driver.findElement(getstartedbuttn).click();
	}

	@Then("User should be able to see <Linked List> page")
	public void user_should_be_able_to_see_linked_list_page() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/");
	}

	@Given("User is on the Linked List page")
	public void user_is_on_the_linked_list_page() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/"); 
	}

	@Given("User is able to see Introduction links on Linked List page")
	public void user_is_able_to_see_introduction_links_on_linked_list_page() {
	    driver.findElement(Introduction);
	}

	@Given("User clicks on Introduction links button on Linked List page")
	public void user_clicks_on_introduction_links_button_on_linked_list_page() {
		 driver.findElement(Introduction).click();
	}

	@When("User is redirected Introduction link page")
	public void user_is_redirected_introduction_link_page() {
		driver.get("https://dsportalapp.herokuapp.com/linked-list/introduction/");
	 
	}

	@When("User able to see Try Here button on the Introduction link page")
	public void user_able_to_see_try_here_button_on_the_introduction_link_page() {
	   driver.findElement(TryHereBtn);
	}

	@And ("User clicks on Try Here button")
	public void user_clicks_on_try_here_button() {
		  driver.findElement(TryHereBtn).click();
	}

	@And("User is redirected to Try Editor page ")
	public void user_is_redirected_to_try_editor_page() {
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	}

	@And("User is able to see a Run button to test")
	public void user_is_able_to_see_a_run_button_to_test() {
	    driver.findElement(runbtn);
	}

	@Then("User validates Try Here button with valid input")
	public void user_validates_try_here_button_with_valid_input() {
	   driver.findElement(Tryeditor).sendKeys("Print Hello");
	}
	@And("User clicks run")
	public void user_clicks_run() {
	driver.findElement(runbtn).click();

	}
	
	@And("User  is able to see output on the console")
	public void user_is_able_to_see_output_on_the_console() {
		System.out.println(output);
	   
	}
	@When("User Validates Try Here button with invalid input")
	public void user_validates_try_here_button_with_invalid_input() {
		   driver.findElement(Tryeditor).sendKeys("1234");
	    
	}
	
	@And("User clicks run on Introduction page")
	public void user_clicks_run_Introduction_page() {
	driver.findElement(runbtn).click();

	}
	
	@Then("It should display error")
	public void it_should_display_error() {
		System.out.println("error");
	   
	}
	@Given("User is able to see Creating Linked List links on Linked List page")
	public void user_is_able_to_see_creating_linked_list_links_on_linked_list_page() {
	    driver.get("https://dsportalapp.herokuapp.com/linked-list/");
	    driver.findElement(CreatingLinkedList);
	}

	@Given("User clicks on Creating Linked List links button on Linked List page")
	public void user_clicks_on_creating_linked_list_links_button_on_linked_list_page() {
	    driver.findElement(CreatingLinkedList).click();
	}

	@When("User is redirected Creating Linked List link page")
	public void user_is_redirected_creating_linked_list_link_page() {
	    driver.get("https://dsportalapp.herokuapp.com/linked-list/creating-linked-list/");
	}

	@When("User able to see Try Here button on the Creating Linked List link page")
	public void user_able_to_see_try_here_button_on_the_creating_linked_list_link_page() {
	    driver.findElement(TryHereBtn);
	}
	
	@When("User is redirected to Try Editor page")
	public void user_is_redirected_to_try_editor_page() {
		driver.get("https://dsportalapp.herokuapp.com/tryEditor");
	}

	@When("User is able to see a Run button to test")
	public void user_is_able_to_see_a_run_button_to_test() {
	    driver.findElement(runbtn);
	}

	@Then("User validates Try Here button with valid input")
	public void user_validates_try_here_button_with_valid_input() {
	   driver.findElement(Tryeditor).sendKeys("Print Hello");
	}
	@And("User clicks run")
	public void user_clicks_run() {
	driver.findElement(runbtn).click();

	}
	
	@And("User  is able to see output on the console")
	public void user_is_able_to_see_output_on_the_console() {
		System.out.println(output);
	   
	}
	@When("User Validates Try Here button with invalid input")
	public void user_validates_try_here_button_with_invalid_input() {
		   driver.findElement(Tryeditor).sendKeys("1234");
	    
	}
	
	@And("User clicks run on Introduction page")
	public void user_clicks_run_Introduction_page() {
	driver.findElement(runbtn).click();

	}
	
	@Then("It should display error")
	public void it_should_display_error() {
		System.out.println("error");

	@Given("User is able to see Types of Linked List links on Linked List page")
	public void user_is_able_to_see_types_of_linked_list_links_on_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User clicks on Types of Linked List links button on Linked List page")
	public void user_clicks_on_types_of_linked_list_links_button_on_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User is redirected Types of Linked List link page")
	public void user_is_redirected_types_of_linked_list_link_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User able to see Try Here button on the Types of Linked List link page")
	public void user_able_to_see_try_here_button_on_the_types_of_linked_list_link_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is able to see Implement Linked List in Python links on Linked List page")
	public void user_is_able_to_see_implement_linked_list_in_python_links_on_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User clicks on Implement Linked List in Python links button on Linked List page")
	public void user_clicks_on_implement_linked_list_in_python_links_button_on_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User is redirected Implement Linked List in Python link page")
	public void user_is_redirected_implement_linked_list_in_python_link_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User able to see Try Here button on the Implement Linked List in Python link page")
	public void user_able_to_see_try_here_button_on_the_implement_linked_list_in_python_link_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is able to see Traversal links on Linked List page")
	public void user_is_able_to_see_traversal_links_on_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User clicks on Traversal links button on Linked List page")
	public void user_clicks_on_traversal_links_button_on_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User is redirected Traversal link page")
	public void user_is_redirected_traversal_link_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User able to see Try Here button on the Traversal link page")
	public void user_able_to_see_try_here_button_on_the_traversal_link_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is able to see Insertion links on Linked List page")
	public void user_is_able_to_see_insertion_links_on_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User clicks on Insertion links button on Linked List page")
	public void user_clicks_on_insertion_links_button_on_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User is redirected Insertion link page")
	public void user_is_redirected_insertion_link_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User able to see Try Here button on the Insertion link page")
	public void user_able_to_see_try_here_button_on_the_insertion_link_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is able to see Deletion links on Linked List page")
	public void user_is_able_to_see_deletion_links_on_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User clicks on Deletion links button on Linked List page")
	public void user_clicks_on_deletion_links_button_on_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User is redirected Deletion link page")
	public void user_is_redirected_deletion_link_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User able to see Try Here button on the Deletion link page")
	public void user_able_to_see_try_here_button_on_the_deletion_link_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("User is on linked List <link> page")
	public void user_is_on_linked_list_link_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User is able to see<Practice Questions> link")
	public void user_is_able_to_see_practice_questions_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on < Practice Questions> link")
	public void user_clicks_on_practice_questions_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User is redirected to a blank page")
	public void user_is_redirected_to_a_blank_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
