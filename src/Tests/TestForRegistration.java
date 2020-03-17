package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageClasses.GenericPage;
import PageClasses.RegistrationPage;
import Resources.UtilityPage;
// import main.*;

public class TestForRegistration extends GenericPage
{
	// public class TestForRegistration{
	GenericPage gpage;
	RegistrationPage rpage;

	public TestForRegistration()
	{
		super();
	}

	@BeforeMethod
	public void setUp()
	{
		gpage.initialization();
		// gpage.screenshot();
		gpage = new GenericPage();
		rpage = new RegistrationPage();

	}

	@Test(dataProvider = "getRegistrationFields")
	public void loginTest(String fname, String lname, String street, String city, String uname)
	{
		System.out.println("first test");
		rpage.fillForm(fname, lname, street, city, uname);
		System.out.println(rpage.verifyPageTitle());
	}

	@DataProvider
	public Object[][] getRegistrationFields()
	{
		Object getdata[][] = UtilityPage.excelReader();
		return getdata;
	}

	// @DataProvider(name = "loginDataHashMap")
	// public Object[][] getLoginData()
	// {
	// Object testcase[][] = UtilityPage.TestcaseReader();
	// return testcase;
	// }
	//
	// @Test(dataProvider="loginData")
	// public void loginTest(String fname, String lname, String address,String
	// city,String state, String zipcode, String phone, String SSN , String
	// Password, String ConfirmPwd) {
	// System.out.println("first test");
	// rpage.fillFormExcel(fname,lname, address, city,state,zipcode,phone, SSN ,
	// Password, ConfirmPwd);
	//
	// System.out.println(rpage.verifyPageTitle());
	//
	// }

	// @Test(dataProvider = "loginDataHashMap")
	// public void loginTest(Map<Object, Object> m1)
	// {
	//
	// System.out.println(m1.get("testName"));
	// System.out.println(m1.get("firstname"));
	// System.out.println(m1.get("lastname"));
	//
	// }
	//
	@AfterMethod
	public void close()
	{
		gpage.tearDown();
	}

}
