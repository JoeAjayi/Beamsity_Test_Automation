package com.fbistech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.fbistech.base.TestBase;

public class TutorPage extends TestBase{
	
	
//	PageFactory - Object Repository 

	@FindBy(xpath = "//button[@id='Tutor']") 
	WebElement tutorFormBtn;
	
	@FindBy(xpath = "//select[@id='interest']") 
	WebElement selectInterest;
	
	@FindBy(xpath = "//input[@id='first_name']") 
	WebElement firstName;
	
	@FindBy(xpath = "//input[@id='last_name']") 
	WebElement lastName;
	
	@FindBy(xpath = "//input[@id='email']") 
	WebElement emailAddress;

	@FindBy(xpath = "//input[@id='phone_number']") 
	WebElement phoneNo;

	@FindBy(xpath = "//select[@id='Course_of_interest']") 
	WebElement selectCourseOfInterest;
	
	@FindBy(xpath = "//input[@id='Course_of_interest']") 
	WebElement uploadCourseFile;
	
	@FindBy(xpath = "//button[contains(text(),'Proceed')]") 
	WebElement proceedBtn;





//Initializing page objects:
	public TutorPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public TutorPage clickOnTutorFormBtn()
	{
		tutorFormBtn.click();
		return new TutorPage();
	}
//	
	
	 
	
	public HomePage createNewTutor(String fN, String lN, String email, String mobileNo, String courseFile)
	{	
		
		Select selectInterestdd = new Select(selectInterest);
		selectInterestdd.selectByIndex(3);
		
		firstName.sendKeys(fN);
		lastName.sendKeys(lN);
		emailAddress.sendKeys(email);
		phoneNo.sendKeys(mobileNo);
		uploadCourseFile.sendKeys(courseFile);
		
		
		
		Select selectCourseOfInterestdd = new Select(selectCourseOfInterest);
		selectCourseOfInterestdd.selectByVisibleText("course two");
		
		proceedBtn.click();
		return new HomePage();
	} 
	
	
	
}	
	
	 