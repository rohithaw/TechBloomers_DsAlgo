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
import pageObjects.DsAlgoArrayPage;
import pageObjects.DsAlgoDataStructureIntroPage;
import pageObjects.DsAlgoGraphPage;
import pageObjects.DsAlgoHomePage;
import pageObjects.DsAlgoLinkedlistPage;
import pageObjects.DsAlgoLoginPage;
import pageObjects.DsAlgoQueuePage;
import pageObjects.DsAlgoRegisterPage;
import pageObjects.DsAlgoStackPage;
import pageObjects.DsAlgoTreePage;
import utilities.PropertiesFile;

import java.time.Duration;

public class Textcontext {
	
	protected static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
	WebDriver driver;
	
	DsAlgoHomePage hp;
	DsAlgoRegisterPage rp;
	DsAlgoLoginPage lp;
	DsAlgoArrayPage ap;
	DsAlgoDataStructureIntroPage dSIP;
	DsAlgoGraphPage gp;
	DsAlgoLinkedlistPage ll;
	DsAlgoQueuePage qp;
	DsAlgoStackPage sp;
	DsAlgoTreePage tp;
	
	
	
	public void setDriver(WebDriver driver) {
		String browser = PropertiesFile.readPropertiesFile("browser");
		System.out.println("The browser value from properties file is: "+ browser);
		
		if (browser.equalsIgnoreCase("Chrome")){
			ChromeOptions co = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
			
			co.addArguments("--headless");
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

	public DsAlgoHomePage getHp() {
		return hp;
	}	
	
	public DsAlgoRegisterPage getRp() {
		return rp;
	}
	
	public DsAlgoLoginPage getLp() {
		return lp;
	}

	public DsAlgoArrayPage getAp() {
		return ap;
	}
	
	public DsAlgoDataStructureIntroPage getDSIP() {
		return dSIP;
	}	
	
	public DsAlgoGraphPage getGp() {
		return gp;
	}	
	
	public DsAlgoLinkedlistPage getLl() {
		return ll;
	}	
	
	public DsAlgoQueuePage getQp() {
		return qp;
	}	
	
	public DsAlgoStackPage getSp() {
		return sp;
	}	
	
	public DsAlgoTreePage getTp() {
		return tp;
	}	

	
	
	public void initializePageObjects(WebDriver driver) {

		this.hp = new DsAlgoHomePage(driver);
		this.rp = new DsAlgoRegisterPage(driver);
		this.lp = new DsAlgoLoginPage(driver);
		this.ap = new DsAlgoArrayPage(driver);
		this.tp = new DsAlgoTreePage(driver);
		this.sp = new DsAlgoStackPage(driver);
		this.qp = new DsAlgoQueuePage(driver);
		this.ll = new DsAlgoLinkedlistPage(driver);
		this.gp = new DsAlgoGraphPage(driver);
		this.dSIP =new DsAlgoDataStructureIntroPage(driver);
		

	}
	
}

