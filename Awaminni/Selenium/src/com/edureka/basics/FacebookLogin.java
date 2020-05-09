package com.edureka.basics;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FacebookLogin {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
		WebElement email=driver.findElement(By.xpath("//input[@class='inputtext login_form_input_box']"));
		email.sendKeys("coolsumitv@yahoo.com");
        WebElement password=driver.findElement(By.xpath(".//*[@id='pass']"));
        password.sendKeys("sumit@27302730");
        //WebElement log=driver.findElement(By.id("u_0_4"));
        //log.click();

	}

}
