package pageObjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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

import utilities.CommonMethods;
import utilities.ExcelReader;
import utilities.Loggerload;

public class dsAlgoArrayPage {
	
    WebDriver driver;
	public static Actions action;
	private WebDriverWait wait;
	public static Alert alert;
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
	
	//Practise Ques
	@FindBy(xpath = "//a[text()=\"Practice Questions\"]") public WebElement practiceLink;
	@FindBy(xpath = "//a[@href='/question/1']") public WebElement searchArrayLink;
	@FindBy(xpath = "//a[@href='/question/2']") public WebElement maxConsecutiveLink;
	@FindBy(xpath = "//a[@href='/question/3']") public WebElement evenDigitLink;
	@FindBy(xpath = "//a[@href='/question/4']") public WebElement squareSortedLink;
	@FindBy(xpath = "//div[@class=\"CodeMirror-scroll\"]") public WebElement questextcodeEditor;
	@FindBy(xpath = "//button[text()='Run']") public WebElement clkRunBtn;
    @FindBy(xpath="//textarea[@tabindex='0']") public WebElement editorInput;	
	@FindBy(xpath="//*[@id='answer_form']") public WebElement answerform;
	@FindBy(xpath="//pre[@id='output']")public WebElement  outputpractisePage;
	@FindBy(xpath="//input[@value='Submit']")public WebElement submitbtn;
	
	public dsAlgoArrayPage(WebDriver driver) {
		
      PageFactory.initElements(driver, this);
      this.action=new Actions(driver);
      this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
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
		    Loggerload.info(value);
		} else if ("Arrays Using List".equals(string)) {
			 String value=txtarraylistheader.getText();
			    assertEquals(value,string);
			    Loggerload.info(value);
		} else if ("Basic Operations in Lists".equals(string)) {
			 String value=txtbasicListsheader.getText();
			    assertEquals(value,string);
			    Loggerload.info(value);
		} else {
			 String value=txtarrayapplicationheader.getText();
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
 		Loggerload.info(alertMessage1);
 		 

 	}
 
 public void acceptBrowserAlert() {
	 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	 String alertMessage1= alert.getText();
	 Loggerload.info(alertMessage1);
     alert.accept();
 }

 
 public void practiceQueslinkselect(String string)
	{
		if ("Search the array".equals(string)) {
			searchArrayLink.click();
		} else if ("Max Consecutive Ones".equals(string)) {
			maxConsecutiveLink.click();
		} else if ("Find Numbers with Even Number of Digits".equals(string)) {
			evenDigitLink.click();
		} else {
			squareSortedLink.click();
		}
	}
 
 public void quesvalidPythonCode(String code)

 {
	 action.moveToElement(questextcodeEditor).doubleClick().click().sendKeys(Keys.BACK_SPACE).build().perform();
	 //action.moveToElement(questextcodeEditor).doubleClick().click().sendKeys(code).build().perform();
	 action.sendKeys(questextcodeEditor,code).build().perform();
 }
 
 
 public void enterCodePractice(String code, WebElement element) {
		action
		.keyDown(Keys.COMMAND)
		.sendKeys("a")
		.sendKeys(Keys.DELETE)
		.keyUp(Keys.COMMAND)
		.perform();
		String[] str1 = code.split("\n");
		for (int i = 0; i < str1.length; i++) {
			if (str1[i].equalsIgnoreCase("\\b")) {
				element.sendKeys(Keys.BACK_SPACE);
			} else {
				element.sendKeys(str1[i]);
				element.sendKeys(Keys.RETURN);
			}
		}
	}
 
 
 public String getCodefromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", sheetname);
		String code = testdata.get(rownumber).get("ArraypythonCode");
		return code;
	}
 
 
 public String readResultfromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData("./src/test/resources/testdata/TechBloomersDsalgo.xlsx", sheetname);
		String result = testdata.get(rownumber).get("Result");
		Loggerload.info("Expected result from Excel sheetname " + sheetname + " and " + rownumber + " : " + result);
		return result;
	}

 
 
 public void enterPythonCodePractice(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		
	   // CommonMethods.waitForElementToBeVisible(driver, answerform);
		String code = getCodefromExcel(sheetname, rownumber);
		enterCodePractice(code, editorInput);
	}
 
 public String getExpectedResult(String sheetName, Integer rowNum) throws InvalidFormatException, IOException {
		String expectedResult =readResultfromExcel(sheetName, rowNum);
		return expectedResult;
	}

 public void outputdisp() {
	 
	
	 wait.until(ExpectedConditions.elementToBeClickable(outputpractisePage)); 
	 if(outputpractisePage.isDisplayed())
	 {
	 String result=outputpractisePage.getText();
	 Loggerload.info("output is displayed: " +result);
	 }
	 else {
		
		 Loggerload.info("Error message is displayed");
		 acceptBrowserAlert();
		 
	 }
		 
	 
 }
 
 public void clkSubmitBtn() {
	 
	 submitbtn.click();
 }
 

}
 





 
 

	

