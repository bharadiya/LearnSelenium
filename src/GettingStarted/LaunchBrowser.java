package GettingStarted;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d = new ChromeDriver();
		d.get("https://redbus.in");
		d.findElement(By.id("singapore_site_footer")).click();

		Set<String> openTabs = d.getWindowHandles();
		System.out.println(openTabs.size());

		List<String> getOpenTabs = new ArrayList<String>(openTabs);
		for (int i = 0; i < getOpenTabs.size(); i++) {
			d.switchTo().window(getOpenTabs.get(i));
			Thread.sleep(3000);
		}
	}
}
