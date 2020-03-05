package TestNG_Demo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class Sample_Problem {
  @Test
  public void TestCase1() { 
	  System.out.println("TestCase1");
  }
  @Test
  public void TestCase2() {
	  System.out.println("TestCase2");
  }
  @Test
  public void TestCase3() {
	  System.out.println("TestCase3");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod:Launch App");
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod:Close App");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass:prepare Test Data");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass:Clear Log");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest:open DB connection");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest:close DB connection");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite:SmokeTesting");
  }
  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite:GenerateReports");
  }
}
