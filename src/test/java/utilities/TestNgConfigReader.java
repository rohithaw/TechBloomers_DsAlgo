package utilities;

public class TestNgConfigReader {
	
	
	private static String browserType = null;

	public static void setBrowserType(String browser) {

	browserType = browser;

	}

	public static String getBrowserType() throws Throwable {

	if (browserType != null)

	return browserType;

	else

	throw new RuntimeException("browser not specified in the testng.xml");

	}

	

}
