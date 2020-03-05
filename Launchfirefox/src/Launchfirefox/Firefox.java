package Launchfirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox
{
	@Test
	public void Firefoxbrowseropen()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium jars\\Firefox driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		System.out.println(driver.getTitle());
		
	}

}
