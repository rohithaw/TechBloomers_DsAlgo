package pageObjects;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Loggerload;

public class dsAlgoRegisterPage {
	
	
	@FindBy(name = "username") public WebElement username_Register;
	@FindBy(name = "password1") public WebElement password_Register;
	@FindBy(name = "password2") public WebElement confirmPassword_Register;
	@FindBy(linkText = " Register ") public WebElement registerLink;
	@FindBy(xpath = "//div[@class='alert alert-primary']") public WebElement errorMessage_Register;
	@FindBy(xpath = "//div[@class='alert alert-primary']") public WebElement success_Register;
	@FindBy(xpath = "//input[@value='Register']") public  WebElement registerButton;
	@FindBy (xpath="/html/body") WebElement SShotError;
	@FindBy (xpath="/html/body/div[3]") WebElement Alert;
	
	
	public dsAlgoRegisterPage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public void all_empty(String user,String pass,String confpass)
	{
		user="";
		pass="";
		confpass="";
		//registerLink.click();
		username_Register.sendKeys(user);
		password_Register.sendKeys(pass);
		confirmPassword_Register.sendKeys(confpass);
		registerButton.click();
	Loggerload.info("User id:"+user+"Pass:"+pass+"Confirm:"+confpass);
	}
	
	public String err_username()
	{
		String message=username_Register.getAttribute("validationMessage");
		return message;
		
	}
	
	public String err_password()
	{
		String message=password_Register.getAttribute("validationMessage");
		return message;
		
	}
	
	public String err_confirmpassword()
	{
		String message=confirmPassword_Register.getAttribute("validationMessage");
		return message;
		
	}
	
	public void Multipleinput(String user,String pass,String confpass)
	{
	
		username_Register.sendKeys(user);
		password_Register.sendKeys(pass);
		confirmPassword_Register.sendKeys(confpass);
		registerButton.click();
	  Loggerload.info("User id:"+user+"Pass:"+pass+"Confirm:"+confpass);
	
	}
	
	public String err_Alert() 
	{
		String message1=Alert.getText();
		Loggerload.warn("The Alert message is:"+message1);
		return message1;
	}
	


}
