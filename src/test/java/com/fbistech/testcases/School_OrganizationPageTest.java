package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import java.awt.Window;
import java.util.ArrayList;

import org.apache.poi.hssf.record.cf.Threshold;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.AboutUsPage;
import com.fbistech.pages.ContactUsPage;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.LoginPage;
import com.fbistech.pages.PartnerWithUsPage;
import com.fbistech.pages.Privacy_PolicyPage;
import com.fbistech.pages.Schools_OrganizationsPage;
import com.fbistech.pages.Sponsors_OrganizationPage;
import com.fbistech.pages.TechOnBeamsityPage;
import com.fbistech.util.JiraPolicy;
import com.fbistech.util.TestUtil;

public class School_OrganizationPageTest extends TestBase {
	
	
//	Object variables of java classes 
	HomePage homePage;
	Schools_OrganizationsPage schools_OrganizationsPage;
	TechOnBeamsityPage techOnBeamsityPage;
	ContactUsPage contactUsPage;
	LoginPage loginPage;
	PartnerWithUsPage partnerWithUsPage;
	AboutUsPage aboutUsPage;
	Privacy_PolicyPage privacy_PolicyPage;
	TestUtil testUtil;
	
	
	
	
	
	public School_OrganizationPageTest()
	{
		super();
	}
	
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization_WebBrowser(); 
//		Below are objects of every java class to be initialize
		homePage = new HomePage();
		schools_OrganizationsPage = new Schools_OrganizationsPage();
		techOnBeamsityPage = new TechOnBeamsityPage();
		contactUsPage = new ContactUsPage();
		loginPage = new LoginPage();
		partnerWithUsPage = new PartnerWithUsPage();
		aboutUsPage = new AboutUsPage();
		privacy_PolicyPage = new Privacy_PolicyPage();
		testUtil = new TestUtil(); // object reference
	
	}
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 1)
	public void verifyHomePageTitle()
	{
		String homePageTitle = schools_OrganizationsPage.validateHomePageTitle(); 
		Assert.assertEquals(homePageTitle, "Beamsity"); //(Actual, expected)
		System.out.println(homePageTitle);
	}
	
	 
	@JiraPolicy(logTicketReady=true)
//	@Test(priority = 1) 
	public void verifyUserCanClickSchoolsOrganizationsPageLink() 
	{
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/organization", "URL does not matched");
		
//		<--- Validating BeamSity for Organizations context is display and running two layers of assertion ---->
			
		String pageNamelabel = schools_OrganizationsPage.validateCorrectSchools_OrganizationsPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "BeamSity for Organizations", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("BeamSity for Organizations");
		System.out.println(text);
		Assert.assertTrue(text);
		
		
	}
	 
	
	
	
	@JiraPolicy(logTicketReady=true)
//	@Test(priority = 1) 
	public void verifyUserCanClickBeamsityLogo()
	{
//		schools_OrganizationsPage = homePage.validateClickOnBeamsityLogo();
	}
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 2)
	public void verifyUserCanClickOnTeachOnBeamsitykLink() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		techOnBeamsityPage = schools_OrganizationsPage.validateClickOnTechOnBeamsityLink();
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/become_a_tutor", "The URL does not matched");
		
	//	<--- Validating Make an Impact context is display and running two layers of assertion ---->
		
		String pageNamelabel = schools_OrganizationsPage.validateCorrectTeachOnBeamsityPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Make an Impact", "Text displayed does not matched");
		
		
		boolean text = driver.getPageSource().contains("Make an Impact");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	

	
	
	
	

	@JiraPolicy(logTicketReady=true)
//	@Test(priority = 3)
	public void verifyUserCanClickOnContactUsLinks() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		contactUsPage = schools_OrganizationsPage.validateClickOnContactUsLinks();
		
//	 	<-----	Assertion on contact us url ------>
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/contactus", "The URL does not matched");
		
//		<--- Validating Contact Us! text is display and running two layers of assertion ---->
		
		String pageNamelabel = schools_OrganizationsPage.validateCorrectContactUsPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Contact Us!", "Page name label displayed does not matched");
		
		
		String footerNamelabel = schools_OrganizationsPage.validateCorrectContactUsFooterName();
		System.out.println(footerNamelabel);
		Assert.assertEquals(footerNamelabel, "CONTACT US", "Footer name label displayed does not matched");
		
		boolean pageNamelText = driver.getPageSource().contains("Contact Us!");
		System.out.println(pageNamelText);
		Assert.assertTrue(pageNamelText);
		
		
		boolean text = driver.getPageSource().contains("Contact Us!");
		Assert.assertEquals(text, true);	
	}
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 4)
	public void verifyUserCanClickOnLoginLink() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		loginPage = schools_OrganizationsPage.validateClickOnLoginLink();
		
//      <---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
        
//      <--- Validating login URL and running a layer of assertion ---->
       
        String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://portal.beamsity.com/", "URL displayed does not matched");
		
