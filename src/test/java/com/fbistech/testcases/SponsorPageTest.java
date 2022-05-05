package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.PartnerWithUsPage;
import com.fbistech.pages.Sponsors_OrganizationPage;
import com.fbistech.util.JiraPolicy;

public class SponsorPageTest extends TestBase{
	
	HomePage homePage; 
	Sponsors_OrganizationPage sponsors_OrganizationPage;
	PartnerWithUsPage partnerWithUsPage;
	
	public SponsorPageTest()
	{
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		
		homePage = new HomePage();
		sponsors_OrganizationPage = new Sponsors_OrganizationPage(); 
		partnerWithUsPage = new PartnerWithUsPage();
	}

	 
//	@JiraPolicy(logTicketReady=true)
//	@Test(priority=1)
//	public void verifySponsorPageTitleTest()
//	{
//		sponsors_OrganizationPage = homePage.validateClickOnSponsors_OrganizationLink();
//		String sponsorsPageTitle = sponsors_OrganizationPage.validateSponsorPageTitle();
//		System.out.println(sponsorsPageTitle);
//		Assert.assertEquals(sponsorsPageTitle, "Beamsity");
//	}
//	
//	
//	@JiraPolicy(logTicketReady=true)
//	@Test(priority = 2)   
//	public void verifyUserCanClickSponsorFormBtn() throws Exception 
//	{
//		sponsors_OrganizationPage = homePage.validateClickOnSponsors_OrganizationLink();
//		Thread.sleep(3000);
//		partnerWithUsPage = partnerWithUsPage.clickOnSponsorForm();
//		System.out.println("User was able to click on Sponsor Link: " + homePage);
////		Assert.assertEquals(sponsorsPage, "page not found");
//	} 
//
//	
//	@JiraPolicy(logTicketReady=true)
//	@Test(priority = 3) 
//	public void verifyUserCanFillSponsorForm() throws Exception
//	{
//		sponsors_OrganizationPage = homePage.validateClickOnSponsors_OrganizationLink();
//		 Thread.sleep(3000);
//		 partnerWithUsPage = partnerWithUsPage.clickOnSponsorForm();
//		 homePage = partnerWithUsPage.createNewSponsor(prop.getProperty("firstName"), prop.getProperty("lastName"),
//				 prop.getProperty("emailAddress"), prop.getProperty("phoneNo"));
//	}
//	
//	
//	@JiraPolicy(logTicketReady=true)
//	@Test(priority = 4) 
//	public void verifyCountryDropdownValue()
//	{	 
//		sponsors_OrganizationPage = homePage.validateClickOnSponsors_OrganizationLink();
//		partnerWithUsPage = partnerWithUsPage.clickOnSponsorForm();
//		partnerWithUsPage = partnerWithUsPage.verifyCountryDropdownValue();
//	}
//
//	
//	@JiraPolicy(logTicketReady=true)
//	@Test(priority = 5) 
//	public void verifyCityDropdownValue()
//	{	 
//		sponsors_OrganizationPage = homePage.validateClickOnSponsors_OrganizationLink();
//		partnerWithUsPage = partnerWithUsPage.clickOnSponsorForm();
//		partnerWithUsPage = partnerWithUsPage.verifyCityropdownValue();
//	}
//	
	 
	 
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(3000);
		driver.quit(); 
	}
}
