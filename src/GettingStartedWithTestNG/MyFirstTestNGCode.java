package GettingStartedWithTestNG;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class MyFirstTestNGCode {

	public static WebDriver d;

	@Test(priority = 1)
	public static void verifyBrowserTitle() throws InterruptedException {
		d = new ChromeDriver();
		// Thread is class from java which is a way for handling hardcoded wait
//		Thread.sleep(10000);
//
//		d.manage().window().maximize();
//		Thread.sleep(5000);
//		d.manage().window().minimize();
//		Thread.sleep(5000);
//		d.manage().window().maximize();
		d.get("https://fb.com");

		String getBrowserTitle = d.getTitle();
		System.out.println(getBrowserTitle);

		assertTrue(getBrowserTitle.equals("Facebook log in or sign up"));

		// used locator - id
//		WebElement userEmail = d.findElement(By.id("emai"));
//		userEmail.sendKeys("shashank.bharadiya@gmail.com");
//
//		// used locator - xpath
//		WebElement userPassword = d.findElement(By.xpath("//input[@aria-label='Password']"));
//		userPassword.sendKeys("abcabcabc");
//
//		// used locator - partial link text , link text
//		WebElement linkForgotPassword = d.findElement(By.partialLinkText("Forgot"));
//		linkForgotPassword.click();
//
//		Thread.sleep(5000);
//
//		String getNavigateURL = d.getCurrentUrl();
//		System.out.println(getNavigateURL);
//
//		d.navigate().back();
//
//		d.close();
	}

	@Test(priority = 2)
	public static void verifyEmailIDTextBoxIsPresent() throws InterruptedException {

		// used locator - id
		WebElement userEmail = d.findElement(By.id("emai"));
		assertTrue(userEmail.isDisplayed());
		userEmail.sendKeys("shashank.bharadiya@gmail.com");
//
//		// used locator - xpath
//		WebElement userPassword = d.findElement(By.xpath("//input[@aria-label='Password']"));
//		userPassword.sendKeys("abcabcabc");
//
//		// used locator - partial link text , link text
//		WebElement linkForgotPassword = d.findElement(By.partialLinkText("Forgot"));
//		linkForgotPassword.click();
//
//		Thread.sleep(5000);
//
//		String getNavigateURL = d.getCurrentUrl();
//		System.out.println(getNavigateURL);
//
//		d.navigate().back();
//
//		d.close();
	}
}
