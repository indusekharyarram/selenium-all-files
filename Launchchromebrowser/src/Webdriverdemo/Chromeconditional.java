package Webdriverdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Chromeconditional {
	@Test
	public static void main(String args[]) {
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.nopcommerce.com/");
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
	}
	


}

}




