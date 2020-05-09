package com.edureka.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://demo.automationtesting.in/Alerts.html");
		/*WebElement informbttn=driver.findElement(By.xpath("//button[contains(text(),'display an  alert box:')]"));
				informbttn.click();
				
				Alert alert=driver.switchTo().alert();
				System.out.println(alert.getText());
				Thread.sleep(3000);
				alert.accept();
				*/
		
	    /*WebElement clcen=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		clcen.click();
	    driver.findElement(By.xpath("//button[contains( text(),'display a confirm box')]")).click();
	    Alert alert=driver.switchTo().alert();
	    System.out.println(alert.getText());
	    Thread.sleep(3000);
	    alert.accept();
	*/
	    
		WebElement clm=driver.findElement(By.xpath("//a[@href='#Textbox']"));
		clm.click();
		driver.findElement(By.xpath("//button[contains(text(),'demonstrate the prompt box')]")).click();
		
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(10000);
		alert.sendKeys("hello");
		Thread.sleep(3000);
		alert.accept();	
        System.out.println(driver.findElement(By.xpath("demo1")).getText());
	    

	}

}
