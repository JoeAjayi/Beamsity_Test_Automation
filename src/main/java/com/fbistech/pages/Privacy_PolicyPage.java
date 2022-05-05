package com.fbistech.pages;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.fbistech.base.TestBase;

public class Privacy_PolicyPage extends TestBase {

	
//	Page Library 
//	Page Factory | Object Repository 
	
	
	@FindBy(xpath = "//div[@class='leftNavside']//a//*[local-name()='svg']") //div[@class='leftNavside']//a
	@CacheLookup
	WebElement beamsityLogo;
		

	

	@FindBy(xpath = "//a[contains(text(),'Schools/Organizations')]") // "//a[contains(text(),'For Sponsors/Organization')]"
	@CacheLookup
	WebElement schools_OrganizationsLink;
	
	
	
	

	@FindBy(xpath = "//a[contains(text(),'Teach on BeamSity')]") 
	@CacheLookup
	WebElement techOnBeamsityLink;
	
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Contact Us!')]")
	@CacheLookup
	WebElement contactUsText;
	

	
	
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")  //span[contains(text(),'Contact Us')] | //a[text()='Contact Us']
	@CacheLookup
	WebElement contactUsLink1;
	
	
	
	@FindBy(xpath = "//button[normalize-space()='Contact Us']")
	@CacheLookup
	WebElement contactUsLink2;
	
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Login']") // "//a[contains(text(),'Sign In')]"
	@CacheLookup
	WebElement logInLink;
	
	
	
	@FindBy(xpath = "//p[contains(text(),'Terms and Conditions')]")  //p[normalize-space()='Terms and Conditions'] 
	@CacheLookup
	WebElement term_ConditionsLink;
	
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Partner with us']")
	@CacheLookup
	WebElement partnerWithUsLink;
	
//	---------
	
	
	@FindBy(xpath = "//span[normalize-space()='50 Awolowo Road, Ikoyi, Lagos, Nigeria']")
	@CacheLookup
	WebElement officeAddress;
	

	
	@FindBy(xpath = "//a[contains(text(),'info@beamsity.com')]")
	@CacheLookup
	WebElement contactEmail;
	
	
	

	@FindBy(xpath = "//div[@class='innerContainer']//div[1]")
	@CacheLookup
	WebElement phoneNumber;
	
	
	
	@FindBy(xpath = "//span[normalize-space()='Get Direction']")
	@CacheLookup
	WebElement getDirection;
	

//	  <----------------  PAGE NAEME LABEL  -------------------------->	
	
	
	@FindBy(xpath = "//div[contains(text(),'Privacy Policy')]")
	@CacheLookup
	WebElement privacyPolicyPageNameLabel; 
	
	

	@FindBy(xpath = "//h5[contains(text(),'BeamSity for Organizations')]") 
	@CacheLookup
	WebElement schools_OrganizationsPageNameLabel; 
	
	
	
	@FindBy(xpath = "//h5[contains(text(),'Make an Impact')]")
	@CacheLookup
	WebElement teachOnBeamsityPageNameLabel; 
	

	
	
	@FindBy(xpath = "//div[contains(text(),'Contact Us!')]")
	@CacheLookup
	WebElement contactUsPageNameLabel;
	
	
	

	@FindBy(xpath = "//div[normalize-space()='Contact Us']")
	@CacheLookup
	WebElement contactUsFooterNameLabel;
	
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Log In')]")
	@CacheLookup
	WebElement loginPageNameLabel; 
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Partner with us today')]")
	@CacheLookup
	WebElement partnerWithUsPageNameLabel;
	
	
	
	
	@FindBy(xpath = "//div[contains(text(),'About Us')]")
	@CacheLookup
	WebElement aboutUspageNameLabel;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	@CacheLookup
	WebElement aboutUspageFooterNameLabel;
	
	
	@FindBy(xpath = "//div[@class='leftSection']//div[2]")
	@CacheLookup
	WebElement contactPhoneNumber;
	
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	@CacheLookup
	WebElement privacyPolicyFooterNameLabel;
	
	
	
	
	@FindBy(xpath = "//span[contains(text(),'50 Awolowo Rd, Ikoyi 106104, Lagos')]")
	@CacheLookup
	WebElement contacUsAddressFooterNameLabel;
	
	
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__title css-14esyki'][normalize-space()='Success.']")
	@CacheLookup
	WebElement signUpToMailingListSuccessPrompt;
	
	
	
	
	@FindBy(xpath = "//span[contains(.,'BeamSity')]")
	@CacheLookup
	WebElement googlePlayPageNameLabel;

	
	
	
	@FindBy(xpath = "//a[contains(text(),'info@beamsity.com')]")
	@CacheLookup
	WebElement emailAddress;
	

	
//  <----------------  COMPANY  -------------------------->	
	

	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	@CacheLookup
	WebElement aboutUsLink;

	
	@FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
	@CacheLookup
	WebElement privacyPolicyLink;
	
	 
	

//  <----------------  CONTACT US  -------------------------->	
	
