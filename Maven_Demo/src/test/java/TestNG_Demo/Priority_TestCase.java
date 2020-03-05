package TestNG_Demo;

import org.testng.annotations.Test;

public class Priority_TestCase {
	@Test(priority=2)
	public void testCase1()
	{
	System.out.println("testCase1");
	}
	@Test(priority=3,invocationCount=3,invocationTimeOut=5)
	//invocationCount=3 
	public void testCase2()
	{
		System.out.println("testCase2");
	}
	@Test(priority=1)
	public void testCase3()
	{
		System.out.println("testCase3");
	}

}
