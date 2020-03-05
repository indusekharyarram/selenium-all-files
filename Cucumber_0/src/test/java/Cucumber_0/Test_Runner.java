package Cucumber_0;
	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;
	public class Test_Runner 
	{
	/// I AM RUNNING WITH CUCUMBER CLASS
	@RunWith(Cucumber.class)
	@CucumberOptions(features="testcase.feature/123.feature", glue="Test_Definition")
	public class Testrunner_googlehomepage
	{
	}
	}
