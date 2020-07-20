package com.selenium.basics.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.selenium.basics.utils.ActitimeUtils;
import com.selenium.basics.utils.DriverUtils;

public class DropDownDemo {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launchApp("http://formy-project.herokuapp.com/form");
		
		Select sel = new Select(driver.findElement(By.id("select-menu")));
		
		sel.selectByIndex(1);
		Thread.sleep(2000);

		sel.selectByValue("2");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("5-9");
		Thread.sleep(2000);
		
		
	}
}
