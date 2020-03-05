package Demointernetexplorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Jnkns {
	@Test(priority=3)	
	public  void Chromebrowseropen()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/");
		
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
	}
	@Test(priority=1)
	public void Internetexploreropen()
	{
		
		System.setProperty("webdriver.ie.driver","D:\\Selenium jars\\Internet explorer driver\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		System.out.println(driver.getTitle());
		driver.close();
	}

	
	@Test(priority=2)	
	public void Firefoxbrowseropen()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Selenium jars\\Firefox driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}


}
