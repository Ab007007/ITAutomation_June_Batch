package com.ita.selenium.actitime.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.ita.selenium.actitime.page.DashBoardPage;
import com.ita.selenium.actitime.page.LoginPage;
import com.ita.selenium.actitime.utils.GenericUtility;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver = null;
	LoginPage lp = null;
	DashBoardPage dp = null;
	ExtentReports report = null;
	ExtentTest test = null;
	
	@BeforeSuite
	public void createReport()
	{
		report  = new ExtentReports("reports\\AutomationReport_" + GenericUtility.getDateAndTime() + ".html");
		
		
	}
	
	@AfterSuite
	public void saveReports()
	{
		report.flush();
		report.close();
	}
	@BeforeClass
	public void setup()
	{
		test = report.startTest("Setup");
		test.log(LogStatus.INFO	, "Creating Driver Object");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		test.log(LogStatus.INFO	, "Creating Page Objects");
		lp = new LoginPage(driver);
		dp = new DashBoardPage(driver);
		report.endTest(test);
	}
	
	
	
	@Test
	public void loginTest()
	{
		test = report.startTest("Login Test");
		
		test.log(LogStatus.INFO, "Launching the applicaiton ");
		driver.get("http://localhost/login.do");
		test.log(LogStatus.PASS, "Application Launched Successfully");
		
		
		test.log(LogStatus.INFO, "Logging in to the application");
		lp.login("admin", "manager");
		dp.verifyTitle("actiTIME - Enter Time-Track");
		test.log(LogStatus.PASS, "Logged in successfully");
		
		test.log(LogStatus.INFO, "Logging out of the application");
		dp.clickonLogout();
		
		report.endTest(test);
		
	}
	
	@Test
	public void verifyTasksPageTest()
	{
		test = report.startTest("Validate Tasks page");
		
		test.log(LogStatus.INFO, "Launching the applicaiton ");
		driver.get("http://localhost/login.do");
		test.log(LogStatus.PASS, "Application Launched Successfully");
		
		
		test.log(LogStatus.INFO, "Logging in to the application");
		lp.login("admin", "manager");
		dp.verifyTitle("actiTIME - Enter Time-Track");
		test.log(LogStatus.PASS, "Logged in successfully");
		
		test.log(LogStatus.INFO, "clicking on tasks page in  application");
		dp.clickOnTasksAndVerifyPage();
		test.log(LogStatus.PASS, "Tasks page is displayed successfully");
		dp.clickonLogout();
		report.endTest(test);
		
	}
	
	@Test
	public void failTest()
	{
		Assert.assertFalse(true);
	}
	
	@AfterClass
	public void cleanUp()
	{
		driver.close();
	}
	
	
	
}
