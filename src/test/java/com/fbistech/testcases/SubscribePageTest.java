package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.SubscribePage;

public class SubscribePageTest extends TestBase {
	
	
	HomePage homePage;
	SubscribePage subscribePage;
	
	
	
	public SubscribePageTest()
	{
		super();

	} 
	
	
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homePage = new HomePage();
		subscribePage = new SubscribePage();
		
	}
	
	
	
	@Test(priority = 2)
	public void verifyUserCanClickSubscribeLink()
	{	
		homePage = subscribePage.clickOnSubscribeLink();
	}
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(7000);
		driver.quit(); 
	}
	
	

}
