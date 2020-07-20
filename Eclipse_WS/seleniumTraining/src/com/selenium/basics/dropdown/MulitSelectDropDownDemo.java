package com.selenium.basics.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.basics.utils.ActitimeUtils;

public class MulitSelectDropDownDemo {

	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launchApp("file:///D:/ITA/ITAutomation_June_Batch/html/multiSelect.html");
		
		WebElement multiSelectDropDown = driver.findElement(By.tagName("select"));
		
		Select sel = new Select(multiSelectDropDown);
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
		sel.selectByValue("volvo");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
		
		sel.deselectByIndex(2);
		Thread.sleep(2000);
		
		sel.deselectByValue("volvo");
		Thread.sleep(2000);
		
		sel.deselectByVisibleText("Audi");
		Thread.sleep(2000);
		
		sel.selectByIndex(2);
		Thread.sleep(2000);
		
		sel.selectByValue("volvo");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
		sel.deselectAll();
		

	}
}
