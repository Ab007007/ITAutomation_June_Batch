package com.selenium.basics.test;

import org.openqa.selenium.WebDriver;

import com.selenium.basics.utils.ActitimeUtils;
import com.selenium.basics.utils.ReaderUtils;


public class LoginTest {

	
	public static void main(String[] args) {
		ActitimeUtils.getDriver(ReaderUtils.getValue("browser"));
		ActitimeUtils.launchApp(ReaderUtils.getValue("url"));
		ActitimeUtils.login(ReaderUtils.getValue("username"),ReaderUtils.getValue("password"));
	//	ActitimeUtils.addRecentTask("Network Support");
		
		
		ActitimeUtils.logout();
		
	}
}
