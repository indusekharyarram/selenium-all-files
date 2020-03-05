package Launching_Browsers_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame_handelling {
	public static void main (String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		//System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //a.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://jqueryui.com/draggable/");
	    driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
	    System.out.println(driver.findElement(By.id("draggable")).isDisplayed());
	    driver.switchTo().defaultContent();
	    driver.findElement(By.linkText("Droppable")).click();
	    //simple alert-----prompt alert-----confirmation alert
	}

}
