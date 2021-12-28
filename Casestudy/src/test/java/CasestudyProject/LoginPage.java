package CasestudyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	WebDriver d1;

	public LoginPage(WebDriver driver) {
		this.d1 = driver;
	}

	By email = By.name("username");

	By password = By.name("password");

	public void visitpage(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\HCL\\chromedriver_win32\\chromedriver.exe");
		this.d1 = new ChromeDriver();

		this.d1.get(url);
	}

	public void Email(String d) {
		this.d1.findElement(email).sendKeys(d);
	}

	public void Password(String e) {
		this.d1.findElement(password).sendKeys(e);
	}
}
