package Launching_Browsers_Selenium;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Take_Snap 
{
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		//System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver a = new ChromeDriver();
	    a.manage().window().maximize();
	    //a.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    //TakesScreenshot b=(TakesScreenshot)a;
	    //a.manage().takeScreenshot
		//a.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
	    a.get("https://google.com/");
		TakesScreenshot ts =((TakesScreenshot)a);
		File Store=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Store, new File("C:\\Users\\BLTuser.BLT0199\\eclipse-workspace\\Launching_Browsers_(Selenium)\\Screenshot\\screenshot.png"));
	}
}
