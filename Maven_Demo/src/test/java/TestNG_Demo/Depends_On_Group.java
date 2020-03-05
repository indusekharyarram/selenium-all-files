package TestNG_Demo;
import org.testng.annotations.Test;
public class Depends_On_Group {
	@Test(groups= {"functional Testing","Smoke Testing"})
	public void Login()
	{
		System.out.println("TestCase1");
		}
	@Test(groups= {"functional Testing","Sanity Testing"})
	public void Search()
	{
		System.out.println("TestCase2");
		}
	@Test(groups= {"functional Testing","Re Testing"})
	public void Logout()
	{
		System.out.println("TestCase3");
		}
}