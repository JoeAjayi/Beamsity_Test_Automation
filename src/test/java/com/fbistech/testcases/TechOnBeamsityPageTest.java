package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.util.ArrayList;

import org.openqa.selenium.By;
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
import com.fbistech.pages.TechOnBeamsityPage;
import com.fbistech.util.JiraPolicy;

public class TechOnBeamsityPageTest extends TestBase {

	HomePage homePage;
	Schools_OrganizationsPage schools_OrganizationsPage;
	TechOnBeamsityPage techOnBeamsityPage;
	ContactUsPage contactUsPage;
	LoginPage loginPage;
	PartnerWithUsPage partnerWithUsPage; 
	AboutUsPage aboutUsPage;
	Privacy_PolicyPage privacy_PolicyPage;
	
	
	
	
	
	
	public TechOnBeamsityPageTest()
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
	public void verifyUserCanClickSchoolsOrganizationsPageLink() throws Exception
	{
		Thread.sleep(5000); 
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		schools_OrganizationsPage = techOnBeamsityPage.validateClickOnSchools_OrganizationsLink();
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		AssertJUnit.assertEquals(url, "https://beamsity.com/organization", "URL does not matched");
		
//		<--- Validating BeamSity for Organizations context is display and running two layers of assertion ---->
		String pageNamelabel = techOnBeamsityPage.validateCorrectSchools_OrganizationsPageName();
		System.out.println(pageNamelabel);
		AssertJUnit.assertEquals(pageNamelabel, "BeamSity for Organizations", "Text displayed does not matched");
		
		boolean text = driver.getPageSource().contains("BeamSity for Organizations");
		System.out.println(text);
		AssertJUnit.assertTrue(text);
	}
	 
	
	
	
	

 
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 2)
	public void verifyUserCanClickOnTeachOnBeamsitykLink() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		AssertJUnit.assertEquals(url, "https://beamsity.com/become_a_tutor", "The URL does not matched");
		
//		<--- Validating Make an Impact context is display and running two layers of assertion ---->		
		String pageNamelabel = techOnBeamsityPage.validateCorrectTeachOnBeamsityPageName();
		System.out.println(pageNamelabel);
		AssertJUnit.assertEquals(pageNamelabel, "Make an Impact", "Text displayed does not matched");
		
		boolean nameLabel = driver.getPageSource().contains("Make an Impact");
		System.out.println(nameLabel);
		AssertJUnit.assertEquals(nameLabel, true);
	}
	
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady=true)
	@Test(priority = 3)
	public void verifyUserCanClickOnContactUsLinks() throws Exception
	{
		Thread.sleep(4000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(4000);
		contactUsPage = techOnBeamsityPage.validateClickOnContactUsLinkOnNavBar();
		
//	<-----	Assertion on contact us url ------>
		String url = driver.getCurrentUrl();
		System.out.println(url);
		AssertJUnit.assertEquals(url, "https://beamsity.com/contactus", "The URL does not matched");
		
//	<----- Validating Contact Us! text is display and running two layers of assertion ---->
		String pageNamelabel = techOnBeamsityPage.validateCorrectContactUsPageName();
		System.out.println(pageNamelabel);
		AssertJUnit.assertEquals(pageNamelabel, "Contact Us!", "Page name label displayed does not matched");
				
		boolean pageNamelText = driver.getPageSource().contains("Contact Us!");
		System.out.println(pageNamelText);
		AssertJUnit.assertTrue(pageNamelText);
		
		
		boolean text = driver.getPageSource().contains("Contact Us!");
		System.out.println(text);
		AssertJUnit.assertEquals(text, true);	
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 4)
	public void verifyUserCanClickOnLoginLink() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		techOnBeamsityPage = techOnBeamsityPage.validateClickOnLoginLink();
		
//      <---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
		 driver.switchTo().window(tabs2.get(1));
	        
//	      <--- Validating login URL and running a layer of assertion ---->
	       
        String url = driver.getCurrentUrl();
		System.out.println(url);
		AssertJUnit.assertEquals(url, "https://portal.beamsity.com/", "URL displayed does not matched");
			
//			<--- Validating login text is display and running two layer of assertion ---->
		String pageNamelabel = techOnBeamsityPage.validateCorrectLoginPageName();
		System.out.println(pageNamelabel);
		AssertJUnit.assertEquals(pageNamelabel, "Log In", "Text displayed does not matched");
			 
		boolean pageNamelText = driver.getPageSource().contains("Log In");
		System.out.println(pageNamelText);
		AssertJUnit.assertTrue(pageNamelText);
	}
	
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 5)
	public void verifyUserCanclickOnPartnerWithUsLink() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		partnerWithUsPage = schools_OrganizationsPage.validatePartnerWithUsLink();
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		AssertJUnit.assertEquals(url, "https://beamsity.com/sponsor", "The URL does not matched");
		
