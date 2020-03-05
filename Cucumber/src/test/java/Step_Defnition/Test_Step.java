package Step_Defnition;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Test_Step {
	WebDriver driver;
	@Given("^I launch Chrome browser$")
	public void launch_browser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\joshi\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
	driver=new ChromeDriver();
	Thread.sleep(5000);
	}
	@When("^I open Google Homepage$")
	public void open_homepage() throws InterruptIOException
	{
	Thread.sleep(5000);
	driver.get("https://www.google.co.in");
	}
	@Then("^I verify text box")
	public void verify_textbox()          
	{
	WebElement txtbox=driver.findElement(By.name("q"));
	if(txtbox.isEnabled())
	{
	txtbox.sendKeys("Hello Welcome");
	driver.close();
	}
	}
	@And("^the page displays Google Search button$")
	public void display_searchbutton()
	{
	System.out.println("The page displays Google Search Button");
	}


	}

}
