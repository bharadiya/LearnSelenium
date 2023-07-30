package LearningWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GettingStartedWithWaits {
	public static WebDriver d;

	@Test
	public static void learnWaits() {
		d = new ChromeDriver();
		d.get("https://www.goibibo.com");

		// used locator - id
		// handle keyboard
		WebElement phoneNumber = d.findElement(By.xpath("//input[@name='phon']"));
//		WebElement destination = d.findElement(By.xpath("//a[text()='Container Restricted']"));
	
		Actions a = new Actions(d);
		WebDriverWait w= new WebDriverWait(d, Duration.ofSeconds(25));
		w.until(ExpectedConditions.elementToBeClickable(phoneNumber));
		
		phoneNumber.sendKeys("9066658956");//input[@name="phone"]
		//a.dragAndDrop(src, destination).build().perform();
		
		a.keyDown(Keys.DOWN).build().perform();
		
		
		a.keyDown(Keys.UP).build().perform();
	}
}
