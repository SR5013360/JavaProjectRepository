package stepDefinitions;


import org.testng.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.OfferPageLocatorsTest;
import utils.TestContextSetup;


public class OfferPageStepDefinitionTest {

public TestContextSetup context;
	
	public OfferPageStepDefinitionTest(TestContextSetup context)
	{
		this.context=context;
	}
	
	@When("User searched with shortname {string} in offers page to check if product exist")
	public void user_searched_with_shortname_in_offers_page_to_check_if_product_exist(String shortName) throws InterruptedException {
		//OfferPageLocators opl=new OfferPageLocators(context.driver);
		OfferPageLocatorsTest opl=context.pom.getoffersPage();
		opl.topDealClick();
		context.gc.switchToOfferPage();	
		Thread.sleep(2000);
		context.searchProductNameOnOfferPage=opl.getProductText(shortName).trim();
		System.out.println("Search Product Name on offer page is :- " + context.searchProductNameOnOfferPage);
	}
	
	
	

	@Then("Verify name of the product in home page matches name in offers page")
	public void verify_name_of_the_product_in_home_page_matches_name_in_offers_page() {
		Assert.assertEquals(context.searchProductName , context.searchProductNameOnOfferPage);
	}
	
	@When("User searched with shortname beet and extracted actual name of product")
	public void user_searched_with_shortname_beet_and_extracted_actual_name_of_product() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	    
	}
}
