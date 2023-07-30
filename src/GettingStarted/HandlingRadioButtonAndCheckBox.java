package GettingStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtonAndCheckBox {
	public static void main(String[] args) throws InterruptedException {

		WebDriver d = new ChromeDriver();
		d.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(10000);

		WebElement flexibleWithDate = d.findElement(By.xpath("//label[text()='Flexible With Date']/preceding-sibling::input"));
		flexibleWithDate.click();
//		boolean isSelected = flexibleWithDate.isSelected();
//		System.out.println(isSelected);
	}
}
