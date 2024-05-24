package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageLocatorsTest {
	
	public WebDriver driver;
	
	 public LandingPageLocatorsTest(WebDriver driver)
	 {
		 this.driver=driver;
	 }
	
	 By seachKeyword= By.xpath("//input[@class='search-keyword']");
	 By getProductName=By.xpath("//h4[@class='product-name']");
	 
	 
	 public void searchItem(String name)
	 {
		 driver.findElement(seachKeyword).sendKeys(name);
	 }
	 
	 public String getProductName()
	 {
		 return driver.findElement(getProductName).getText();
		 
	 }
		

}
