package CasestudyProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePageTest {
	WebDriver d1;
	HomePage home = new HomePage(d1);

	@Test
	public void visitTest() throws IOException, InterruptedException {
		home.visitpage("https://phptravels.com/jobs/");

	}

	@Test(dependsOnMethods = {"visitTest"})
	public void clicklogin() {
		home.login();
	}
}
