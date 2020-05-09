package com.edureka.tentng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class M6BaseTest 
{

	public WebDriver driver=null;
	public WebDriverWait wait=null;
	String username="sumitvarshney00@gmail.com";
	String password="sumit1234";

	
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
		    driver.get("https://www.edureka.co/");
			}

	@Test
	public void TC_LOGIN1() 
	{
		
		driver.findElement(By.xpath("//a[@data-button-name='Login']")).click();
		driver.findElement(By.xpath("//input[@id='si_popup_email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='si_popup_passwd']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
		driver.findElement(By.xpath("//*[@id='footauto']/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/button/img")).click();
		driver.findElement(By.xpath("//*[@id='footauto']/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/ul/li[12]/a")).click();
		 
		}
		
    @AfterMethod
    public void closeBrowser()
    {
    	driver.quit();
    }
     
       }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

