package com.edureka.basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInByEmail {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
			driver.get("https://www.amazon.in/ap/signin?openid.assoc_handle=inflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fcart%2Fview.html%2F%3Fie%3DUTF8%26ref_%3Dnav_em_link_re_signin&ref_=nav_em_T1_0_1_0_4_link_clc_signin");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement email=driver.findElement(By.id("ap_email"));
			email.sendKeys("sumitvarshney00@gmail.com");
			WebElement name1=driver.findElement(By.xpath(".//*[@id='continue']"));
			name1.click();
			
			driver.findElement(By.name("password")).sendKeys("sumit1234");
			WebElement name=driver.findElement(By.id("signInSubmit"));
			name.click();
			
			String title=driver.getTitle();
			if(title.contains("inbox"))
			{
				System.out.println("login sucess");
			}
			else
				System.out.println("faiiled");
	}
			
			
			


	}


