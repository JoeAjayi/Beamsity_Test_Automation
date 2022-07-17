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
import com.fbistech.pages.CompanyPage;
import com.fbistech.pages.ContactUsPage;
import com.fbistech.pages.CoursesPage;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.LoginPage;
import com.fbistech.pages.PartnerWithUsPage;
import com.fbistech.pages.PortalDashboardPage;
import com.fbistech.pages.Privacy_PolicyPage;
import com.fbistech.pages.Schools_OrganizationsPage;
import com.fbistech.pages.Sponsors_OrganizationPage;
import com.fbistech.pages.SubscribePage;
import com.fbistech.pages.TechOnBeamsityPage;
import com.fbistech.util.JiraPolicy;
import com.fbistech.util.TestUtil;

public class HomePageTest extends TestBase {
	
	
//	reference variables of java classes 
	HomePage homePage;
	Schools_OrganizationsPage schools_OrganizationsPage;
	TechOnBeamsityPage techOnBeamsityPage;
	ContactUsPage contactUsPage;
	LoginPage loginPage;
	PartnerWithUsPage partnerWithUsPage;
	CoursesPage coursesPage;
	SubscribePage subscribePage;
	Sponsors_OrganizationPage sponsors_OrganizationPage;
	CompanyPage companyPage;
	PortalDashboardPage portalDashboardPage;
	AboutUsPage aboutUsPage;
	Privacy_PolicyPage privacy_PolicyPage;
	 
	TestUtil testUtil; // class object 
	
	
//	This constructor, with super key word will call the TestBase class constructor 
	public HomePageTest()   
	{
		super();
	}
	
	 
	

	@BeforeMethod
	public void setUp() throws Exception
	{  
		initialization_WebBrowser();
//		Below are objects of every java class to be initialize
		homePage = new HomePage();
		schools_OrganizationsPage = new Schools_OrganizationsPage();
		techOnBeamsityPage = new TechOnBeamsityPage();
		contactUsPage = new ContactUsPage();
		loginPage = new LoginPage();
		partnerWithUsPage = new PartnerWithUsPage();
		coursesPage = new CoursesPage();
		subscribePage = new SubscribePage();
		sponsors_OrganizationPage = new Sponsors_OrganizationPage();
		companyPage = new CompanyPage();
		partnerWithUsPage = new PartnerWithUsPage();
		aboutUsPage = new AboutUsPage();
		privacy_PolicyPage = new  Privacy_PolicyPage();
		testUtil = new TestUtil(); // Initialize // testUtil = object reference 

//		homePage = signInPage.loginDetails(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	 
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 1)
	public void verifyHomePageTitle()
	{
		String homePageTitle = homePage.validateHomePageTitle(); 
		Assert.assertEquals(homePageTitle, "Beamsity"); //(Actual, expected)
		System.out.println(homePageTitle);
	}
	

	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 2)
	public void verifyBeamsityLogo()
	{
		boolean logo = homePage.validateBeamsityLogo();
		Assert.assertTrue(logo);
	}
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 3)
	public void verifyUserCanClickOnSchools_OrganizationsLinkLink() throws Exception
	{
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		
		
//		<--- Validating BeamSity for Organizations context is display and running three layers of assertion ---->
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://beamsity.com/organization", "URL enterred does not matched");
		System.out.println(url);
		
		String pageNamelabel = homePage.validateCorrectSchools_OrganizationsPageName();
		Assert.assertEquals(pageNamelabel, "BeamSity for Organizations", "Text displayed does not matched");
		System.out.println(pageNamelabel);
		
		boolean text = driver.getPageSource().contains("BeamSity for Organizations");
		Assert.assertTrue(text);
		System.out.println(text);
	}
	

	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 4)
	public void verifyUserCanClickOnTeachOnBeamsitykLink() throws Exception
	{
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
	
//      <---- Validating Make an Impact context is display and running three layers of assertion ---->
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://beamsity.com/become_a_tutor", "URL does not matched");
		System.out.println(url);

		String pageNamelabel = homePage.validateCorrectTeachOnBeamsityPageName();
		Assert.assertEquals(pageNamelabel, "Make an Impact", "Text displayed does not matched");
		System.out.println(pageNamelabel);
		
		boolean text = driver.getPageSource().contains("Make an Impact");
		Assert.assertTrue(text);
		System.out.println(text);
	}

	
	


	@JiraPolicy(logTicketReady=true)
