package GettingStartedWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LearnFileUpload {
	@Test
	public static void handleAlert() throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/alerts");

		Thread.sleep(6000);
		//WebElement promptButton = d.findElement(By.id("promtButton"));

		JavascriptExecutor js =  (JavascriptExecutor) d;
		js.executeScript("$(\"#promtButton\").click();");

		Thread.sleep(3000);
		d.switchTo().alert().sendKeys("Kajal");
		Thread.sleep(3000);
		String getTextONAlert = d.switchTo().alert().getText();
		System.out.println(getTextONAlert);

		d.switchTo().alert().accept();
	}
}
