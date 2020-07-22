package com.selenium.basics.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.Assert;

public class DriverUtils {

	public static WebDriver driver = null;

	/**
	 * @author Aravind
	 * @return - webdriver by default chrome browser
	 */
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Integer.valueOf(ReaderUtils.getValue("timeout")), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}

	
	public static WebDriver getDriver(String type)
	{
		switch (type.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "ff":
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		case "edge":
			System.setProperty("webdriver.edge.driver", "drivers\\");
			driver = new EdgeDriver();
			break;

		case "opera":
			System.setProperty("webdriver.opera.driver", "drivers\\geckodriver.exe");
			driver = new OperaDriver();
			break;

		}
		driver.manage().timeouts().implicitlyWait(Integer.valueOf(ReaderUtils.getValue("timeout")), TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	/**
	 * @author Aravind
	 * @param type - any one out of 8 identifer=>id,name,classname,tagname,linktext
	 * partiallinktext,css,xpath
	 * @param typeValue => value corresponding to type
	 * @return =>returns webelement
	 */
	public static WebElement getElement(String type, String typeValue) {
		System.out.println("Finding the element using " + type + " and " + typeValue);
		WebElement ele = null;
		switch (type) {
		case "id":
				ele = driver.findElement(By.id(typeValue));
			break;
		case "name":
			ele = driver.findElement(By.name(typeValue));
			break;
		case "classname":
			ele = driver.findElement(By.className(typeValue));
			break;
		case "tagname":
			ele = driver.findElement(By.tagName(typeValue));
			break;
		case "linktext":
			ele = driver.findElement(By.linkText(typeValue));
			break;
		case "particallinktext":
			ele = driver.findElement(By.partialLinkText(typeValue));
			break;
		case "css":
			ele = driver.findElement(By.cssSelector(typeValue));
			break;
		case "xpath":
			ele = driver.findElement(By.xpath(typeValue));
			break;

		default:
			System.out.println("Please check your type!!! Cannot find the element");
			break;
		}

		return ele;
	}
		
	public static void click(String type, String typeValue)
	{
		System.out.println("Performing click operation on an element");
		getElement(type, typeValue).click();
	}

	public static void type(String type, String typeValue,String value)
	{
		System.out.println("Performing type on element " + value);
		getElement(type, typeValue).sendKeys(value);
	}
	
	public static String getText(String type, String typeValue)
	{
		String text  = getElement(type, typeValue).getText();
		System.out.println("Got text from the element " + text);
		return text;
	}

	public static void validateTitle(String expectedTitle)
	{
		String actualTitle = driver.getTitle();
	
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	
	public static void sleep(long ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void moveMouse(String type, String typeValue)
	{
		Actions act = new Actions(driver);
		act.moveToElement(getElement(type, typeValue)).perform();
				
	}
	
	public static void actionClick(String type, String typeValue)
	{
		Actions act = new Actions(driver);
		act.click(getElement(type, typeValue)).perform();
		sleep(2000);
		
	}
}