	@FindBy(xpath = "//a[contains(text(),'50, Awolowo Road Ikoyi lagos, Nigeria.')]")
	@CacheLookup
	WebElement  contactAddress;
	
	
	@FindBy(xpath = "//a[contains(text(),'info@beamsity.com')]")
	@CacheLookup
	WebElement  contactEmailFooter;
	

	
//  <----------------  SIGN UP TO MAILING LIST  -------------------------->	
	
	
	@FindBy(xpath = "//input[@placeholder='Email Address']")
	@CacheLookup
	WebElement mailingListEmailField;
	
	
	@FindBy(xpath = "//span[contains(text(),'Signup')]")
	@CacheLookup
	WebElement signUpMailingListButton;
	

	                
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__title css-14esyki'][normalize-space()='Success.']") //button[contains(text(),'Login')] //button[normalize-space()='Login']
	@CacheLookup
	WebElement signUpMailingListSuccess;
	
	

	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__desc css-2xkhb3'][normalize-space()='The email must be a valid email address.']")
	@CacheLookup
	WebElement invalidEmailSignUpToMailingListErrorPrompt;
	
	
//  <----------------  DOWNLOAD -------------------------->	
	
	@FindBy(xpath = "//div[@class='right']//a//*[local-name()='svg']")
	@CacheLookup
	WebElement googlePlay;
	
	
	@FindBy(xpath = "//button[@class='ant-btn']//*[local-name()='svg']") //div[@class='right']//a//*[local-name()='svg']
	@CacheLookup
	WebElement googlePlayButton1;
	
	
	
	@FindBy(xpath = "//*[name()='div' and contains(@class,'footerList')]"
			+ "//*[name()='a' and contains(@href,'https://pl')]"
			+ "//*[name()='button' and contains(@type,'button')]")
	@CacheLookup
	WebElement googlePlayButton2;
	
	
	
	@FindBy(xpath = "//button[contains(text(),'Installed')]") //button[normalize-space()='Installed']  
	@CacheLookup
	WebElement installationLink;
	
	
	
	
	@FindBy(xpath = "//span[@class='DPvwYc']") 
	@CacheLookup
	WebElement selectInstallationPhone;
	
	
	
	
	
	
	//Initializing page objects:
	public Privacy_PolicyPage()
	{
		PageFactory.initElements(driver, this); 
	}
			
	
	public String validateCorrectPrivacy_PolicyPageName()
	{
		return privacyPolicyPageNameLabel.getText();
	}
	
	
	public HomePage validateClickOnBeamsityLogo() 
	{
		beamsityLogo.click();
		return new HomePage();
	}
	
	
	
	public Privacy_PolicyPage validateClickOnTermsAndConditionsLink()
	{
		term_ConditionsLink.click();
		return new Privacy_PolicyPage(); 
	}
	
	
	public String validateCorrectPrivacyPolicyPageNameLabel()
	{
		return privacyPolicyPageNameLabel.getText();
	}
	
	
	
	
	
	
	
	
	
	public Privacy_PolicyPage validateClickOnSchools_OrganizationsLink()
	{
		schools_OrganizationsLink.click();
		return new Privacy_PolicyPage(); 
	}
	
	
	public String validateCorrectSchools_OrganizationsPageName()
	{
		return schools_OrganizationsPageNameLabel.getText();
	}
	
	
	
	public Privacy_PolicyPage validateClickOnTechOnBeamsityLink()
	{
		techOnBeamsityLink.click();
		return new Privacy_PolicyPage();
	}
	
	
	public String validateCorrectTeachOnBeamsityPageName() throws Exception
	{
		return teachOnBeamsityPageNameLabel.getText();
	}
	
	
	
	
	
	public Privacy_PolicyPage validateClickOnContactUsLinkOnNavBar() throws Exception
	{
		contactUsLink1.click();
		return new Privacy_PolicyPage();
	}
	
	
	public ContactUsPage validateClickOnContactUsLinks() throws Exception
	{
		contactUsLink1.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 2600);");
		Thread.sleep(4000);
		contactUsLink2.click();
		return new ContactUsPage();
	}
	
	
	public String validateCorrectContactUsPageName()
	{
		return contactUsPageNameLabel.getText();
	}
	
	

	public String validateCorrectContactUsFooterName()
	{
		return contactUsFooterNameLabel.getText();
	}
	
	
	
	
	
	
	public Privacy_PolicyPage validateClickOnLoginLink() throws Exception
	{
		logInLink.click();
		return new Privacy_PolicyPage();
	}
	  
	
	public String validateCorrectLoginPageName()
	{
		return loginPageNameLabel.getText();
	}
	
	
	
	
	
	
	public Privacy_PolicyPage validateClickOnPartnerWithUsLink()
	{
		partnerWithUsLink.click();
		return new Privacy_PolicyPage();
	}
	

	public String validateCorrectPartnerWithUsPageName()
	{
		return partnerWithUsPageNameLabel.getText();
	}
	
	

	
	
