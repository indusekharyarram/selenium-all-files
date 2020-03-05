package Test_Definition;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.And;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	public class Test_Step 
	{
	/*{
	WebDriver driver;
	@Given("^I launch Chrome browser$")
	public void launch_browser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
	driver=new ChromeDriver();
	Thread.sleep(5000);
	}
	@When("^I open Google Homepage$")
	public void open_homepage() throws InterruptedException
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
	}*/
	WebDriver driver;
	@Given("^I launch Chrome browser$")
	public void i_launch_Chrome_browser()   {  
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
	driver=new ChromeDriver();
	}
	@When("^I open Google Homepage$")
	public void i_open_Google_Homepage()  {
	driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	}
	@Then("^I verify that the page displays search text box$")
	public void i_verify_that_the_page_displays_search_text_box() {
	WebElement txtbox=driver.findElement(By.name("q"));
	System.out.println(txtbox.isDisplayed());
	}
	@Then("^i verify that text is entered and searched$")
	public void i_verify_that_text_is_entered_and_searched() throws InterruptedException{
	WebElement txtbox=driver.findElement(By.name("q"));
	if(txtbox.isEnabled())
	{
	txtbox.sendKeys("Hello Welcome");
	Thread.sleep(3000);
	}
	}
	@Then("^clicks the submit button$")
	public void clicks_the_submit_button()
	{
	Actions action=new Actions(driver);
	action.sendKeys(Keys.ENTER);
	driver.close();
	}
	}
	


