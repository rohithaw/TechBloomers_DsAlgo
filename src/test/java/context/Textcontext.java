package context;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.dsAlgoArrayPage;
import pageObjects.dsAlgoHomePage;
import pageObjects.dsAlgoLoginPage;
import pageObjects.dsAlgoRegisterPage;
import utilities.PropertiesFile;

import java.time.Duration;

public class Textcontext {
	
	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
	WebDriver driver;
	
	dsAlgoHomePage hp;
	dsAlgoRegisterPage rp;
	dsAlgoLoginPage lp;
	dsAlgoArrayPage ap;
	
	
	public void setDriver(WebDriver driver) {
		String browser = PropertiesFile.readPropertiesFile("browser");
		System.out.println("The browser value from properties file is: "+ browser);
		
		if (browser.equalsIgnoreCase("Chrome")){
			ChromeOptions co = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			
			//co.addArguments("--headless");
			co.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			driver = new ChromeDriver(co);
			threadLocalDriver.set(driver);
		}

		else if(browser.equalsIgnoreCase("Edge")){
			EdgeOptions eo = new EdgeOptions();
			WebDriverManager.edgedriver().setup();
			
			eo.addArguments("--headless");
			driver = new EdgeDriver(eo);
			threadLocalDriver.set(driver);
		}

		else if(browser.equalsIgnoreCase("FireFox")) {
			
			FirefoxOptions fo = new FirefoxOptions();
			WebDriverManager.firefoxdriver().setup();
			
			fo.addArguments("--headless");
			driver = new FirefoxDriver(fo);
			threadLocalDriver.set(driver);
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		this.driver = driver;
	}
	
	public WebDriver getDriver() {
		return threadLocalDriver.get();
	}

	public dsAlgoHomePage getHp() {
		return hp;
	}	
	
	public dsAlgoRegisterPage getRp() {
		return rp;
	}
	
	public dsAlgoLoginPage getLp() {
		return lp;
	}

	public dsAlgoArrayPage getAp() {
		return ap;
	}

	
	
	public void initializePageObjects(WebDriver driver) {

		this.hp = new dsAlgoHomePage(driver);
		this.rp = new dsAlgoRegisterPage(driver);
		this.lp = new dsAlgoLoginPage(driver);
		this.ap = new dsAlgoArrayPage(driver);
		

	}
	
}

