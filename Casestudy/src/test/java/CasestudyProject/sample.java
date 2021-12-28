package CasestudyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class sample {

	@Test
	public void register() {
	System.setProperty("webdriver.chrome.driver", "D:\\HCL\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://phptravels.org/register.php");

	driver.findElement(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[1]/div[2]/div/div[4]/div/div/div/div/div[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"containerNewUserSignup\"]/div[1]/div[2]/div/div[4]/div/div/div/ul/li[102]/span[1]")).click();
	}
}
