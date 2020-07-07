package com.selenium.basics.waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.selenium.basics.utils.DriverUtils;

public class FluentWaitDemo {

	public static void main(String[] args) {
		WebDriver driver = DriverUtils.getDriver();

		driver.get("file:///D:/ITA/ITAutomation_June_Batch/html/tiimeout.html");

		driver.findElement(By.tagName("button")).click();
		
		FluentWait<WebElement> wait = new FluentWait<WebElement>(driver.findElement(By.id("demo")))
				.withTimeout(Duration.ofSeconds(20))
				.pollingEvery(Duration.ofMillis(100))
				.ignoring(NoSuchElementException.class)
				.ignoring(Exception.class);
		
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>() {
			
			@Override
			public Boolean apply(WebElement ele) {
				
				if(ele.getText().equals("Hello")) {
					System.out.println("Element found");
					return true;
				}
				else
				{
					System.out.println("Waiting!!!!!!");
					return false;
				}
			}
		};
		
		wait.until(fun);
		
		
		
	}
}
