package com.ita.selenium.actitime.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	/*
	 * 1. Variables   => WebElements
	 * 2. Methods 	  => Actions we perform
	 * 3. Constructors=> used to initialize the driver
	 */
	
	@FindBy(id = "username")
	WebElement userNameTxtBox;
	
	@FindBy(name = "pwd")
	WebElement passwordTxtBox;
	
	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	public void enterUserName(String un)
	{
		userNameTxtBox.sendKeys(un);
	}
	
	public void enterPassword(String pass)
	{
		passwordTxtBox.sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	public void login(String un, String pwd)
	{
		enterUserName(un);
		enterPassword(pwd);
		clickOnLoginButton();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
}
