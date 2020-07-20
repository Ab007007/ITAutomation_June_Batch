package com.selenium.basics.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.selenium.basics.utils.ActitimeUtils;

public class KeyBoardActions {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver =  ActitimeUtils.getDriver();
		ActitimeUtils.launchApp("http://localhost/login.do");
		
		Actions act = new Actions(driver);
		act.sendKeys("admin").perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("manager").perform();
		act.sendKeys(Keys.ENTER).perform();
		
	}
}
