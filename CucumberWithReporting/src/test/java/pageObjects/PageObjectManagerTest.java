package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManagerTest {
	
	public LandingPageLocatorsTest lpl;
	public OfferPageLocatorsTest opl;
	public WebDriver driver;
	
	public PageObjectManagerTest(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LandingPageLocatorsTest getLandingPage()
	{
		lpl=new LandingPageLocatorsTest(driver);
		return lpl;
	}
	
	public OfferPageLocatorsTest getoffersPage()
	{
		opl=new OfferPageLocatorsTest(driver);
		return opl;
	}

}
