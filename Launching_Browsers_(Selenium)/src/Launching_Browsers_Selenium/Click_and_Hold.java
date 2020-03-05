package Launching_Browsers_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_and_Hold 
{
	public static void main (String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		//System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //a.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://jqueryui.com/selectable/");
	    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	    WebElement a=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[1]"));
	    WebElement b=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[2]"));
	    WebElement c=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[3]"));
	    WebElement d=driver.findElement(By.xpath("//*[@id=\"selectable\"]/li[4]"));
	    Actions action=new Actions (driver);
	    action.clickAndHold(a).clickAndHold(d).release().build().perform();	
}
}
