package PageClasses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Resources.EventHandlingListener;

public class GenericPage
{

	static public WebDriver driver;
	static public Properties prop;
	static public EventFiringWebDriver edriver;
	static public EventHandlingListener ehandler;

	public GenericPage()
	{
		prop = new Properties();

		try
		{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/resources/Config.properties");
			prop.load(fis);

		}
		catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void tearDown()
	{
		System.out.println("in parent static");
		driver.quit();
	}

	public static void initialization()
	{
		String browser = prop.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"D:\\pranav\\study\\javaEclipse\\Amazon\\ExternalLib\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
			if (browser.equalsIgnoreCase("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",
						"D:\\pranav\\study\\javaEclipse\\Amazon\\ExternalLib\\selenium\\chromedriver.exe");
				driver = new FirefoxDriver();
			}

		edriver = new EventFiringWebDriver(driver);
		ehandler = new EventHandlingListener();
		edriver.register(ehandler);
		driver = edriver;
		String url = prop.getProperty("url");
		driver.get(url);
		// driver.manage().window().maximize();
	}

	public void waitForPageLoad()
	{

	}

	// public static void screenshot()
	// {
	// TakesScreenshot scrshot = ((TakesScreenshot) driver);
	// File srcFile = scrshot.getScreenshotAs(OutputType.FILE);
	// File DestFile = new File("C:\\Users\\hebli\\Photon
	// Workspace\\TestFrame\\TestTool\\src\\Snaps");
	// try
	// {
	// FileUtils.copyFile(srcFile, DestFile);
	// }
	// catch (IOException e)
	// {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }

}
