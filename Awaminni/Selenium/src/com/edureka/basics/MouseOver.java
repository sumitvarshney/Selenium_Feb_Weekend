package com.edureka.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver,20);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.craftsvilla.com/");
		
       WebElement sareesLink= driver.findElement(By.xpath("//a[@href=\"/womens-clothing/sarees/?MID=megamenu_sarees_seeall\"]"));
       
       Actions action= new Actions(driver);
       action.moveToElement(sareesLink).perform();
       
       WebElement georgettesarees = driver.findElement(By.linkText("georgette"));
       georgettesarees.click();
       
	}

}
