package Driver;

import java.time.Duration;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utilities.PropertiesFile;

public class Driverfactory {
	
	public static WebDriver driver;
	static String browser = PropertiesFile.readPropertiesFile("browser");
	
	public static WebDriver initializeDriver(String browser) {
		
//		  System.out.println("The browser value from properties file is: "+ browser);
//		  browser = "Chrome";
		
		if (browser == "Chrome"){
			
			ChromeOptions co = new ChromeOptions();
			co.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			
			driver = new ChromeDriver(co);
			
		}
		
		else if(browser == "Edge"){
			
			driver = new EdgeDriver();
		}
		
		else if(browser == "FireFox") {
			
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
			
		}
	

}
