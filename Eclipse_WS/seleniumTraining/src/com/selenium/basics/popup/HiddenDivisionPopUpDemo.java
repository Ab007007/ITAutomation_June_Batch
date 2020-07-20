package com.selenium.basics.popup;

import com.selenium.basics.utils.ActitimeUtils;

public class HiddenDivisionPopUpDemo {

	public static void main(String[] args) {
		ActitimeUtils.getDriver();
		ActitimeUtils.launchApp();
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.type("xpath", "//span[text()='Status meetings']/ancestor::tr[contains(@id,'taskRow')]//td[@class='calendarWorkingDayNormal  ']//input[contains(@name,'spentStr[0]')]", "1");
		ActitimeUtils.sleep(2000);
		ActitimeUtils.selectModule("tasks");
		ActitimeUtils.sleep(2000);
		ActitimeUtils.click("id", "SaveChangesButton");
		
	}
}
