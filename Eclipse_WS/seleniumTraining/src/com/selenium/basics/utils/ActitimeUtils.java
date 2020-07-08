package com.selenium.basics.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeUtils extends DriverUtils {

	public static void launcApp(String url) {
		driver.get(url);
		validateTitle("actiTIME - Login");
	}

	public static void login(String un, String pwd) {
		System.out.println("---Login to applicaiton using " + un + " and " + pwd);
		type("id", "username", un);
		type("name", "pwd", pwd);
		click("id", "loginButton");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		validateTitle("actiTIME - Enter Time-Track");
	}

	public static void logout() {
		System.out.println("Logging out of application");
		click("id", "logoutLink");
		driver.close();

	}

	public static void addRecentTask(String taskName) {
		ActitimeUtils.click("xpath", "//span[text()='Add Recent Task']/parent::div");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(
				getElement("xpath", "//span[text()='" + taskName + "']/ancestor::div[@class='row task']")));

		ActitimeUtils.click("xpath", "//span[text()='" + taskName + "']/ancestor::div[@class='row task']");

		// span[text()='Network Support']/ancestor::div[@class='row task']
	}

	public static void selectModule(String name) {
		System.out.println("Entering to " + name + " module");

		switch (name.toLowerCase()) {
		case "time-track":
				
			break;
		case "tasks":
			click("xpath", "//div[text()='TASKS']/parent::a");
			validateTitle("actiTIME - Task List");
			break;
		case "reports":
			click("xpath", "//div[text()='REPORTS']/parent::a");
			validateTitle("actiTIME - Reports Dashboard");
			break;
		case "users":
			click("xpath", "//div[text()='USERS']/parent::a");
			validateTitle("actiTIME - User List ");
			break;

		default:
			break;
		}
	}

	public static void clickOnNewCustomerButton()
	{
		System.out.println("---Clicking on new Customer Button");
		click("xpath", "//div[@class='addNewContainer']");
		click("xpath","//div[@class='item createNewCustomer ellipsis']");
	}

	public static void createCustomer(String cn, String cd)
	{
		type("id", "customerLightBox_nameField", cn);
		type("id", "customerLightBox_descriptionField", cd);
		click("id", "customerLightBox_commitBtn");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement successMsg = wait.until(ExpectedConditions.visibilityOf(getElement("xpath", "//div[@class='toast']")));
		System.out.println("Success message is appeared "  + successMsg.getText());
		WebDriverWait waitDisappear = new WebDriverWait(driver, 10);
		waitDisappear.until(ExpectedConditions.invisibilityOf(getElement("xpath", "//div[@class='toast']")));
		System.out.println("Toast message disappeared!!!");
		
		
	}
	
}