//------------------	
	
	public boolean validateOfficeAdressLabel() 
	{
		return officeAddress.isDisplayed();	
	}


	
	
	
	public String validateCorrectContactOfficePhoneNumber() throws Exception
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 1100);");
		Thread.sleep(4000);
		return contactPhoneNumber.getText();
	}
	

	

	
	
	
	
	public Privacy_PolicyPage validateClickOnAboutUsLink() throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", aboutUsLink);
		Thread.sleep(4000);
		aboutUsLink.click();
		return new Privacy_PolicyPage();
	}
	
	
	public String validateCorrectAboutUsPageName()
	{
		return aboutUspageNameLabel.getText();
	}
	
	public String validateCorrectAboutUsFooterName()
	{
		return aboutUspageFooterNameLabel.getText();
	}
	
	
	
	
	public Privacy_PolicyPage validateClickOnPrivacyPolicyLink() throws Exception
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 4590)");
		Thread.sleep(4000);
	    privacyPolicyLink.click();
		return new Privacy_PolicyPage();
	}

	
	public String validateCorrectPrivacyPolicyPageName()
	{
		return privacyPolicyPageNameLabel.getText();
	}
	
	
	public String validateCorrectPrivacyPolicyFooterName()
	{
		return privacyPolicyFooterNameLabel.getText();
	}
	
	
	
	
	

	public Privacy_PolicyPage validateClickOnContactUsOfficeAddress() throws Exception
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 4590)");
		Thread.sleep(5000);
		contactAddress.click();
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(3));
//		Thread.sleep(5000);

		
		
		return new Privacy_PolicyPage();
	}
	
	
	public String validateCorrectGoogleMapContactUsOfficeAddress()
	{
		return contacUsAddressFooterNameLabel.getText();
	}
	
	
	
	

	
	public Privacy_PolicyPage  validateClickOnContactEmail() throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", contactEmail);
		Thread.sleep(3000);
		contactEmail.click();
		return new Privacy_PolicyPage();
	}
	
	
	public String validateCorrectEmailAddressName()
	{
		return emailAddress.getText();
	}
	
	
	
	
	
	

	public Privacy_PolicyPage validateSignUpToMailingList(String userEmail) throws Exception
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 4590);");
		Thread.sleep(3000);
		mailingListEmailField.sendKeys(userEmail);
		Thread.sleep(4000);
//		signUpMailingListButton.click();
		return new Privacy_PolicyPage();
	}
	
	
	
	
	public String validateSignUpToMailingListSuccessPrompt()
	{
		return signUpToMailingListSuccessPrompt.getText();
	}
	
	
	
	
	
	public Privacy_PolicyPage validateSignUpToMailingListWithInvalidEmailFormat(String emailWithoutDomeNameExtension) throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", signUpMailingListButton);
		Thread.sleep(3000);
		mailingListEmailField.sendKeys(emailWithoutDomeNameExtension);
		Thread.sleep(4000);
//		signUpMailingListButton.click();
		return new Privacy_PolicyPage();
	}
	
	
	
	public String validateSignUpToMailingListInvalidEmailErrorPrompt()
	{
		return invalidEmailSignUpToMailingListErrorPrompt.getText();
	}
	
	
	
	
	
	
	public Privacy_PolicyPage validateClickOnGooglePlayLlink() throws InterruptedException
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
//		scroll.executeScript("window.scrollBy(0, 4590);");
//		Thread.sleep(4000);
//		googlePlayButton1.click();	
		
//		Switch back to the initial tab 
//		Thread.sleep(6000);
//		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(tabs2.get(0));
		
//		Scroll down and click Google play
		scroll.executeScript("arguments[0].scrollIntoView(true)", googlePlayButton2);
		Thread.sleep(4000);
		googlePlayButton2.click();	
		
		return new Privacy_PolicyPage();
	}
	
	
	
	public String validateCorrectGooglePlayPageName() throws Exception
	{
		return googlePlayPageNameLabel.getText();
	}
	
	
	
	
	
	
	
	public Privacy_PolicyPage validateUserInstallBeamsityApp() throws Exception
	{
		Thread.sleep(4000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", googlePlayButton2);
		
		Thread.sleep(4000);
		googlePlayButton2.click(); 
		
		
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		Thread.sleep(4000);		
		installationLink.click();
		
//		Thread.sleep(4000);
//		selectInstallationPhone.click();
		return new Privacy_PolicyPage();
	}
	
	
	

		
		
		
		
		

}