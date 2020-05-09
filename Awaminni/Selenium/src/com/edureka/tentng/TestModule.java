package com.edureka.tentng;

import org.testng.Reporter;
import org.testng.annotations.Test;

  public class TestModule extends AnnotationDemo
  {
	@Test
	public void createTask()
	{
		Reporter.log("task created",true);
	}
	@Test
	public void editTask()
	{
		Reporter.log("task edit",true);
	}
	@Test
	public void deleteTask()
	{
		Reporter.log("task deleted",true);
	}
	
}
