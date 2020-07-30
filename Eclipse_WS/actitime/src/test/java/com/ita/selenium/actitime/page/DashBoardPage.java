package com.ita.selenium.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashBoardPage {

	WebDriver driver = null;
	
	
	@FindBy(id = "logoutLink")
	WebElement logoutLink;
	
	@FindBy(xpath = "//div[text()='TASKS']/parent::a")
	WebElement tasks;
	
	
	public void clickOnTasksAndVerifyPage()
	{
		tasks.click();
		Assert.assertEquals(driver.getTitle(), "actiTIME - Task List");
	}
	
	
	public void clickonLogout()
	{
		logoutLink.click();
	}
	
	public void verifyTitle(String expected)
	{
		Assert.assertEquals(driver.getTitle(), expected);
	}
	
	public DashBoardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
}
