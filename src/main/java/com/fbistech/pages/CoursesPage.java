package com.fbistech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fbistech.base.TestBase;

public class CoursesPage extends TestBase {
	
	
	@FindBy(xpath = "//a[@class='ant-dropdown-trigger ant-dropdown-link']")
	@CacheLookup
	WebElement coursesLink; 
	
	
	
	
	

	//Initializing page objects: 
		public CoursesPage()
		{ 
			PageFactory.initElements(driver, this);
		}
		
		
		
		
		public HomePage clickOnCoursesLink()
		{
			coursesLink.click();
			return new HomePage();
		}
		

}
