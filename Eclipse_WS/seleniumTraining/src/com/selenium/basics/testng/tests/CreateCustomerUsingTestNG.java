package com.selenium.basics.testng.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.selenium.basics.testng.data.TestData;
import com.selenium.basics.utils.ActitimeUtils;

public class CreateCustomerUsingTestNG {

	@BeforeClass
	public void launchAndLogin() {
		ActitimeUtils.getDriver();
		ActitimeUtils.launchApp();
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.selectModule("tasks");
	}

	@Test(priority = 1, dataProviderClass = TestData.class, dataProvider = "createcustomerdata")
	public void createCustomer(String cn, String cd) {
		ActitimeUtils.clickOnNewCustomerButton();
		ActitimeUtils.createCustomer(cn, cd);
	}

	@Test(priority = 2,dataProviderClass = TestData.class, dataProvider = "createcustomerdata")
	public void DeleteCustomer(String cn, String cd) {

		ActitimeUtils.searchCustomerToDelete(cn);
		ActitimeUtils.deleteCustomer();
		ActitimeUtils.getElement("xpath", "//div[@class='customersProjectsPanel']//input").clear();

	}

	@AfterClass
	public void logoutApp() {
		ActitimeUtils.logout();
	}

}
