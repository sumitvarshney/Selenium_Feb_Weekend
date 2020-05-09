package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorByXPath {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
		//absolutexPath
		WebElement email=driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/input"));
		email.sendKeys("sumit");
		
		//RelativeXpath
		
		WebElement pass=driver.findElement(By.xpath(".//*[@id='pass']"));
		pass.sendKeys("sumit");
		
		String createText=driver.findElement(By.xpath("//span[text()='Create an account']")).getText();
		System.out.println(createText);
		
		WebElement mobile =driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']"));
		mobile.sendKeys("9999922872");
		
		//WebElement text=driver.findElement(By.xpath("//div[starts-with(text(),'Facebook helps')]"));
		//System.out.println(text.getText());
		
		WebElement contains=driver.findElement(By.xpath("//div[contains(text(),'connect and share')]"));
		System.out.println(contains.getText());
		

	}

}
