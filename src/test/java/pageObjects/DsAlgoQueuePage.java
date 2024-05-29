package pageObjects;

import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Loggerload;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;

public class DsAlgoQueuePage {

	WebDriver driver;
	public Actions action;

	@FindBy(xpath = "//h4[text()='Queue']")
	public WebElement QueuePage;
	@FindBy(xpath = "//h5[text()='Queue']/..//a[text()='Get Started']")
	public WebElement GetStartedQp;
	@FindBy(xpath = "//a[@class='list-group-item' and text()='Implementation of Queue in Python']")
	public WebElement Implementation;
	@FindBy(xpath = "//p[text()='Implementation of Queue in Python']")
	public WebElement Implementationpage;
	@FindBy(xpath = "//a[@class='list-group-item' and text()='Implementation using collections.deque']")
	public WebElement Implementationdeque;
	@FindBy(xpath = "//p[text()='Implementation using collections.deque']")
	public WebElement Implementationdequepage;
	@FindBy(xpath = "//p[text()='Implementation using array']")
	public WebElement Implementationarraypage;
	@FindBy(xpath = "//a[@class='list-group-item' and text()='Implementation using array']")
	public WebElement Implementationarray;
	@FindBy(xpath = "//p[text()='Queue Operations']")
	public WebElement QueueOperationspage;
	@FindBy(xpath = "//a[@class='list-group-item' and text()='Queue Operations']")
	public WebElement QueueOperations;
	@FindBy(xpath = "//a[@class='btn btn-info' and text()='Try here>>>']")
	public WebElement Tryherebtn;
	@FindBy(xpath = "//pre[@role='presentation']")
	public WebElement tryEditor;
	@FindBy(xpath = "//button[text()='Run']")
	public WebElement Run;
	@FindBy(xpath = "//pre[@id='output']")
	public WebElement Output;
	@FindBy(xpath = "//a[@class='dropdown-item' and text()='Queue']")
	public WebElement QueueDropdown;
	@FindBy(xpath = "//div[@class='nav-item dropdown']")
	public WebElement DataDropdown;
	@FindBy(xpath = "//a[text()='Practice Questions']")
	public WebElement Practice;
	@FindBy(xpath = "/html/body")
	public WebElement practiceblank_page;

	private WebDriverWait wait;

	public DsAlgoQueuePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.action = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void QueuelinksDisplay(String String) {

		if ("Implementation of Queue in Python".equals(String)) {
			String value = Implementationpage.getText();
			assertsEquals(value, String);
			Loggerload.info(value);
		} else if ("Implementation using collections.deque".equals(String)) {
			String value = Implementationdequepage.getText();
			assertsEquals(value, String);
			Loggerload.info(value);
		} else if ("Implementation using array".equals(String)) {
			String value = Implementationarraypage.getText();
			assertsEquals(value, String);
			Loggerload.info(value);
		} else if ("Queue Operations".equals(String)) {
			String value = QueueOperationspage.getText();
			assertsEquals(value, String);
			Loggerload.info(value);
		}

	}

	private void assertsEquals(String value, String string) {

	}

	public void Queuelinks(String String) {
		if ("Implementation of Queue in Python".equals(String)) {
			Implementation.click();
		} else if ("Implementation using collections.deque".equals(String)) {
			Implementationdeque.click();
		} else if ("Implementation using array".equals(String)) {
			Implementationarray.click();
		} else if ("Queue Operations".equals(String)) {
			QueueOperations.click();
		}

	}

	public void tryherebtn() {
		Tryherebtn.click();
	}

	public void runbtn() {
		Run.click();
	}

	public void Queue_validcode(String code) {
		
        action.moveToElement(tryEditor).doubleClick().click().sendKeys(code).build().perform();
	}

	public static void acceptBrowserAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void Queue_Invalidcode(WebDriver driver) {

		wait.until(ExpectedConditions.alertIsPresent());

		String alertMessage = driver.switchTo().alert().getText();
		assertEquals(alertMessage, " SyntaxError: bad token T_OP on line 1");
	}

	public void acceptBrowserAlert() {
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String alertMessage1 = alert.getText();
		Loggerload.info("The Error message displayed is :" +alertMessage1);
		alert.accept();
	}

	public void Practicedisplay() {

		Practice.isDisplayed();
	}

}
