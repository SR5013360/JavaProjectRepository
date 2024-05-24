package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;
import pageObjects.LandingPageLocatorsTest;
import utils.TestContextSetup;

public class LandingPageStepDefinitionTest {	
	public TestContextSetup context;
	
	public LandingPageStepDefinitionTest(TestContextSetup context)
	{
		this.context=context;
	}
	@Given("User is on GreenCart Landing Page")
	public void user_is_on_green_cart_landing_page() throws Exception 
		{
			
		}

	@When("User searched with shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String searchtext) throws InterruptedException 
		{
		    LandingPageLocatorsTest lpl=context.pom.getLandingPage();
		    lpl.searchItem(searchtext);
			Thread.sleep(2000);
			context.searchProductName=lpl.getProductName().split("-")[0].trim();
			System.out.println("Search Product Name is :- " + context.searchProductName);
	
	
		}		
	
	

}