//		<--- Validating partner with us text is display and running 2 layers of assertion ---->
		String pageNameLabel = schools_OrganizationsPage.validateCorrectPartnerWithUsPageName();
		System.out.println(pageNameLabel);
		AssertJUnit.assertEquals(pageNameLabel, "Partner with us today", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Partner with us today");
		System.out.println(pageNamelText);
		AssertJUnit.assertTrue(pageNamelText);
	}

	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 6)
	public void verifyUserCanClickOnGetStartedLink() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		partnerWithUsPage = techOnBeamsityPage.validateClickOnGetStartedLink();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		AssertJUnit.assertEquals(url, "https://beamsity.com/sponsor", "The URL does not matched");
		
//		<--- Validating get started with sponsors page! text is display and running two layers of assertion ---->
		String pageNameLabel = techOnBeamsityPage.validateCorrectPartnerWithUsPageName();
		System.out.println(pageNameLabel);
		AssertJUnit.assertEquals(pageNameLabel, "Partner with us today", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Partner with us today");
		System.out.println(pageNamelText);
		AssertJUnit.assertTrue(pageNamelText);
	}

	

	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 7)
	public void verifyUserCanClickOnAboutUsLink() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		aboutUsPage = techOnBeamsityPage.validateClickOnAboutUsLink();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		AssertJUnit.assertEquals(url, "https://beamsity.com/about_us", "The URL does not matched");
		
//		<--- Validating Make an Impact context is display and running two layers of assertion ---->	
		String footerNameLabel = techOnBeamsityPage.validateCorrectAboutUsFooterName();
		System.out.println(footerNameLabel);
		AssertJUnit.assertEquals(footerNameLabel, "About Us", "Text link name displayed does not matched");
		 
		
		String pageNameLabel = techOnBeamsityPage.validateCorrectAboutUsPageName();
		System.out.println(pageNameLabel);
		AssertJUnit.assertEquals(pageNameLabel, "About Us", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("About Us");
		System.out.println(pageNamelText);
		AssertJUnit.assertTrue(pageNamelText);
	}
	


	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 8)
	public void verifyUserCanClickOnPrivacyPolicyLink() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		privacy_PolicyPage = techOnBeamsityPage.validateClickOnPrivacyPolicyLink();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		AssertJUnit.assertEquals(url, "https://beamsity.com/privacy_policy", "The URL does not matched");
		
//		<--- Validating Make an Impact context is display and running two layers of assertion ---->
		String footerNameLabel = techOnBeamsityPage.validateCorrectPrivacyPolicyPageName();
		System.out.println(footerNameLabel);
		AssertJUnit.assertEquals(footerNameLabel, "Privacy Policy", "Text link name displayed does not matched");
		 
		String pageNameLabel = techOnBeamsityPage.validateCorrectPrivacyPolicyPageName();
		System.out.println(pageNameLabel);
		AssertJUnit.assertEquals(pageNameLabel, "Privacy Policy", "Text displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("Privacy Policy");
		System.out.println(pageNamelText);
//		Assert.assertEquals(pageNamelText, true);
		AssertJUnit.assertTrue(pageNamelText);	
	}
	

	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 9)
	public void verifyUserIsRedirectedToGoogleMapNavigation_ClickOnContactAddressLink() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		techOnBeamsityPage = techOnBeamsityPage.validateClickOnContactUsAddress();
		
