package com.selenium.basics.test;

import org.omg.PortableInterceptor.ACTIVE;

import com.selenium.basics.utils.ActitimeUtils;
import com.selenium.basics.utils.ReaderUtils;

public class CreateCustomerTest {

	public static String sheetName = "createCustomer";
	public static void main(String[] args) 
	{
		
		ActitimeUtils.getDriver(ReaderUtils.getValue("browser"));
		ActitimeUtils.launcApp(ReaderUtils.getValue("url"));
		ActitimeUtils.login(ReaderUtils.getValue("username"),ReaderUtils.getValue("password"));
		ActitimeUtils.selectModule("tasks");
	
		int rowCount = ReaderUtils.getRowCount(sheetName);
		String cn,cd;
		for (int i = 1; i < rowCount; i++) 
		{
			cn = null;
			cd = null;
			cn = ReaderUtils.getCellData(sheetName, i, 0);
			cd = ReaderUtils.getCellData(sheetName, i, 1);
			ActitimeUtils.clickOnNewCustomerButton();
			ActitimeUtils.createCustomer(cn , cd);
			
		}
		ActitimeUtils.logout();
	}
}
