package PageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends GenericPage
{

	@FindBy(name = "username")
	WebElement userName1;

	@FindBy(name = "password")
	WebElement password1;

	@FindBy(xpath = "//input[@type='submit' and @value= 'Log In']")
	WebElement loginLink;

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	public UWHomePage loginToApplication(String luname, String lpwd)
	{

		// userName1.sendKeys(prop.getProperty("username"));
		// password1.sendKeys(prop.getProperty("password"));
		userName1.sendKeys(luname);
		password1.sendKeys(lpwd);
		loginLink.click();
		String expected = driver.findElement(By.xpath("//div[@id='leftPanel']/p")).getText();
		return new UWHomePage();
	}
}
