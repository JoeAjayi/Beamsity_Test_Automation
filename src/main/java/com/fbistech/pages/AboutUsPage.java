package com.fbistech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fbistech.base.TestBase;

public class AboutUsPage extends TestBase {

	
//	Page Library 
//	Page Factory | Object Repository 
	
	
	@FindBy(xpath = "//div[@class='leftNavside']//a//*[local-name()='svg']") //div[@class='leftNavside']//a
	@CacheLookup
	WebElement beamsityLogo;
	

	@FindBy(xpath = "//div[contains(text(),'About Us')]") 
	@CacheLookup
	WebElement aboutUsPageNameLabel; 
	
	
	
	
	//Initializing page objects:
	public AboutUsPage()
	{
		PageFactory.initElements(driver, this); 
	}
			
	
	public String validateCorrectAboutUsPageName()
	{
		return aboutUsPageNameLabel.getText();
	}
	
	
	public HomePage validateClickOnBeamsityLogo() 
	{
		beamsityLogo.click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
}
