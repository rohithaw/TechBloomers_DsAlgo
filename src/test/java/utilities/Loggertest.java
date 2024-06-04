package utilities;

public class Loggertest {

	public void testInfo()
	{
		int c,a=10, b=20;
		c=a+b;
		System.out.println("Value of c :"+c);
		Loggerload.info("Info  - Addition of integers");
	}
	
	public void testError()
	{
		try
			{
			int i=1/0;
			}
		catch(Exception e)
			{
			System.out.println(e);
			}
		finally
			{
			Loggerload.error("Error - You can not divide a number by zero");
			}
	
	}
	
	public void testWarn()
	{
		Loggerload.warn("Warning - Testing");
	}
	
	public static void main(String[] args) {
		
		Loggertest obj = new Loggertest();
		obj.testError();
		obj.testInfo();
		obj.testWarn();
	}
}