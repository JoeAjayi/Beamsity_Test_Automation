package com.fbistech.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.fbistech.util.TestUtil;
import com.fbistech.util.WebEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {
	
	/*---Reference Variables----*/
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	
	
	public TestBase()
	{
		try  
		{
			prop = new Properties();
//			FileInputStream ip = new FileInputStream("/Users/josephajayi/eclipse-workspace/BeamSity_Website/src/main/java/com/fbistech/config/config.properties");
			FileInputStream input = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/fbistech/config/config.properties");
			prop.load(input);	
			 
		}
		catch (FileNotFoundException e) 
		{ 
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	 
	public static void initialization()
	{
		String browserName = prop.getProperty("browser");
		
//		System.setProperty("webdriver.chrome.driver", "/Users/josephajayi/Desktop/Selenium Drivers/web-Drivers-2020/driver.Chrome/chromedriver94v");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		
//    	if (browserName.equals("chrome"))
//    	{
//    		WebDriverManager.chromedriver().setup();
//    		driver = new ChromeDriver();
//    	}
//    	else if 
//    	(browserName.equals("FF")) 
//    	{
//    		WebDriverManager.firefoxdriver().setup();
//    		driver = new FirefoxDriver();
//    	}
		
		
		
		
//		if(browserName.equals("Chrome"))
//		{
//			System.setProperty("webdriver.chrome.driver", "/Users/josephajayi/Desktop/Selenium Drivers/web-Drivers-2020/driver.Chrome/chromedriver87v");	
//			driver = new ChromeDriver();    
//		}
//		else if(browserName.equals("FF"))
//		{
//			System.setProperty("webdriver.gecko.driver", "/Users/josephajayi/Desktop/Selenium Drivers/web-Drivers-2020/driver.Firefox/geckodriver v29");	
//			driver = new FirefoxDriver(); 
//		}
//		else 
//		{
//			System.out.print("We Do Not Supported This Browser...");
//		}
			
		
		
		
		
    /*  ----The below configuration is to call all the webEventListener inside util package -----*/
 
		e_driver = new EventFiringWebDriver(driver);
		
        
        /* The EventListenerHandler object is to register EventFiringWebDriver           *
         * EventListener is an object of new WebEventListener() class
         * Registering the eventListener object to e_driver  
         * Assign e_driver to driver                                                                            
         */
//		
//		eventListener = new WebEventListener(); 
//		e_driver.register(eventListener); 
		driver = e_driver;              
		
		
		driver.manage().window().maximize(); // maximize window 
		driver.manage().deleteAllCookies();  // delete all cookies 
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITY_WAIT, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
			
	}
}
