package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Loggerload;

public class dsAlgoLoginPage {
	
	
	//Locators
	
	//@FindBy(xpath = "//a[text()='Sign in']") public  WebElement SigninPageText;
	@FindBy(xpath = "//input[@name=\"username\"]") public  WebElement UsernameText;
	@FindBy(xpath = "//input[@name=\"password\"]") public  WebElement PasswordText;
	@FindBy(xpath = "//input[@value=\"Login\"]") public  WebElement Loginbtn;
	@FindBy(xpath="//a[@href='/register']") public WebElement registerLink;
	@FindBy(xpath="//div[@role='alert']") public WebElement alertSigninMsg;
	
	
	//Constructor
	
public dsAlgoLoginPage(WebDriver driver){
		
        PageFactory.initElements(driver, this);

    }

	
public void loginsucess() {
	
	UsernameText.sendKeys("Numpy4");
	PasswordText.sendKeys("Testers@4");
	Loginbtn.click();
	
}

public void clkregister() {
	
	registerLink.click();
}

public void dispMsg() {
	
    boolean Msg = alertSigninMsg.isDisplayed();
    String OutputMessage= alertSigninMsg.getText();
    Loggerload.info("Logged in message is displayed :" +OutputMessage) ;
		
}

public void signin_excel(String username,String password)
{
	UsernameText.sendKeys(username);
	PasswordText.sendKeys(password);
	
}

public void click_login()
{
	Loginbtn.click();

}


}
