package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dsAlgoLoginPage {
	
	private WebDriver driver;
	
	//Locators
	
	//@FindBy(xpath = "//a[text()='Sign in']") public  WebElement SigninPageText;
	@FindBy(xpath = "//input[@name=\"username\"]") public  WebElement UsernameText;
	@FindBy(xpath = "//input[@name=\"password\"]") public  WebElement PasswordText;
	
	@FindBy(xpath = "//input[@value=\"Login\"]") public  WebElement Loginbtn;
	
	
	//Constructor
	
public dsAlgoLoginPage(WebDriver driver){
		
        PageFactory.initElements(driver, this);

    }
	
public void loginsucess() {
	
	UsernameText.sendKeys("Numpy4");
	PasswordText.sendKeys("Testers@4");
	Loginbtn.click();
	
}


}
