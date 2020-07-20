package com.selenium.basics.testng.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.basics.testng.data.TestData;
import com.selenium.basics.utils.ActitimeUtils;

public class CreateCustomerUsingTestNG {

	
	@BeforeClass
	public void launchAndLogin()
	{
		ActitimeUtils.getDriver();
		ActitimeUtils.launchApp();
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.selectModule("tasks");
	}
	

	@Test(dataProviderClass = TestData.class, dataProvider = "createcustomerdata")
	public void createCustomer(String cn, String cd)
	{
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.createCustomer(cn, cd);
	}
	
	@AfterClass
	public void logoutApp()
	{
		ActitimeUtils.logout();
	}
	
	
}
