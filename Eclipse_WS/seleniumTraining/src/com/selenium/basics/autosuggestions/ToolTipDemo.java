package com.selenium.basics.autosuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo 
{
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.redbus.in/");

		String toolTip4 = driver.findElement(By.id("redBus")).getAttribute("title");
		String toolTip1 = driver.findElement(By.id("cars")).getAttribute("title");
		String toolTip2 = driver.findElement(By.id("redBus Bus Hire")).getAttribute("title");
		String toolTip3 = driver.findElement(By.id("pilgrimages")).getAttribute("title");
		
		System.out.println(toolTip4);
		System.out.println(toolTip1);
		System.out.println(toolTip2);
		System.out.println(toolTip3);
	
	
	}

}
