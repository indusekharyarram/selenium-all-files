package TestNG_Demo;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Depends_On_Methods {
	@Test
	public void Login()
	{
		System.out.println("Login");
		}
	@Test(dependsOnMethods= {"Login"})
	public void Search()
	{
		System.out.println("Search");
		Assert.assertEquals("abc", "123");
		}
	@Test(dependsOnMethods={"Search"},alwaysRun=false)
	public void Logout()
	{
		System.out.println("Logout");
		}
}

