package pageObjects;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dsAlgoArrayPage {
	
    WebDriver driver;
	public static Actions action;
	private WebDriverWait wait;
	//public static Alert alert;
	//Actions action=new Actions(driver);
	
	
	@FindBy(xpath = "//h4[text() = 'Array']") public WebElement arrayPage;
	@FindBy(xpath = "//a[@href='array']") public WebElement arrayPageGetStarted;
	@FindBy(xpath = "//a[@href='arrays-in-python']") public  WebElement arrayinpythonLink;
	@FindBy(xpath = "//a[text()='Arrays Using List']") public  WebElement arrayusinglistLink;
	@FindBy(xpath = "//a[text()='Basic Operations in Lists']") public  WebElement basicoperationsinlistsLink;
	@FindBy(xpath = "//a[text()='Applications of Array']") public  WebElement applicationofarraysLink;
	@FindBy(xpath =  "//a[text()='Search the array']")    public WebElement PracticequestionPage;
	//@FindBy(xpath = "//h5[text()='Array']/../a[text() = 'Get Started']") public  WebElement getStartedButton_ArrayModule;
	@FindBy(xpath = "//a[@class='dropdown-item' and text()='Arrays']") public WebElement arrayDropDownElement;
	@FindBy(linkText = "Data Structures") public  WebElement dsDropDown;
	@FindBy(xpath = "//a[@href='/tryEditor']") public WebElement tryHerebtn;
	@FindBy(xpath = "//button[@type='button']") public WebElement Runbtn;
	@FindBy(xpath = "//p[text()='Arrays Using List']") public WebElement txtarraylistheader;
	@FindBy(xpath = "//p[text()='Applications of Array']") public WebElement txtarrayapplicationheader;
	@FindBy(xpath = "//p[text()='Arrays in Python']") public WebElement txtarraypythonheader;
	@FindBy(xpath = "//p[text()='Basic Operations in Lists']") public WebElement txtbasicListsheader;
	@FindBy(xpath = "//pre[@role='presentation']") public WebElement CodeTxtEditor1;
	@FindBy(xpath = "//pre[@id='output']") public WebElement outputdisplay;
	@FindBy(xpath = "//*[@id='answer_form']") public  WebElement pythonCode_Input;
	
	
	public dsAlgoArrayPage(WebDriver driver) {
		
      PageFactory.initElements(driver, this);
      this.action=new Actions(driver);
      this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      //Alert alert = driver.switchTo().alert();
    }
	
	
	public void arraylinkselect(String string)
	{
		if ("Arrays in Python".equals(string)) {
		    arrayinpythonLink.click();
		} else if ("Arrays Using List".equals(string)) {
			arrayusinglistLink.click();
		} else if ("Basic Operations in Lists".equals(string)) {
			basicoperationsinlistsLink.click();
		} else {
			applicationofarraysLink.click();
		}
	}
	
	public void arraylinktextdisplay(String string)
	{
		if ("Arrays in Python".equals(string)) {
		    String value=txtarraypythonheader.getText();
		    assertEquals(value,string);
		    System.out.println(value);
		} else if ("Arrays Using List".equals(string)) {
			 String value=txtarraylistheader.getText();
			    assertEquals(value,string);
			    System.out.println(value);
		} else if ("Basic Operations in Lists".equals(string)) {
			 String value=txtbasicListsheader.getText();
			    assertEquals(value,string);
			    System.out.println(value);
		} else {
			 String value=txtarrayapplicationheader.getText();
			    assertEquals(value,string);
			    System.out.println(value);
		}
	}
		public void clkTryHerebtn() {
			
			tryHerebtn.click();
		}
		
   public void displayTryHerebtn() {
			
			tryHerebtn.isDisplayed();
		}
   
   public void clkRunBtn() {
	   
	   Runbtn.click();
   }
   
 public void displyRunBtn() {
	   
	   Runbtn.isDisplayed();
   }
 
 public void Arr_valid_phyton_code(String code)

 {
	 
 	//Actions action=new Actions(driver);
 	//CodeTxtEditor.click();
	 action.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(code).build().perform();
// 	action.moveToElement(CodeTxtEditor1).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
//
// 	action.sendKeys(CodeTxtEditor1,code).build().perform();
 	//CodeTxtEditor.sendKeys(code);
 }
 

 
 public void error_alert_handle()
 {
 	
 		
 		String alertMessage1= "You accepted an alert";
 		System.out.println(alertMessage1);
 		 
 	

 	}
 
 public static void acceptBrowserAlert(WebDriver driver) {
     Alert alert = driver.switchTo().alert();
     alert.accept();
 }
 
 public void alert_invalid(WebDriver driver) {
	 
	    wait.until(ExpectedConditions.alertIsPresent());
	    
		String alertMessage = driver.switchTo().alert().getText() ;
//		System.out.println(alertMessage);
		assertEquals(alertMessage ,"SyntaxError: bad input on line 1");
 }
 


public void run_bttn_click()
{
	try {
		Runbtn.click();
	String res=outputdisplay.getText();
	System.out.println("The Result is:"+res);
		}catch(UnhandledAlertException f) {
		try 
	    {
	Alert alert = driver.switchTo().alert();
	String alertMessage1= alert.getText();
	 System.out.println(alertMessage1);
	 alert.accept();
	    } catch (NoAlertPresentException e) {

	    	
	 
	        e.printStackTrace();

	    }
	}
 
// public void alertMsgPopup() {
//     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//     try {
//         Alert alrtmsg = wait.until(ExpectedConditions.alertIsPresent());
//         String text = alrtmsg.getText();
//         System.out.println(text);
//     } catch (Exception e) {
//         System.out.println("Alert message not found: " + e.getMessage());
//     }
 
}



}

 
 

	

