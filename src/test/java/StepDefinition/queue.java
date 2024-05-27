 package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class queue {
	
	public static WebDriver driver;
	String URL= "https://dsportalapp.herokuapp.com/home";
	
	By getstartedbtn= By.xpath("/html/body/div[2]/div[5]/div/div/a");
	By dropdownbtn= By.xpath("/html/body/div[1]/nav/div/div[1]/div/div/a[4]");
	By ImpQueueinPython= By.xpath("/html/body/div[2]/ul[1]/a");
	By Impcollectdeque= By.xpath("/html/body/div[2]/ul[2]/a");
	By ImpusingArray= By.xpath("/html/body/div[2]/ul[3]/a");
	By QueueOperations= By.xpath("/html/body/div[2]/ul[4]/a");
	By Tryherebtn= By.xpath("/html/body/div[2]/div/div[2]/a");
	By Editor=By.id("editor");
	By run= By.xpath("//*[@id=\"answer_form\"]/button");
	By output= By.id("output");
	By practice= By.xpath("//*[@id=\"content\"]/a");
	

@Given("User clicks the Get Started button in <Queue> pane or select <Queue> from the drop down menu")
public void user_clicks_the_get_started_button_in_queue_pane_or_select_queue_from_the_drop_down_menu() {
	   driver = new ChromeDriver();
	   driver.get(URL);
	   
}

@Then("User should be able to see <Queue> page")
public void user_should_be_able_to_see_queue_page() {
	   driver.findElement(getstartedbtn).click();
}

@When("User selects <Queue> from the drop down menu")
public void select_queue_from_the_drop_down_menu1() {
	   driver = new ChromeDriver();
	   driver.get(URL);
}

@Then("User is redirected to <Queue> page")
public void user_is_redirected_to_queue_page() {
	   driver.findElement(dropdownbtn).click();
}

@When("User is able to see Implementation of Queue in Python links on <Queue> page")
public void user_is_able_to_see_Implementation_of_queue_in_python_links_on_queue_page() {
    driver.findElement(ImpQueueinPython);
}
@And("User clicks the Implementation of Queue in Python button")
public void user_clicks_the_Implementation_of_Queue_in_python_button() {
    driver.findElement(ImpQueueinPython).click();
 }

@Then("User should be redirected to the Implementation of Queue in Python page")
public void user_should_be_redirected_to_the_Implementation_of_queue_in_python_page() {
    driver.get("https://dsportalapp.herokuapp.com/queue/implementation-lists/");
}

@And ("User should be able to see Try Here button on the Implementation of Queue in Python page")
public void user_should_be_able_to_see_try_here_buttonon_the_Implementation_of_Queue_in_Python_page() {
    driver.findElement(Tryherebtn);
}

@When("User validates Try Here button in the Implementation of Queue in Python page")
public void user_validates_try_here_button_in_the_implementation_of_queue_in_python_page() {
	driver.findElement(Tryherebtn).click();
	
}@Then("User should be redirected to a Implementation of Queue in Python page having Try Editor with a run button to test")
public void user_should_be_redirected_to_he_implementation_of_queue_in_python__page_having_try_editor_with_a_run_button_to_test() {
    driver.get("https://dsportalapp.herokuapp.com/tryEditor");
    driver.findElement(Editor).sendKeys("print hello");
    driver.findElement(run).click();
    System.out.println(output);
    driver.findElement(Editor).sendKeys("1234");
    driver.findElement(run).click();
    System.out.println("error");
}

@When("User validates Try Here button in the Implementation of Queue in Pythonpage with valid code")
public void user_validates_try_here_button_in_the_implementation_of_queue_in_pythonpage_with_valid_code() {
   // driver.findElement(Editor).sendKeys("print hello");
}

@And("User clicks run")
public void user_clicks_run() {
//driver.findElement(run).click();

}

@Then("User  is able to see output on the console")
public void user_is_able_to_see_output_on_the_console() {
	//System.out.println(output);
   
}

@When("User validates Try Here button in theImplementation of Queue in Pythonpage with invalid code")
public void user_validates_try_here_button_in_the_implementation_of_queue_in_pythonpage_with_invalid_code() {
	//driver.findElement(Editor).sendKeys("1234");
}

@Then("It should display error")
public void it_should_display_error() {
	//System.out.println("error");
   
}

@When("User is able to see <Implementation using collections.deque> links on <Queue> page")
public void user_is_able_to_see_the_implementation_using_collections_deque_link_on_queue_page(){
	driver.findElement(Impcollectdeque);
}

@And ("User clicks the Implementation using collections.deque button")
public void user_clicks_the_implementation_using_collections_deque_button() {
   driver.findElement(Impcollectdeque).click();    
}

@Then("User should be redirected to the <Implementation using collections.deque> page")
public void user_should_be_redirected_to_the_implementation_using_collections_deque_page() {
    driver.get("https://dsportalapp.herokuapp.com/queue/implementation-collections/");
 
}

@And ("User should be able to see Try Here button")
public void user_should_be_able_to_see_try_here_button() {
    driver.findElement(Tryherebtn);
}

@When("User validates Try Here button in the Implementation using collections.deque page")
public void user_validates_try_here_button_in_the_implementation_using_collections_deque_page() {
	driver.findElement(Tryherebtn).click();
}


@Then("User should be redirected to a page having Try Editor with a run button to test")
public void user_should_be_redirected_to_a_page_having_try_editor_with_a_run_button_to_test() {
   driver.get("https://dsportalapp.herokuapp.com/tryEditor");
   driver.findElement(Editor).sendKeys("print hello");
   driver.findElement(run).click();
   System.out.println(output);
   driver.findElement(Editor).sendKeys("1234");
   driver.findElement(run).click();
   System.out.println("error");
   
}


@When("User validates Try Here button in the Implementation using collections.dequepage with valid code")
public void user_validates_try_here_button_in_the_implementation_using_collections_dequepage_with_valid_code() {

}

@And("User clicks run on the Implementation using collections.deque page")
public void user_clicks_run_in_the_implementation_using_collections_deque_page_() {
//driver.findElement(run).click();

}

@Then("User  is able to see output on the console on the Implementation using collections.deque page")
public void user_is_able_to_see_output_on_the_console_in_the_implementation_using_collections_dequepage_() {
	//System.out.println(output);
   
}

@When("User validates Try Here button in theImplementation using collections.dequepage with invalid code")
public void user_validates_try_here_button_in_the_implementation_using_collections_dequepage_with_invalid_code() {
    
}
@And("User clicks run on the Implementation using collections.deque page with invalid code")
public void user_clicks_run_in_the_implementation_using_collections_deque_page_with_invalid_code() {
//driver.findElement(run).click();

}

@Then("It should display error on the Implementation using collections.deque page")
public void it_should_display_error_in_the_implementation_using_collections_dequepage_() {
	//System.out.println("error");
 }

@When("User is able to see Implementation using array links on <Queue> page")
public void user_is_able_to_see_Implementation_using_array_links_on_queue_page() {
   driver.findElement(ImpusingArray);
}

@And("User clicks the Implementation using array button")
public void user_clicks_the_implementation_using_array_button() {
   driver.findElement(ImpusingArray).click();
}

@Then("User should be redirected to the Implementation using array page")
public void user_should_be_redirected_to_the_implementation_using_array_page() {
    driver.get("https://dsportalapp.herokuapp.com/queue/Implementation-array/");
}

@When("User is able to see Try Here button in the Implementation using array page")
public void user_is_able_to_see_try_here_button_in_the_implementation_using_array_page() {
   driver.findElement(Tryherebtn);
}

@And("User validates Try Here button in the Implementation using array page")
public void user_validates_try_here_button_in_the_implementation_using_array_page() {
	  driver.findElement(Tryherebtn).click();
}

@Then("User should be redirected to a page having Try Editor with a run button to test in the Implementation using array page")
public void user_should_be_redirected_to_a_page_having_try_editor_with_a_run_button_to_testin_the_implementation_using_array_page() {
   driver.get("https://dsportalapp.herokuapp.com/tryEditor");
   driver.findElement(Editor).sendKeys("print hello");
   driver.findElement(run).click();
   System.out.println(output);
   driver.findElement(Editor).sendKeys("1234");
   driver.findElement(run).click();
   System.out.println("error");
   
}

@When("User validates Try Here button in the Implementation using arraypage with valid code")
public void user_validates_try_here_button_in_the_implementation_using_arraypage_with_valid_code() {
   
}

@And("User clicks run on the Implementation using array page")
public void user_clicks_run_in_the_implementation_using_array_page_() {
//driver.findElement(run).click();

}

@Then("User  is able to see output on the console on the Implementation using array page")
public void user_is_able_to_see_output_on_the_console_in_the_implementation_using_array_page_() {
	//System.out.println(output);
}
@When("User validates Try Here button in the Implementation using arraypage with invalid code")
public void user_validates_try_here_button_in_the_implementation_using_arraypage_with_invalid_code() {
   
}

@Then("It should display error on the Implementation using array page")
public void it_should_display_error_in_the_implementation_using_array_page_() {
	//System.out.println("error");
 }


@When("User is able to see Queue Operations links on <Queue> page")
public void user_is_able_to_see_Queue_operations_links_on_queue_page() {
	driver.findElement(QueueOperations);
}

@And("User clicks the Queue Operations button")
public void user_clicks_the_queue_operations_button() {
    driver.findElement(QueueOperations).click();
}

@Then("User should be redirected to the Queue Operations page")
public void user_should_be_redirected_to_the_queue_operations_page() {
    driver.get("https://dsportalapp.herokuapp.com/queue/QueueOp/");    
}

@When("User is able to see Try Here button in the Queue Operations page")
public void user_is_able_to_see_try_here_button_in_the_queue_operations_page() {
   driver.findElement(Tryherebtn);
}

@And ("User validates Try Here button in the Queue Operations page")
public void user_validates_try_here_button_in_the_queue_operations_page() {
	 driver.findElement(Tryherebtn).click();  
}


@Then("User should be redirected to a page having Try Editor with a run button to test in the Queue Operations  page")
public void user_should_be_redirected_to_a_page_having_try_editor_with_a_run_button_to_test_in_the_queue_operations_page() {
   driver.get("https://dsportalapp.herokuapp.com/tryEditor");
   
  }
@When("User validates Try Here button in the Queue Operations page with valid code")
public void user_validates_try_here_button_in_the_queue_operations_page_with_valid_code() {
	 driver.findElement(Editor).sendKeys("print hello");
	 driver.findElement(run).click();
}
@Then("User  is able to see output on the console on the Queue operations page")
public void user_is_able_to_see_output_on_the_console_in_the_queue_operations_page_() {
	System.out.println(output);
}

@When("User validates Try Here button in the <queue operations> page with invalid code")
public void user_validates_try_here_button_in_the_queue_operations_page_with_invalid_code() {
	driver.findElement(Editor).sendKeys("1234");
	driver.findElement(run).click();
}
@Then("It should display error on the <queue operations> page")
public void it_should_display_error_in_the_queue_operations_page_() {
	System.out.println("error");
 }


 @When("User click <Practice Questions> button")
public void user_click_practice_questions_button() {
  driver.findElement(practice).click();
}

@Then("User should be redirected to the blank page")
public void user_should_be_redirected_to_the_blank_page() {
    driver.get("https://dsportalapp.herokuapp.com/queue/practice");
}
	
	

}

