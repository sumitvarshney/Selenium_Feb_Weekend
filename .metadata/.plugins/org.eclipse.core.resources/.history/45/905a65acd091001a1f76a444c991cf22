package com.edureka.tentng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class M6LogIn extends M6BaseTest
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
	

}