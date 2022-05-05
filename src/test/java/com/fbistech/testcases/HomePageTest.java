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
	
//	This constructor will call TestBase class constructor
	public HomePageTest()   
	{
		super();
	}
	
	 
	

	@BeforeMethod
	public void setUp() throws Exception
	{  
		initialization();
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
	public void verifyHomePageTitleTest()
	{
		String homePageTitle = homePage.validateHomePageTitle(); 
		System.out.println(homePageTitle);
		Assert.assertEquals(homePageTitle, "Beamsity"); //(Actual, expected)	 
	}
	

	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 2)
	public void validateBeamsityLogo()
	{
		boolean flag = homePage.validateBeamsityLogo();
		Assert.assertTrue(flag);
	}
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 3)
	public void verifyUserCanClickOnSchools_OrganizationsLinkLink() throws Exception
	{
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		
		
//		<--- Validating BeamSity for Organizations context is display and running three layers of assertion ---->
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/organization", "URL enterred does not matched");
		
		
		String pageNamelabel = homePage.validateCorrectSchools_OrganizationsPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "BeamSity for Organizations", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("BeamSity for Organizations");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	

	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 4)
	public void verifyUserCanClickOnTeachOnBeamsitykLink() throws Exception
	{
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
	
//      <---- Validating Make an Impact context is display and running three layers of assertion ---->
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/become_a_tutor", "URL does not matched");
		

		String pageNamelabel = homePage.validateCorrectTeachOnBeamsityPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Make an Impact", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("Make an Impact");
		System.out.println(text);
		Assert.assertTrue(text);
	}

	
	
	
	

	@JiraPolicy(logTicketReady=true)
	@Test(priority = 5)
	public void verifyUserCanClickOnContactUsLinks() throws Exception
	{
		contactUsPage = homePage.validateClickOnContactUsLinks();
		
//	    <-----	Assertion on contact us url ------>
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/contactus", "URL does not matched");
		
	
//		<----- Validating Contact Us! text is display and running two layers of assertion ---->
		String pageNamelabel = homePage.validateCorrectContactUsPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Contact Us!", "Page name label displayed does not matched");
		
		
		String footerNamelabel = homePage.validateCorrectContactUsFooterName();
		System.out.println(footerNamelabel);
		Assert.assertEquals(footerNamelabel, "CONTACT US", "Footer name label displayed does not matched");
		
		boolean pageNamelText = driver.getPageSource().contains("Contact Us!");
		System.out.println(pageNamelText);
		Assert.assertTrue(pageNamelText);
	}
	
	
	
	 
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 6)
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
	@Test(priority = 7)
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
	@Test(priority = 8)
	public void verifyUserIsRedirectedToHomePageOnClickBeamsityLogoFromSchoolsOrganizationsPage() throws Exception
	{
		Thread.sleep(4000);
		schools_OrganizationsPage = homePage.validateClickOnSchools_OrganizationsLink();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/organization", "URL does not matched");
		
		String pageNamelabel = homePage.validateCorrectSchools_OrganizationsPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "BeamSity for Organizations", "Text displayed does not matched");
		
		
		Thread.sleep(5000);
		homePage = schools_OrganizationsPage.validateClickOnBeamsityLogo();
		
		
		String sch_orgUrl = driver.getCurrentUrl();
		System.out.println(sch_orgUrl);
		Assert.assertEquals(sch_orgUrl, "https://beamsity.com/", "URL does not matched");
		
		boolean text = driver.getPageSource().contains("Beamsity");
		System.out.println(text);
		Assert.assertTrue(text);	
	}
	 


	
	


	@JiraPolicy(logTicketReady = true)
	@Test(priority = 9)
	public void verifyUserIsRedirectedToHomePageOnClickBeamsityLogoFromTechOnBeamsityPage() throws Exception
	{
		Thread.sleep(4000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/become_a_tutor", "URL does not matched");
				
		String pageNamelabel = homePage.validateCorrectTeachOnBeamsityPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Make an Impact", "Text displayed does not matched");
		
		
		Thread.sleep(5000);
		homePage = techOnBeamsityPage.validateClickOnBeamsityLogo();
		
		String sch_orgUrl = driver.getCurrentUrl();
		System.out.println(sch_orgUrl);
		Assert.assertEquals(sch_orgUrl, "https://beamsity.com/", "URL does not matched");
		
		boolean text = driver.getPageSource().contains("Beamsity");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	 
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 10)
	public void verifyUserIsRedirectedToHomePageOnClickBeamsityLogoFromContactUsPage() throws Exception
	{
		Thread.sleep(4000);
		contactUsPage = homePage.validateClickOnContactUsLinkOnNavBar();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/contactus", "URL displayed does not matched");
			
		String pageNamelabel = homePage.validateCorrectContactUsPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Contact Us!", "Text displayed does not matched");
		
		
		Thread.sleep(5000);
		homePage = contactUsPage.validateClickOnBeamsityLogo();
		
		String sch_orgUrl = driver.getCurrentUrl();
		System.out.println(sch_orgUrl);
		Assert.assertEquals(sch_orgUrl, "https://beamsity.com/", "URL does not matched");
		
		boolean text = driver.getPageSource().contains("Beamsity");
		System.out.println(text);
		Assert.assertTrue(text);
	}
 
 

	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 11)
	public void verifyUserIsRedirectedToHomePageOnClickBeamsityLogoFromPartnerWithUsPage() throws Exception
	{
		Thread.sleep(4000);
		partnerWithUsPage = homePage.validateClickOnPartnerWithUsLink();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/sponsor", "The URL does not matched");
		
//		<--- Validating partner with us text is display and running 2 layers of assertion ---->
		String pageNameLabel = homePage.validateCorrectPartnerWithUsPageName();
		System.out.println(pageNameLabel);
		Assert.assertEquals(pageNameLabel, "Partner with us today", "Text displayed does not matched");
		
		Thread.sleep(5000);
		homePage = partnerWithUsPage.validateClickOnBeamsityLogo();
		
		String sch_orgUrl = driver.getCurrentUrl();
		System.out.println(sch_orgUrl);
		Assert.assertEquals(sch_orgUrl, "https://beamsity.com/", "URL does not matched");
		
		boolean text = driver.getPageSource().contains("Beamsity");
		System.out.println(text);
		Assert.assertTrue(text);
	}



	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 12)
	public void verifyUserCanClickOnGetStartedLink() throws Exception
	{
		partnerWithUsPage = homePage.validateClickOnGetStartedLinks();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/sponsor", "The URL does not matched");
		
//		<--- Validating get started with sponsors page! text is display and running two layers of assertion ---->
		String pageNameLabel = homePage.validateCorrectPartnerWithUsPageName();
		System.out.println(pageNameLabel);
		Assert.assertEquals(pageNameLabel, "Partner with us today", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Partner with us today");
		System.out.println(pageNamelText);
		Assert.assertTrue(pageNamelText);
	}
	
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 13)
	public void verifyUserCanClickOnLearnMoreLink() throws Exception
	{
		techOnBeamsityPage = homePage.validateClickOnLearnMoreLink();

		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/become_a_tutor", "The URL does not matched");
			
	//	<--- Validating Make an Impact context is display and running two layers of assertion ---->
		String pageNameLabel = homePage.validateCorrectTeachOnBeamsityPageName();
		System.out.println(pageNameLabel);
		Assert.assertEquals(pageNameLabel, "Make an Impact", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Make an Impact");
		System.out.println(pageNamelText);
		Assert.assertTrue(pageNamelText);			
	}


	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 14)
	public void verifyUserIsRedirectedToHomePageOnClickBeamsityLogo_AboutUsFooter() throws Exception
	{
		Thread.sleep(3000);
		aboutUsPage = homePage.validateClickOnAboutUsLink();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/about_us", "URL displayed does not matched");
			
		String pageNamelabel = aboutUsPage.validateCorrectAboutUsPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "About Us", "Text displayed does not matched");
		
		
		Thread.sleep(3000);
		homePage = aboutUsPage.validateClickOnBeamsityLogo();
		
		String sch_orgUrl = driver.getCurrentUrl();
		System.out.println(sch_orgUrl);
		Assert.assertEquals(sch_orgUrl, "https://beamsity.com/", "URL does not matched");
		
		boolean text = driver.getPageSource().contains("Beamsity");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 15)
	public void verifyUserIsRedirectedToHomePageOnClickBeamsityLogo_PrivatePolicyFooter() throws Exception
	{
		Thread.sleep(3000);
		privacy_PolicyPage = homePage.validateClickOnPrivacyPolicyLink();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/privacy_policy", "URL displayed does not matched");
			
		String pageNamelabel = privacy_PolicyPage.validateCorrectPrivacy_PolicyPageName();
		System.out.println(pageNamelabel);
		Assert.assertEquals(pageNamelabel, "Privacy Policy", "Text displayed does not matched");
		
		
		Thread.sleep(3000);
		homePage = privacy_PolicyPage.validateClickOnBeamsityLogo();
		
		String sch_orgUrl = driver.getCurrentUrl();
		System.out.println(sch_orgUrl);
		Assert.assertEquals(sch_orgUrl, "https://beamsity.com/", "URL does not matched");
		
		boolean text = driver.getPageSource().contains("Beamsity");
		System.out.println(text);
		Assert.assertTrue(text);
	}
	
	
	
	
	
	
	
		
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 16)
	public void verifyUserCanClickOnAboutUsLink() throws Exception
	{
		
		aboutUsPage = homePage.validateClickOnAboutUsLink();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/about_us", "The URL does not matched");
		
//		<--- Validating Make an Impact context is display and running two layers of assertion ---->
//		
		String footerNameLabel = homePage.validateCorrectAboutUsPageName();
		System.out.println(footerNameLabel);
		Assert.assertEquals(footerNameLabel, "About Us", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("About Us");
		System.out.println(pageNamelText);
//		Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);	
	}
	


	

	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 16)
	public void verifyUserCanClickOnPrivacyPolicyLink() throws Exception
	{
		privacy_PolicyPage = homePage.validateClickOnPrivacyPolicyLink();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/privacy_policy", "The URL does not matched");
		
//		<--- Validating Make an Impact context is display and running two layers of assertion ---->
		
		String footerNameLabel = homePage.validateCorrectPrivacyPolicyPageName();
		System.out.println(footerNameLabel);
		Assert.assertEquals(footerNameLabel, "Privacy Policy", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Privacy Policy");
		System.out.println(pageNamelText);
//		Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);	
	}
	

	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 18)
	public void verifyUserIsRedirectedToGoogleMapNavigation_ClickOnContactAddressLink() throws Exception
	{
		homePage = homePage.validateClickOnContactUsOfficeAddress();
		
//		<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
	
	    // Navigate to New Tab
	    driver.switchTo().window(tabs2.get(1));
		
	//	<--- Validating login text is display and running a layer of assertion ---->
		
	    String footerNameLabel = homePage.validateCorrectContactUsOfficeAddressFooterName();
		System.out.println(footerNameLabel);
		Assert.assertEquals(footerNameLabel, "50 Awolowo Rd, Ikoyi 106104, Lagos", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("50 Awolowo Rd, Ikoyi 106104, Lagos");
		System.out.println(pageNamelText);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);
	}
	
	
	
	

	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 19)
	public void verifyUserCanSignUpToMailingList() throws Exception
	{
		homePage = homePage.validateSignUpToMailingList(prop.getProperty("userEmail"));
		Thread.sleep(2000);
	
	
//		<--- Validating SignUp To Mailing List success and running two layers of assertion ---->
		
		String successPrompt = homePage.validateSignUpToMailingListSuccessPrompt();
		System.out.println(successPrompt);
		Assert.assertEquals(successPrompt, "Success.", "Text displayed does not matched");
			 
			
		boolean successPromptText = driver.getPageSource().contains("Success.");
		System.out.println(successPromptText);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(successPromptText);
	}

	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 20)
	public void verifyUserCannotSignUpToMailingListWithEmail_WithOutDotCom() throws Exception
	{
		homePage = homePage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOutDotCom"));
		Thread.sleep(2000);
	
	
//		<--- Validating SignUp To Mailing List success and running two layers of assertion ---->
		
		String signUpMailingListInvalidEmailErrorPrompt = homePage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		System.out.println(signUpMailingListInvalidEmailErrorPrompt);
		Assert.assertEquals(signUpMailingListInvalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
			 
			
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
	}

	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 21)
	public void verifyUserCannotSignUpToMailingListWithEmail_WithoutATgmail() throws Exception
	{
		homePage = homePage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOut@gmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String signUpMailingListInvalidEmailErrorPrompt = homePage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		System.out.println(signUpMailingListInvalidEmailErrorPrompt);
		Assert.assertEquals(signUpMailingListInvalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 22)
	public void verifyUserCannotSignUpToMailingListWith_PhoneNumber() throws Exception
	{
		homePage = homePage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("signUpWithPhoneNo"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String signUpMailingListInvalidEmailErrorPrompt = homePage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		System.out.println(signUpMailingListInvalidEmailErrorPrompt);
		AssertJUnit.assertEquals(signUpMailingListInvalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		AssertJUnit.assertTrue(InvalidEmailErrorPrompt);
	}
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 23)
	public void verify_SUCCESS_IsPromptedWhenUserSuccessfullySignUpToMailingListWithValidEmail() throws Exception
	{
		homePage = homePage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("userEmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List Success prompt and running two layers of assertion ---->
		
		String signUpMailingListSuccessPrompt = homePage.validateSignUpToMailingListSuccessPrompt();
		System.out.println(signUpMailingListSuccessPrompt);
		Assert.assertEquals(signUpMailingListSuccessPrompt, "Success.", "Text displayed does not matched");
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("Success.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 24)
	public void verify_InvalidEmailAddress_IsPromptedWhenUserAttemptedToSignUpToMailingListWithInvalidEmail() throws Exception
	{
		homePage = homePage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOut@gmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String signUpMailingListInvalidEmailErrorPrompt = homePage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		System.out.println(signUpMailingListInvalidEmailErrorPrompt);
		Assert.assertEquals(signUpMailingListInvalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(InvalidEmailErrorPrompt);
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 25)
	public void verifyUserCanClickOnGooglePlayLink() throws Exception
	{
		homePage = homePage.validateClickOnGooglePlayLlink();
		
//	<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

//	<----  Navigate to New Tab ---->
		driver.switchTo().window(tabs2.get(1));
				
//	<---- Validating Google play button and running three layers of assertion ---->
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://play.google.com/store/apps/details?id=com.fbistech.beamsity", "The URL does not matched");
		
		
		String footerNameLabel = homePage.validateCorrectGooglePlayPageName();
		System.out.println(footerNameLabel);
		Assert.assertEquals(footerNameLabel, "BeamSity", "Text displayed does not matched");
			 
			
		boolean pageNamelText = driver.getPageSource().contains("BeamSity");
		System.out.println(pageNamelText);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);	
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 26)
	public void verifyUserCanInstallBeamsityApp() throws Exception
	{
		homePage = homePage.validateUserInstallBeamsityApp();
		
//	<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

//	<----  Navigate to New Tab ---->
		driver.switchTo().window(tabs2.get(1));
				
//	<---- Validating Google play button and running three layers of assertion ---->
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://play.google.com/store/apps/details?id=com.fbistech.beamsity", "The URL does not matched");
		
		
		String footerNameLabel = homePage.validateCorrectGooglePlayPageName();
		System.out.println(footerNameLabel);
		Assert.assertEquals(footerNameLabel, "BeamSity", "Text displayed does not matched");
			 
			
		boolean pageNamelText = driver.getPageSource().contains("BeamSity");
		System.out.println(pageNamelText);
	//	Assert.assertEquals(pageNamelText, true);
		Assert.assertTrue(pageNamelText);	
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
