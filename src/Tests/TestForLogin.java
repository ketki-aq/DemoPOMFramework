package Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageClasses.GenericPage;
import PageClasses.LoginPage;
import PageClasses.UWHomePage;

public class TestForLogin extends GenericPage
{

	GenericPage gpage;
	LoginPage lpage;
	UWHomePage hpage;

	public TestForLogin()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
	{
		gpage.initialization();
		lpage = new LoginPage();
		gpage = new GenericPage();

	}

	@DataProvider(name = "loginData")
	public Object[][] getData()
	{
		return new Object[][] {
				{
						"swosea345", "123123123"
				}, {
						"rofoty121", "123123123"
				}
		};
	}

	@Test(dataProvider = "loginData")
	public void loginTest(String luname, String lpwd)
	{
		System.out.println("first test");
		hpage = lpage.loginToApplication(luname, lpwd);
		String actual = "Welcome";
		
		String expected = "Welcome";
		Assert.assertEquals(actual, expected);
	}

	@AfterMethod
	public void close()
	{
		// gpage.tearDown();
		System.out.println(driver.getTitle());
	}

}
