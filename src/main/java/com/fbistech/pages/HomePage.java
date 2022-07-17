package com.fbistech.pages;

import java.util.ArrayList;

import javax.xml.soap.Text;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.reactivestreams.Subscriber;

import com.fbistech.base.TestBase;
import com.google.common.eventbus.Subscribe;

public class HomePage extends TestBase{
	 
	
//	Page Library 
//	Page Factory | Object Repository 
	
	
	@FindBy(xpath = "//div[@class='leftNavside']//a//*[local-name()='svg']") //div[@class='leftNavside']//a
	@CacheLookup
	WebElement beamsityLogo;
	
	
	
	
	WebElement userNameLabel;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Schools/Organizations')]") // "//a[contains(text(),'For Sponsors/Organization')]"
	@CacheLookup
	WebElement schools_OrganizationsLink;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Teach on BeamSity')]") 
	@CacheLookup
	WebElement techOnBeamsityLink;
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Contact Us')]")  //span[contains(text(),'Contact Us')] | //a[text()='Contact Us']
	@CacheLookup
	WebElement contactUsLink_Navbar;
	
	
	
	@FindBy(xpath = "//a[@href='/contactus']//button[@type='button']")   //button[contains(.,'Contact us')]
	@CacheLookup
	WebElement contactUsLink2;
	
	
	@FindBy(xpath = "//div[contains(text(),'Contact Us!')]")
	@CacheLookup
	WebElement contactUsText;
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Login']") // "//a[contains(text(),'Sign In')]"
	@CacheLookup
	WebElement logInLink;
	
	
	
	@FindBy(xpath = "//a[normalize-space()='Partner with us']")
	@CacheLookup
	WebElement partnerWithUsLink;
	
	
	

//	  <----------------  PAGE NAEME LABEL  -------------------------->	
	
	

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
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Privacy Policy')]")
	@CacheLookup
	WebElement privacyPolicyPageNameLabel;
	
	
	
	
	@FindBy(xpath = "//span[contains(text(),'50 Awolowo Rd, Ikoyi 106104, Lagos')]")
	@CacheLookup
	WebElement contacUsAddressFooterNameLabel;
	
	
	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__title css-14esyki'][normalize-space()='Success.']")
	@CacheLookup
	WebElement signUpToMailingListSuccessPrompt;
	

	
	@FindBy(xpath = "//li[@class='chakra-toast']//div[@class='chakra-alert__desc css-2xkhb3'][normalize-space()='The email must be a valid email address.']")
	@CacheLookup
	WebElement invalidEmailSignUpToMailingListErrorPrompt;
	
	
	
	
	
	@FindBy(xpath = "//span[contains(.,'BeamSity')]")
	@CacheLookup
	WebElement googlePlayPageNameLabel;

	
	
	
	@FindBy(xpath = "//a[contains(text(),'info@beamsity.com')]")
	@CacheLookup
	WebElement emailAddress;

	
	
	
//  <----------------  GET STARTED  -------------------------->		
	
	
	@FindBy(xpath = "//button[@class='ant-btn started']") 
	@CacheLookup
	WebElement getStartedLink1;
	
	
	@FindBy(xpath = "//div[@class='sectionTwoGroup']//a")
	@CacheLookup
	WebElement getStartedLink2;
	
	
	@FindBy(xpath = "//div[@class='sectionFourGroup']//a")
	@CacheLookup
	WebElement getStartedLink3;
	
	
	
	
	@FindBy(xpath = "//span[contains(text(),'Learn More')]") 	//span[normalize-space()='Learn More']
	@CacheLookup
	WebElement learnMoreLink;
	

	
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
	WebElement  contactEmail;
	

	
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
	
	
//  <----------------  DOWNLOAD -------------------------->	
	
	@FindBy(xpath = "//div[@class='right']//a//*[local-name()='svg']")
	@CacheLookup
	WebElement googlePlay;
	
	
	
	
	@FindBy(xpath = "//button[@class='ant-btn']//*[local-name()='svg']") 
	@CacheLookup
	WebElement googlePlayButton1;
	
	
	
	@FindBy(xpath = "//*[name()='div' and contains(@class,'footerList')]"
			+ "//*[name()='a' and contains(@href,'https://pl')]"
			+ "//*[name()='button' and contains(@type,'button')]")
	@CacheLookup
	WebElement googlePlayButton2;
	
	
	
	
	
	@FindBy(xpath = "//button[normalize-space()='Installed']") //button[contains(text(),'Installed')]
	@CacheLookup
	WebElement installationLink;
	
	
	
	
	@FindBy(xpath = "//span[@class='DPvwYc']") 
	@CacheLookup
	WebElement selectInstallationPhone;
	
	
	

	 
	
	

	
	

//	Initializing the elements with the help of page factory: 
//	Using the constructor to initializing all the Page Factories | Page objects
//	This means current class object and all the elements will be initialize the by the driver  
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	} 
	  
	
	
