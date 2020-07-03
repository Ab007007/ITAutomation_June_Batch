package com.selenium.basics.autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestioinsDemo {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			driver.findElement(By.name("q")).sendKeys("ITA");
			Thread.sleep(2000);
			List<WebElement> autoSuggestions = driver.findElements(By.xpath("//li//span"));
			
			System.out.println(autoSuggestions.size());
			
			for (WebElement suggestion : autoSuggestions) 
			{
				System.out.println(suggestion.getText());
			}
			
			
	}
}
