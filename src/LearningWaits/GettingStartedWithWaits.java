package LearningWaits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class GettingStartedWithWaits {
	public static WebDriver driver;

	@Test
	public static void learnWaits() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");

		driver.manage().window().maximize();

		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Nitisha");

		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Patni");

		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("ernitishaved@gmail.com");

		Actions a = new Actions(driver);
		WebElement gender = driver.findElement(By.id("gender-radio-2"));
		a.click(gender).build().perform();
	}
}
