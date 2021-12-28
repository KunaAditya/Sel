package CasestudyProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPageTest {

	WebDriver d1;
	LoginPage login = new LoginPage(d1);

	@Test
	public void visitTest() throws IOException, InterruptedException {
		
		login.visitpage("https://phptravels.org/login");
		login.Email("kunaaditya17@gmail.com");
		login.Password("KUNA@aditya123");

}
}
