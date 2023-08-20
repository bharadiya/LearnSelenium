package GettingStarted;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\poona\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		WebElement getEntireTable = driver.findElement(By.xpath("//div[@class='rt-tbody']"));

		List<WebElement> rowGroup = driver.findElements(By.xpath("//div[@role='rowgroup']"));
		for (int i = 0; i < rowGroup.size(); i++) {
			List<WebElement> subrowGroup = rowGroup.get(i).findElements(By.xpath("//div[@role='rowgroup']/div/div"));
			System.out.println(subrowGroup.size());
		}

	}
}