//		<--- Validating login text is display and running two layer of assertion ---->
		String pageNamelabel = schools_OrganizationsPage.validateCorrectLoginPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Log In", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Log In");
		System.out.println(pageNamelText);
		Assert.assertTrue(pageNamelText);
	}
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 5)
	public void verifyUserCanclickOnPartnerWithUsLink() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		partnerWithUsPage = schools_OrganizationsPage.validatePartnerWithUsLink();
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/sponsor", "The URL does not matched");
		
//		<--- Validating partner with us text is display and running 2 layers of assertion ---->
		String pageNameLabel = schools_OrganizationsPage.validateCorrectPartnerWithUsPageName();
		System.out.println(pageNameLabel);
		Assert.assertEquals(pageNameLabel, "Partner with us today", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Partner with us today");
		System.out.println(pageNamelText);
		Assert.assertTrue(pageNamelText);
	}

	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 6)
	public void verifyUserCanClickOnGetStartedLink() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		schools_OrganizationsPage = schools_OrganizationsPage.validateClickOnGetStartedLink();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/sponsor", "The URL does not matched");
		
//		<--- Validating get started with sponsors page! text is display and running two layers of assertion ---->
		String pageNameLabel = schools_OrganizationsPage.validateCorrectPartnerWithUsPageName();
		System.out.println(pageNameLabel);
		Assert.assertEquals(pageNameLabel, "Partner with us today", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Partner with us today");
		System.out.println(pageNamelText);
		Assert.assertTrue(pageNamelText);
	}

	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 7)
	public void verifyUserCanClickOnGooglePlayLink() throws Exception
	{
		
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		schools_OrganizationsPage = schools_OrganizationsPage.validateClickOnGooglePlayLlink();
		
//		<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

//		<----  Navigate to New Tab ---->
		driver.switchTo().window(tabs2.get(1));
		
		
//		<--- Validating Google play button and running three layers of assertion ---->
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://play.google.com/store/apps/details?id=com.fbistech.beamsity", "The URL does not matched");
		
		
		String footerNameLabel = schools_OrganizationsPage.validateCorrectGooglePlayPageName();
		System.out.println(footerNameLabel);
		Assert.assertEquals(footerNameLabel, "BeamSity", "Text displayed does not matched");
			 
			
		boolean pageNamelText = driver.getPageSource().contains("BeamSity");
		System.out.println(pageNamelText);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);			
	}
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 8)
	public void verifyUserCanClickOnAboutUsLink() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		aboutUsPage = schools_OrganizationsPage.validateClickOnAboutUsLink();
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/about_us", "The URL does not matched");
		
//		<--- Validating About Us context is display and running three layers of assertion ---->		
		String footerNameLabel = schools_OrganizationsPage.validateCorrectAboutUsFooterName();
		System.out.println(footerNameLabel);
		Assert.assertEquals(footerNameLabel, "About Us", "Text link name displayed does not matched");
		 
		
		String pageNameLabel = schools_OrganizationsPage.validateCorrectAboutUsPageName();
		System.out.println(pageNameLabel);
		Assert.assertEquals(pageNameLabel, "About Us", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("About Us");
		System.out.println(pageNamelText);
//		Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);	
	}
	



	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 9)
	public void verifyUserCanClickOnPrivacyPolicyLink() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		privacy_PolicyPage = schools_OrganizationsPage.validateClickOnPrivacyPolicyLink();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/privacy_policy", "The URL does not matched");
		
//		<--- Validating Privacy Policy context is display and running three layers of assertion ---->
		
		String footerNameLabel = schools_OrganizationsPage.validateCorrectPrivacyPolicyPageName();
		System.out.println(footerNameLabel);
		Assert.assertEquals(footerNameLabel, "Privacy Policy", "Text link name displayed does not matched");
		 
		String pageNameLabel = schools_OrganizationsPage.validateCorrectPrivacyPolicyPageName();
		System.out.println(pageNameLabel);
		Assert.assertEquals(pageNameLabel, "Privacy Policy", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Privacy Policy");
		System.out.println(pageNamelText);
//		Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);	
	}
	

	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 10)
	public void verifyUserIsRedirectedToGoogleMapNavigation_ClickOnContactAddressLink() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		schools_OrganizationsPage = schools_OrganizationsPage.validateClickOnContactUsAddress();
		
//		<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

    // Navigate to New Tab
		driver.switchTo().window(tabs2.get(1));
	
//		<--- Validating login text is display and running a layer of assertion ---->
		String footerNameLabel = schools_OrganizationsPage.validateCorrectContactUsOfficeAddressFooterName();
		System.out.println(footerNameLabel);
		Assert.assertEquals(footerNameLabel, "50 Awolowo Rd, Ikoyi 106104, Lagos", "Address displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("50 Awolowo Rd, Ikoyi 106104, Lagos");
		System.out.println(pageNamelText);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);
	}
	
	
	

	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 11)
	public void verifyUserCanSignUpToMailingList() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		schools_OrganizationsPage = schools_OrganizationsPage.validateSignUpToMailingList(prop.getProperty("userEmail"));
		
