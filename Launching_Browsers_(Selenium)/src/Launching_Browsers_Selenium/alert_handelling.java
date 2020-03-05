package Launching_Browsers_Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_handelling 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		//System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //a.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("http://www.prtc.in/PRTCWeb/preUserAuthenticate.do;jsessionid=9189F8DB1816146001FBCD387F7D1EFC");
	    //simple alert-----prompt alert-----confirmation alert
	    driver.findElement(By.xpath("/html/body/form/div[2]/div[3]/div[3]/input")).click();
	    Alert a =driver.switchTo().alert();
	    System.out.println(a.getText());
	    a.accept();//this is for enter button
	    a.dismiss();// this is for cancel button
	    a.sendKeys("sekhar");// this is for prompt button
	    a.accept();
	}
}
