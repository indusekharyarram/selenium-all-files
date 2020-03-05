package Test_Runner;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Test_Case {
	WebDriver driver;
	@Test
	public void launch_browser() throws InterruptIOException
	{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\joshi\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.co.in");
	WebElement txtbox=driver.findElement(By.name("q"));
	if(txtbox.isEnabled())
	{
	txtbox.sendKeys("Hello Welcome");
	System.out.println("The page displays Google Search Button");
	driver.close();
	}


	}



}
