package PageClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage extends GenericPage
{

	@FindBy(xpath = "//a[contains(text(),'Register')]")
	WebElement linkToRegister;

	@FindBy(name = "username")
	WebElement userName;

	@FindBy(id = "customer.firstName")
	WebElement firstName;

	@FindBy(id = "customer.lastName")
	WebElement lastName;

	@FindBy(id = "customer.address.street")
	WebElement addressStreet;

	@FindBy(id = "customer.address.city")
	WebElement addressCity;

	@FindBy(id = "customer.address.state")
	WebElement addressState;

	@FindBy(id = "customer.address.zipCode")
	WebElement zipCode;

	@FindBy(id = "customer.phoneNumber")
	WebElement phoneNumber;

	@FindBy(id = "customer.ssn")
	WebElement ssn;

	@FindBy(id = "customer.username")
	WebElement username;

	@FindBy(id = "customer.password")
	WebElement password;

	@FindBy(id = "repeatedPassword")
	WebElement confirmPwd;

	@FindBy(xpath = "//input[@type='submit' and @value= 'Register']")
	WebElement submitLink;

	@FindBy(xpath = "//li/a[contains(text(),'Log Out')]")
	WebElement logoutLink;

	@FindBy(xpath = "//div/h1[contains(text(),'Welcome')]")
	WebElement welcomeText;

	public RegistrationPage()
	{
		// TODO Auto-generated constructor stub
		super();

		PageFactory.initElements(driver, this);
	}

	public void fillForm(String fname, String lname, String street, String city, String uname)
	{
		// username.sendKeys("arg0");
		// firstName.sendKeys("Saltlake");
		// lastName.sendKeys("jamiess");
		// addressStreet.sendKeys("lane34");
		// addressCity.sendKeys("city67");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		linkToRegister.click();
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		addressStreet.sendKeys(street);
		addressCity.sendKeys(city);
		addressState.sendKeys("UT");
		zipCode.sendKeys("0000000");
		phoneNumber.sendKeys("999999999999");
		ssn.sendKeys("1234321234");
		// username.sendKeys("Salt2lake");
		username.sendKeys(uname);
		password.sendKeys("123123123");
		confirmPwd.sendKeys("123123123");
		submitLink.click();
		// GenericPage.screenshot();
	}

	public void fillFormExcel(String fname, String lname, String address, String city, String state, String zipcode,
			String phone, String SSN, String Password, String ConfirmPwd)
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		linkToRegister.click();
		firstName.sendKeys(fname);
		lastName.sendKeys(lname);
		addressStreet.sendKeys(address);
		addressCity.sendKeys(city);
		addressState.sendKeys(state);
		zipCode.sendKeys(zipcode);
		phoneNumber.sendKeys(phone);
		ssn.sendKeys(SSN);
		password.sendKeys(Password);
		confirmPwd.sendKeys(ConfirmPwd);

	}

	public String verifyPageTitle()
	{
		System.out.println(welcomeText.getText());
		return driver.getTitle();
	}

}
