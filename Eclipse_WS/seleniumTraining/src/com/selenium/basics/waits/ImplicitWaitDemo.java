package com.selenium.basics.waits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			driver.get("https://www.google.com/");
			
			driver.findElement(By.name("q")).sendKeys("ITA");
			List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ul/li//span"));
			
			System.out.println(autoSuggestions.size());
			
			for (WebElement suggestion : autoSuggestions) 
			{
				System.out.println(suggestion.getText());
			}
			
			
	}
}
