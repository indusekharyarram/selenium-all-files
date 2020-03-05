package Launching_Browsers_Selenium;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Wrapper_Method 
{
	WebDriver driver;
	public void LaunchApp(String url) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		//System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    //a.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get(url);
	}
	public void enterById(String loc,String val)
	{
		driver.findElement(By.id(loc)).sendKeys(val);
	}
	public void clickByXpath(String path)
	{
		driver.findElement(By.xpath(path)).click();
	}
	public void clickByLinkText(String link)
	{
		driver.findElement(By.linkText(link)).click();
	}
	public void screenShot(String path1)throws IOException
	{
	TakesScreenshot ts =((TakesScreenshot)driver);
	File Store=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(Store, new File(path1));
	}
public void closeApp()
{
	driver.close();
}
}





