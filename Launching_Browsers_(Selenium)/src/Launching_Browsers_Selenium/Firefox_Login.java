package Launching_Browsers_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox_Login {
	public static void main(String args[]) {
		{
			System.setProperty("webdriver.gecko.driver","D:\\Selenium jars\\Firefox driver\\geckodriver.exe");
			WebDriver a=new FirefoxDriver();
			a.manage().window().maximize();
			a.get("https://www.google.com/");
			System.out.println(a.getTitle());
			a.quit();
		}

	}

}
