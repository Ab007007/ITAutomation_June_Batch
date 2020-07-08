package com.selenium.basics.test;

import org.omg.PortableInterceptor.ACTIVE;

import com.selenium.basics.utils.ActitimeUtils;

public class CreateCustomerTest {

	
	public static void main(String[] args) 
	{
		ActitimeUtils.getDriver();
		ActitimeUtils.launcApp("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
		
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.createCustomer("ITA-NEW-CUST2", "ITA-NEW-CUST2");
		
		ActitimeUtils.logout();
	}
}
