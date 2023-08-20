package GettingStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\poona\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame("frame1");
		WebElement samplePageOnIFrame = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(samplePageOnIFrame.isDisplayed());
		driver.switchTo().defaultContent();
	}
}