//	@Test(priority = 5)
	public void verifyUserCanClickOnContactUsLinks() throws Exception
	{
		contactUsPage = homePage.validateClickOnContactUsLinks();
		
//	    <-----	Assertion on contact us url ------>
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://beamsity.com/contactus", "URL does not matched");
		System.out.println(url);
	
//		<----- Validating Contact Us! text is display and running two layers of assertion ---->
		String pageNamelabel = homePage.validateCorrectContactUsPageName();
		Assert.assertEquals(pageNamelabel, "Contact Us!", "Page name label displayed does not matched");
		System.out.println(pageNamelabel);
		
		
		String footerNamelabel = homePage.validateCorrectContactUsFooterName();
		Assert.assertEquals(footerNamelabel, "CONTACT US", "Footer name label displayed does not matched");
		System.out.println(footerNamelabel);
		
		boolean pageNamelText = driver.getPageSource().contains("Contact Us!");
		Assert.assertTrue(pageNamelText);
		System.out.println(pageNamelText);
	}
	
	
	
	 
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 6)
	public void verifyUserCanClickOnLoginLink() throws Exception
	{   
		loginPage = homePage.validateClickOnLoginLink();
		
//      <---  Create Array List to keep Tab information ---->
		Thread.sleep(2000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
        
//      <--- Validating login URL and running a layer of assertion url ---->
        String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://portal.beamsity.com/", "URL displayed does not matched");
		
//		<--- Validating login text is display and running two layer of assertion ---->
		String pageNamelabel = homePage.validateCorrectLoginPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Log In", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Log In");
		System.out.println(pageNamelText);
		Assert.assertTrue(pageNamelText);
	}
	
	
	
	
	

	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 7)
	public void verifyUserCanclickOnPartnerWithUsLink()
	{
		partnerWithUsPage = homePage.validateClickOnPartnerWithUsLink();
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/sponsor", "The URL does not matched");
		
//		<--- Validating partner with us text is display and running 2 layers of assertion ---->
		String pageNameLabel = homePage.validateCorrectPartnerWithUsPageName();
		System.out.println(pageNameLabel);
		Assert.assertEquals(pageNameLabel, "Partner with us today", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Partner with us today");
		System.out.println(pageNamelText);
		Assert.assertTrue(pageNamelText);
	}

	
	


	

	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 8)
	public void verifyUserIsRedirectedToHomePageOnClickBeamsityLogoFromSchoolsOrganizationsPage() throws Exception
	{
		Thread.sleep(4000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://beamsity.com/organization", "URL does not matched");
		System.out.println(url);
		
		String pageNamelabel = homePage.validateCorrectSchools_OrganizationsPageName();
		Assert.assertEquals(pageNamelabel, "BeamSity for Organizations", "Text displayed does not matched");
		System.out.println(pageNamelabel);
		
		Thread.sleep(5000);
		homePage = schools_OrganizationsPage.validateClickOnBeamsityLogo();
		
		
		String sch_orgUrl = driver.getCurrentUrl();
		Assert.assertEquals(sch_orgUrl, "https://beamsity.com/", "URL does not matched");
		System.out.println(sch_orgUrl);
		
		boolean text = driver.getPageSource().contains("Beamsity");
		Assert.assertTrue(text);	
		System.out.println(text);
	}
	 


	
	


	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 9)
	public void verifyUserIsRedirectedToHomePageOnClickBeamsityLogoFromTechOnBeamsityPage() throws Exception
	{
		Thread.sleep(4000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		
		String techPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(techPageUrl, "https://beamsity.com/become_a_tutor", "URL does not matched");
		System.out.println(techPageUrl);
		
		String pageNamelabel = homePage.validateCorrectTeachOnBeamsityPageName();
		Assert.assertEquals(pageNamelabel, "Make an Impact", "Text displayed does not matched");
		System.out.println(pageNamelabel);
		
		Thread.sleep(5000);
		homePage = techOnBeamsityPage.validateClickOnBeamsityLogo();
		
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "https://beamsity.com/", "URL does not matched");
		System.out.println(homePageUrl);
		
		boolean text = driver.getPageSource().contains("Beamsity");
		Assert.assertTrue(text);
		System.out.println(text);
	}
	 
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 10)
	public void verifyUserIsRedirectedToHomePageOnClickBeamsityLogoFromContactUsPage() throws Exception
	{
		Thread.sleep(4000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		
		String contPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(contPageUrl, "https://beamsity.com/contactus", "URL displayed does not matched");
		System.out.println(contPageUrl);
		
		String pageNamelabel = homePage.validateCorrectContactUsPageName();
		Assert.assertEquals(pageNamelabel, "Contact Us!", "Text displayed does not matched");
		System.out.println(pageNamelabel);
		
		Thread.sleep(5000);
		homePage = contactUsPage.validateClickOnBeamsityLogo();
		
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "https://beamsity.com/", "URL does not matched");
		System.out.println(homePageUrl);
		
		boolean text = driver.getPageSource().contains("Beamsity");
		Assert.assertTrue(text);
		System.out.println(text);
	}
 
 

	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 11)
	public void verifyUserIsRedirectedToHomePageOnClickBeamsityLogoFromPartnerWithUsPage() throws Exception
	{
		Thread.sleep(4000);
		partnerWithUsPage = homePage.validateClickOnPartnerWithUsLink();
		
		String partPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(partPageUrl, "https://beamsity.com/sponsor", "The URL does not matched");
		System.out.println(partPageUrl);
		
//		<--- Validating partner with us text is display and running 2 layers of assertion ---->
		String pageNameLabel = homePage.validateCorrectPartnerWithUsPageName();
		Assert.assertEquals(pageNameLabel, "Partner with us today", "Text displayed does not matched");
		System.out.println(pageNameLabel);
		
		Thread.sleep(5000);
		homePage = partnerWithUsPage.validateClickOnBeamsityLogo();
		
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "https://beamsity.com/", "URL does not matched");
		System.out.println(homePageUrl);
		
		boolean text = driver.getPageSource().contains("Beamsity");
		Assert.assertTrue(text);
		System.out.println(text);
	}


	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 12)
	public void verifyUserCanClickOnGetStartedLink() throws Exception
	{
		partnerWithUsPage = homePage.validateClickOnGetStartedLinks();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://beamsity.com/sponsor", "The URL does not matched");
		System.out.println(url);
		
//		<--- Validating get started with sponsors page! text is display and running two layers of assertion ---->
		String pageNameLabel = homePage.validateCorrectPartnerWithUsPageName();
		Assert.assertEquals(pageNameLabel, "Partner with us today", "Text displayed does not matched");
		System.out.println(pageNameLabel);
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Partner with us today");
		System.out.println(pageNamelText);
		Assert.assertTrue(pageNamelText);
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 13)
	public void verifyUserCanClickOnLearnMoreLink() throws Exception
	{
		techOnBeamsityPage = homePage.validateClickOnLearnMoreLink();

		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://beamsity.com/become_a_tutor", "The URL does not matched");
		System.out.println(url);
			
	//	<--- Validating Make an Impact context is display and running two layers of assertion ---->
		String pageNameLabel = homePage.validateCorrectTeachOnBeamsityPageName();
		Assert.assertEquals(pageNameLabel, "Make an Impact", "Text displayed does not matched");
		System.out.println(pageNameLabel);
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Make an Impact");
		Assert.assertTrue(pageNamelText);			
		System.out.println(pageNamelText);

	}


	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 14)
	public void verifyUserIsRedirectedToHomePageOnClickBeamsityLogoFromAboutUsPage() throws Exception
	{ 
		Thread.sleep(3000);
		aboutUsPage = homePage.validateClickOnAboutUsLink();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://beamsity.com/about_us", "URL displayed does not matched");
		System.out.println(url);

		
		String pageNamelabel = aboutUsPage.validateCorrectAboutUsPageName();
		Assert.assertEquals(pageNamelabel, "About Us", "Text displayed does not matched");
		System.out.println(pageNamelabel);
		
		
		Thread.sleep(3000);
		homePage = aboutUsPage.validateClickOnBeamsityLogo();
		
		String homePgUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePgUrl, "https://beamsity.com/", "URL does not matched");
		System.out.println(homePgUrl);
		
		boolean text = driver.getPageSource().contains("Beamsity");
		Assert.assertTrue(text);
		System.out.println(text);

	}
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 15)
	public void verifyUserIsRedirectedToHomePageOnClickBeamsityLogoFromPrivatePolicyPage() throws Exception
	{
		Thread.sleep(3000);
		privacy_PolicyPage = homePage.validateClickOnPrivacyPolicyLink();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://beamsity.com/privacy_policy", "URL displayed does not matched");
		System.out.println(url);
			
		String pageNamelabel = privacy_PolicyPage.validateCorrectPrivacy_PolicyPageName();
		Assert.assertEquals(pageNamelabel, "Privacy Policy", "Text displayed does not matched");
		System.out.println(pageNamelabel);
		
		
		Thread.sleep(3000);
		homePage = privacy_PolicyPage.validateClickOnBeamsityLogo();
		
		String homePgUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePgUrl, "https://beamsity.com/", "URL does not matched");
		System.out.println(homePgUrl);
		
		boolean text = driver.getPageSource().contains("Beamsity");
		Assert.assertTrue(text);
		System.out.println(text);
	}
	
	
	
	
	
	
	
		
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 16)
	public void verifyUserCanClickOnAboutUsLink() throws Exception
	{
		aboutUsPage = homePage.validateClickOnAboutUsLink();
		
		String AbtUsPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(AbtUsPageUrl, "https://beamsity.com/about_us", "The URL does not matched");
		System.out.println(AbtUsPageUrl);
		
//		<--- Validating Make an Impact context is display and running two layers of assertion ---->
		
		String footerNameLabel = homePage.validateCorrectAboutUsPageName();
		Assert.assertEquals(footerNameLabel, "About Us", "Text displayed does not matched");
		System.out.println(footerNameLabel);
		 
		
		boolean pageNamelText = driver.getPageSource().contains("About Us");
//		Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);	
		System.out.println(pageNamelText);
	}
	


	

	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 16)
	public void verifyUserCanClickOnPrivacyPolicyLink() throws Exception
	{
		privacy_PolicyPage = homePage.validateClickOnPrivacyPolicyLink();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://beamsity.com/privacy_policy", "The URL does not matched");
		System.out.println(url);
		
//		<--- Validating Make an Impact context is display and running two layers of assertion ---->
		
		String footerNameLabel = homePage.validateCorrectPrivacyPolicyPageName();
		Assert.assertEquals(footerNameLabel, "Privacy Policy", "Text displayed does not matched");
		System.out.println(footerNameLabel);		 
		
		boolean pageNamelText = driver.getPageSource().contains("Privacy Policy");
//		Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);	
		System.out.println(pageNamelText);

	}
	

	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 18)
	public void verifyUserIsRedirectedToGoogleMapNavigation_ClickOnContactAddressLink() throws Exception
	{
		homePage = homePage.validateClickOnContactUsOfficeAddress();
		
//		<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
	
	    // Navigate to New Tab
	    driver.switchTo().window(tabs2.get(1));
		
	//	<--- Validating login text is display and running a layer of assertion ---->
		
	    String footerNameLabel = homePage.validateCorrectContactUsOfficeAddressFooterName();
		Assert.assertEquals(footerNameLabel, "50 Awolowo Rd, Ikoyi 106104, Lagos", "Text displayed does not matched");
		System.out.println(footerNameLabel);
		 
		
		boolean pageNamelText = driver.getPageSource().contains("50 Awolowo Rd, Ikoyi 106104, Lagos");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);
		System.out.println(pageNamelText);

	}
	
	
	
	

	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 19)
	public void verifyUserCanSignUpToMailingList() throws Exception
	{
		homePage = homePage.validateSignUpToMailingList(prop.getProperty("userEmail"));
		Thread.sleep(2000);
	
	
//		<--- Validating SignUp To Mailing List success and running two layers of assertion ---->
		
		String successPrompt = homePage.validateSignUpToMailingListSuccessPrompt();
		Assert.assertEquals(successPrompt, "Success.", "Text displayed does not matched");
		System.out.println(successPrompt);
			 
			
		boolean successPromptText = driver.getPageSource().contains("Success.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(successPromptText);
		System.out.println(successPromptText);
	}

	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 20)
	public void verifyUserCannotSignUpToMailingListWithEmail_WithOutDotCom() throws Exception
	{
		homePage = homePage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOutDotCom"));
		Thread.sleep(2000);
	
	
//		<--- Validating SignUp To Mailing List success and running two layers of assertion ---->
		
		String signUpMailingListInvalidEmailErrorPrompt = homePage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		Assert.assertEquals(signUpMailingListInvalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
		System.out.println(signUpMailingListInvalidEmailErrorPrompt);
 
			
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
		System.out.println(InvalidEmailErrorPrompt);
	}

	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 21)
	public void verifyUserCannotSignUpToMailingListWithEmail_WithoutATgmail() throws Exception
	{
		homePage = homePage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOut@gmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String signUpMailingListInvalidEmailErrorPrompt = homePage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		Assert.assertEquals(signUpMailingListInvalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
		System.out.println(signUpMailingListInvalidEmailErrorPrompt);

		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
		System.out.println(InvalidEmailErrorPrompt);
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 22)
	public void verifyUserCannotSignUpToMailingListWith_PhoneNumber() throws Exception
	{
		homePage = homePage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("signUpWithPhoneNo"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String signUpMailingListInvalidEmailErrorPrompt = homePage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		AssertJUnit.assertEquals(signUpMailingListInvalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
		System.out.println(signUpMailingListInvalidEmailErrorPrompt);
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
	//	Assert.assertEquals(pageNamelText, true);
		AssertJUnit.assertTrue(InvalidEmailErrorPrompt);
		System.out.println(InvalidEmailErrorPrompt);
	}
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 23)
	public void verify_SUCCESS_IsPromptedWhenUserSuccessfullySignUpToMailingListWithValidEmail() throws Exception
	{
		homePage = homePage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("userEmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List Success prompt and running two layers of assertion ---->
		
		String signUpMailingListSuccessPrompt = homePage.validateSignUpToMailingListSuccessPrompt();
		Assert.assertEquals(signUpMailingListSuccessPrompt, "Success.", "Text displayed does not matched");
		System.out.println(signUpMailingListSuccessPrompt);
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("Success.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
		System.out.println(InvalidEmailErrorPrompt);
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 24)
	public void verify_InvalidEmailAddress_IsPromptedWhenUserAttemptedToSignUpToMailingListWithInvalidEmail() throws Exception
	{
		homePage = homePage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOut@gmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String signUpMailingListInvalidEmailErrorPrompt = homePage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		Assert.assertEquals(signUpMailingListInvalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
		System.out.println(signUpMailingListInvalidEmailErrorPrompt);
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
		System.out.println(InvalidEmailErrorPrompt);
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 25)
	public void verifyUserCanClickOnGooglePlayLink() throws Exception
	{
		homePage = homePage.validateClickOnGooglePlayLlink();
		
//	<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

//	<----  Navigate to New Tab ---->
		driver.switchTo().window(tabs2.get(1));
				
//	<---- Validating Google play button and running three layers of assertion ---->
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://play.google.com/store/apps/details?id=com.fbistech.beamsity", "The URL does not matched");
		System.out.println(url);
		
		
		String footerNameLabel = homePage.validateCorrectGooglePlayPageName();
		Assert.assertEquals(footerNameLabel, "BeamSity", "Text displayed does not matched");
		System.out.println(footerNameLabel);			 
			
		boolean pageNamelText = driver.getPageSource().contains("BeamSity");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);	
		System.out.println(pageNamelText);
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 26)
	public void verifyUserCanInstallBeamsityApp() throws Exception
	{
		homePage = homePage.validateUserInstallBeamsityApp();
		
//	<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

//	<----  Navigate to New Tab ---->
		driver.switchTo().window(tabs2.get(1));
				
//	<---- Validating Google play button and running three layers of assertion ---->
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://play.google.com/store/apps/details?id=com.fbistech.beamsity", "The URL does not matched");
		System.out.println(url);		
		
		String footerNameLabel = homePage.validateCorrectGooglePlayPageName();
		Assert.assertEquals(footerNameLabel, "BeamSity", "Text displayed does not matched");
		System.out.println(footerNameLabel);
		
			
		boolean pageNamelText = driver.getPageSource().contains("BeamSity");
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);	
		System.out.println(pageNamelText);
	}
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 27)
	public void verifyUserCanClickOnContactUsEmail() throws Exception
	{
		homePage = homePage.validateClickOnContactEmail();
		
		
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
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test(priority = 9 )
//	public void verifyUsernameOnHomePageTest() 
//	{
////		testU til.switchToFrame();
//		Assert.assertTrue(homePage.verifyUserNameOnHomePage()); 	 
//	}
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{	
		Thread.sleep(5000);
		driver.quit();
	}

}
