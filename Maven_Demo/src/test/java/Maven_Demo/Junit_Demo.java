package Maven_Demo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_Demo {
	@Test
	public void testCase1()
	{
		System.out.println("testCase1");
	}
	@Test
	public void testCase2()
	{
		System.out.println("testCase2");
	}
	@Test
	public void testCase3()
	{
		System.out.println("testCase3");
	}
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("beforeClass:Prepare TestData");
		}
	
	@AfterClass
	public static void AfterClass()
	{
		System.out.println("afterClass:clearLog");
		}
	@Before
	public void before()
	{
		System.out.println("beforemethod:LaunchApp");
		}
	@After
	public void after()
	{
		System.out.println("afterMethod:CloseApp");
		}
	}
