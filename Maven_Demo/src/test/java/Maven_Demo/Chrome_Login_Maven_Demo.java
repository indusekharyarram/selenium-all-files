package Maven_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Chrome_Login_Maven_Demo 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		/*System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");*/
		WebDriver a = new ChromeDriver();
	    a.manage().window().maximize();
		a.get("https://www.google.com/");
		System.out.println(a.getTitle());
		}
}
