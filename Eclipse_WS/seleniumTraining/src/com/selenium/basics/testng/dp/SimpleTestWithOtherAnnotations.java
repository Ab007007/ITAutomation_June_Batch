package com.selenium.basics.testng.dp;

import org.apache.poi.hslf.record.Sound;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.selenium.basics.testng.data.TestData;

public class SimpleTestWithOtherAnnotations {

	@Parameters({"url", "username" , "password"})
	@BeforeMethod
	public void launchAndLogin(String appurl, String appUserName, String appPassword)
	{
		System.out.println(appurl);
		System.out.println(appUserName);
		System.out.println(appPassword);
	}
	
	@Test(dataProvider = "createcustomerdata", dataProviderClass = TestData.class)
	public void createCustomer(String cn, String cd)
	{
		System.out.println(cn + " - " + cd);
	}
	
	@AfterMethod
	public void logout()
	{
		
	}
}