//	Actions:
	public String validateHomePageTitle() 
	{
		return driver.getTitle(); 
	}
	
	
	
	public boolean validateBeamsityLogo()
	{
		return beamsityLogo.isDisplayed();
//		this will return true or false 
	}
	
	
	public HomePage validateClickOnBeamsityLogo() 
	{
		beamsityLogo.click();
		return new HomePage();
	}
	
	
	public boolean verifyUserNameOnHomePage()
	{
		
		return userNameLabel.isDisplayed();
	}
	
		

	
	public Schools_OrganizationsPage validateClickOnSchools_OrganizationsLink() 
	{
		schools_OrganizationsLink.click();
		return new Schools_OrganizationsPage(); 
	}
	
	
	public String validateCorrectSchools_OrganizationsPageName()
	{
		return schools_OrganizationsPageNameLabel.getText();
	}
	
	
	
	
	
	public TechOnBeamsityPage validateClickOnTechOnBeamsityLink()
	{
		techOnBeamsityLink.click();
		return new TechOnBeamsityPage();
	}
	
	
	public String validateCorrectTeachOnBeamsityPageName() throws Exception
	{
		return teachOnBeamsityPageNameLabel.getText();
	}
	
	
	
	
	
	public ContactUsPage validateClickOnContactUsLinkOnNavBar() throws Exception
	{
		contactUsLink_Navbar.click();
		return new ContactUsPage();
	}
	
	
	public ContactUsPage validateClickOnContactUsLinks() throws Exception
	{
		Thread.sleep(5000);
		contactUsLink_Navbar.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 4000);");
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
	
	
	
	
	public LoginPage validateClickOnLoginLink()
	{
		logInLink.click();
		return new LoginPage();
	}
	  
	
	public String validateCorrectLoginPageName()
	{
		return loginPageNameLabel.getText();
	}
	

	
	public PartnerWithUsPage validateClickOnPartnerWithUsLink()
	{
		partnerWithUsLink.click();
		return new PartnerWithUsPage();
	}
	
	
	public String validateCorrectPartnerWithUsPageName()
	{
		return partnerWithUsPageNameLabel.getText();
	}
	

	
	public PartnerWithUsPage validateClickOnGetStartedLinks() throws Exception
	{
		 getStartedLink1.click();
		 Thread.sleep(4000);
		 driver.navigate().back();
	  	 Thread.sleep(4000);
	  	 JavascriptExecutor scroll = (JavascriptExecutor) driver;
		 scroll.executeScript("window.scrollBy(0, 1450);");
		 Thread.sleep(4000);
		 getStartedLink2.click(); 
		 Thread.sleep(4000);
		 driver.navigate().back();
		 Thread.sleep(4000);
		 scroll.executeScript("window.scrollBy(0, 1700);");
		 Thread.sleep(4000);
		 getStartedLink3.click(); 
		 return new PartnerWithUsPage();
	}
	
	
	

	
	public TechOnBeamsityPage validateClickOnLearnMoreLink() throws Exception
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 6400);");
		Thread.sleep(4000);
		learnMoreLink.click();
		return new TechOnBeamsityPage();
	}
	
	
	
	

	public AboutUsPage validateClickOnAboutUsLink() throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", aboutUsLink);
		Thread.sleep(4000);
		aboutUsLink.click();
		return new AboutUsPage();
	}
	
	
	public String validateCorrectAboutUsPageName()
	{
		return aboutUspageNameLabel.getText();
	}
	
	
	
	

	public Privacy_PolicyPage validateClickOnPrivacyPolicyLink() throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", privacyPolicyLink);
		Thread.sleep(4000);
	    privacyPolicyLink.click();
		return new Privacy_PolicyPage();
	}
	
	
	public String validateCorrectPrivacyPolicyPageName()
	{
		return privacyPolicyPageNameLabel.getText();
	}
	
	
	
	
	
	
	
	public HomePage validateClickOnContactUsOfficeAddress() throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", contactAddress);
		Thread.sleep(4000);
		contactAddress.click();
		return new HomePage();  
	}
	
	
	
	public String validateCorrectContactUsOfficeAddressFooterName()
	{
		return contacUsAddressFooterNameLabel.getText();
	}
	
	

	
	
	
	
	
	public HomePage validateSignUpToMailingList(String userEmail) throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", signUpMailingListButton);
		Thread.sleep(3000);
		mailingListEmailField.sendKeys(userEmail);
		Thread.sleep(3000);
//		signUpMailingListButton.click();
		return new HomePage();
	}
	
	
	
	public String validateSignUpToMailingListSuccessPrompt()
	{
		return signUpToMailingListSuccessPrompt.getText();
	}
	
	
	
	public HomePage validateSignUpToMailingListWithInvalidEmailFormat(String emailWithOutDotCom) throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", signUpMailingListButton);
		Thread.sleep(3000);
		mailingListEmailField.sendKeys(emailWithOutDotCom);
		Thread.sleep(3000);
//		signUpMailingListButton.click();
		return new HomePage();
	}
	
	
	
	public String validateSignUpToMailingListInvalidEmailErrorPrompt()
	{
		return invalidEmailSignUpToMailingListErrorPrompt.getText();
	}
	
	
	
	
	
	
	public HomePage validateClickOnGooglePlayLlink() throws Exception
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 4640);");
		Thread.sleep(4000);
		googlePlayButton1.click();
		Thread.sleep(6000);

		ArrayList<String> switchToInitialTab = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(switchToInitialTab.get(0));
		Thread.sleep(4000);
		
		scroll.executeScript("arguments[0].scrollIntoView(true)", googlePlayButton2);
		Thread.sleep(4000);
		googlePlayButton2.click();	
		return new HomePage();
	}
	
	
	public String validateCorrectGooglePlayPageName() throws Exception
	{
		return googlePlayPageNameLabel.getText();
	}
	
	
	
	
	
	public HomePage validateUserInstallBeamsityApp() throws Exception
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
//		
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	public HomePage validateClickOnContactEmail() throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", contactEmail);
		Thread.sleep(4000);
		contactEmail.click();
		return new HomePage();
	}
	
	
	public String validateCorrectEmailAddressName()
	{
		return emailAddress.getText();
	}
	
	

	


	
}
