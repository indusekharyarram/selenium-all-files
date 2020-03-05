package Test_Cases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Libraries.Wrapper_Ex;
import Pages.OrangeHRM_Login;
public class OrangeHRM_TestCase extends Wrapper_Ex
{
	@BeforeClass
	public void startUp()
	{
		launchApplication("chrome", "https://opensource-demo.orangehrmlive.com/");
		}
	@Test
	public void login()
	{
		OrangeHRM_Login lpage=new OrangeHRM_Login(driver);
	    lpage.loginToApp_username("Admin");
	    lpage.loginToApp_password("admin123");
		lpage.loginToApp_Loginbutton();
		}
	
	@AfterClass
	public void Logout()
    {
		driver.findElement(By.id("welcome")).click();
		WebElement a=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a"));
    	Actions action=new Actions(driver);
    	action.moveToElement(a).click().build().perform();
    	}
}


 