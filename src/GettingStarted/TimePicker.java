package GettingStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TimePicker {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/date-picker");
		driver.manage().window().maximize();
		WebElement dateandtime = driver.findElement(By.id("dateAndTimePickerInput"));
		dateandtime.click();
		// Here you can change the time according to your need
		WebElement timepicker = driver.findElement(By.xpath("//li[@class='react-datepicker__time-list-item ' and contains(text(),'00:30')]"));

		Thread.sleep(1000);

		Actions action = new Actions(driver);
		action.scrollToElement(timepicker).build().perform();

		Thread.sleep(1000);
		action.click(timepicker).build().perform();
	}
}
