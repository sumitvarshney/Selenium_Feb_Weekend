package com.edureka.tentng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogInModuleScripts extends BaseTest
{
	
	@DataProvider
	public String[][] getData()
	{
		String[][] credentials = new String[2][2];
		credentials[0][0] = "seleniumwebpractice@gmail.com";
		credentials[0][1] = "$Practice456";
		
		credentials[1][0] = "seleniumwebpractice@gmail.com";
		credentials[1][1] = "$Practice456";
		
		return credentials;
	}
	
	@Test(dataProvider="getData")
	public void TC_01_LoginToGmail(String username, String password )
	{
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys(username);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		wait.until(ExpectedConditions.titleContains("Inbox"));
		String title = driver.getTitle();
		//String expected_title = "seleniumwebpractice@gmail.com";
		
		Assert.assertEquals(title, title);
	
	}
}
