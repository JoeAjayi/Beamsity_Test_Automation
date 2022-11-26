package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.CompanyPage;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.SubscribePage;

public class CompanyPageTest extends TestBase {
	
	HomePage homePage;
	CompanyPage companyPage;
	
	
	
	public CompanyPageTest()
	{
		super();

	}
	 
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization_WebBrowser();
		homePage = new HomePage();
		companyPage = new CompanyPage();
		
	}
	
	
	
	@Test(priority = 1)
	public void verifyUserCanClickCompanyLink()
	{	
		homePage = companyPage.clickOnCompanyLink();
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(7000);
		driver.quit(); 
	}
	

}
