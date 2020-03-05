package Maven_OrangeHRM_Examples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Maven_OrangeHRM_Examples 
{
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.findElement(By.xpath("//*[@id='txtUsername' and @name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id='txtPassword' and @name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id='btnLogin' and @name='Submit']")).click();
		System.out.println(driver.getTitle());
		}
	@Test
	public void Logout()
	{
		driver.findElement(By.id("welcome")).click();
		WebElement a=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(a).click().build().perform();
		}
	@AfterMethod
	public void afterMethod()
	{
System.out.println("Logout");
driver.close();
}
}

