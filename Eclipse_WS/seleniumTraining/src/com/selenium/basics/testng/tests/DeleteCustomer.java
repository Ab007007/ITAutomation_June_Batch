package com.selenium.basics.testng.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.basics.utils.ActitimeUtils;

public class DeleteCustomer 
{
	
	@BeforeClass
	public void launchAndLogin()
	{
		ActitimeUtils.getDriver();
		ActitimeUtils.launchApp();
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.selectModule("tasks");
	}
	
	@Test
	public void deleteCustomer()
	{
		ActitimeUtils.searchCustomerToDelete("Int-May-DD-Cust10");
		ActitimeUtils.deleteCustomer();
		ActitimeUtils.getElement("xpath", "//div[@class='customersProjectsPanel']//input").clear();
	}
	
	//@AfterClass
	public void logoutApp()
	{
		ActitimeUtils.logout();
	}


}
