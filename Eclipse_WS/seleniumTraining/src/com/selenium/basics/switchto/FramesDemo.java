package com.selenium.basics.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.selenium.basics.utils.ActitimeUtils;

public class FramesDemo {

	public static void main(String[] args) {
		
		WebDriver driver =  ActitimeUtils.getDriver();
		ActitimeUtils.launchApp("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(0);
		driver.switchTo().frame(ActitimeUtils.getElement("xpath", "//iframe[@class='demo-frame']"));
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		System.out.println(src.getText());
		System.out.println(dest.getText());
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).perform();
		
		System.out.println(src.getText());
		System.out.println(dest.getText());
		
		driver.switchTo().defaultContent();
		
		ActitimeUtils.click("linktext", "Draggable");
		
		
	}
}
