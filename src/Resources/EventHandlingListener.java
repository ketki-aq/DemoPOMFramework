package Resources;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import PageClasses.GenericPage;

public class EventHandlingListener extends GenericPage implements WebDriverEventListener
{

	@Override
	public void afterClickOn(WebElement element, WebDriver driver)
	{
		// TODO Auto-generated method stub
		System.out.println("clicked on" + element.toString());
		// GenericPage.screenshot();
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver)
	{
		// TODO Auto-generated method stub
		System.out.println("found element" + by.toString());
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend)
	{
		// TODO Auto-generated method stub
		System.out.println("before the value changes" + element.toString());
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver driver)
	{
		// TODO Auto-generated method stub
		System.out.println(" clicking on" + element.getText());
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver)
	{
		// TODO Auto-generated method stub
		System.out.println("before Find bY" + by.toString());
	}

	@Override
	public void afterNavigateBack(WebDriver driver)
	{
		// TODO Auto-generated method stub
		System.out.println("after navigating back the webpage");
	}

	@Override
	public void afterNavigateForward(WebDriver driver)
	{
		// TODO Auto-generated method stub
		System.out.println("after navigating ahead on the web page");
	}

	@Override
	public void afterAlertAccept(WebDriver arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void afterAlertDismiss(WebDriver arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2)
	{
		// TODO Auto-generated method stub
		System.out.println("after the value changes" + arg2.toString());
	}

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void afterGetText(WebElement element, WebDriver driver, String arg2)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void afterScript(String arg0, WebDriver arg1)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void afterSwitchToWindow(String arg0, WebDriver arg1)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeAlertAccept(WebDriver arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeGetText(WebElement arg0, WebDriver arg1)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateBack(WebDriver arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateForward(WebDriver arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateRefresh(WebDriver arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void beforeSwitchToWindow(String arg0, WebDriver arg1)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void onException(Throwable arg0, WebDriver driver)
	{
		// TODO Auto-generated method stub}
	}

}