//		<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

    // Navigate to New Tab
		driver.switchTo().window(tabs2.get(1));
		
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		AssertJUnit.assertEquals(url, "https://www.google.ng/maps/place/50+Awolowo+Rd,+Ikoyi+106104,+Lagos/@6.4421886,3.4114973,17z/data="
				+ "!3m1!4b1!4m5!3m4!1s0x103b8b29704ac2f9:0x2888f7638f75f072!8m2!3d6.4421886!4d3.413686", "The URL does not matched");
	
//		<--- Validating login text is display and running a layer of assertion ---->
		String footerNameLabel = techOnBeamsityPage.validateCorrectContactUsOfficeAddressFooterName();
		System.out.println(footerNameLabel);
		AssertJUnit.assertEquals(footerNameLabel, "50 Awolowo Rd, Ikoyi 106104, Lagos", "Address displayed does not matched");
		 
		
		boolean pageNamelText = driver.getPageSource().contains("50 Awolowo Rd, Ikoyi 106104, Lagos");
		System.out.println(pageNamelText);
	//	Assert.assertEquals(pageNamelText, true);
		AssertJUnit.assertTrue(pageNamelText);
	}
	
	
	
	
	
	
	

	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 10)
	public void verifyUserCanSignUpToMailingList() throws Exception 
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		techOnBeamsityPage = techOnBeamsityPage.validateSignUpToMailingList(prop.getProperty("userEmail"));
		
//		<--- Validating SignUp To Mailing List success and running two layers of assertion ---->
		Thread.sleep(3000);
		String successPrompt = techOnBeamsityPage.validateSignUpToMailingListSuccessPrompt();
		System.out.println(successPrompt);
		AssertJUnit.assertEquals(successPrompt, "Success.", "Text displayed does not matched");
			 
			
		boolean successPromptText = driver.getPageSource().contains("Success.");
		System.out.println(successPromptText);
	//	Assert.assertEquals(pageNamelText, true);
		AssertJUnit.assertTrue(successPromptText);
	}

	
	
	
	
	
	 
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 11)
	public void verifyUserCannotSignUpToMailingListWithEmail_WithOutDotCom() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		techOnBeamsityPage = techOnBeamsityPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOutDotCom"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List success and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = techOnBeamsityPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		System.out.println(invalidEmailErrorPrompt);
		AssertJUnit.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
			 
			
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		AssertJUnit.assertTrue(InvalidEmailErrorPrompt);
	}

	
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 12)
	public void verifyUserCannotSignUpToMailingListWithEmail_WithoutATgmail() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		techOnBeamsityPage = techOnBeamsityPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOut@gmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = techOnBeamsityPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		System.out.println(invalidEmailErrorPrompt);
		AssertJUnit.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
			 
		boolean inValidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(inValidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		AssertJUnit.assertTrue(inValidEmailErrorPrompt);
	}
	
	
	

	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 13)
	public void verifyUserCannotSignUpToMailingListWith_PhoneNumber() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		techOnBeamsityPage = techOnBeamsityPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("signUpWithPhoneNo"));
	
