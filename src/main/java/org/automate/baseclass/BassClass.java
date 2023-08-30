package org.automate.baseclass;

import java.io.IOException;
import org.automate.utility.UtilityFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


public class BassClass {

	public static WebDriver adactin_driver;
	
    @BeforeSuite
	public void browserLaunch() throws IOException

	{
		if (UtilityFile.getBrowser("BROWSER_NAME").equalsIgnoreCase("Chrome"))

		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\Eclipse_Workspace\\SeleniumTestNG\\Drivers\\chromedriver.exe");
			adactin_driver = new ChromeDriver();
		}

		else if (UtilityFile.getBrowser("BROWSER_NAME").equalsIgnoreCase("Edge"))

		{
			System.setProperty("webdriver.edge.driver",
					"D:\\Eclipse_Workspace\\SeleniumTestNG\\Drivers\\msedgedriver.exe");
			adactin_driver = new EdgeDriver();
		}

		else

		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\Eclipse_Workspace\\SeleniumTestNG\\Drivers\\chromedriver.exe");
			adactin_driver = new ChromeDriver();
		}

	}

    @BeforeTest
	public void urlLaunch() throws IOException

	{
		adactin_driver.get(UtilityFile.getURL("URL"));
		adactin_driver.manage().deleteAllCookies();
		adactin_driver.manage().window().maximize();
	}

	@AfterSuite
    public void driverClose()

	{
		adactin_driver.quit();
	}
	
	public static void getDropDown(WebElement element , String value) 
	
	{
	 Select s = new Select(element);
	 s.selectByValue(value);
	}
}
