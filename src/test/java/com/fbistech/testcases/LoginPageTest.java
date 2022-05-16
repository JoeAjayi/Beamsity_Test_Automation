package com.fbistech.testcases;

import java.util.ArrayList;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.HomePage;
import com.fbistech.pages.LoginPage;
import com.fbistech.pages.PortalDashboardPage;
import com.fbistech.pages.Privacy_PolicyPage;
import com.fbistech.util.JiraPolicy;

public class LoginPageTest extends TestBase{
	
	HomePage homePage;
	LoginPage loginPage;
	PortalDashboardPage portalDashboardPage;
	Privacy_PolicyPage privacy_PolicyPage;

	

	
	public LoginPageTest() 
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		 
		homePage = new HomePage();  
		loginPage = new LoginPage();
		privacy_PolicyPage = new Privacy_PolicyPage();
 
	}
	
	

//	@JiraPolicy(logTicketReady=true)
//	@Test(priority = 1)
//	public void verifyLoginPageTitle()
//	{
//		String title = loginPage.validateLoginPageTitle();
//		System.out.println(title);
//		Assert.assertEquals(title, "Beamsity"); 
//	}

	  
	

	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 1)
	public void verifyUserCanClickOnLoginLink() throws Exception
	{
		Thread.sleep(4000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
		
//      <---  Create Array List to keep Tab information ---->
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
        
//      <--- Validating login URL and running a layer of assertion ---->
        String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://portal.beamsity.com/", "URL does not matched");
		System.out.println(url);

		
//		<--- Validating login text is display and running a layer of assertion ---->
		
		
		String pageNamelabel = loginPage.validateCorrectLoginPageName();
		Assert.assertEquals(pageNamelabel, "Log In", "Text displayed does not matched");
		System.out.println(pageNamelabel);

		boolean text = driver.getPageSource().contains("Log In");
		Assert.assertTrue(text);
		System.out.println(text);

	}
	
	 
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 2)
	public void verifyUserCanLoginWith_ValideCredentials() throws Exception
	{
		Thread.sleep(3000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <----  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to the login page tab
        driver.switchTo().window(tabs2.get(1));
        
        Thread.sleep(2000);
        portalDashboardPage = loginPage.validateUserLoginWith_ValidCredentials(prop.getProperty("eMail"), prop.getProperty("passWord"));
        
//      <--- Validating user can successfully login and running an assertion ---->
		String loginPrompt = loginPage.validateLoginSuccessPrompt();
		Assert.assertEquals(loginPrompt, "Success.", "Text displayed does not matched");
		System.out.println(loginPrompt);
		
		boolean text = driver.getPageSource().contains("Success.");
		Assert.assertTrue(text);
		System.out.println(text);
		
//      <---- Validating login URL and running an assertion ---->
        Thread.sleep(10000);
        String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://portal.beamsity.com/school/dashboard", "URL does not matched");
		System.out.println(url);		
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 3)
	public void verifyUserCannotLoginWith_InvalideCredentials() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(2000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(2000);    		
        loginPage = loginPage.validateUserLoginWith_InvalidCredentials(prop.getProperty("invalidEmail"), prop.getProperty("invalidPassWord"));
        
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://portal.beamsity.com/", "URL does not matched");
		System.out.println(url);

 
//      <--- Validating user can successfully login and running an assertion ---->
  
		String invalidLoginPrompt = loginPage.validateLoginInvalidCredentialsEntered();
		Assert.assertEquals(invalidLoginPrompt, "Invalid credentials entered", "Text displayed does not matched");
		System.out.println(invalidLoginPrompt);

		boolean text = driver.getPageSource().contains("Invalid credentials entered");
		Assert.assertTrue(text);
		System.out.println(text);
		
		Thread.sleep(1000);
		boolean cancelErrorPrompt2 = loginPage.validateClickOnCancel_SelectedEmailIsInvalidErrorPromptButton();
		AssertJUnit.assertTrue(cancelErrorPrompt2);
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 4)
	public void verifyUserCannotLoginWith_ValidEmail_InvalidPassword() throws Exception
	{	
		Thread.sleep(3000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(2000);    		
        loginPage = loginPage.validateUserCannotLoginWith_ValidEmail_InvalidPassword(prop.getProperty("eMail"), prop.getProperty("invalidPassWord"));
        
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://portal.beamsity.com/", "URL does not matched");
		System.out.println(url);

 
		String pageNamelabel = loginPage.validateCorrectLoginPageName();
		Assert.assertEquals(pageNamelabel, "Log In", "Text displayed does not matched");
		System.out.println(pageNamelabel);
		
//      <--- Validating user can successfully login and running an assertion ---->
  
		String invalidLoginPrompt = loginPage.validateLoginInvalidCredentialsEntered();
		Assert.assertEquals(invalidLoginPrompt, "Invalid credentials entered", "Text displayed does not matched");
		System.out.println(invalidLoginPrompt);

		boolean text = driver.getPageSource().contains("Invalid credentials entered");
		Assert.assertTrue(text);
		System.out.println(text);
	

		Thread.sleep(1000);
		boolean cancelErrorPromptBtn = loginPage.validateClickOnCancel_SelectedEmailIsInvalidErrorPromptButton();
		AssertJUnit.assertTrue(cancelErrorPromptBtn);
	}
	
	

	
	


	@JiraPolicy(logTicketReady = true)
	@Test(priority = 5)
	public void verifyUserCannotLoginWith_InvalidEmail_ValidPassword() throws Exception
	{
		Thread.sleep(3000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(2000);    		
        loginPage = loginPage.validateUserCannotLoginWith_InvalidEmail_ValidPassword(prop.getProperty("invalidEmail"), prop.getProperty("passWord"));
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://portal.beamsity.com/", "URL does not matched");
		System.out.println(url);

 
		String pageNamelabel = loginPage.validateCorrectLoginPageName();
		Assert.assertEquals(pageNamelabel, "Log In", "Text displayed does not matched");
		System.out.println(pageNamelabel);
//		
		
//      <--- Validating user can not successfully login and running an assertion ---->
		String invalidLoginPrompt = loginPage.validateLoginInvalidCredentialsEntered();
		Assert.assertEquals(invalidLoginPrompt, "Invalid credentials entered", "Text displayed does not matched");
		System.out.println(invalidLoginPrompt);

		boolean text = driver.getPageSource().contains("Invalid credentials entered");
		Assert.assertTrue(text);
		System.out.println(text);
		
		
		Thread.sleep(1000);
		boolean cancelErrorPromptBtn = loginPage.validateClickOnCancel_SelectedEmailIsInvalidErrorPromptButton();
		Assert.assertTrue(cancelErrorPromptBtn);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 6)
	public void verifyUserCannotLoginWith_EmailWithoutDomaName_AndValidPassword() throws Exception
	{	
		Thread.sleep(3000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(2000);    		
        loginPage = loginPage.validateUserCannotLoginWith_ValidEmail_InvalidPassword(prop.getProperty("eMailWithoutDomeName"), prop.getProperty("passWord"));
        
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://portal.beamsity.com/", "URL does not matched");
		System.out.println(url);

 
//      <--- Validating user can successfully login and running an assertion ---->
  
		String invalidLoginPrompt = loginPage.validateEmailMustBeAValidEmailAddressErrorPrompt();
		Assert.assertEquals(invalidLoginPrompt, "The email must be a valid email address.", "Text displayed does not matched");
		System.out.println(invalidLoginPrompt);

		boolean text = driver.getPageSource().contains("The email must be a valid email address.");
		Assert.assertTrue(text);
		System.out.println(text);
       
		Thread.sleep(1000);
		boolean cancelErrorPromptBtn = loginPage.validateClickOnCancel_SelectedEmailIsInvalidErrorPromptButton();
		Assert.assertTrue(cancelErrorPromptBtn);
	}
	
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 7)
	public void verifyUserCannotLoginWith_EmptyEmail_AndValidPassword() throws Exception
	{	
		Thread.sleep(3000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(2000);    		
        loginPage = loginPage.validateUserCannotLoginWith_ValidEmail_InvalidPassword(prop.getProperty("emptyEmail"), 
        		prop.getProperty("passWord"));
        
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://portal.beamsity.com/", "URL does not matched");
		System.out.println(url);

 
//      <--- Validating user can successfully login and running an assertion ---->
  
		String invalidLoginPrompt = loginPage.validateEmailFieldIsRequiredErrorPrompt();
		Assert.assertEquals(invalidLoginPrompt, "The email field is required.", "Text displayed does not matched");
		System.out.println(invalidLoginPrompt);

		boolean text = driver.getPageSource().contains("The email field is required.");
		Assert.assertTrue(text);
		System.out.println(text);
       
		Thread.sleep(1000);
		boolean cancelErrorPromptBtn = loginPage.validateClickOnCancel_SelectedEmailIsInvalidErrorPromptButton();
		Assert.assertTrue(cancelErrorPromptBtn);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 8)
	public void verifyUserCannotLoginWith_ValidEmail_EmptyPassword() throws Exception
	{	
		Thread.sleep(3000);
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(3000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(2000);    		
        loginPage = loginPage.validateUserCannotLoginWith_ValidEmail_InvalidPassword(prop.getProperty("eMail"), 
        		prop.getProperty("emptyPassword"));
        
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://portal.beamsity.com/", "URL does not matched");
		System.out.println(url);

 
//      <--- Validating user can successfully login and running an assertion ---->
  
		String invalidLoginPrompt = loginPage.validatePasswordFieldIsRequiredErrorPrompt();
		Assert.assertEquals(invalidLoginPrompt, "The password field is required.", "Text displayed does not matched");
		System.out.println(invalidLoginPrompt);

		boolean text = driver.getPageSource().contains("The password field is required.");
		Assert.assertTrue(text);
		System.out.println(text);
       
		Thread.sleep(1000);
		boolean cancelErrorPromptBtn = loginPage.validateClickOnCancel_SelectedEmailIsInvalidErrorPromptButton();
		AssertJUnit.assertTrue(cancelErrorPromptBtn);
	}
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 9)
	public void verifyUserCannotLoginWith_PasswordLessThan6DigitsCharacters() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(2000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(2000);    		
        loginPage = loginPage.validateUserCannotLoginWith_InvalidEmail_ValidPassword(prop.getProperty("eMail"), prop.getProperty("passWord<6Chart"));
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://portal.beamsity.com/", "URL does not matched");
        
 
//      <--- Validating user can successfully login and running an assertion ---->
  
		String invalidLoginPrompt = loginPage.validatePasswordToBe6Characters();
		Assert.assertEquals(invalidLoginPrompt, "The password must be at least 6 characters.", "Text displayed does not matched");
		System.out.println(invalidLoginPrompt);
		
		boolean text = driver.getPageSource().contains("The password must be at least 6 characters.");
		System.out.println(text);
		AssertJUnit.assertTrue(text);
		
		Thread.sleep(1000);
		boolean cancelErrorPromptBtn = loginPage.validateClickOnCancel_SelectedEmailIsInvalidErrorPromptButton();
		Assert.assertTrue(cancelErrorPromptBtn);
	}
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 10)
	public void verifyUserCanClickForgotPasswordLink() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(2000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        loginPage = loginPage.validateClickOnForgotPasswordLink();
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		  Assert.assertEquals(url, "https://portal.beamsity.com/auth/forgot_password", "URL does not matched");
        System.out.println(url);

 
//      <--- Validating user can successfully login and running an assertion ---->
  
		String forgotPasswordNameLabel = loginPage.validateCorrectForgetPasswordPageNameLabel();
		Assert.assertEquals(forgotPasswordNameLabel, "Forgot Password", "Text displayed does not matched");
		System.out.println(forgotPasswordNameLabel);

		boolean text = driver.getPageSource().contains("Forgot Password");
		Assert.assertTrue(text);
		System.out.println(text);
	}
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 11)
	public void verifyUserCanTerminateForgotPasswordProcess() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(2000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        loginPage = loginPage.validateClickOnForgotPasswordLink();
        
//       Enter email 
//        Thread.sleep(3000);    		
//        loginPage = loginPage.validateUserForgotPasswordWithValidEmail(prop.getProperty("userEmail"));      
        
//        Click on cancel button
        Thread.sleep(4000);    		
        loginPage = loginPage.validateClickOnCancelForgetPasswordProcess();
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://portal.beamsity.com/", "URL does not matched");
		System.out.println(url);

 
//      <--- Validating user can successfully terminate forget password process and running two layers assertion ---->
		String pageNamelabel = loginPage.validateCorrectLoginPageName();
		Assert.assertEquals(pageNamelabel, "Log In", "Text displayed does not matched");
		System.out.println(pageNamelabel);

		boolean text = driver.getPageSource().contains("Log In");
		Assert.assertTrue(text);
		System.out.println(text);
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
	@Test(priority = 12)
	public void verifyUserCanResetForgetPassword_WithValidEmail() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(2000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(3000);    		
        loginPage = loginPage.validateClickOnForgotPasswordLink();
        
        Thread.sleep(3000);    		
        loginPage = loginPage.validateUserForgotPasswordWithValidEmail(prop.getProperty("eMail"));
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://portal.beamsity.com/auth/forgot_password", "URL does not matched");
        
 
//      <--- Validating user can successfully login and running an assertion ---->
//		String pageNameLabe = loginPage.validateCorrectForgetPasswordPageNameLabel();
//		Assert.assertEquals(pageNameLabe, "Forgot Password", "Text displayed does not matched");
//		System.out.println(pageNameLabe);
//		
//		String invalidLoginPrompt = loginPage.validatePasswordToBe6Characters();
//		Assert.assertEquals(invalidLoginPrompt, "The password must be at least 6 characters.", "Text displayed does not matched");
//		System.out.println(invalidLoginPrompt);
//		
//		boolean text = driver.getPageSource().contains("The password must be at least 6 characters.");
//		System.out.println(text);
//		Assert.assertTrue(text);
//		
		
		
		String resetPasswordSent = loginPage.validateResetPasswordLinkSentSuccessPrompt();
		AssertJUnit.assertEquals(resetPasswordSent, "Forgot Password", "Text displayed does not matched");
		System.out.println(resetPasswordSent);
		
		
		
		
		
//		Thread.sleep(1000);   
//		String getErrorPromtText = loginPage.validateSelectedEmailIsInvalidErrorPrompt();
//		Assert.assertEquals(getErrorPromtText, "The selected email is invalid.", "Error text displayed does not matched");
//		System.out.println(getErrorPromtText);
////		
//		Thread.sleep(1000);
//		boolean cancelErrorPrompt2 = loginPage.validateClickOnCancel_SelectedEmailIsInvalidErrorPromptButton();
//		Assert.assertTrue(cancelErrorPrompt2);
	}
	
	
	
	
	 
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 13)
	public void verifyUserCannotResetForgetPasswordWithEmailWithoutServerHostName() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(2000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        loginPage = loginPage.validateClickOnForgotPasswordLink();
        
        Thread.sleep(2000);    		
        loginPage = loginPage.validateUserForgotPasswordWithValidEmail(prop.getProperty("emailWithoutServerHostName"));
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://portal.beamsity.com/auth/forgot_password", "URL does not matched");
        
 
//      <--- Validating user can successfully login and running an assertion ---->
		String pageNameLabe = loginPage.validateCorrectForgetPasswordPageNameLabel();
		Assert.assertEquals(pageNameLabe, "Forgot Password", "Text displayed does not matched");
		System.out.println(pageNameLabe);
		
		
		String invalidEmailPrompt1 = loginPage.validateEmailMustBeAValidEmailAddressErrorPrompt();
		Assert.assertEquals(invalidEmailPrompt1, "The email must be a valid email address.", "Text displayed does not matched");
		System.out.println(invalidEmailPrompt1);
//		
		String invalidEmailPrompt2 = loginPage.validateSelectedEmailIsInvalidErrorPrompt();
		Assert.assertEquals(invalidEmailPrompt2, "The selected email is invalid.", "Text displayed does not matched");
		System.out.println(invalidEmailPrompt2);
		
		boolean text = driver.getPageSource().contains("The email must be a valid email address.");
		System.out.println(text);
		Assert.assertTrue(text);

//		This object reference is to click on error prompt cancel button 
		Thread.sleep(1000);   
		loginPage = loginPage.validateClickOnCancel_EmailMustBeAValidEmailAddressErrorPromptBtn();
		Thread.sleep(1000);   
		loginPage = loginPage.validateClickOnCancel_SelectedEmailIsInvalidErrorPromptBtn();
		
		
		
//		This object reference is to click on error prompt cancel button and validate an assertion on the cancel btn 
		
//		Thread.sleep(1000);   
//		boolean cancelErrorPrompt1 = loginPage.validateClickOnCancel_EmailMustBeAValidEmailAddressErrorPromptButton();
//		Assert.assertTrue(cancelErrorPrompt1);
//		
//		Thread.sleep(1000);
//		boolean cancelErrorPrompt2 = loginPage.validateClickOnCancel_SelectedEmailIsInvalidErrorPromptButton();
//		Assert.assertTrue(cancelErrorPrompt2);	
	}
	
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 14)
	public void verifyUserCannotResetForgetPasswordWithEmailWithoutDomainName() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(2000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        loginPage = loginPage.validateClickOnForgotPasswordLink();
        
        Thread.sleep(2000);    		
        loginPage = loginPage.validateUserForgotPasswordWithValidEmail(prop.getProperty("emailWithoutDomainName"));
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://portal.beamsity.com/auth/forgot_password", "URL does not matched");
        
 
//      <--- Validating user can successfully login and running an assertion ---->
		String pageNameLabe = loginPage.validateCorrectForgetPasswordPageNameLabel();
		Assert.assertEquals(pageNameLabe, "Forgot Password", "Text displayed does not matched");
		System.out.println(pageNameLabe);
			
		String invalidEmailPrompt2 = loginPage.validateSelectedEmailIsInvalidErrorPrompt();
		Assert.assertEquals(invalidEmailPrompt2, "The selected email is invalid.", "Text displayed does not matched");
		System.out.println(invalidEmailPrompt2);
		
		boolean text = driver.getPageSource().contains("The selected email is invalid.");
		System.out.println(text);
		Assert.assertTrue(text);

		Thread.sleep(1000);   
		boolean cancelErrorPrompt = loginPage.validateClickOnCancel_SelectedEmailIsInvalidErrorPromptButton();
		Assert.assertTrue(cancelErrorPrompt);
	}
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 15)
	public void verifyUserCannotResetForgetPasswordWithEmptyInputField() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(2000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(4000);    		
        loginPage = loginPage.validateClickOnForgotPasswordLink();
        
        Thread.sleep(2000);    		
        loginPage = loginPage.validateUserForgotPasswordWithValidEmail(prop.getProperty("emptyEmail"));
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://portal.beamsity.com/auth/forgot_password", "URL does not matched");
        
 
//      <--- Validating user can successfully login and running an assertion ---->

		String invalidLoginPrompt = loginPage.validateEmailFieldIsRequiredErrorPrompt();
		Assert.assertEquals(invalidLoginPrompt, "The email field is required.", "Text displayed does not matched");
		System.out.println(invalidLoginPrompt);

		boolean text = driver.getPageSource().contains("The email field is required.");
		Assert.assertTrue(text);
		System.out.println(text);
       
		Thread.sleep(1000);
		boolean cancelErrorPromptBtn = loginPage.validateClickOnCancel_SelectedEmailIsInvalidErrorPromptButton();
		Assert.assertTrue(cancelErrorPromptBtn);
	}
	
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 16)
	public void verifyUserCanNavigateToTermsAndConditionsPage() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(2000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(2000);    		
        privacy_PolicyPage = loginPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/privacy_policy/", "URL does not matched");
        
 
//      <--- Validating user can successfully login and running an assertion ---->
  
		String forgotPasswordNameLabel = loginPage.validateCorrectPrivacyPolicyPageNameLabel();
		Assert.assertEquals(forgotPasswordNameLabel, "Privacy Policy", "Text displayed does not matched");
		System.out.println(forgotPasswordNameLabel);

		boolean text = driver.getPageSource().contains("Privacy Policy");
		Assert.assertTrue(text);
		System.out.println(text);

	}
	
	
	
	
	
	
	
	
	@JiraPolicy(logTicketReady = true)
