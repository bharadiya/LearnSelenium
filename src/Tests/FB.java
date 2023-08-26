package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM.HomePage;
import Utilities.ReadConfig;

public class FB {
	@Test
	public static void enterUserNameAndPassword() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\poona\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		ReadConfig rc = new ReadConfig();
		driver.get(rc.getApplicationURL());
		HomePage h = new HomePage(driver);
		h.enterUserName(rc.getUserName());
		h.enterPassword(rc.getPassword());
	}

	@Test
	public static void fetchTitle() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\poona\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fb.com");
		Assert.assertTrue(driver.getTitle().equals("Facebook – log in or sign up"));
	}
}
