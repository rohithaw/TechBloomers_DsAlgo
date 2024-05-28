package pageObjects;

import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Loggerload;

public class DsAlgoStackPage {
	
	WebDriver driver;
	public Actions action;
	private WebDriverWait wait;
	
	
	@FindBy(xpath = "//h4[text() = 'Stack']") public WebElement StackPage;
	@FindBy(xpath = "//div[4]/div/div/a") public WebElement getStartedStackPage;
	@FindBy(xpath =	"//ul/a[contains(@href,'operations-in-stack')]")public WebElement opInstack;	
	@FindBy(xpath = "//ul/a[contains(@href,'implementation')]")	public WebElement implebutton;
	@FindBy(xpath =  "//ul/a[contains(@href,'stack-applications')]") public WebElement Appbutton;
	@FindBy(xpath = "//a[@class='dropdown-item' and text()='Stack']")public WebElement stackDropDownElement;
	@FindBy(xpath = "//a[@href='/tryEditor']") public WebElement tryHerebtn;
	@FindBy(linkText = "Data Structures") public  WebElement dsDropDown;
	@FindBy(xpath = "//button[@type='button']") public WebElement Runbtn;
	@FindBy(xpath = "//p[text()='Operations in Stack']")public WebElement txtOpInstackheader;
	@FindBy(xpath = "//p[text()='Implementation']")public WebElement txtimpleheader;
	@FindBy(xpath = "//p[text()='Applications']")public WebElement txtappheader;
	@FindBy(xpath = "//pre[@role='presentation']") public WebElement CodeTxtEditor1; 
	@FindBy(xpath = "//pre[@id='output']") public WebElement outputdisplay;
	@FindBy(xpath = "//*[@id='answer_form']") public  WebElement pythonCode_Input;
	@FindBy(xpath = "//a[text()='Practice Questions']")public WebElement prac_ques;
	@FindBy(xpath ="//html/body") public WebElement practiceQuestion_page;
	
	
	public DsAlgoStackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	    this.action=new Actions(driver);
	    this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void stacklinkselect(String string){
		if ("Operations in Stack".equals(string)) {
			opInstack.click();
			} else if ("Implementation".equals(string)) {
			implebutton.click();
			} else {
			Appbutton.click();
			}
	}

	public void stacklinktextdisplay(String string){
		if ("Operations in Stack".equals(string)) {
			String value=txtOpInstackheader.getText();
			assertEquals(value,string);
			Loggerload.info(value);
			} else if ("Implementation".equals(string)) {
				String value=txtimpleheader.getText();
				assertEquals(value,string);
				Loggerload.info(value);
			} else {
				 String value=txtappheader.getText();
				 assertEquals(value,string);
				 Loggerload.info(value);
			}
		}
	public void clkTryHerebtn() {
		tryHerebtn.click();
		}
			
	public void displayTryHerebtn() {
		tryHerebtn.isDisplayed();
		}
	   
	public void displayRunBtn() {
		Runbtn.isDisplayed();
	   }
	public void clkRunBtn() {
		Runbtn.click();
	   }
	   
	public void acceptBrowserAlert() {
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String alertMessage1= alert.getText();
	    Loggerload.info(alertMessage1);
	    alert.accept();
	    }	 
	public void Stack_valid_python_code(String code){
		action.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(code).build().perform();
		}
	 	 
	public void error_alert_handle()
	 {
		String alertMessage1= "You accepted an alert";
	 	Loggerload.info(alertMessage1);
	 	}
	 
	public static void acceptBrowserAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
	    alert.accept();
	 }
	 
	public void alert_invalid(WebDriver driver) {
		wait.until(ExpectedConditions.alertIsPresent());
		String alertMessage = driver.switchTo().alert().getText() ;
		assertEquals(alertMessage ,"SyntaxError: bad input on line 1");
	 }
	 
	public void run_bttn_click(){
		Runbtn.click();
		}

	public void alertMsgPopup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			Alert alrtmsg = wait.until(ExpectedConditions.alertIsPresent());
			String text = alrtmsg.getText();
			Loggerload.info(text);
			} catch (Exception e) {
				Loggerload.info("Alert message not found: " + e.getMessage());
				}
		}

	public void Stack_invalid_python_code(String code) {
		action.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(code).build().perform();
		}
				
	public void pagedisp(){
		practiceQuestion_page.isDisplayed();
		}
	}	
	

