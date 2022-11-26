package com.fbistech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fbistech.base.TestBase;

public class LoginPage extends TestBase {

	
//	PageFactory - Object Repository 
	
	
	@FindBy(xpath = "//div[contains(text(),'Log In')]") // WebObject or WebElement 
	@CacheLookup
	WebElement loginPageNameLabel; 
	
	
	
	
	@FindBy(xpath= "//input[@id='email']")   
//	@CacheLookup
	WebElement emailPhoneNoField;
	
	
	

	@FindBy(xpath = "//input[@id='password']") 
	@CacheLookup
	WebElement passWordField;
	
	
	
	
	@FindBy(xpath = "//*[@class='chakra-icon css-13otjrl']") 
	@CacheLookup
	WebElement showPasswordEye;
	
	
	
	
	@FindBy(xpath = "//button[@type='button']") //button[contains(text(),'Login')] //button[normalize-space()='Login']
	@CacheLookup
	WebElement loginButton;
	
	
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__title css-tidvy5'][normalize-space()='Success.']") //button[contains(text(),'Login')] //button[normalize-space()='Login']
	@CacheLookup
	WebElement loginSuccessPrompt;
	
	
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__desc css-zycdy9'][normalize-space()='Invalid credentials entered']")
	@CacheLookup
	WebElement loginInvalidCredentialsEnteredPrompt;
	
		
	
	
//	@FindBy(xpath = "//li[@class='chakra-toast']//*[@class='chakra-icon css-onkibi']") 
//	@CacheLookup
//	WebElement cancelInvalidLoginErrorPromptButton;
	
	
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__desc css-zycdy9'][normalize-space()='The password must be at least 6 characters.']")
	@CacheLookup
	WebElement invalidPasswordLessThan6CharactersPrompt;
	
	
	
//	<----  FORGET PASSWORD PAGE  PageFactory - Object Repository  ----> 
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Forgot Password')]")
	@CacheLookup
	WebElement forgotYourPasswordPageNameLabel; 
	
	 
	
	@FindBy(xpath = " //a[contains(text(),'Forgot your password?')]") 
	@CacheLookup
	WebElement forgotPassWordLink;
	
	
	
	@FindBy(xpath = "//input[@placeholder='Enter email']") 
	@CacheLookup
	WebElement forgotPassowrdInputField;
	
	
	
