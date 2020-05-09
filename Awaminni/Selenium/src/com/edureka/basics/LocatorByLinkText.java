package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByLinkText {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		WebElement forgottonAcccount=driver.findElement(By.linkText("Forgotten account?"));
		forgottonAcccount.click();

	}

}
