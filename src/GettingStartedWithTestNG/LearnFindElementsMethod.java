package GettingStartedWithTestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElementsMethod {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://goibibo.com");
		driver.findElement(By.xpath("//span[@role='presentation']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']/following-sibling::p")).click();
		clickCalendarDate(driver, "10");
	}

	public static void clickCalendarDate(WebDriver driver, String date) {
		// 33
		List<WebElement> calendarValues = driver.findElements(By.xpath("//div[@aria-disabled='false']/child::p"));
		System.out.println(calendarValues);

		for (int i = 0; i < calendarValues.size(); i++) {
			WebElement date1 = calendarValues.get(i);
			String getDate = date1.getText();
			System.out.println(getDate);
			if (getDate.equals("5")) {
				date1.click();
				break;
			}
		}
	}
}
