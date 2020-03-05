package TestNG_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OrangeHRM_example {
	WebDriver driver;
	String url="https://www.tumblr.com/login";
	@Test 
	public void Login()
	{
		WebElement NextBtn=driver.findElement(By.xpath("//*[@id=\"signup_determine_email\"]")).sendKeys("indusekharyarram@gmail.com");
		WebElement NextBtn=driver.findElement(By.xpath("//*[@id=\"signup_forms_submit\"]/span[2]")).click();
	}

}