	@FindBy(xpath = "//button[normalize-space()='Continue']") 
	@CacheLookup
	WebElement forgetPasswordEmailContinueButton;
	
	
	@FindBy(xpath = "//img[@alt='cancel']") 
	@CacheLookup
	WebElement cancel_ForgotPassowrdButton;
	
	
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__desc css-zycdy9']"
			+ "[normalize-space()='The email field is required.']") 
	@CacheLookup
	WebElement emailFieldIsRequiredErrorPrompt;
	
	
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__desc css-zycdy9']"
			+ "[normalize-space()='The password field is required.']") 
	@CacheLookup
	WebElement passwordFieldIsRequiredErrorPrompt;
	
	
	
	

	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__desc css-zycdy9']"
			+ "[normalize-space()='The email must be a valid email address.']") 
	@CacheLookup
	WebElement emailMustBeAValidEmailAddressErrorPrompt;
	
					 

	@FindBy(xpath = "//li[@class='chakra-toast']//div[@id='12']//*[@class='chakra-icon css-onkibi']") //li[@class='chakra-toast']//div[@id='8']//button[@aria-label='Close']
	@CacheLookup
	WebElement cancel_EmailMustBeAValidEmailAddressErrorPrompt;
	
	
	
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__title css-tidvy5'][normalize-space()='Success.']") 
	@CacheLookup
	WebElement successResetPasswordLinkSentPrompt;
	
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__desc css-zycdy9']"
			+ "[contains(text(),'Reset password link has been sent to your register')]") 
	@CacheLookup
	WebElement resetPasswordLinkSentSuccessPrompt;
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//*[@class='chakra-icon css-onkibi']")  
	@CacheLookup
	WebElement cancel_ResetPasswordLinkSentSuccessPrompt;
	
	
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__desc css-zycdy9']"
			+ "[normalize-space()='The selected email is invalid.']") 
	@CacheLookup
	WebElement selectedEmailIsInvalidErrorPrompt;
	  
	
					  																	
	@FindBy(xpath = "//li[@class='chakra-toast']//button[@aria-label='Close']")  
	@CacheLookup
	WebElement cancel_SelectedEmailIsInvalidErrorPrompt;
	
	
	
	
	@FindBy(xpath = "//p[contains(text(),'Terms and Conditions')]")  //p[normalize-space()='Terms and Conditions'] 
	@CacheLookup
	WebElement term_ConditionsLink;
	
	

	
	@FindBy(xpath = "//p[contains(text(),'Terms and Conditions')]")
	@CacheLookup
	WebElement termsAndConditionsNameLabel; 

	
	
	@FindBy(xpath = "//div[contains(text(),'Privacy Policy')]")
	@CacheLookup
	WebElement privacyPolicyPageNameLabel; 
	
	
	

	
	// To Initialize the Page Objects | object repository create the constructor of the class
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this); //the driver is coming from TestB ase class. This => current class objects
	}
	

	public String validateLoginPageTitle() 
	{
		return driver.getTitle(); //this method should return title of the page 
	}
	
	
	
	
	public String validateCorrectLoginPageName()
	{
		return loginPageNameLabel.getText();
	}
	
	
	
	
	public PortalDashboardPage validateUserLoginWith_ValidCredentials(String eMail, String passWord) throws Exception
	{
		emailPhoneNoField.sendKeys(eMail);
		Thread.sleep(2000);
		passWordField.sendKeys(passWord);
		Thread.sleep(2000);
		showPasswordEye.click(); 
		Thread.sleep(2000); 
		loginButton.click(); 
		Thread.sleep(5000); 

		//After login the method should return PortalDashboardPage
		return new PortalDashboardPage();
	}
	
	
	
	public LoginPage validateUserLoginWith_InvalidCredentials(String invalidEmail, String invalidPassWord) throws Exception
	{
		emailPhoneNoField.sendKeys(invalidEmail);
		Thread.sleep(2000);
		passWordField.sendKeys(invalidPassWord);
		Thread.sleep(2000);
		showPasswordEye.click();
		Thread.sleep(2000); 
		loginButton.click(); 
		return new LoginPage();
	}
	
	
	
	
	public LoginPage validateUserCannotLoginWith_ValidEmail_InvalidPassword(String eMail, String invalidPassWord) throws Exception
	{
		
		emailPhoneNoField.sendKeys(eMail);
		Thread.sleep(2000);
		passWordField.sendKeys(invalidPassWord);
		Thread.sleep(2000);
		showPasswordEye.click();
		Thread.sleep(2000); 
		loginButton.click();
		return new LoginPage(); 
	}
	
	
	
	
	public LoginPage validateUserCannotLoginWith_InvalidEmail_ValidPassword(String invalidEmail, String passWord) throws Exception
	{
		emailPhoneNoField.sendKeys(invalidEmail);
		Thread.sleep(2000);
		passWordField.sendKeys(passWord);
		Thread.sleep(2000);
		showPasswordEye.click();
		Thread.sleep(2000); 
		loginButton.click();
//		Thread.sleep(3000); 
//		cancelEmailMustBeAValidEmailAddressErrorPrompt.click();
		return new LoginPage(); 
	}
	
	
	
	
	public String validateLoginSuccessPrompt()
	{
		return loginSuccessPrompt.getText();
	}
	
	
	public String validateLoginInvalidCredentialsEntered()
	{
		return loginInvalidCredentialsEnteredPrompt.getText();
	}
	
	
	
	
	
	public String validateEmailFieldIsRequiredErrorPrompt()
	{
		return emailFieldIsRequiredErrorPrompt.getText();
	}
	
	
	public String validatePasswordFieldIsRequiredErrorPrompt()
	{
		return passwordFieldIsRequiredErrorPrompt.getText();
	}
	
	
	
	
		
	public String validateEmailMustBeAValidEmailAddressErrorPrompt()
	{
		return emailMustBeAValidEmailAddressErrorPrompt.getText();
	}
	
	
	public LoginPage validateClickOnCancel_EmailMustBeAValidEmailAddressErrorPromptBtn()
	{
		cancel_EmailMustBeAValidEmailAddressErrorPrompt.click();
		return new LoginPage();
	}
	
		
	public boolean validateClickOnCancel_EmailMustBeAValidEmailAddressErrorPromptButton()
	{
		cancel_EmailMustBeAValidEmailAddressErrorPrompt.click();
		return true;
	}
	
	
	
	
