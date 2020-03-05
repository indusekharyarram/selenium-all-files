package Grid_Selenium;

import java.net.MalformedURLException;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

public class TestCase {
		WebDriver driver;
		String Baseurl,nodeurl;
		@BeforeTest
		public void setup() throws MalformedURLException
		{
			Baseurl="http://www.google.com/";
			nodeurl="192.168.1.209";
			DesiredCapabilities capability=DesiredCapabilities.chrome();
			capability.setBrowserName("chrome");
			capability.setPlatform(Platform.WINDOWS);
			driver=new RemoteWebDriver(capability);
		}
	public void aftertest()
	{
		driver.quit();
	}
	@Test
	public void simpletest()
	{
		driver.get(Baseurl);
		String a=driver.getTitle();
		System.out.println("Title of the page" +a);
	}
	}


