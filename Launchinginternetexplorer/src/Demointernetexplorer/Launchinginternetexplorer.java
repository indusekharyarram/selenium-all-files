package Demointernetexplorer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Launchinginternetexplorer 
{
@Test	
public void Internetexploreropen()
{
	System.setProperty("webdriver.ie.driver","D:\\Selenium jars\\Internet explorer driver\\IEDriverServer.exe");
	WebDriver driver=new InternetExplorerDriver();
	driver.manage().window().maximize();
	driver.get("https://www.bing.com/");
	System.out.println(driver.getTitle());
}

}
