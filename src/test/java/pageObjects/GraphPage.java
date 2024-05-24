package pageObjects;

import static org.testng.Assert.assertEquals;
import java.time.Duration;
import org.openqa.selenium.Alert;
//import org.openqa.selenium.NoAlertPresentException;
//import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Loggerload;


public class GraphPage {
		
	WebDriver driver;
	public Actions action;
	private WebDriverWait wait;
	  
		
	  @FindBy(xpath ="//h4[text() = 'Graph']" ) public WebElement GraphPage;
	  @FindBy(xpath = "//a[@href='graph']") public WebElement GraphPageGetStarted;
	  @FindBy(xpath = "//ul/a[contains(@href,'graph')]") public WebElement graph;
	  @FindBy(xpath = "//ul/a[contains(@href,'graph-representations')]")public WebElement graphrepbutton;
	  @FindBy(xpath = "//a[@class='dropdown-item' and text()='Graph']")public WebElement graphDropDownElement;
	  @FindBy(linkText = "Data Structures") public WebElement dsDropDown;
	  @FindBy(xpath = "//a[@href='/tryEditor']") public WebElement tryHerebtn;
	  @FindBy(xpath = "//button[@type='button']") public WebElement Runbtn;
	  @FindBy(xpath = "//p[text()='Graph']")public WebElement txtgraphheader;
	  @FindBy(xpath = "//p[text()='Graph Representations']")public WebElement txtgraphrepheader;
	  @FindBy(xpath = "//pre[@role='presentation']")public WebElement CodeTxtEditor1;
	  @FindBy(xpath = "//pre[@id='output']")public WebElement outputdisplay;
	  @FindBy(xpath = "//*[@id='answer_form']")public WebElement pythonCode_Input;
	  @FindBy(xpath = "//a[text()='Practice Questions']")public WebElement prac_ques;
	  @FindBy(xpath ="//html/body") public WebElement practiceQuestion_page;
	  
	
	public GraphPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.action = new Actions(driver);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		  }
	  
	public void graphlinkselect(String string) {
		if ("graph".equals(string)) {
			GraphPage.click();
		} 
		else { 
			graphrepbutton.click();
		}
	  }
			  	  
	public void graphlinktextdisplay(String string) {
		if("graph".equals(string)) {
			String value=txtgraphheader.getText();
			assertEquals(value,string);
			Loggerload.info(value);
				}
		else {
			String value=txtgraphrepheader.getText();
			assertEquals(value,string);
			Loggerload.info(value);
			  }
		  }
		  
	public void clkTryHerebtn() {
		tryHerebtn.click();
		  }
		  
	public void displayTryherebtn() {
		tryHerebtn.isDisplayed();
		}
		  
	public void clkRunBtn() {
		Runbtn.click();
		}
		  
	public void displayRunBtn() {
		Runbtn.isDisplayed();
		}
		  
	public void Graph_valid_python_code(String code) {
		action.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(code).build().perform();
		}
		    
	public void error_alert_handle(){
		String alertMessage1= "You accepted an alert";
		Loggerload.info(alertMessage1);
		}
		  
	public void acceptBrowserAlert() {
	    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		String alertMessage1= alert.getText();
		Loggerload.info(alertMessage1);
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

	public void Graph_invalid_python_code(String code) {
			
		action.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(code).build().perform();
		}
		
	public void pagedisp(){
		practiceQuestion_page.isDisplayed();
		}
	}

		  


	
	  
	
	
    


