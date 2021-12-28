package CasestudyProject;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class RegisterTest {
	
	WebDriver d1;
	Register reg = new Register(d1);
	
	@Test
	public void visitTest() throws IOException, InterruptedException {

		reg.visitpage("https://phptravels.org/login");

		 /*Set<String> window_value = d1.getWindowHandles(); 
		 Iterator<String> iter = window_value.iterator(); 
		 String w1 = iter.next(); 
		 String w2 = iter.next();
		 d1.switchTo().window(w2);*/
		
		 //Thread.sleep(6000);
		 
		reg.clickRegister();
		reg.Fname("Aditya");
		reg.Lname("Kuna");
		reg.Mail("kunaaditya17@gmail.com");
		
		Thread.sleep(4000);
		
		reg.choosecountry();
		reg.choosecountrycode();
		reg.phonenumber("9392903391");
		reg.companyname("HCL");
		reg.address1("256,Gujaratipeta");
		reg.address2("P.N.Colony 10th line");
		reg.city("Srikakulam");
		reg.state("Andhra Pradesh");
		reg.postcode("532001");
		reg.country("India");
		reg.customfeild("9392903391");
		reg.password1("KUNA@aditya123");
		reg.password2("KUNA@aditya123");

	}
}