package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.After;
import utils.TestContextSetup;

public class HooksTest {
	
	public TestContextSetup tcs;
	public HooksTest(TestContextSetup tcs)
	{
		this.tcs=tcs;
	}
	
	@After
	public void closeBroswer() throws IOException
	{
		tcs.testbase.WebDriverManager().quit();
	}

}
