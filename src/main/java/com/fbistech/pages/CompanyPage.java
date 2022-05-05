package com.fbistech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fbistech.base.TestBase;

public class CompanyPage extends TestBase {
	

	@FindBy(xpath = " //a[contains(text(),'Company')]")
	@CacheLookup
	WebElement companyLink; 
	
	
	
	
	

	//Initializing page objects:
		public CompanyPage()
		{ 
			PageFactory.initElements(driver, this);
		}
		
		
		
		
		public HomePage clickOnCompanyLink()
		{
			companyLink.click();
			return new HomePage();
		}

}
