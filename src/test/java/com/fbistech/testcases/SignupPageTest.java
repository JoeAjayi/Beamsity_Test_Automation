package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.LoginPage;
import com.fbistech.pages.Schools_OrganizationsPage;
import com.fbistech.pages.SignupPage;
import com.fbistech.util.JiraPolicy;

public class SignupPageTest extends TestBase {
	HomePage homePage;
	SignupPage signupPage;
	LoginPage loginPage;

	
	// this will initialize the properties of base class constructor there after call initialization() method
	public SignupPageTest()
	{
		super();
	}

	
	

	@BeforeMethod
	public void setUp() 
	{
		initialization_WebBrowser();
		homePage = new HomePage();
		signupPage = new SignupPage();
		loginPage = new LoginPage();
	}

	 
//	@JiraPolicy(logTicketReady=true)
//	@Test(priority=1)
//	public void verifyUserSignUpPageTitle() throws Exception
//	{
////		loginPage = homePage.validateClickOnLogInLink();
//		Thread.sleep(2000);
//		signupPage = loginPage.validateCreateFreeAcctLink();
//		Thread.sleep(2000);
//		String title = signupPage.validateSignUpPageTitle();
//		System.out.println(title);
//		Assert.assertEquals(title, "React App");  // No title page displayed from page source
//	} 
//	
//	
//	
//	@JiraPolicy(logTicketReady=true)
//	@Test(priority=1) 
//	public void verifyUserCanClickSignUpLink()
//	{
////		loginPage = homePage.validateClickOnLogInLink();
//		signupPage = loginPage.validateCreateFreeAcctLink();
//	}
//
//
//	@Test(priority=2)
//	public void verifyUserCanSignUpForm() throws Exception
//	{
////		homePage.validateClickOnLogInLink();
//		Thread.sleep(2000);
//		signupPage = loginPage.validateCreateFreeAcctLink();
//		Thread.sleep(3000);
//		loginPage = signupPage.Signup(prop.getProperty("firstName"), prop.getProperty("lastName"), 
//		prop.getProperty("phoneNo"), prop.getProperty("emailAddress"), prop.getProperty("password"));
//	}	
//	
//	@Test(priority=3)
//	public void verifyUserCanSuccessfullySignUP()
//	{
//		signUpPage = homePage.clickOnSignUpLink();
////		loginPage = loginPage.clickOnLoginLink();	
//	
//	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(4000);
		driver.quit();
	}
}
