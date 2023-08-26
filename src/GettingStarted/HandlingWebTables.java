package GettingStarted;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class HandlingWebTables {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\poona\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
//
//		List<WebElement> rowData = driver.findElements(By.xpath("(//table[@id='customers']//tr)[4]/td"));
//		for (int i = 0; i < rowData.size(); i++) {
//			WebElement rowDataTDs = rowData.get(i);
//			System.out.println(rowDataTDs.getText());
//		}

		List<WebElement> columnData = driver.findElements(By.xpath("(//table[@id='customers']//tr)/td[2]"));
		List<WebElement> checkBoxData = driver.findElements(By.xpath("(//table[@id='customers']//tr)/td[1]/input"));
		for (int i = 0; i < columnData.size(); i++) {
			String rowDataTDs = columnData.get(i).getText();
			if (rowDataTDs.equals("Ola")) {
				checkBoxData.get(i).click();
				break;
			}
		}

		AShot a = new AShot();
		Screenshot sc;
		Date d = new Date();
		sc = a.shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver);

		try {
			ImageIO.write(sc.getImage(), "JPG", new File(
					"C:\\Users\\poona\\eclipse-workspace\\LearnSelenium\\Screenshots\\" + "checkboxData" + ".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
