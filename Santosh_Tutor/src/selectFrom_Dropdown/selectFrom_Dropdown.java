package selectFrom_Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectFrom_Dropdown {
	public static void main (String args[])
	{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
			//System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			WebDriver a = new ChromeDriver();
		    a.manage().window().maximize();
			a.get("http://examples.codecharge.com/Store/Default.php");
			WebElement b=a.findElement(By.name("category_id"));
			Select c = new Select(b);
			c.selectByVisibleText("Databases");

}
}
