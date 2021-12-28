package CasestudyProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	WebDriver d1;

	public Register(WebDriver driver) {
		this.d1 = driver;
	}

	By Register = By.linkText("Register");
	By Firstname = By.name("firstname");
	By Lastname = By.name("lastname");
	By Email = By.id("inputEmail");
	By Choosecountry = By.xpath("//*[@id=\"containerNewUserSignup\"]/div[1]/div[2]/div/div[4]/div/div/div/div/div[2]");
	By Choosecountrycode = By.xpath("//*[@id=\"containerNewUserSignup\"]/div[1]/div[2]/div/div[4]/div/div/div/ul/li[102]/span[1]");
	By Phonenumber = By.name("phonenumber");
	By Companyname = By.name("companyname");
	By Address1 = By.name("address1");
	By Address2 = By.name("address2");
	By City = By.name("city");
	By State = By.name("state");
	By Postcode = By.name("postcode");
	By Country = By.name("country");
	By Customfield = By.name("customfield[2]");
	By Password = By.name("password");
	By Confirmpassword = By.name("password2");

	public void visitpage(String url) {
		System.setProperty("webdriver.chrome.driver", "D:\\HCL\\chromedriver_win32\\chromedriver.exe");
		this.d1 = new ChromeDriver();

		this.d1.get(url);
	}

	public void clickRegister() {
		d1.findElement(Register).click();
	}

	public void Fname(String a) {
		this.d1.findElement(Firstname).sendKeys(a);
	}

	public void Lname(String b) {
		this.d1.findElement(Lastname).sendKeys(b);
	}

	public void Mail(String c) {
		this.d1.findElement(Email).sendKeys(c);
	}

	public void choosecountry() {
		this.d1.findElement(Choosecountry).click();
	}

	public void choosecountrycode() {
		this.d1.findElement(Choosecountrycode).click();
	}

	public void phonenumber(String f) {
		this.d1.findElement(Phonenumber).sendKeys(f);
	}

	public void companyname(String g) {
		this.d1.findElement(Companyname).sendKeys(g);
	}

	public void address1(String h) {
		this.d1.findElement(Address1).sendKeys(h);
	}

	public void address2(String i) {
		this.d1.findElement(Address2).sendKeys(i);
	}

	public void city(String j) {
		this.d1.findElement(City).sendKeys(j);
	}

	public void state(String k) {
		this.d1.findElement(State).sendKeys(k);
	}

	public void postcode(String l) {
		this.d1.findElement(Postcode).sendKeys(l);
	}

	public void country(String m) {
		this.d1.findElement(Country).sendKeys(m);
	}

	public void customfeild(String n) {
		this.d1.findElement(Customfield).sendKeys(n);
	}

	public void password1(String o) {
		this.d1.findElement(Password).sendKeys(o);
	}

	public void password2(String p) {
		this.d1.findElement(Confirmpassword).sendKeys(p);
	}

}
