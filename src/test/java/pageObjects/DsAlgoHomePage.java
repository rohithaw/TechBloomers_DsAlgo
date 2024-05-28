package pageObjects;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DsAlgoHomePage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//h1[text()='Preparing for the Interviews']") public  WebElement homePageText;
	@FindBy(xpath = "//button[text()='Get Started']") public  WebElement getStartedButtonHP;
	@FindBy(xpath = "//a[text()='Sign in']") public  WebElement SigninPageText;
	
	@FindBy(linkText = "Data Structures") public  WebElement dsDropDown;
	@FindBy(xpath = "//a[@class='dropdown-item']") public  List<WebElement> dsDropDownOptions;
	@FindBy(xpath = "//a[text()=' Register ']") public  WebElement registerLink;
	@FindBy(xpath = "//input[@value='Register']") public  WebElement registerButton;
	@FindBy(xpath = "//*[@class='card-title']") public  List<WebElement> dsModuleTitles;
	
	@FindBy(xpath = "//div[@class='alert alert-primary']") public  WebElement notLoggedInAlert;
	@FindBy(linkText = "Register!") public  WebElement pleaseRegisterMessageLink;
	@FindBy(name = "username") public WebElement username;
	@FindBy(name = "password") public WebElement password;
	@FindBy(xpath = "//h5[text()='Data Structures-Introduction']/../a[text()='Get Started']") public  WebElement getStartedButton_DSIntroductionModule;
	@FindBy (xpath="/html/body/div[2]/div[2]/div/div/a") WebElement ArrButton;
	@FindBy (xpath="/html/body/div[2]/div[3]/div/div/a") WebElement LLButton;
	@FindBy (xpath="/html/body/div[2]/div[4]/div/div/a") WebElement StkButton;
	@FindBy (xpath="/html/body/div[2]/div[5]/div/div/a") WebElement QuButton;
	@FindBy (xpath="/html/body/div[2]/div[6]/div/div/a") WebElement TrButton;
	@FindBy (xpath="/html/body/div[2]/div[7]/div/div/a") WebElement GphButton;
	@FindBy (xpath="/html/body") WebElement SShotwarning;
	@FindBy (xpath="//a[@class='dropdown-item']/../a[text()='Arrays']") WebElement Arrlist;
	@FindBy (xpath="//a[@class='dropdown-item']/../a[text()='Linked List']") WebElement Lnklist;
	@FindBy (xpath="//a[@class='dropdown-item']/../a[text()='Stack']") WebElement Stklist;
	@FindBy (xpath="//a[@class='dropdown-item']/../a[text()='Queue']") WebElement Qulist;
	@FindBy (xpath="//a[@class='dropdown-item']/../a[text()='Tree']") WebElement Trlist;
	@FindBy (xpath="//a[@class='dropdown-item']/../a[text()='Graph']") WebElement Gphlist;

	
	public DsAlgoHomePage(WebDriver driver){
		
        PageFactory.initElements(driver, this);

    }
	
   public String open_portallink()
	
	{
		return driver.getTitle();
		
		
	}
	
	public void clickgetstarted() {
		
		getStartedButtonHP.click();
	}
	
	public void signinClick() {
		
		SigninPageText.click();
		
	}
	
	public void Getstart_click(String opt)
	{
		
		
	 if (opt.equalsIgnoreCase("Datastructures"))
	 {
		 getStartedButton_DSIntroductionModule.click();
	 }
	 else if (opt.equalsIgnoreCase("Arrays"))
	 {
		 ArrButton.click();
	 }
	 else if (opt.equalsIgnoreCase("Linkedlist"))
	 {
		 LLButton.click();
	 }
	 else if (opt.equalsIgnoreCase("Stack"))
	 {
		 StkButton.click();
	 }
	 else if (opt.equalsIgnoreCase("Queue"))
	 {
		 QuButton.click();
	 }
	 else if (opt.equalsIgnoreCase("Tree"))
	 {
		 TrButton.click();
	 }
	 else if (opt.equalsIgnoreCase("Graph"))
	 {
		 GphButton.click();
	 }
	 else
	 {
		 System.out.println("Invalid Element");
	 }

	} 
	
	public void warning_mess(String Warning) throws IOException
	{
		Warning="You are not logged in";
		String actualmess= notLoggedInAlert.getText();
		Assert.assertEquals(Warning, actualmess);
		
		TakesScreenshot ts = (TakesScreenshot) SShotwarning;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File src1 = ((TakesScreenshot) SShotwarning).getScreenshotAs(OutputType.FILE);
		Date dt = new Date();
		DateFormat dft = new SimpleDateFormat("dd_mm_yy_hh_mm_ss");
		File trg = new File(".\\Screenshots\\image.png");
		FileUtils.copyFile(src1, new File("./Screenshots/imag1" + dft.format(dt) + ".png"));
		// imag131_5_2021_1_26_30
		
	
	}
	
	public void droplist(String opt)
	{
		dsDropDown.click();
		
	if (opt.equalsIgnoreCase("Arrays"))
	 {
		Arrlist.click();
	 }
	 else if (opt.equalsIgnoreCase("Linkedlist"))
	 {
		 Lnklist.click();
	 }
	 else if (opt.equalsIgnoreCase("Stack"))
	 {
		 Stklist.click();
	 }
	 else if (opt.equalsIgnoreCase("Queue"))
	 {
		 Qulist.click();
	 }
	 else if (opt.equalsIgnoreCase("Tree"))
	 {
		 Trlist.click();
	 }
	 else if (opt.equalsIgnoreCase("Graph"))
	 {
		 Gphlist.click();
	 }
	 else
	 {
		 System.out.println("Invalid Element");
	 }
	}
}
