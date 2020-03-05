package Webdriverdemo;
//Using chrome web driver launch browser
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowser {

	public void ChromebrowserOpen()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");

		WebDriver driver = new ChromeDriver();
	    String baseUrl ="https://www.nopcommerce.com/";
		String expectedTitle="nopCommerce";
		String actualTitle="";
	
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
			}
		else
		{
		System.out.println("failed");
		}
		driver.quit();
		
	}
	 


}
