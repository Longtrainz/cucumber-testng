package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




//@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"},
		features = "src/test/resources/features",
		glue = "steps"
		/*publish = true*/)

public class RunCucumberTest extends AbstractTestNGCucumberTests  {

}
