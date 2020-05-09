package com.edureka.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class FormSel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sumit\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("sumit");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("varshney");
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("sumitvarshney878@gmail.com");
		WebElement bttn =driver.findElement(By.xpath("//input[@type='radio']"));
		bttn.click();
		WebElement chkbox=driver.findElement(By.xpath("//input[@id='checkbox1']"));
		chkbox.click();
		WebElement chkbox1=driver.findElement(By.id("checkbox2"));
		chkbox1.click();
		
		WebElement countryDropdown=driver.findElement(By.id("countries"));
		Select oCountries=new Select(countryDropdown);
		//oCountries.selectByIndex(9);
		//oCountries.selectByValue("United States Minor Outlying Islands");
		oCountries.selectByVisibleText("Australia");
		
		
		
		
		
		
	}

}
