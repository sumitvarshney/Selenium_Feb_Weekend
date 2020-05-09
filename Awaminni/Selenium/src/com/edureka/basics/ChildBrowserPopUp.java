package com.edureka.basics;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://www.popuptest.com/");
		driver.findElement(By.linkText("Multi-PopUp Test")).click();
		String parentWindow=driver.getWindowHandle();
		Set<String> windowHandles= driver.getWindowHandles();
		for(String handle: windowHandles)
		{
		/*	if(!handle.equals(parentWindow))
			{
			driver.switchTo().window(handle);
			driver.manage().window().maximize();
			String url=driver.getCurrentUrl();
			System.out.println(url);
			driver.close();
			}
			else 
				continue;*/
			if(handle.equals(parentWindow))
			{		
		            continue;
			}
			else{
				driver.switchTo().window(handle);
				driver.manage().window().maximize();
				String url=driver.getCurrentUrl();
				System.out.println(url);
				driver.close();
			}
			}
		
		   }
		      }


