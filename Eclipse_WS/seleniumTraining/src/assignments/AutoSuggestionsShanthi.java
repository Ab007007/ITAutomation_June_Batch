package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsShanthi {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://localhost/login.do");
		// Log in with credentials---

		WebElement userNameTextBox = driver.findElement(By.id("username"));
		userNameTextBox.sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		// Prints Actitime home page title---sleep time added
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(driver.getTitle());
		// searching the task list with a key word----
		driver.findElement(By.id("taskSearchControl_field")).sendKeys("de");
		// sleep time added since it did not print the expected number of the list size
		// initially due sync issue---

		try {

			Thread.sleep(2000);

		} catch (InterruptedException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}
		List<WebElement> autosuggestions = driver.findElements(By.xpath("//div[@class='taskList']/div[contains(@class,'row task')]//span[@class='taskName']"));
		System.out.println(autosuggestions.size());
		for (WebElement suggestion : autosuggestions) {
			System.out.println(suggestion.getText());
		}
		driver.findElement(By.id("logoutLink")).click();

		driver.close();

	}
}
