package com.fbistech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fbistech.base.TestBase;

public class ForgotPasswordPage extends TestBase {

	
	
	
//	PageFactory - Object Repository 
	
	
	@FindBy(xpath= "//input[@id='email']")   
//	@CacheLookup
	WebElement emailPhoneNoField;
	
	
	@FindBy(xpath = "//*[@class='chakra-icon css-13otjrl']") 
	@CacheLookup
	WebElement showPasswordEye;
	

	@FindBy(xpath = "//input[@id='password']") 
	@CacheLookup
	WebElement passWordField;
	
	
	
	@FindBy(xpath = "//p[contains(text(),'Terms and Conditions')]")  //p[normalize-space()='Terms and Conditions'] 
	@CacheLookup
	WebElement term_ConditionsLink;
	
	
	
	@FindBy(xpath = "//button[@type='button']") //button[contains(text(),'Login')] //button[normalize-space()='Login']
	@CacheLookup
	WebElement loginButton;
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__title css-tidvy5'][normalize-space()='Success.']") //button[contains(text(),'Login')] //button[normalize-space()='Login']
	@CacheLookup
	WebElement loginSuccessPrompt;
	
	
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__desc css-zycdy9'][normalize-space()='Invalid credentials entered']")
	@CacheLookup
	WebElement loginInvalidCredentialsEnteredPrompt;
	
	
	
	
	//div[contains(text(),'Success.')]
	
	
	@FindBy(xpath = " //a[contains(text(),'Forgot your password?')]") 
	@CacheLookup
	WebElement forgotPassWordLink;
	
	
	
	@FindBy(xpath = "//input [@placeholder='Enter email']") 
	@CacheLookup
	WebElement forgotPwdEmailField;
	
	
	@FindBy(xpath = "//button[contains(text(),'Continue')]") 
	@CacheLookup
	WebElement forgotPwdEmailSubmitBtn;
	 
	
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Log In')]")
	@CacheLookup
	WebElement loginPageNameLabel; 
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
	@CacheLookup
	WebElement forgotYourPasswordNameLabel; 
	
	
	
	
	
	
	
	
	
	
	// Initializing the Page Objects | object repository:
		// how to initialize the element with the help of page factory 
		public ForgotPasswordPage()
		{
			PageFactory.initElements(driver, this);
		}
		
	
	
	
	public LoginPage forgetPasswordEmail(String passwordEmail) throws Exception
	{
		Thread.sleep(2000);
		forgotPwdEmailField.sendKeys(passwordEmail);
		Thread.sleep(3000);
		forgotPwdEmailSubmitBtn.click();
		return new LoginPage();
	} 
	
	
}
