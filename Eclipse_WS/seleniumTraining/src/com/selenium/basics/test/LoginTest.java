package com.selenium.basics.test;

import org.openqa.selenium.WebDriver;

import com.selenium.basics.utils.ActitimeUtils;


public class LoginTest {

	
	public static void main(String[] args) {
		ActitimeUtils.getDriver();
		ActitimeUtils.launcApp("http://localhost/login.do");
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.addRecentTask("Network Support");
		
		
		ActitimeUtils.logout();
		
	}
}
