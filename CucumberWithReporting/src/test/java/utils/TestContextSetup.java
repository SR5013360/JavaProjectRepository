package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManagerTest;

public class TestContextSetup {
	
	public WebDriver driver;
	public String searchProductName,searchProductNameOnOfferPage;
	public PageObjectManagerTest pom;
	public GenericUtils gc;
	public TestBase testbase;
	
	public TestContextSetup() throws IOException
	{
		testbase =new TestBase();
		pom = new PageObjectManagerTest(testbase.WebDriverManager());
		gc = new GenericUtils(testbase.driver);
	}
	
	

}
