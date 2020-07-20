package com.selenium.basics.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.basics.utils.ActitimeUtils;

public class MouseMomentOperation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = ActitimeUtils.getDriver();
		ActitimeUtils.launchApp("http://flipkart.com/");
		
		WebDriverWait wait =  new WebDriverWait(driver, 20);
		WebElement loginPrompt = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']"))));
		loginPrompt.click();
		
		WebElement electronicsTab = driver.findElement(By.xpath("//span[text()='Electronics']/parent::li"));
		WebElement menTab = driver.findElement(By.xpath("//span[text()='Men']/parent::li"));
		WebElement womenTab = driver.findElement(By.xpath("//span[text()='Women']/parent::li"));
		WebElement sportsTab = driver.findElement(By.xpath("//span[text()='Sports, Books & More']/parent::li"));
		WebElement hnfTab = driver.findElement(By.xpath("//span[text()='Home & Furniture']/parent::li"));
		WebElement babyTab = driver.findElement(By.xpath("//span[text()='Baby & Kids']/parent::li"));
		 
	
		Actions act = new Actions(driver);
		
		act.moveToElement(womenTab).perform();
		Thread.sleep(2000);
		act.moveToElement(babyTab).perform();
		Thread.sleep(2000);
		act.moveToElement(electronicsTab).perform();
		Thread.sleep(2000);
		act.moveToElement(hnfTab).perform();
		Thread.sleep(2000);
		act.moveToElement(sportsTab).perform();
		Thread.sleep(2000);
		act.moveToElement(menTab).perform();
		Thread.sleep(2000);
		
		driver.close();
	
	
	}
}
