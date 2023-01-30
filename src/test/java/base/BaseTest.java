package base;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	
	public static WebDriver driver;
	public static Properties properties = new Properties();
	public static Properties properties_locators = new  Properties();
	public static FileReader fr;
	public static FileReader fr_loc;
	
	
	@BeforeMethod
	public void setUp() throws IOException
	{
		
		if(driver == null)
		{
			
		
			
		fr = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\config.properties");
		fr_loc = new  FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
			
			properties.load(fr);
			properties_locators.load(fr_loc);
			
			
		}
		
		if(properties.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			
	
			driver.get(properties.getProperty("testurl"));
		}
		
		
		else if(properties.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
			driver.get(properties.getProperty("testurl"));
		}
		
	}
	
	
	

	@AfterMethod
	public void tearDwon()
	{
		driver.close();
		System.out.println("Tear Dwon is sucssfully");
	}
}
