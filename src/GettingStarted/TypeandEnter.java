package GettingStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TypeandEnter {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/auto-complete");
		WebElement multioptiontext = driver
				.findElement(By.xpath("//div[@class='auto-complete__control css-yk16xz-control']"));
		Actions action = new Actions(driver);
		String optionText = "Green";
		action.click(multioptiontext).sendKeys(optionText).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1000);
		action.sendKeys(Keys.ENTER).build().perform();
	}
}
