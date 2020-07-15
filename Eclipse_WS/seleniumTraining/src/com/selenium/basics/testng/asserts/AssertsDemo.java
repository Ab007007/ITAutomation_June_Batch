package com.selenium.basics.testng.asserts;

import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertsDemo {

	
	int a=10, b=20, c;
	
	@Test
	public void sum()
	{
		c = a+b;
		Assert.assertEquals(20, c);
		System.out.println("new values to a and b");
		a = 20 ; b = 30;
		c = a+b;
		Assert.assertEquals(c,50);
		System.out.println("new values to a and b");
		System.out.println("End of program");
				
	}
}
