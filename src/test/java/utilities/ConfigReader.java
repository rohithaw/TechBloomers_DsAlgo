package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigReader {
	
	
	private Properties properties;
	private final String configFilePath= "./src/test/resources/Config/config.properties";

	public ConfigReader(){

	File ConfigFile = new File(configFilePath);

	try {
	      FileInputStream configFileReader = new FileInputStream(ConfigFile);
	      properties = new Properties();

	try {
	      properties.load(configFileReader);
	      configFileReader.close();
	    } catch (IOException e) 
	      {
	        System.out.println(e.getMessage());
	      }
	  }  catch (FileNotFoundException e) 
	      {
	        System.out.println(e.getMessage());
	        throw new RuntimeException("config.properties not found at config file path " + configFilePath);
	      }
	  }

	public String getApplicationUrl() {
	String applicationurl = properties.getProperty("HomePageUrl");
	if(applicationurl != null)
	  return applicationurl;
	else 
	  throw new RuntimeException("Application url not specified in the config.properties file.");
	}

	public String getUserName() {
	String username = properties.getProperty("username");
	if(username != null)
	  return username;
	else
	  throw new RuntimeException("username not specified in the config.properties file.");
	}

	public String getPassword() {
	String password = properties.getProperty("password");
	if(password != null)
	  return password;
	else
	  throw new RuntimeException("password not specified in the config.properties file.");
	}

	public String getBrowser() {
	String browser = properties.getProperty("browser");

	if(browser != null)
	  return browser;
	else
	  throw new RuntimeException("browser not specified in the config.properties file.");
	}
	}

	
//	private Properties prop;
//	
//	public Properties init_prop()
//	{
//		
//		prop= new Properties();
//		
//		try 
//		{
//			FileInputStream ip = new FileInputStream("./src/test/resources/Config/config.properties");
//			prop.load(ip);
//		}
//		catch(FileNotFoundException e) {
//			e.printStackTrace();
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
//		
//		return prop;
//	}
//	-----------
//static Properties prop = new Properties();
//	
//	//Method to read from config.properties file
//	public static String readPropertiesFile(String key) {
//		
//		try { // Giving the config.properties file location                                      
//			InputStream input = new FileInputStream("./src/test/resources/Config/config.properties");
//			prop.load(input); //Loading the config.properties file
//		}
//		
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		return prop.getProperty(key);// Getting the required property from the config.properties file
//	}
//	
//	//Method to write to config.properties file
//	public static void writePropertiesFile(String key, String value) {
//		
//		try {
//			OutputStream output = new FileOutputStream("./src/test/resources/Config/config.properties");
//			prop.setProperty(key, value);
//			prop.store(output, null);
//		}
//		
//		catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//	}

