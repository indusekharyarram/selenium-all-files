package Maven_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload 
{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","D:\\Selenium jars\\Chrome driver\\chromedriver.exe");
		//System.setProperty("webdriver.driver.in","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    //a.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("http://www.tinyupload.com/");
	    //driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]")).click();
	    driver.findElement(By.name("uploaded_file")).sendKeys("C:\\Users\\BLTuser.BLT0199\\Desktop\\excel1.xlsx");
	    driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/textarea")).sendKeys("File Tobe Uploaded");
	    driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/img")).click();
	}
}
