package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.Schools_OrganizationsPage;
import com.fbistech.pages.Sponsors_OrganizationPage;
import com.fbistech.pages.TutorPage;
import com.fbistech.util.JiraPolicy;

public class TutorPageTest extends TestBase {
	
	
	HomePage homePage;
	Sponsors_OrganizationPage sponsors_OrganizationPage;
	TutorPage tutorPage;
	
	public TutorPageTest()
	{
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization_WebBrowser();
		
		homePage = new HomePage();
		sponsors_OrganizationPage = new Sponsors_OrganizationPage();
		tutorPage = new TutorPage();
		
	}
//	
//	
//	@JiraPolicy(logTicketReady=true)
//	@Test(priority = 1) 
//	public void verifyUserCanClickTutorFormBtn() 
//	{
//		sponsors_OrganizationPage = homePage.validateClickOnSponsors_OrganizationLink();
//	}
//
//	
//	@Test(priority = 2) 
//	public void verifyUserCanFillTutorForm() throws Exception
//	{
//		sponsors_OrganizationPage = homePage.validateClickOnSponsors_OrganizationLink();
//		Thread.sleep(3000);
//		homePage = tutorPage.createNewTutor(prop.getProperty("firstName"), prop.getProperty("lastName"), 
//				prop.getProperty("emailAddress"), prop.getProperty("phoneNo"), prop.getProperty("uploadCourseFile"));
//		
//	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(3000);
		driver.quit(); 
	}
	
}
