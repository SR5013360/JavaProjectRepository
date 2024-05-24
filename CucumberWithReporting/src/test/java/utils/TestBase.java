package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\git\\CucumberWithReporting\\src\\test\\resources\\global.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String url=prop.getProperty("QAUrl");
		System.out.println(url);
		System.out.println("=================");
		System.out.println(prop.getProperty("browser"));
		
		
		if(driver==null)
		{		
			System.out.println("=================");
		 if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		 {
		   System.setProperty("webdriver.chrome.driver", "src//test//java//driverFile//chromedriver.exe");
		   driver=new ChromeDriver();
		   driver.get(url);
		   driver.manage().window().maximize();
		   
		}
		
	}
		return driver;
	}
}
