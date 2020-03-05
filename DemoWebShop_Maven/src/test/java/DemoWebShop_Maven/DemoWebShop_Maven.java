package DemoWebShop_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_Maven {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		/*System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");*/
		WebDriver a = new ChromeDriver();
	    a.manage().window().maximize();
		a.get("http://demowebshop.tricentis.com/");
		System.out.println(a.getTitle());
		}

}
