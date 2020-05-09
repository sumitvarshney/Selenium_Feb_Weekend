package com.edureka.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Module4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.goindigo.in/?linkNav=home_header");
		WebElement chkbox1=driver.findElement(By.xpath("//label[contains(@for,'oneWayTrip')]"));
		chkbox1.click();
		
		WebElement departure=driver.findElement(By.xpath("//input[@placeholder='From']"));
		departure.click();
	
		
		
		
		
		
		
		
		
	}

}
