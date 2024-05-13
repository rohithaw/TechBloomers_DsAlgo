package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dsAlgoHomePage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//h1[text()='Preparing for the Interviews']") public  WebElement homePageText;
	@FindBy(xpath = "//button[text()='Get Started']") public  WebElement getStartedButtonHP;
	@FindBy(xpath = "//a[text()='Sign in']") public  WebElement SigninPageText;

	
	public dsAlgoHomePage(WebDriver driver){
		
        PageFactory.initElements(driver, this);

    }
	
	public void clickgetstarted() {
		
		getStartedButtonHP.click();
	}
	
	public void signinClick() {
		
		SigninPageText.click();
		
	}


}
