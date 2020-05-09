package com.edureka.tentng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class M7BaseTest 
{
	public WebDriver driver=null;
	public WebDriverWait wait=null;
	
	
	@Parameters({"browserType"})
	@BeforeMethod
	public void launchBrowser(String browser)
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		    wait=new WebDriverWait(driver,30);
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    driver.manage().window().maximize();
		    driver.manage().deleteAllCookies();
		    driver.get("https://www.flipkart.com/");
			}
		
	
    @AfterMethod
    public void closeBrowser()
    {
    	driver.quit();
    }
     
       }
	
