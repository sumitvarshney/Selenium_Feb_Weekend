package com.edureka.tentng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest 
{
	public WebDriver driver = null;
	public WebDriverWait wait = null;
	
	@Parameters({"browserType"})
	@BeforeMethod
	public void launchBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("CHROME"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Edureka_Jan_Weekend_2020\\Selenium\\Drivers\\geckodriver.exe");
			 driver = new FirefoxDriver();
			
		}
		
		else
		{
			System.out.println("Invalid browser selection");
		}
		 wait = new WebDriverWait(driver, 5);
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.gmail.com");
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}

}