//	<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = techOnBeamsityPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		System.out.println(invalidEmailErrorPrompt);
		AssertJUnit.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		AssertJUnit.assertTrue(InvalidEmailErrorPrompt);
	}
	
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 14)
	public void verify_SUCCESS_IsPromptedWhenUserSuccessfullySignUpToMailingListWithValidEmail() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		techOnBeamsityPage = techOnBeamsityPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("userEmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List Success prompt and running two layers of assertion ---->
		
		String signUpMailingListSuccessPrompt = techOnBeamsityPage.validateSignUpToMailingListSuccessPrompt();
		System.out.println(signUpMailingListSuccessPrompt);
		AssertJUnit.assertEquals(signUpMailingListSuccessPrompt, "Success.", "Text displayed does not matched");
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("Success.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		AssertJUnit.assertTrue(InvalidEmailErrorPrompt);
	}
	
	
	
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 15)
	public void verify_InvalidEmailAddress_IsPromptedWhenUserAttemptedToSignUpToMailingListWithInvalidEmail() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		techOnBeamsityPage = techOnBeamsityPage.validateSignUpToMailingListWithInvalidEmailFormat(prop.getProperty("emailWithOut@gmail"));
		Thread.sleep(2000);
	
//		<--- Validating SignUp To Mailing List invalid email error prompt and running two layers of assertion ---->
		
		String invalidEmailErrorPrompt = schools_OrganizationsPage.validateSignUpToMailingListInvalidEmailErrorPrompt();
		System.out.println(invalidEmailErrorPrompt);
		AssertJUnit.assertEquals(invalidEmailErrorPrompt, "The email must be a valid email address.", "Text displayed does not matched");
			 
		boolean InvalidEmailErrorPrompt = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(InvalidEmailErrorPrompt);
	//	Assert.assertEquals(pageNamelText, true);
		AssertJUnit.assertTrue(InvalidEmailErrorPrompt);
	}
	
	
	
	

	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 16)
	public void verifyUserCanInstallBeamsityApp() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		techOnBeamsityPage = techOnBeamsityPage.validateUserInstallBeamsityApp();
		
//		<---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

//		<----  Navigate to New Tab ---->
		driver.switchTo().window(tabs2.get(1));
				
//		<---- Validating Google play button and running three layers of assertion ---->
		String url = driver.getCurrentUrl();
		System.out.println(url);
		AssertJUnit.assertEquals(url, "https://play.google.com/store/apps/details?id=com.fbistech.beamsity", "The URL does not matched");
		
		
		String footerNameLabel = techOnBeamsityPage.validateCorrectGooglePlayPageName();
		System.out.println(footerNameLabel);
		AssertJUnit.assertEquals(footerNameLabel, "BeamSity", "Text displayed does not matched");
			 
			
		boolean pageNamelText = driver.getPageSource().contains("BeamSity");
		System.out.println(pageNamelText);
	//	Assert.assertEquals(pageNamelText, true);
		AssertJUnit.assertTrue(pageNamelText);	
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 17)
	public void verifyUserCanClickOnContactUsEmail() throws Exception
	{
		Thread.sleep(5000);
		techOnBeamsityPage = homePage.validateClickOnTechOnBeamsityLink();
		Thread.sleep(5000);
		techOnBeamsityPage = techOnBeamsityPage.validateClickOnContactEmail();
		
		
////		<---  Create Array List to keep Tab information ---->
//		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//
////	<----  Navigate to New Tab ---->
//		driver.switchTo().window(tabs2.get(1));
//		
	
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		Assert.assertEquals(url, "https://mail.google.com/mail/u/0/?fs=1&tf=cm&source=mailto&to=info@beamsity.com", "URL does not matched");
		
		String pageNamelabel = techOnBeamsityPage.validateCorrectEmailAddressName();
		System.out.println(pageNamelabel);
		AssertJUnit.assertEquals(pageNamelabel, "info@beamsity.com", " Email Address displayed does not matched");
		
		boolean text = driver.getPageSource().contains("info@beamsity.com");
		System.out.println(text);
		AssertJUnit.assertTrue(text);	
	}

	
	

	
	

	
	
	
	
	

	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(4000);
		driver.quit(); 
	}
}
