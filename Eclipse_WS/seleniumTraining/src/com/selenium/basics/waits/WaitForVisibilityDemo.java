package com.selenium.basics.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.basics.utils.DriverUtils;

public class WaitForVisibilityDemo {

	public static void main(String[] args) {
		
		WebDriver driver = DriverUtils.getDriver();
		
		driver.get("file:///D:/ITA/ITAutomation_June_Batch/html/tiimeout.html");
		
		driver.findElement(By.tagName("button")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement helloTxt = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		
		String text = helloTxt.getText();
		System.out.println("Text : "  + text);
		
	}
}
