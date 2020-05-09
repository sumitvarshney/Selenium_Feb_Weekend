package com.edureka.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Module3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait =new WebDriverWait(driver,20);
		driver.manage().deleteAllCookies();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@ type='text']")).click();
		driver.findElement(By.xpath("//*[@id='search-inp-overlay-new']")).sendKeys("Selenium Certification Training");
		driver.findElement(By.xpath("/html/body/div[2]/div[3]/section[1]/div/span[1]/div/span[1]/form/div/div/ul/li[2]/a/span/a/span")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.contains("Selenium 3.0 WebDriver Online Training"))
		{
			System.out.println("login sucess");
		}
		else
			System.out.println("faiiled");
		    driver.navigate().back();
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[5]/div[3]/a")).click();
		
	}
}
