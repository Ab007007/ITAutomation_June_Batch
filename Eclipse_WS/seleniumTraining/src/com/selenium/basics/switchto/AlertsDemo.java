package com.selenium.basics.switchto;

import com.selenium.basics.utils.ActitimeUtils;

public class AlertsDemo extends ActitimeUtils
{
	
	
	public static void main(String[] args) 
	{
		getDriver();
		launchApp();
		login("admin", "manager");
		selectModule("tasks");
		clickOnNewCustomerButton();
		enterCustomerDetailsAndCancel("XXXXX");
		logout();
		
	}

}
