package Launching_Browsers_Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class locators {
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		/*System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");*/
		WebDriver a = new ChromeDriver();
	    a.manage().window().maximize();
		a.get("https://account.envato.com/");
		System.out.println(a.getTitle());
		a.findElement(By.id("user_username")).sendKeys("indusekharyarram@gmail.com");
		a.findElement(By.id("user_password")).sendKeys("123456789");
		a.findElement(By.name("commit")).click();
		}

}
