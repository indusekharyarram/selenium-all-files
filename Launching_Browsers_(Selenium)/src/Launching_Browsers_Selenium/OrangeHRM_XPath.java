package Launching_Browsers_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM_XPath 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		//System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver a = new ChromeDriver();
	    a.manage().window().maximize();
		a.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		//a.findElement(By.id("txtUsername").sendKeys("Admin");
		//a.findElement(By.id("txtPassword").sendKeys("admin123");
		//a.findElement(By.id("btnLogin").click();
		//System.out.println(a.getTitle());
		//a.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("Admin");
		//a.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin123");
		//a.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		//USING LINKTEXT

		//a.findElement(By.linkText("Recruitment")).click();
		//a.findElement(By.linkText("Leave")).click();
		
		//USING XPATH (RELATIVE AND ABSOLUTE)
		
		//a.findElement(By.xpath("//*[@id='txtUsername' or @name='txtUsername']")).sendKeys("Admin");
		//a.findElement(By.xpath("//*[@id='txtPassword' or @name='txtPassword']")).sendKeys("admin123");
		//a.findElement(By.xpath("//*[@id='btnLogin' or @name='Submit']")).click();
		//a.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys("Admin");
		//a.findElement(By.xpath("//*[@id='txtPassword' and @name='txtPassword']")).sendKeys("admin123");
		//a.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
		
		//USING XPATH CONTAINS
		
		//a.findElement(By.xpath("//*[contains(@id,'txtUsername')]")).sendKeys("Admin");
		//a.findElement(By.xpath("//*[contains(@id,'txtPassword')]")).sendKeys("admin123");
		//a.findElement(By.xpath("//*[contains(@id,'btnLogin')]")).click();
		
		//USING STARTs WITH
		
		//a.findElement(By.xpath("//input[starts-with(@id,'txtUsername')]")).sendKeys("Admin");
		//a.findElement(By.xpath("//input[starts-with(@id,'txtPassword')]")).sendKeys("admin123");
		//a.findElement(By.xpath("//input[starts-with(@id,'btnLogin')]")).click();
		System.out.println(a.getTitle());
	}
}
