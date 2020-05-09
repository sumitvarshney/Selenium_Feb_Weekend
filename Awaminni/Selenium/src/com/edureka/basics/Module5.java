package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module5
{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.edureka.co/");
		driver.findElement(By.xpath("//a[@data-button-name='Login']")).click();
		driver.findElement(By.xpath("//input[@id='si_popup_email']")).sendKeys("sumitvarshney00@gmail.com");
		driver.findElement(By.xpath("//input[@id='si_popup_passwd']")).sendKeys("sumit1234");
		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
		
	}
}