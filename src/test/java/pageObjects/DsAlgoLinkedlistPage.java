package pageObjects;

import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DsAlgoLinkedlistPage {
	WebDriver driver;
	public Actions action;

	// Locators
	@FindBy(xpath = "//h5[text()='Linked List']/..//a[text()='Get Started']")
	public WebElement GetStartedLp;
	@FindBy(xpath = "//div[@class='nav-item dropdown']")
	public WebElement DataStDropdown;
	@FindBy(xpath = "//a[@class='dropdown-item' and text()='Linked List']")
	public WebElement LLDropdown;
	@FindBy(xpath = "//h4[text()='Linked List']")
	public WebElement LinkedlistPage;
	@FindBy(xpath = "//a[@class='list-group-item' and text()='Introduction']")
	public WebElement Introduction;
	@FindBy(xpath = "//a[@class='list-group-item' and text()='Creating Linked LIst']")
	public WebElement Creating;
	@FindBy(xpath = "//a[@class='list-group-item' and text()='Types of Linked List']")
	public WebElement Types;
	@FindBy(xpath = "//a[@class='list-group-item' and text()='Implement Linked List in Python']")
	public WebElement Implement;
	@FindBy(xpath = "//a[@class='list-group-item' and text()='Traversal']")
	public WebElement Traversal;
	@FindBy(xpath = "//a[@class='list-group-item' and text()='Insertion']")
	public WebElement Insertion;
	@FindBy(xpath = "//a[@class='list-group-item' and text()='Deletion']")
	public WebElement Deletion;
	@FindBy(xpath = "//p[text()='Introduction']")
	public WebElement Introductionpage;
	@FindBy(xpath = "//p[text()='Creating Linked LIst']")
	public WebElement Creatingpage;
	@FindBy(xpath = "//p[text()='Types of Linked List']")
	public WebElement Typespage;
	@FindBy(xpath = "//p[text()='Implement Linked List in Python']")
	public WebElement Implementpage;
	@FindBy(xpath = "//p[text()='Traversal']")
	public WebElement Traversalpage;
	@FindBy(xpath = "//p[text()='Insertion']")
	public WebElement Insertionpage;
	@FindBy(xpath = "//p[text()='Deletion']")
	public WebElement Deletionpage;
	@FindBy(xpath = "//a[@class='btn btn-info' and text()='Try here>>>']")
	public WebElement Tryherebtn;
	@FindBy(xpath = "//pre[@role='presentation']")
	public WebElement tryEditor;
	@FindBy(xpath = "//button[text()='Run']")
	public WebElement Run;
	@FindBy(xpath = "//pre[@id='output']")
	public WebElement Output;
	@FindBy(xpath = "//a[text()='Practice Questions']")
	public WebElement Practice;
	@FindBy(xpath = "/html/body")
	public WebElement practiceblank_page;

	private WebDriverWait wait;

	// constructors
	public DsAlgoLinkedlistPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.action = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void Linkedlist_linkspageDisplay(String String) {

		if ("Introduction".equals(String)) {
			String value = Introductionpage.getText();
			assertsEquals(value, String);
			System.out.println(value);
		} else if ("Creating Linked LIst".equals(String)) {
			String value = Creatingpage.getText();
			assertsEquals(value, String);
			System.out.println(value);
		} else if ("Types of Linked List".equals(String)) {
			String value = Typespage.getText();
			assertsEquals(value, String);
			System.out.println(value);
		} else if ("Implement Linked List in Python".equals(String)) {
			String value = Implementpage.getText();
			assertsEquals(value, String);
			System.out.println(value);
		} else if ("Traversal".equals(String)) {
			String value = Traversalpage.getText();
			assertsEquals(value, String);
			System.out.println(value);
		} else if ("Insertion".equals(String)) {
			String value = Insertionpage.getText();
			assertsEquals(value, String);
			System.out.println(value);
		} else if ("Deletion".equals(String)) {
			String value = Deletionpage.getText();
			assertsEquals(value, String);
			System.out.println(value);
		}

	}

	private void assertsEquals(String value, String string) {

	}

	public void Linkedlist_linksDisplay(String String) {
		if ("Introduction".equals(String)) {
			Introduction.click();
		} else if ("Creating Linked LIst".equals(String)) {
			Creating.click();
		} else if ("Types of Linked List".equals(String)) {
			Types.click();
		} else if ("Implement Linked List in Python".equals(String)) {
			Implement.click();
		} else if ("Traversal".equals(String)) {
			Traversal.click();
		} else if ("Insertion".equals(String)) {
			Insertion.click();
		} else if ("Deletion".equals(String)) {
			Deletion.click();
		}

	}

	public void displaytryherebtn() {
		Tryherebtn.isDisplayed();
	}

	public void tryherebtn() {
		Tryherebtn.click();
	}

	public void runbtn() {
		Run.click();
	}

	public void Linkedlist_validcode(String code) {
		// Actions action=new Actions(driver);

		action.moveToElement(tryEditor).doubleClick().click().sendKeys(code).build().perform();
	}

	public static void acceptBrowserAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public void Linkedlist_Invalidcode(WebDriver driver) {

		wait.until(ExpectedConditions.alertIsPresent());

		String alertMessage = driver.switchTo().alert().getText();
		assertEquals(alertMessage, " SyntaxError: bad token T_OP on line 1");
	}

	public void acceptBrowserAlert() {
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String alertMessage1 = alert.getText();
		System.out.println(alertMessage1);
		alert.accept();
	}

	public void Practicedisplay() {

		Practice.isDisplayed();
	}

}
