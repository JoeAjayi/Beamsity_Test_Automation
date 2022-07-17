package com.fbistech.testcases;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
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
import com.fbistech.pages.TechOnBeamsityPage;
import com.fbistech.util.JiraPolicy;

public class ContactUsPageTest extends TestBase {

//	Page Objects 
	HomePage homePage;
	Schools_OrganizationsPage schools_OrganizationsPage;
	TechOnBeamsityPage techOnBeamsityPage;
	ContactUsPage contactUsPage;
	LoginPage loginPage;
	PartnerWithUsPage partnerWithUsPage; 
	AboutUsPage aboutUsPage;
	Privacy_PolicyPage privacy_PolicyPage;
	

	
	
//	The super keyword will help the constructor to call TestBase constructor the properties 
//	TestBase constructor will initialize
	public ContactUsPageTest()
	{
		super();
	}
	
	
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization_WebBrowser(); 
		
		homePage = new HomePage();
		schools_OrganizationsPage = new Schools_OrganizationsPage();
		techOnBeamsityPage = new TechOnBeamsityPage();
		contactUsPage = new ContactUsPage();
		loginPage = new LoginPage();
		partnerWithUsPage = new PartnerWithUsPage();
		aboutUsPage = new AboutUsPage();
		privacy_PolicyPage = new Privacy_PolicyPage();
	
	}
	
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority = 1) 
	public void verifyUserCanClickSchools_OrganizationsPageLink() throws Exception
	{
		Thread.sleep(4000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(4000);
		schools_OrganizationsPage = contactUsPage.validateClickOnSchools_OrganizationsLink();
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/organization", "URL does not matched");
		
		
//		<--- Validating BeamSity for Organizations context is display and running two layers of assertion ---->
		String pageNamelabel = contactUsPage.validateCorrectSchools_OrganizationsPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "BeamSity for Organizations", "Text displayed does not matched");
		
		
		boolean text = driver.getPageSource().contains("BeamSity for Organizations");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 2)
	public void verifyUserCanClickOnTeachOnBeamsitykLink() throws Exception
	{
		Thread.sleep(4000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(4000);
		techOnBeamsityPage = contactUsPage.validateClickOnTechOnBeamsityLink();
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/become_a_tutor", "URL does not matched");
		
	//	<--- Validating Make an Impact context is display and running two layers of assertion ---->
		
		String pageNamelabel = contactUsPage.validateCorrectTeachOnBeamsityPageName();
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
		Thread.sleep(4000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		
//	<-----	Assertion on contact us url ------>
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/contactus", "URL does not matched");
		
//	<----- Validating Contact Us! text is display and running two layers of assertion ---->
		
		String pageNamelabel1 = contactUsPage.validateCorrectContactUsPageName();
		System.out.println(pageNamelabel1);
		Assert.assertEquals(pageNamelabel1, "Contact Us!", "Text displayed does not matched");
		
		
		String pageNamelabel2 = contactUsPage.validateCorrectContactUsFooterName();
		System.out.println(pageNamelabel2);
		Assert.assertEquals(pageNamelabel2, "CONTACT US", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("Contact Us!");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 4)
	public void verifyUserCanClickOnLoginLink() throws Exception
	{
		Thread.sleep(4000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(4000);
		loginPage = contactUsPage.validateClickOnLoginLink();
		
//      <---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://portal.beamsity.com/", "URL does not matched");
		
		
//		<--- Validating login text is display and running two layers of assertion ---->
		
		
		String pageNamelabel = contactUsPage.validateCorrectLoginPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Log In", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("Log In");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 5)
	public void verifyUserCanclickOnPartnerWithUsLink() throws Exception
	{
		Thread.sleep(5000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(4000);
		partnerWithUsPage = contactUsPage.validatePartnerWithUsLink();
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/sponsor");
		
//		<--- Validating partner with us text is display and running 2 layers of assertion ---->
		
		String pageNamelabel = contactUsPage.validateCorrectPartnerWithUsPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Partner with us today", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("Partner with us today");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 6)
	public void verifyOfficeAddressIsDisplayed() throws Exception
	{
		Thread.sleep(5000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(4000);
		
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/sponsor");
		
//		<--- Validating partner with us text is display and running 2 layers of assertion ---->
		
		String pageNamelabel = contactUsPage.validateCorrectPartnerWithUsPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Partner with us today", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("Partner with us today");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	
	
	


//	<----------------- ContactUsPage body ---------------->
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 7)
	public void verifyUserIsOfficePhoneNumberisDisplayed() throws Exception
	{
		Thread.sleep(4000); 
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(3000); 
		
//		<--- Validating office phone number is displayed and and running a layer of assertion ----> 
		String phoneNumberLabel = contactUsPage.validateCorrectContactOfficePhoneNumber();
		Assert.assertEquals(phoneNumberLabel, "+234(0)8032036876");
		System.out.println(phoneNumberLabel);

		
//		<--- Validating office address text is display on the footer and running a layer of assertion ---->
		boolean text = driver.getPageSource().contains("+234(0)8032036876");
		Assert.assertTrue(text);
		System.out.println(text);
	}
	
	
	
	
	

	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 8)
	public void verifyUserCanClickOnAboutUsLink() throws Exception
	{
		Thread.sleep(5000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(3000);
		aboutUsPage = contactUsPage.validateClickOnAboutUsLink();
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/about_us", "URL does not matched");
		
//		<--- Validating Make an Impact context is display and running two layers of assertion ---->	
		
		String pageNamelabel = contactUsPage.validateCorrectAboutUsFooterName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "About Us", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("About Us");
		System.out.println(text);
		Assert.assertTrue(text);	
	}
	


	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 9)
	public void verifyUserCanClickOnPrivacyPolicyLink() throws Exception
	{
		Thread.sleep(4000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(3000);
		privacy_PolicyPage = contactUsPage.validateClickOnPrivacyPolicyLink();
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/privacy_policy", "URL does not matched");
		
//		<--- Validating Make an Impact context is display and running two layers of assertion ---->
		
		String pageNamelabel = contactUsPage.validateCorrectPrivacyPolicyFooterName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Privacy Policy", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("Privacy Policy");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	

	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 10)
	public void verifyUserIsRedirectedToGoogleMapNavigation_ClickOnContactAddressLink() throws Exception
	{
		Thread.sleep(4000); 
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(4000); 
		contactUsPage = contactUsPage.validateClickOnContactUsOfficeAddress();
		
		
//		<--- Validating office address text is display on the footer and running a layer of assertion ---->
		boolean text = driver.getPageSource().contains("50, Awolowo Road Ikoyi lagos, Nigeria.");
		Assert.assertTrue(text);
		System.out.println(text);

		
//		<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

//		Navigate to google map tab
		driver.switchTo().window(tabs2.get(2));
	
		
//		<--- Validating office address text is display on google map and running a layer of assertion ---->
		String footerNamelabel = contactUsPage.validateCorrectGoogleMapContactUsOfficeAddress();
		System.out.println(footerNamelabel);
		Assert.assertEquals(footerNamelabel, "50 Awolowo Rd, Ikoyi 106104, Lagos", " The address displayed does not matched");
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 11)
	public void verifyUserCanSignUpToMailingList() throws Exception
	{
		Thread.sleep(5000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(5000);
		contactUsPage = contactUsPage.validateSignUpToMailingList(prop.getProperty("userEmail"));
		
//		<--- Validating SignUp To Mailing List success and running two layers of assertion ---->
		Thread.sleep(3000);
		String successPrompt = contactUsPage.validateSignUpToMailingListSuccessPrompt();
		Assert.assertEquals(successPrompt, "Success.", "Text displayed does not matched");
		System.out.println(successPrompt);
			 
			
		boolean successPromptText = driver.getPageSource().contains("Success.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(successPromptText);
		System.out.println(successPromptText);
	}

	
	
	
	
	
	
	 
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 12)
	public void verifyUserCannotSignUpToMailingListWithEmail_WithOutDotCom() throws Exception
	{
		Thread.sleep(5000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(5000);
		contactUsPage = contactUsPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOutDotCom"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List success and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = contactUsPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		Assert.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
		System.out.println(invalidEmailErrorPrompt);

			
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
		System.out.println(InvalidEmailErrorPrompt);
	}

	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 13)
	public void verifyUserCannotSignUpToMailingListWithEmail_WithoutATgmail() throws Exception
	{
		Thread.sleep(5000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(5000);
		contactUsPage = contactUsPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOut@gmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = contactUsPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		Assert.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
		System.out.println(invalidEmailErrorPrompt);
			 
		boolean inValidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(inValidEmailErrorPrompt);
		System.out.println(inValidEmailErrorPrompt);
	}
	
	
	
	

	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 14)
	public void verifyUserCannotSignUpToMailingListWith_PhoneNumber() throws Exception
	{
		Thread.sleep(5000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(5000);
		contactUsPage = contactUsPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("signUpWithPhoneNo"));
	
//	<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = contactUsPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
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
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(5000);
		contactUsPage = contactUsPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("userEmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List Success prompt and running two layers of assertion ---->
		
		String signUpMailingListSuccessPrompt = contactUsPage.validateSignUpToMailingListSuccessPrompt();
		Assert.assertEquals(signUpMailingListSuccessPrompt, "Success.", "Text displayed does not matched");
		System.out.println(signUpMailingListSuccessPrompt);
		
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("Success.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
		System.out.println(InvalidEmailErrorPrompt);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 16)
	public void verify_InvalidEmailAddress_IsPromptedWhenUserAttemptedToSignUpToMailingListWithInvalidEmail() throws Exception
	{
		Thread.sleep(5000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(5000);
		contactUsPage = contactUsPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOut@gmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = contactUsPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		Assert.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
		System.out.println(invalidEmailErrorPrompt);

		
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
		System.out.println(InvalidEmailErrorPrompt);
	}
	

	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 17)
	public void verifyUserCanClickOnGooglePlayLink() throws Exception
	{
		Thread.sleep(4000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(3000);
		contactUsPage = contactUsPage.validateClickOnGooglePlayLlink();
		
//	<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

//	<----  Navigate to New Tab ---->
		driver.switchTo().window(tabs2.get(1));
		
		
//		<--- Validating Google play button and running three layers of assertion ---->
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://play.google.com/store/apps/details?id=com.fbistech.beamsity", "URL does not matched");
		
		
		
		String pageNamelabel = contactUsPage.validateCorrectGooglePlayPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "BeamSity", " Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("BeamSity");
		System.out.println(text);
		Assert.assertTrue(text);	
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 18)
	public void verifyUserCanInstallBeamsityApp() throws Exception
	{
		Thread.sleep(5000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(5000);
		contactUsPage = contactUsPage.validateUserInstallBeamsityApp();
		
//		<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

//		<----  Navigate to New Tab ---->
		driver.switchTo().window(tabs2.get(1));
				
//		<---- Validating Google play button and running three layers of assertion ---->
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://play.google.com/store/apps/details?id=com.fbistech.beamsity", "The URL does not matched");
		System.out.println(url);

		
		String footerNameLabel = contactUsPage.validateCorrectGooglePlayPageName();
		Assert.assertEquals(footerNameLabel, "BeamSity", "Text displayed does not matched");
		System.out.println(footerNameLabel);
 
			
		boolean pageNamelText = driver.getPageSource().contains("BeamSity");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);	
		System.out.println(pageNamelText);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 19)
	public void verifyUserCanClickOnContactUsEmail() throws Exception
	{
		Thread.sleep(3000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		Thread.sleep(3000);
		contactUsPage = contactUsPage.validateClickOnContactEmail();
		
		
////		<---  Create Array List to keep Tab information ---->
//		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//
////	<----  Navigate to New Tab ---->
//		driver.switchTo().window(tabs2.get(1));
//		
	
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		Assert.assertEquals(url, "https://mail.google.com/mail/u/0/?fs=1&tf=cm&source=mailto&to=info@beamsity.com", "URL does not matched");
		
		
		String pageNamelabel = contactUsPage.validateCorrectEmailAddressName();
		Assert.assertEquals(pageNamelabel, "info@beamsity.com", " Email Address displayed does not matched");
		System.out.println(pageNamelabel);
		
		boolean text = driver.getPageSource().contains("info@beamsity.com");
		Assert.assertTrue(text);	
		System.out.println(text);
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
		Thread.sleep(6000);
		driver.quit(); 
	}
}
