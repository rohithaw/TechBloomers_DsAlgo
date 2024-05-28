package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Loggerload;

public class DsAlgoDataStructureIntroPage {
	
	
	private WebDriver driver;
	public  Actions action ;
	public WebDriverWait wait;
	//FindBy locators
	
	
	@FindBy(xpath="//h5[contains(text(),'Data ')]/..//a[text()='Get Started']") public WebElement getStartedDSPane; 
	@FindBy(xpath="//div/h4[text()='Data Structures-Introduction']") public WebElement DataStructureText; 
	@FindBy(xpath="//h4[contains(text(),'Data ')]/..//a[text()='Time Complexity']")public WebElement timeCompBtn;
	//div//p[text()='Time Complexity']
	@FindBy(xpath="//div//p[text()='Time Complexity']")public WebElement timecompTextHead;
	@FindBy(xpath="//div//a[@class='btn btn-info']")public WebElement tryHereBtn;
			
	//@FindBy(xpath="//a[@href='/tryEditor']")public WebElement tryHereBtn;		
	
    @FindBy(xpath="//*[@id='answer_form']") public WebElement tryEditor;
    @FindBy(xpath="//div//button[text()='Run']")public WebElement runcode;		
	@FindBy(xpath="//div//pre[@id='output']")public WebElement output;
	@FindBy(xpath="//a[text()='Practice Questions']")public WebElement practiceQuesLink;
	@FindBy(xpath="/html/body") public WebElement practiceQuestion_page;
	@FindBy(xpath = "//pre[@id='output']") public WebElement outputdisplay;
	
	public DsAlgoDataStructureIntroPage(WebDriver driver){
		
        PageFactory.initElements(driver, this);
        this.action = new Actions(driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    }
	
    public void clickGetStartedDataStructurePane() {
    	getStartedDSPane.click();
    }
	public void getDataStructureTextHead() {
		String DSintroPage = DataStructureText.getText();
		Loggerload.info(DSintroPage);
	}

    
    public void clickontimecomplexity() {
    	timeCompBtn.click();
    }

    public void getTimeComplexityTextHead() {
		String timeCompText = timecompTextHead.getText();
		Loggerload.info(timeCompText);
	}

    public void clickontryhere() {
    	tryHereBtn.click();
    	
    }
	public void clickOnTryEditorTextArea() {

		action.moveToElement(tryEditor).doubleClick().click().sendKeys("print(\"Data in python\")").build().perform();
	
	}
	
	public void clickOnRunButton() {
		runcode.click();
	}
	public void EnterInValidPythonCode() {
		action.moveToElement(tryEditor).doubleClick().click().sendKeys("print('Hello, world!)").build().perform();
	}
	public void acceptBrowserAlert() {
		 Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		 String alertMessage1= alert.getText();
		 Loggerload.info(alertMessage1);
	     alert.accept();
	  
	}
	
	public void practiceQuestionsDataStructure() {
		practiceQuesLink.click();
		
	}
	
	public void pagedisp(){
		practiceQuestion_page.isDisplayed();
		}
	
	
}
