package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.edureka.co/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Enter Course, Category or keyword']")).click();
		driver.navigate().refresh();
	    //driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.linkText("Log In")).click();
		driver.navigate().refresh();
		

	}

}
