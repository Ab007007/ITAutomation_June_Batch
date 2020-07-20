package com.selenium.basics.browseroperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.selenium.basics.utils.ActitimeUtils;

public class BrowserOperationsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		driver.manage().window().maximize();
		
		ActitimeUtils.launchApp("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[@aria-label='Televisions']")).click();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.navigate().to("http://www.google.com");
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[@aria-label='Televisions']")).click();
		
		driver.close();
//		driver.quit();
	}
}
