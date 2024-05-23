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



public class GraphPage {
	
	
	WebDriver driver;
	  public Actions action;
	  private WebDriverWait wait;
	  
	//By Locators:
	
//	private By getStrtGraph = By.xpath("//a[@href='graph' and @class='align-self-end btn btn-lg btn-block btn-primary']");
//	private By graph1 = By.xpath("//ul/a[contains(@href,'graph')]");
//	private By tryHere = By.xpath("//a[@class='btn btn-info']");
//	private By pythonCd =  By.xpath("//form[@id='answer_form']/div/div/div/textarea");
//	//private By errPythonCd = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
//	private By runbutton = By.xpath("//form[@id=\"answer_form\"]/button");
//	private By outputPyCd = By.xpath("//pre[@id=\"output\"]");
//	private By graphrepbutton = By.xpath("//ul/a[contains(@href,'graph-representations')]");
	
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
	  
	//Constructor:

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
				  System.out.println(value);
				}
			  else {
				  
			  	  String value=txtgraphrepheader.getText();
				  assertEquals(value,string);
				  System.out.println(value);
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
			  
			//Actions action=new Actions(driver);
			 	//CodeTxtEditor.click();
				 action.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(code).build().perform();
//			 	action.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
			//
//			 	action.sendKeys(CodeTxtEditor1,code).build().perform();
			 	//CodeTxtEditor.sendKeys(code);
			 }
		  
		  
		  public void error_alert_handle()
		  {
		  		String alertMessage1= "You accepted an alert";
		  		System.out.println(alertMessage1);
		  	}
		  
		  public void acceptBrowserAlert() {
				 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
				 String alertMessage1= alert.getText();
				 System.out.println(alertMessage1);
			   alert.accept();
			 }
		  
		  public void alert_invalid(WebDriver driver) {
		 	 
		 	    wait.until(ExpectedConditions.alertIsPresent());
		 	    
		 		String alertMessage = driver.switchTo().alert().getText() ;
//		 		System.out.println(alertMessage);
		 		assertEquals(alertMessage ,"SyntaxError: bad input on line 1");
		  }
		  
		 public void run_bttn_click()
		 {
//		 	try {
		 		Runbtn.click();
//		 	String res=outputdisplay.getText();
//		 	System.out.println("The Result is:"+res);
//		 		}catch(UnhandledAlertException f) {
//		 		try 
//		 	    {
//		 	Alert alert = driver.switchTo().alert();
//		 	String alertMessage1= alert.getText();
//		 	 System.out.println(alertMessage1);
//		 	 alert.accept();
//		 	    } catch (NoAlertPresentException e) {
 	 
//		 	        e.printStackTrace();
//		 	    } 
//
//		 	    }
		 	}
		  
		  public void alertMsgPopup() {
		      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		      try {
		          Alert alrtmsg = wait.until(ExpectedConditions.alertIsPresent());
		          String text = alrtmsg.getText();
		          System.out.println(text);
		      } catch (Exception e) {
		          System.out.println("Alert message not found: " + e.getMessage());
		      }
		  
		 }

		public void Graph_invalid_python_code(String code) {
			//Actions action=new Actions(driver);
		 	//CodeTxtEditor.click();
			 action.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(code).build().perform();
//		 	action.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
		//
//		 	action.sendKeys(CodeTxtEditor1,code).build().perform();
		 	//CodeTxtEditor.sendKeys(code);
			
		}

		 }

		  


	
	  
	
	
    


