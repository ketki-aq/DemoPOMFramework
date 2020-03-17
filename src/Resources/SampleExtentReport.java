package Resources;

import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class SampleExtentReport
{

	static ExtentTest test;
	static ExtentReports report;

	@BeforeClass
	public static void startTest()
	{
		report = new ExtentReports(System.getProperty("user.dir") + "\\ExtentReportResults.html");
		test = report.startTest("ExtentDemo");
	}

}
