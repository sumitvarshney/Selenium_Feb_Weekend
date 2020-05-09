package com.edureka.tentng;


import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Demo extends BaseTest
{
	String username="sumitvarshney00@gmail.com";
	String password="sumit1234";


	
	@Test 
	public void TC_LOGIN1() 
	{
		
	    driver.findElement(By.xpath("//a[@data-button-name='Login']")).click();
		driver.findElement(By.xpath("//input[@id='si_popup_email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='si_popup_passwd']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@class='clik_btn_log btn-block']")).click();
		driver.findElement(By.xpath("//*[@id='footauto']/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/button/img")).click();
		driver.findElement(By.xpath("//*[@id='footauto']/app-root/app-mycourse-main/section/app-header/header/nav/div/div[3]/ul/li[8]/div/ul/li[12]/a")).click();
		 
		}
	@Test
	public void EdurekaSignIn1(By driver)
	{
		
		((WebElement) driver.findElements((SearchContext) By.xpath("//*[@id='header-II']/section/nav/div/a[1]"))).click();
		driver.findElement((SearchContext) By.xpath("//*[@id='sg_popup_email']")).sendKeys("sumitvarshney00@gmail.com");
		driver.findElement((SearchContext) By.xpath("//*[@id='sg_popup_phone_no']")).sendKeys("8194047406");
		driver.findElement((SearchContext) By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[1]/form/button")).click();
	}
	 

	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	}
	
	

