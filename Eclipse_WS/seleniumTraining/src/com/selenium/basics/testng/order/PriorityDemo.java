package com.selenium.basics.testng.order;

import org.testng.annotations.Test;

public class PriorityDemo {

	
	@Test(priority = 1)
	public void Test4()
	{
		System.out.println("Test4");
	}
	
	@Test(priority = 2)
	public void Test3()
	{
		System.out.println("Test3");
	}
	
	@Test(priority = 3)
	public void Test2()
	{
		System.out.println("Test2");
	}

	
	@Test(priority = 4)
	public void Test1()
	{
		System.out.println("Test1");
	}
	
	

}