//	<----  FORGET PASSWORD ACTIONS  ----> 
		
	
	public LoginPage validateUserForgotPasswordWithValidEmail(String userEmail) throws Exception
	{
		forgotPassowrdInputField.sendKeys(userEmail);
		Thread.sleep(2000);
		forgetPasswordEmailContinueButton.click();
		Thread.sleep(2000); 
		return new LoginPage(); 
	}
	
	
	
	public String validateSuccessResetPasswordLinkSentPrompt()
	{
		return successResetPasswordLinkSentPrompt.getText();
	}
	

	
	public String validateResetPasswordLinkSentSuccessPrompt()
	{
		return resetPasswordLinkSentSuccessPrompt.getText();
	}
	
	
	public LoginPage validateClickOnCancel_ResetPasswordLinkSentSuccessPrompt()
	{
		cancel_ResetPasswordLinkSentSuccessPrompt.click();
		return new LoginPage();
	}
	
	
	
	

	public String validateSelectedEmailIsInvalidErrorPrompt()
	{
		return selectedEmailIsInvalidErrorPrompt.getText();
	}
	
	
	public LoginPage validateClickOnCancel_SelectedEmailIsInvalidErrorPromptBtn()
	{
		cancel_SelectedEmailIsInvalidErrorPrompt.click();
		return new LoginPage();
	}
	
	public boolean validateClickOnCancel_SelectedEmailIsInvalidErrorPromptButton()
	{
		cancel_SelectedEmailIsInvalidErrorPrompt.click();
		return true;
	}
	
	
	
	
	
	
	
	
	
//	public LoginPage validateClickOnCancelInvalidLoginErrorPromptButton()
//	{
//		cancelInvalidLoginErrorPromptButton.click();
//		return new LoginPage();
//	}
	
	
	
	
	public String validatePasswordToBe6Characters()
	{
		return invalidPasswordLessThan6CharactersPrompt.getText();
	}
	
	
	

	
	
	public LoginPage validateClickOnForgotPasswordLink()
	{
		forgotPassWordLink.click();
		return new LoginPage(); 
	}
	

	public LoginPage validateClickOnCancelForgetPasswordProcess()
	{
		cancel_ForgotPassowrdButton.click();
		return new LoginPage(); 
	}
	
	
	public String validateCorrectForgetPasswordPageNameLabel()
	{
		return forgotYourPasswordPageNameLabel.getText();
	}
	
	

	
	public Privacy_PolicyPage validateClickOnTermsAndConditionsLink()
	{
		term_ConditionsLink.click();
		return new Privacy_PolicyPage(); 
	}
	
	
	
	public String validateCorrectTermsAndConditionsNameLabel()
	{
		return termsAndConditionsNameLabel.getText();
	}
	
	
	
	
	public String validateCorrectPrivacyPolicyPageNameLabel()
	{
		return privacyPolicyPageNameLabel.getText();
	}
	
	
}
