package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://demo.automationtesting.in/Frames.html");
		//driver.switchTo().frame(0);
		//driver.switchTo().frame("singleframe");
		
		WebElement singleframe= driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(singleframe);
		
		WebElement text= driver.findElement(By.xpath("//input[@type='text']"));
		text.sendKeys("hello");
		driver.switchTo().parentFrame();
		
		WebElement iframetab=driver.findElement(By.xpath("//a[@href='#Multiple']"));
		iframetab.click();
		
		WebElement outerframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		driver.switchTo().frame(0);
		WebElement text1= driver.findElement(By.xpath("//input[@type='text']"));
		text1.sendKeys("hello123");
		
		
		
		
		

	}

}
