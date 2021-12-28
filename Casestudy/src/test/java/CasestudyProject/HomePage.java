package CasestudyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	WebDriver d1;

	public HomePage(WebDriver driver) {
		this.d1 = driver;
	}

	By Login = By.xpath("/html/body/header/div/nav/a[6]");

	public void visitpage(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\HCL\\chromedriver_win32\\chromedriver.exe");
		this.d1 = new ChromeDriver();

		this.d1.get(url);
	}

	public void login() {
		this.d1.findElement(Login).click();
	}

}
