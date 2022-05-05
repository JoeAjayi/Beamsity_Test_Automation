package com.fbistech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fbistech.base.TestBase;

public class SignupPage extends TestBase {
	
	// Page Library Object
	
	@FindBy(xpath = "//input[@placeholder='First Name']") 
	WebElement firstName;
	

	@FindBy(xpath = "//input[@placeholder='Last Name']") 
	WebElement lastName;
	
	
	@FindBy(xpath = "//input[@placeholder='Phone Number']") 
	WebElement phoneNo;
	
	
	@FindBy(xpath = "//input[@placeholder='Email Address']") 
	WebElement emailAddress;
	
	
	@FindBy(xpath = "//input[@placeholder='Password']") 
	WebElement password;
	
	@FindBy(xpath = "//button[@type='button']") 
	WebElement submitBtn;
	
	
	@FindBy(xpath = "//a[@id='signUp-login']") 
	@CacheLookup 
	WebElement loginLink;
	
	
	
	//Initializing the page objects;
	public SignupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Actions:
	public String validateSignUpPageTitle()
	{
		return driver.getTitle();
	}
	
 
	
	public LoginPage Signup(String fN, String lN, String mobileNo, String email, String pwd)
	{
		firstName.sendKeys(fN);
		lastName.sendKeys(lN);
		phoneNo.sendKeys(mobileNo);
		emailAddress.sendKeys(email);
		password.sendKeys(pwd);
		submitBtn.click();
		
		return new LoginPage();  
	}
	
	
	public LoginPage clickOnLoginLink()
	{
		loginLink.click();
		return new LoginPage();
	}
	
	
	
}
