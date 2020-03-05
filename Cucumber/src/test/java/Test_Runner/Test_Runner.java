import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class Test_Runner {
/// I AM RUNNING WITH CUCUMBER CLASS
@RunWith(Cucumber.class)
@CucumberOptions(features="feature/testcase.feature1", glue="Step_Defnition")
public class Testrunner_googlehomepage
{

}

}