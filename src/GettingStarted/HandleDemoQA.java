package GettingStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDemoQA {
	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.get("https://demoqa.com/select-menu");

		WebElement oldStyleSelectMenu = d.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select s = new Select(oldStyleSelectMenu);
		//s.selectByValue("4");
		
		s.selectByVisibleText("Voilet");
		
		s.selectByIndex(0);
	}
}
