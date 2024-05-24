package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPageLocatorsTest {
	
	public WebDriver driver;
	
	 public OfferPageLocatorsTest(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	
	 By topDeals= By.linkText("Top Deals");
	 By searchField=By.id("search-field");
	 By getProductNameOnOfferPage=By.xpath("//table[@class='table table-bordered']/tbody/tr/td[1]");
	 
	 
	 
	 public void topDealClick()
	 {
		 driver.findElement(topDeals).click();
		 
	 }
	 
	 
	 public String getProductText(String name)
	 {
		 driver.findElement(By.id("search-field")).sendKeys(name);
		 return driver.findElement(getProductNameOnOfferPage).getText();	
	 }
	 
	

}