//	@Test(priority = 17)
	public void verifyUserCanClickOnTermsAndConditionsLink() throws Exception
	{
		loginPage = homePage.validateClickOnLoginLink();
		Thread.sleep(2000);
		
//      <---  Create Array List to keep Tab information ---->
        ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());

        // Navigate to New Tab
        driver.switchTo().window(tabs2.get(1));
         
        Thread.sleep(2000);    		
        privacy_PolicyPage = loginPage.validateClickOnTermsAndConditionsLink();
        
        ArrayList<String> tabs3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs3.get(2));
        
//      <--- Validating login URL and running an assertion ---->
        String url = driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url, "https://beamsity.com/privacy_policy/", "URL does not matched");
        
 
//      <--- Validating user can successfully login and running an assertion ---->
  
		String forgotPasswordNameLabel = loginPage.validateCorrectPrivacyPolicyPageNameLabel();
		Assert.assertEquals(forgotPasswordNameLabel, "Privacy Policy", "Text displayed does not matched");
		System.out.println(forgotPasswordNameLabel);

		boolean text = driver.getPageSource().contains("Privacy Policy");
		Assert.assertTrue(text);
		System.out.println(text);

	}
	

	
	
	

	@AfterMethod 
	public void tearDown() throws Exception
	{
		Thread.sleep(6000);
		driver.quit(); 
	}
	
	
}
