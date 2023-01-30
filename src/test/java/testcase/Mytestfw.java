package testcase;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class Mytestfw extends BaseTest{
	
	@Test(dataProvider = "testdata")
	public  static void LoginTest(String username, String password) throws InterruptedException
	{
driver.manage().window().maximize();

Thread.sleep(1000);

driver.findElement(By.linkText(properties_locators.getProperty("signin_link"))).click();
		
driver.findElement(By.id(properties_locators.getProperty("login_id"))).sendKeys(username);
driver.findElement(By.id(properties_locators.getProperty("next_button"))).click();

Thread.sleep(4000);

driver.findElement(By.id(properties_locators.getProperty("password"))).sendKeys(password);

Thread.sleep(1000);



 driver.findElement(By.xpath(properties_locators.getProperty("login_next"))).click();
 
 Thread.sleep(5000);

	}
	
	
	@DataProvider(name = "testdata")
	public Object[][] Data()
	{
		return new Object[][]
				{
			{"ontorhazari571@gmail.com","01765"},
			{"ontorhazari571@gmail.com","01765018"},
			{"ontorhazari579@gmail.com","01765018"},
			{"ontorhazary570@gmail.com","01765018"},
				};
	}

}
