package Pick_Data_from_Table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Pick_Data_from_Table 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		//System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		int row=5,column=1;String url;
		for(row=2;row<=7;row++)
		{
			for(column=1;column<=3;column++)
			{
				url="//*[@id=\"customers\"]/tbody/tr["+row+"]/td["+column+"]";
				String s=driver.findElement(By.xpath(url)).getText();
				System.out.print(s+" ");
			}
			System.out.println();
			}
		}
	}

