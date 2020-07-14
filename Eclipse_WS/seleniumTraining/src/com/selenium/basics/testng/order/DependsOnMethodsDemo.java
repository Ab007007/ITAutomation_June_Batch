package com.selenium.basics.testng.order;

import org.testng.annotations.Test;

public class DependsOnMethodsDemo {

	
	@Test
	public void Test4()
	{
		System.out.println("Test4");
	}
	
	@Test(dependsOnMethods = "Test4")
	public void Test3()
	{
		System.out.println("Test3");
	}
	
	@Test(dependsOnMethods = "Test3")
	public void Test2()
	{
		System.out.println("Test2");
	}

	
	@Test(dependsOnMethods = { "Test3", "Test2" })
	public void Test1()
	{
		System.out.println("Test1");
	}
	
	

}