//		<--- Validating SignUp To Mailing List success and running two layers of assertion ---->
		Thread.sleep(3000);
		String successPrompt = schools_OrganizationsPage.validateSignUpToMailingListSuccessPrompt();
		System.out.println(successPrompt);
		Assert.assertEquals(successPrompt, "Success.", "Text displayed does not matched");
			 
			
		boolean successPromptText = driver.getPageSource().contains("Success.");
		System.out.println(successPromptText);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(successPromptText);
	}

	
	
	
	 
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 12)
	public void verifyUserCannotSignUpToMailingListWithEmail_WithOutDotCom() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		schools_OrganizationsPage = schools_OrganizationsPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOutDotCom"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List success and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = schools_OrganizationsPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		System.out.println(invalidEmailErrorPrompt);
		Assert.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
			 
			
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
		
	}

	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 13)
	public void verifyUserCannotSignUpToMailingListWithEmail_WithoutATgmail() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		schools_OrganizationsPage = schools_OrganizationsPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOut@gmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = schools_OrganizationsPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		System.out.println(invalidEmailErrorPrompt);
		Assert.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
			 
		boolean inValidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(inValidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(inValidEmailErrorPrompt);
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 14)
	public void verifyUserCannotSignUpToMailingListWith_PhoneNumber() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		schools_OrganizationsPage = schools_OrganizationsPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("signUpWithPhoneNo"));
	
//	<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = schools_OrganizationsPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		System.out.println(invalidEmailErrorPrompt);
		Assert.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
		
	}
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 15)
	public void verify_SUCCESS_IsPromptedWhenUserSuccessfullySignUpToMailingListWithValidEmail() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		schools_OrganizationsPage = schools_OrganizationsPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("userEmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List Success prompt and running two layers of assertion ---->
		
		String signUpMailingListSuccessPrompt = schools_OrganizationsPage.validateSignUpToMailingListSuccessPrompt();
		System.out.println(signUpMailingListSuccessPrompt);
		Assert.assertEquals(signUpMailingListSuccessPrompt, "Success.", "Text displayed does not matched");
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("Success.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 16)
	public void verify_InvalidEmailAddress_IsPromptedWhenUserAttemptedToSignUpToMailingListWithInvalidEmail() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		schools_OrganizationsPage = schools_OrganizationsPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOut@gmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = schools_OrganizationsPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		System.out.println(invalidEmailErrorPrompt);
		AssertJUnit.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
	}
	
	
	
	

	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 17)
	public void verifyUserCanInstallBeamsityApp() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		schools_OrganizationsPage = schools_OrganizationsPage.validateUserInstallBeamsityApp();
		
//		<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

//		<----  Navigate to New Tab ---->
		driver.switchTo().window(tabs2.get(1));
				
//		<---- Validating Google play button and running three layers of assertion ---->
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://play.google.com/store/apps/details?id=com.fbistech.beamsity", "The URL does not matched");
		
		
		String footerNameLabel = schools_OrganizationsPage.validateCorrectGooglePlayPageName();
		System.out.println(footerNameLabel);
		Assert.assertEquals(footerNameLabel, "BeamSity", "Text displayed does not matched");
			 
			
		boolean pageNamelText = driver.getPageSource().contains("BeamSity");
		System.out.println(pageNamelText);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);
	
//		Close browser 
//		try 
//		{
//			Thread.sleep(5000);
//			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "W");
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 18)
	public void verifyUserCanClickOnContactUsEmail() throws Exception
	{
		Thread.sleep(5000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		Thread.sleep(5000);
		schools_OrganizationsPage = schools_OrganizationsPage.validateClickOnContactEmail();
		
		
////		<---  Create Array List to keep Tab information ---->
//		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//
////	<----  Navigate to New Tab ---->
//		driver.switchTo().window(tabs2.get(1));
//		
	
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		Assert.assertEquals(url, "https://mail.google.com/mail/u/0/?fs=1&tf=cm&source=mailto&to=info@beamsity.com", "URL does not matched");
		
		String pageNamelabel = homePage.validateCorrectEmailAddressName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "info@beamsity.com", " Email Address displayed does not matched");
		
		boolean text = driver.getPageSource().contains("info@beamsity.com");
		System.out.println(text);
		Assert.assertTrue(text);
		
	}

	
	
	
	
	
	
	
	

//	@JiraPolicy(logTicketReady=true)
//	@Test(priority = 3) 
//	public void verifyUserCanFillSponsorForm() throws Exception
//	{
//		sponsors_OrganizationPage = homePage.validateClickOnSponsors_OrganizationLink();
//		Thread.sleep(3000);
//		schools_OrganizationsPage = schools_OrganizationsPage.clickOnSponsor_OrganizationForm();
//		homePage = schools_OrganizationsPage.createNewSchool(prop.getProperty("school_OrganizationName"),prop.getProperty("firstName"), 
//				prop.getProperty("lastName"), prop.getProperty("emailAddress"), prop.getProperty("phoneNo"));
//	}
//	
	
	

	
	
	
	
	

	@AfterMethod
	public void tearDown() throws Exception
	{	
		Thread.sleep(5000);
		driver.quit();
	}
	
}
