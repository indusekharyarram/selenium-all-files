package clickOnRadio_Button;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class clickOnRadio_Button {
	public static void main (String args[])
	{
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
			//System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			WebDriver a = new ChromeDriver();
		    a.manage().window().maximize();
			a.get("http://demowebshop.tricentis.com/");
			List<WebElement> b = a.findElements(By.name("pollanswers-1"));
			((WebElement) b.get(1)).click();
			
		}
	}

}
