package com.selenium.basics.testng.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.basics.testng.data.TestData;
import com.selenium.basics.utils.ActitimeUtils;

public class LoginUsingTest {

	WebDriver driver = null;
	@BeforeTest
	public void createDriver()
	{
		driver = ActitimeUtils.getDriver();
	}
	
	@AfterTest
	public void closeDriver()
	{
		driver.close();
	}
	
	@BeforeMethod
	public void launch()
	{
		ActitimeUtils.launchApp();
	}
	
	@AfterMethod
	public void logout(ITestResult result) throws IOException
	{
		if(result.getStatus() == ITestResult.SUCCESS) {
			ActitimeUtils.logout();
		}
		else if (result.getStatus() == ITestResult.FAILURE)
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File srcFile = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("screenshots\\ss.png"));
		}
		System.out.println("Test has failures..");
			
	}

	@Test(priority = 1)
	public void validLoginTest()
	{
		ActitimeUtils.login("admin", "manager");
		ActitimeUtils.selectModule("tasks");
		
	}
	
	@Test(priority = 2)
	public void inValidLoginTest()
	{
		ActitimeUtils.login("admin1", "manager1");
		
	}

	
}
