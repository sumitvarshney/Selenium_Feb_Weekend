package com.edureka.tentng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AnnotationDemo
{
	
	@BeforeSuite
	public void beforeSuiteMethods()
	{
		Reporter.log("BeforeSuit",true);
		
	}
	
	@BeforeTest
	public void beforeTestMethods()
	{
		Reporter.log("BeforeTest",true);
	}

	@BeforeClass
	public void beforeClassMethods()
	{
		Reporter.log("Before Class",true);
	}
	@BeforeMethod
	public void beforeMethods()
	{
		Reporter.log("BeforeMethod",true);
	}

	@AfterMethod
	public void afterMethods()
	{
		Reporter.log("AfterMethod",true);
	}
	
	@AfterClass
	public void afterClassMethods()
	{
		Reporter.log("After Class",true);
	}
	

	@AfterTest
	public void afterTestMethods()
	{
		Reporter.log("AfterTest",true);
	}
	
	
	
	@AfterSuite
	public void afterSuiteMethods()
	{
		Reporter.log("AfterSuit",true);
	}
	
	
}
