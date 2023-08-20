package GettingStarted;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ClearTrip {
	@Test
	public static void clickLowestPriceTicket() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\poona\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");

		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));

		WebElement whereFrom = driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
		action.sendKeys(whereFrom, "Bangalore").perform();
		action.sendKeys(Keys.RETURN).perform();

		// Wait for the auto-suggest dropdown to appear (example: using explicit wait)

		WebElement autoSuggestDropdown1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//p[text() = 'Bangalore, IN - Kempegowda International Airport (BLR)']"))); // Replace with

		// Find and click on the desired city from the dropdown options
		WebElement desiredCityOption1 = autoSuggestDropdown1
				.findElement(By.xpath("//p[contains(text(), 'Bangalore')]")); // Replace with the actual locator
		desiredCityOption1.click();

		WebElement whereTo = driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
		action.sendKeys(whereTo, "Pune").perform();
		action.sendKeys(Keys.RETURN).perform();

		WebElement autoSuggestDropdown2 = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text() = 'Pune, IN - Lohegaon (PNQ)']")));

		WebElement desiredCityOption2 = autoSuggestDropdown2.findElement(By.xpath("//p[contains(text(), 'Pune')]")); // Replace
		desiredCityOption2.click();

		WebElement openCalendar = driver
				.findElement(By.xpath("//span[text()='Search flights']/parent::div/preceding-sibling::div//button"));
		openCalendar.click();

		dateClicker(driver, "27");
	}

	public static void dateClicker(WebDriver driver, String date) {
		List<WebElement> getallDates = driver.findElements(By.xpath("//div[@aria-disabled='false']/div/div"));
		for (int i = 0; i < getallDates.size(); i++) {
			if (getallDates.get(i).getText().contains(date)) {
				getallDates.get(i).click();
				break;
			}
		}
	}
}
