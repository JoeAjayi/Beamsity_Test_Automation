package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.ArrayList;

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

public class Privacy_PolicyPageTest extends TestBase {
	
	

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
	public Privacy_PolicyPageTest()
	{
		super();
	}
	
	
	
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization(); 
		
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
	public void verifyUserCanNavigateToTermsAndConditionsPage() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(2000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(2000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
        
        
       
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/privacy_policy/", "URL does not matched");
		
		
//		<--- Validating BeamSity for Organizations context is display and running two layers of assertion ---->
		
		String pageNamelabel = privacy_PolicyPage.validateCorrectPrivacyPolicyPageNameLabel();
		Assert.assertEquals(pageNamelabel, "Privacy Policy", "Text displayed does not matched");
		System.out.println(pageNamelabel);

		boolean text = driver.getPageSource().contains("Privacy Policy");
		Assert.assertTrue(text);
		System.out.println(text);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 2)
	public void verifyUserCanClickSchools_OrganizationsPageLink() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(3000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
		
		
		Thread.sleep(4000);
		privacy_PolicyPage = privacy_PolicyPage.validateClickOnSchools_OrganizationsLink();
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/organization", "URL does not matched");
		
	//	<--- Validating Make an Impact context is display and running two layers of assertion ---->
		
		String pageNamelabel = privacy_PolicyPage.validateCorrectSchools_OrganizationsPageName();
		Assert.assertEquals(pageNamelabel, "BeamSity for Organizations", "Text displayed does not matched");
		System.out.println(pageNamelabel);

		
		boolean text = driver.getPageSource().contains("BeamSity for Organizations");
		Assert.assertTrue(text);
		System.out.println(text);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 3)
	public void verifyUserCanClickOnTeachOnBeamsitykLink() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(3000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
		
		Thread.sleep(4000);
		privacy_PolicyPage = privacy_PolicyPage.validateClickOnTechOnBeamsityLink();
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/become_a_tutor", "URL does not matched");
		
	//	<--- Validating Make an Impact context is display and running two layers of assertion ---->
		
		String pageNamelabel = privacy_PolicyPage.validateCorrectTeachOnBeamsityPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Make an Impact", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("Make an Impact");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority = 4)
	public void verifyUserCanClickOnContactUsLink() throws Exception
	{	
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(3000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
		Thread.sleep(4000);
		privacy_PolicyPage = privacy_PolicyPage.validateClickOnContactUsLinkOnNavBar();
		
//	<-----	Assertion on contact us url ------>
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/contactus", "URL does not matched");
		
//	<----- Validating Contact Us! text is display and running two layers of assertion ---->
		
		String pageNameLabel1 = privacy_PolicyPage.validateCorrectContactUsPageName();
		System.out.println(pageNameLabel1);
		Assert.assertEquals(pageNameLabel1, "Contact Us!", "Text displayed does not matched");
		
		
		String pageNameLabel2 = privacy_PolicyPage.validateCorrectContactUsFooterName();
		System.out.println(pageNameLabel2);
		Assert.assertEquals(pageNameLabel2, "CONTACT US", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("Contact Us!");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 5)
	public void verifyUserCanClickOnLoginLink() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
		
		Thread.sleep(4000);
		privacy_PolicyPage = privacy_PolicyPage.validateClickOnLoginLink();
		
		Thread.sleep(4000);		
//      <---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(3));
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://portal.beamsity.com/", "URL does not matched");
		
		
//		<--- Validating login text is display and running two layers of assertion ---->
		
		
		String pageNamelabel = privacy_PolicyPage.validateCorrectLoginPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Log In", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("Log In");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 6)
	public void verifyUserCanClickOnPartnerWithUsLink() throws Exception
	{
		Thread.sleep(2000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
		
		Thread.sleep(4000);
		privacy_PolicyPage = privacy_PolicyPage.validateClickOnPartnerWithUsLink();
				
		

	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/sponsor");
		
//		<--- Validating partner with us text is display and running 2 layers of assertion ---->
		
		String pageNamelabel = privacy_PolicyPage.validateCorrectPartnerWithUsPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Partner with us today", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("Partner with us today");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	
	
	

	
	
	
	

	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 7)
	public void verifyUserCanClickOnAboutUsLink() throws Exception
	{
		Thread.sleep(2000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
	
		Thread.sleep(3000);
		privacy_PolicyPage = privacy_PolicyPage.validateClickOnAboutUsLink();
		
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://beamsity.com/about_us", "URL does not matched");
		System.out.println(url);
	
//		<--- Validating Make an Impact context is display and running two layers of assertion ---->	
		
		String footerNameLabel = privacy_PolicyPage.validateCorrectAboutUsFooterName();
		System.out.println(footerNameLabel);
		Assert.assertEquals(footerNameLabel, "About Us", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("About Us");
		Assert.assertTrue(text);
		System.out.println(text);
	}
	


	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 8)
	public void verifyUserCanClickOnPrivacyPolicyLink() throws Exception
	{
		Thread.sleep(2000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
		
		
		Thread.sleep(3000);
		privacy_PolicyPage = privacy_PolicyPage.validateClickOnPrivacyPolicyLink();
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/privacy_policy", "URL does not matched");
		
//		<--- Validating Make an Impact context is display and running two layers of assertion ---->
		
		String footerNameLabel = privacy_PolicyPage.validateCorrectPrivacyPolicyFooterName();
		Assert.assertEquals(footerNameLabel, "Privacy Policy", "Text displayed does not matched");
		System.out.println(footerNameLabel);

		
		boolean text = driver.getPageSource().contains("Privacy Policy");
		Assert.assertTrue(text);
		System.out.println(text);
	}
	

	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 9)
	public void verifyUserIsRedirectedToGoogleMapNavigation_ClickOnContactAddressLink() throws Exception
	{
		Thread.sleep(2000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
		
	
		Thread.sleep(4000); 
		privacy_PolicyPage = privacy_PolicyPage.validateClickOnContactUsOfficeAddress();
		
		
//		<--- Validating office address text is display on google map and running a layer of assertion ---->
		String footerNamelabel = privacy_PolicyPage.validateCorrectGoogleMapContactUsOfficeAddress();
		System.out.println(footerNamelabel);
		Assert.assertEquals(footerNamelabel, "50 Awolowo Rd, Ikoyi 106104, Lagos", " The address displayed does not matched");
		
		
//		<--- Validating office address text is display on the footer and running a layer of assertion ---->
		boolean text = driver.getPageSource().contains("50 Awolowo Rd, Ikoyi 106104, Lagos");
		Assert.assertTrue(text);
		System.out.println(text);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 10)
	public void verifyUserCanSignUpToMailingList() throws Exception
	{
		Thread.sleep(2000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
		
		Thread.sleep(5000);
		privacy_PolicyPage = privacy_PolicyPage.validateSignUpToMailingList(prop.getProperty("userEmail"));
		
//		<--- Validating SignUp To Mailing List success and running two layers of assertion ---->
		Thread.sleep(3000);
		String successPrompt = contactUsPage.validateSignUpToMailingListSuccessPrompt();
		Assert.assertEquals(successPrompt, "Success.", "Text displayed does not matched");
		System.out.println(successPrompt);
			 
			
		boolean successPromptText = driver.getPageSource().contains("Success.");
		Assert.assertEquals(successPromptText, true);
//		Assert.assertTrue(successPromptText);
		System.out.println(successPromptText);
	}

	
	
	
	
	
	
	 
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 11)
	public void verifyUserCannotSignUpToMailingListWithEmail_WithOutEmailDomeNameExtension () throws Exception
	{
		Thread.sleep(2000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
		 
		Thread.sleep(5000);
        privacy_PolicyPage = privacy_PolicyPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithoutDomeNameExtension"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List success and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = privacy_PolicyPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		Assert.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
		System.out.println(invalidEmailErrorPrompt);

			
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
		System.out.println(InvalidEmailErrorPrompt);
	}

	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 12)
	public void verifyUserCannotSignUpToMailingListWithEmail_emailWithoutServerHostName() throws Exception
	{
		Thread.sleep(2000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
		
		
		Thread.sleep(5000);
//		Sign up to mailing list with email without gmail
		privacy_PolicyPage = privacy_PolicyPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithoutServerHostName"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = privacy_PolicyPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		Assert.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
		System.out.println(invalidEmailErrorPrompt);
			 
		boolean inValidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(inValidEmailErrorPrompt);
		System.out.println(inValidEmailErrorPrompt);
	}
	
	
	
	

	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 13)
	public void verifyUserCannotSignUpToMailingListWith_PhoneNumber() throws Exception
	{
		Thread.sleep(2000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
		
		
		Thread.sleep(5000);
		privacy_PolicyPage = privacy_PolicyPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("signUpWithPhoneNo"));
	
//	<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = privacy_PolicyPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		System.out.println(invalidEmailErrorPrompt);
		Assert.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
	}
	
	
	
	

	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 14)
	public void verify_SUCCESS_IsPromptedWhenUserSuccessfullySignUpToMailingListWithValidEmail() throws Exception
	{
		Thread.sleep(2000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
		
		Thread.sleep(5000);
		privacy_PolicyPage = privacy_PolicyPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("userEmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List Success prompt and running two layers of assertion ---->
		
		String signUpMailingListSuccessPrompt = privacy_PolicyPage.validateSignUpToMailingListSuccessPrompt();
		Assert.assertEquals(signUpMailingListSuccessPrompt, "Success.", "Text displayed does not matched");
		System.out.println(signUpMailingListSuccessPrompt);
		
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("Success.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
		System.out.println(InvalidEmailErrorPrompt);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 15)
	public void verify_InvalidEmailAddress_IsPromptedWhenUserAttemptedToSignUpToMailingListWithInvalidEmail() throws Exception
	{
		Thread.sleep(2000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
		
		
		Thread.sleep(5000);
		privacy_PolicyPage = privacy_PolicyPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOut@gmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = privacy_PolicyPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		Assert.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
		System.out.println(invalidEmailErrorPrompt);

		
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
		System.out.println(InvalidEmailErrorPrompt);
	}
	

	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 16)
	public void verifyUserCanClickOnGooglePlayLink() throws Exception
	{
		Thread.sleep(2000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
	
		
		
		Thread.sleep(3000);
		privacy_PolicyPage = privacy_PolicyPage.validateClickOnGooglePlayLlink();
		
//	<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());

//	<----  Navigate to New Tab ---->
		driver.switchTo().window(tabs4.get(3));
		
		
//		<--- Validating Google play button and running three layers of assertion ---->
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://play.google.com/store/apps/details?id=com.fbistech.beamsity", "URL does not matched");
		System.out.println(url);

		
		
		String pageNamelabel = privacy_PolicyPage.validateCorrectGooglePlayPageName();
		Assert.assertEquals(pageNamelabel, "BeamSity", " Text displayed does not matched");
		System.out.println(pageNamelabel);

		
		boolean text = driver.getPageSource().contains("BeamSity");
		Assert.assertTrue(text);	
		System.out.println(text); 
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 17)
	public void verifyUserCanInstallBeamsityApp() throws Exception
	{
		Thread.sleep(2000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
	
		
		
		Thread.sleep(3000);
		privacy_PolicyPage = privacy_PolicyPage.validateClickOnGooglePlayLlink();
		
		ArrayList<String> tabs4 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs4.get(3));
	
		

		Thread.sleep(5000);
		privacy_PolicyPage = privacy_PolicyPage.validateUserInstallBeamsityApp();
		
				
//		<---- Validating Google play button and running three layers of assertion ---->
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://play.google.com/store/apps/details?id=com.fbistech.beamsity", "The URL does not matched");
		System.out.println(url);

		
		String footerNameLabel = privacy_PolicyPage.validateCorrectGooglePlayPageName();
		Assert.assertEquals(footerNameLabel, "BeamSity", "Text displayed does not matched");
		System.out.println(footerNameLabel);
 
			
		boolean pageNamelText = driver.getPageSource().contains("BeamSity");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);	
		System.out.println(pageNamelText);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 18)
	public void verifyUserCanClickOnContactUsEmail() throws Exception
	{
		Thread.sleep(2000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab2.get(1));
         
        Thread.sleep(4000);    		
        privacy_PolicyPage = privacy_PolicyPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tab3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tab3.get(2));
	
        
		Thread.sleep(3000);
		privacy_PolicyPage = privacy_PolicyPage.validateClickOnContactEmail();
		
		
//		<---  Create Array List to keep Tab information ---->
		ArrayList<String> tab4 = new ArrayList<String>(driver.getWindowHandles());

//	<----  Navigate to New Tab ---->
		driver.switchTo().window(tab4.get(3));
//		
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://mail.google.com/mail/u/0/?fs=1&tf=cm&source=mailto&to=info@beamsity.com", "URL does not matched");
		
		
		String pageNameLabel = privacy_PolicyPage.validateCorrectEmailAddressName();
		System.out.println(pageNameLabel);
		Assert.assertEquals(pageNameLabel, "info@beamsity.com", " Email Address displayed does not matched");
		
		boolean text = driver.getPageSource().contains("info@beamsity.com");
		System.out.println(text);
		Assert.assertTrue(text);	
	}
//	
	
	
	
	
	

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
