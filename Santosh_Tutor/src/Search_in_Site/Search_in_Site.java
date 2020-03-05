package Search_in_Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_in_Site {
	public static void main (String args[]) throws InterruptedException
	{
		
			System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
			//System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			WebDriver a = new ChromeDriver();
		    a.manage().window().maximize();
			a.get("http://demowebshop.tricentis.com/");
			a.findElement(By.id("small-searchterms")).sendKeys("book");
			a.findElement(By.xpath("//input[@value='Search']")).click();
			Thread.sleep(3000);
			a.findElement(By.id("As")).click();
	}
}
