package GettingStarted;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClearTripFromNitisha {
	public static void scrollToElement(WebDriver driver, WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\poona\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		WebElement whereFrom = driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
		action.sendKeys(whereFrom, "Bangalore").perform();
		action.sendKeys(Keys.RETURN).perform();
		WebElement autoSuggestDropdown1 = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//p[text() = 'Bangalore, IN - Kempegowda International Airport (BLR)']"))); // Replace with
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
		Thread.sleep(1000);
		WebElement searchFlights = driver.findElement(By.xpath("//span[text()='Search flights']"));
		searchFlights.click();
		Thread.sleep(2000);
		driver.findElement(By.className("switch")).click();
		Thread.sleep(10000);
		List<WebElement> price = driver.findElements(By.xpath("//div[@data-ct-handle='solutionPrice']//p[2]"));
		ArrayList<Integer> pricearray = new ArrayList<Integer>();
		List<WebElement> bookNowButtons = driver.findElements(By.xpath("//button[text()='Book']"));
		for (WebElement priceElement : price) {
			System.out.println(priceElement.getText());
			String priceText = priceElement.getText().replaceAll("[^0-9]", ""); // Remove non-numeric characters
			int priceInt = Integer.parseInt(priceText);
			pricearray.add(priceInt);
		}
		int minPrice = Collections.min(pricearray);
		for (int i = 0; i < pricearray.size(); i++) {
			if (minPrice == pricearray.get(i)) {
				bookNowButtons.get(i).click();
				break;
			}
		}
	}
}
