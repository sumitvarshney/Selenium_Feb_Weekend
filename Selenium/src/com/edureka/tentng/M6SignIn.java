package com.edureka.tentng;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class M6SignIn extends M6BaseTest
{
	@DataProvider
	public String[][] getData()
	{
		String[][] credentials = new String[2][2];
		credentials[0][0] = "sumitvarshney00@gmail.com";
		credentials[0][1] = "8194047406";
		
		return credentials;
	}
	
	
	@Test(dataProvider="getData")
	public void EdurekaLog1(String username,String mobileno)
	{
		driver.findElement(By.xpath("//*[@id='header-II']/section/nav/div/a[1]")).click();
		driver.findElement(By.xpath("//*[@id='sg_popup_email']")).sendKeys("sumitvarshney00@gmail.com");
		driver.findElement(By.xpath("//*[@id='sg_popup_phone_no']")).sendKeys("8194047406");
		driver.findElement(By.xpath("//*[@id='new_sign_up_mode']/div/div/div[2]/div[1]/form/button")).click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
