package com.selenium.basics.switchto;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.selenium.basics.utils.ActitimeUtils;

public class MultiBrowserDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launchApp();
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.click("xpath", "//div[@class='popup_menu_label' and contains(text(),'Help')]");
		ActitimeUtils.click("xpath", "//a[text()='User Guide']");
		
		Set<String> windowIDs = driver.getWindowHandles();
		Iterator<String> it = windowIDs.iterator();
		String parent = it.next();
		String child = it.next();
		System.out.println("Parent WID : " + parent);
		System.out.println("Child WID : " + child);
		
		driver.switchTo().window(child);
		
		List<WebElement> childHyperlinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total hyperlinks in child browser "+ childHyperlinks.size());
		printCollection(childHyperlinks);
		driver.close();
		
		
		driver.switchTo().window(parent);
		List<WebElement> parentHyperlinks = driver.findElements(By.xpath("//a"));
		System.out.println("Total hyperlinks in parent browser "+ parentHyperlinks.size());
		printCollection(parentHyperlinks);
		driver.close();
		
		
	}
	
	public static void printCollection(List<WebElement> elements)
	{

		for (WebElement element : elements) {
			System.out.println(element.getText());
		}
		
			
	}
	
	

}
