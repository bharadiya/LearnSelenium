package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public static WebDriver driver;
	@FindBy(how = How.XPATH, using = "//input[@name='email']")
	WebElement username;

	@FindBy(how = How.XPATH, using = "//input[@name='pass']")
	WebElement password;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterUserName(String u) {
		username.sendKeys(u);
	}

	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
}
