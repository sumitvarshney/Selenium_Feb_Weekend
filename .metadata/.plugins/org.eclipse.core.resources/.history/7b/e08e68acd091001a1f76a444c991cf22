package com.edureka.thirdpartytools;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ComposeEmailWithAttachment
{
	
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		
	}
	
	
	public void runAutoIt() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String strFilePath="D:\\Sample.txt";
		String strPath="C:\\Users\\Sumit\\workspace\\Selenium\\AttachmentForGmail.exe";
		
		String strParameter =strPath+" "+strFilePath;
		Runtime.getRuntime().exec(strParameter);
	}
		
	@Test
	public void composeEmail() throws Exception
	{
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("varshneysumit23@gmail.com");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("sumit@2730");
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		wait.until(ExpectedConditions.titleContains("Inbox"));
		
		WebElement composeBtn = driver.findElement(By.xpath("//div[@gh='cm']"));
		composeBtn.click();		
		
		WebElement attachBtn = driver.findElement(By.xpath("//div[@aria-label='Attach files']/div"));
		attachBtn.click();
		
		runAutoIt();
		
	}
}