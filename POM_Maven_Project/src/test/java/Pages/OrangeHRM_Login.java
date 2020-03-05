package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
public class OrangeHRM_Login 
{
	WebDriver driver;
	By Username= By.id("txtUsername");
	By Password= By.id("txtPassword");
	By Login=By.id("btnLogin");
	By Logout=By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a");
	public OrangeHRM_Login(WebDriver driver)
	{
		this.driver=driver;
		}
	public void loginToApp_username(String userid)
	{
		driver.findElement(Username).sendKeys(userid);
		}
	public void loginToApp_password(String pass)
	{
		driver.findElement(Password).sendKeys(pass);
		}	
	public void loginToApp_Loginbutton()
	{
		driver.findElement(Login).click();
		}
	public void Logout()
	{
		driver.findElement(By.id("welcome")).click();
		WebElement a=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/ul/li[2]/a"));
    	Actions action=new Actions(driver);
    	action.moveToElement(a).click().build().perform();
	}
}
