package com.fbistech.pages;

import java.awt.Window;
import java.util.ArrayList;

import org.apache.commons.exec.launcher.Java13CommandLauncher;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.fbistech.base.TestBase;

public class Schools_OrganizationsPage extends TestBase{

	
	
	
//	PageFactory - Object Repository 
	
	

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
	
	
	
	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	@CacheLookup
	WebElement aboutUspageFooterNameLabel;
	
	
	
	
	@FindBy(xpath = "//div[contains(text(),'Privacy Policy')]")
	@CacheLookup
	WebElement privacyPolicyPageNameLabel;
	
	
	
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

	
	
	
	
	
//  <----------------  GET STARTED  -------------------------->		
	
	
	@FindBy(xpath = "//button[@class='ant-btn started']") 
	@CacheLookup
	WebElement getStartedLink1;
	
	
	
	

	
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
	
	
	
	@FindBy(xpath = "//button[normalize-space()='Installed']") //button[contains(text(),'Installed')]
	@CacheLookup
	WebElement installationLink;
	
	
	
	
	@FindBy(xpath = "//span[@class='DPvwYc']") 
	@CacheLookup
	WebElement selectInstallationPhone;
	
	
	
	
	
	
	



//Initializing page objects:
	public Schools_OrganizationsPage()
	{
		PageFactory.initElements(driver, this); 
	}
	
	
	public HomePage validateClickOnBeamsityLogo() 
	{
		beamsityLogo.click();
		return new HomePage();
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
		contactUsLink1.click();
		return new ContactUsPage();
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
	
	
	
	
	
	
	public LoginPage validateClickOnLoginLink() throws Exception
	{
		logInLink.click();
		return new LoginPage();
	}
	  
	
	public String validateCorrectLoginPageName()
	{
		return loginPageNameLabel.getText();
	}
	
	
	
	
	
	
	public PartnerWithUsPage validatePartnerWithUsLink()
	{
		partnerWithUsLink.click();
		return new PartnerWithUsPage();
	}
	

	public String validateCorrectPartnerWithUsPageName()
	{
		return partnerWithUsPageNameLabel.getText();
	}
	
	



	
	

	public Schools_OrganizationsPage validateClickOnGetStartedLink() throws Exception
	{
		 getStartedLink1.click();
		 Thread.sleep(4000);		 
		 return new Schools_OrganizationsPage();
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
	
	public String validateCorrectAboutUsFooterName()
	{
		return aboutUspageFooterNameLabel.getText();
	}
	
	
	
	
	public Privacy_PolicyPage validateClickOnPrivacyPolicyLink() throws Exception
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 4000);");
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
	
	
	
	
	

	public Schools_OrganizationsPage validateClickOnContactUsAddress() throws Exception
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 4000);");
		Thread.sleep(4000);
		contactAddress.click();
		return new Schools_OrganizationsPage();
	}
	
	
	public String validateCorrectContactUsOfficeAddressFooterName()
	{
		return contacUsAddressFooterNameLabel.getText();
	}
	
	
	
	
	public Schools_OrganizationsPage  validateClickOnContactEmail() throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", contactEmail);
		Thread.sleep(4000);
		contactEmail.click();
		return new Schools_OrganizationsPage ();
	}
	
	
	public String validateCorrectEmailAddressName()
	{
		return emailAddress.getText();
	}
	
	
	
	
	
	

	public Schools_OrganizationsPage validateSignUpToMailingList(String userEmail) throws Exception
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 4000);");
		Thread.sleep(3000);
		mailingListEmailField.sendKeys(userEmail);
		Thread.sleep(4000);
//		signUpMailingListButton.click();
		return new Schools_OrganizationsPage();
	}
	
	
	
	
	public String validateSignUpToMailingListSuccessPrompt()
	{
		return signUpToMailingListSuccessPrompt.getText();
	}
	
	
	
	public Schools_OrganizationsPage validateSignUpToMailingListWithInvalidEmailFormat(String emailWithOutDotCom) throws Exception
	{
		Thread.sleep(3000);
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("arguments[0].scrollIntoView(true)", signUpMailingListButton);
		Thread.sleep(3000);
		mailingListEmailField.sendKeys(emailWithOutDotCom);
		Thread.sleep(4000);
//		signUpMailingListButton.click();
	
		
		return new Schools_OrganizationsPage();
	}
	
	
	
	public String validateSignUpToMailingListInvalidEmailErrorPrompt()
	{
		return invalidEmailSignUpToMailingListErrorPrompt.getText();
	}
	
	
	
	public Schools_OrganizationsPage validateClickOnGooglePlayLlink() throws InterruptedException
	{
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		scroll.executeScript("window.scrollBy(0, 3300);");
		Thread.sleep(4000);
		googlePlayButton1.click();	
		
//		Switch back to the initial tab 
		Thread.sleep(6000);
		ArrayList<String> tabs2 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(0));
		
//		Scroll down and click Google play
		scroll.executeScript("arguments[0].scrollIntoView(true)", googlePlayButton2);
		Thread.sleep(4000);
		googlePlayButton2.click();	
		
		return new Schools_OrganizationsPage();
	}
	
	
	
	public String validateCorrectGooglePlayPageName() throws Exception
	{
		return googlePlayPageNameLabel.getText();
	}
	
	
	
	
	
	
	
	public Schools_OrganizationsPage validateUserInstallBeamsityApp() throws Exception
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
		
//		try 
//		{
//			Thread.sleep(5000);
//			driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "W");
//		}
//		catch (Exception e)
//		{
//			System.out.println(e);
//		}		
		
		return new Schools_OrganizationsPage();
	}
	
	
	

	
	
	
	
	
//	public HomePage createNewSchool(String schOrgName, String fN, String lN, String email, String mobileNo)
//	{	 
//		school_OrganizationName.sendKeys(schOrgName);
//		firstName.sendKeys(fN);
//		lastName.sendKeys(lN); 
//		emailAddress.sendKeys(email);
//		phoneNo.sendKeys(mobileNo);
//		proceedBtn.click();
//		return new HomePage();
//	} 
	
	
}
