package com.edureka.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
		driver.get("https://www.facebook.com");
		driver.manage().deleteAllCookies();
        //driver.navigate().to("https://www.facebook.com");
             
             // driver.navigate().back();
             //driver.navigate().forward();
             // driver.navigate().refresh();
              driver.manage().window().maximize();
              String url=driver.getCurrentUrl();
              System.out.println(url);
              String title=driver.getTitle();
              System.out.println(title);
              
             // System.out.println(driver.getTitle());
              //driver.close();
              //driver.quit();
              
	} 
	

}
