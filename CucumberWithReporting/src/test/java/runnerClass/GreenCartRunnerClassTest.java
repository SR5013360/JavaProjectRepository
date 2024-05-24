package runnerClass;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepDefinitions",monochrome=true,plugin= {"pretty","html:src\\test\\java\\reports\\GreenCart.html","json:src\\test\\java\\reports\\GreenCart.json"})
public class GreenCartRunnerClassTest extends AbstractTestNGCucumberTests {
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
