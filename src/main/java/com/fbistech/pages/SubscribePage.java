package com.fbistech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fbistech.base.TestBase;

public class SubscribePage extends TestBase {
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Subscribe')]")
	@CacheLookup
	WebElement subscribeLink; 
	
	
	
	
	

	//Initializing page objects:
		public SubscribePage()
		{ 
			PageFactory.initElements(driver, this);
		}
		
		
		
		
		public HomePage clickOnSubscribeLink()
		{
			subscribeLink.click();
			return new HomePage();
		}

}
