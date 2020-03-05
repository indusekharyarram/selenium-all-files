package Maven_Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Headless_Browser {
	public static void main(String args[])
	{
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println(driver.getTitle());
		
		
	}

}
