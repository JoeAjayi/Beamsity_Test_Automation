package com.fbistech.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.fbistech.base.TestBase;
import com.fbistech.pages.CoursesPage;
import com.fbistech.pages.HomePage;

public class CoursesPageTest extends TestBase{

	HomePage homePage;
	CoursesPage coursesPage;
	
	
	
	public CoursesPageTest()
	{
		super();

	}
	
	

	@BeforeMethod
	public void setUp()
	{
		initialization();
		homePage = new HomePage();
		coursesPage = new CoursesPage();
		
	}
	
	
	
	@Test(priority = 2)
	public void verifyUserCanClickCoursesLink()
	{	
		homePage = coursesPage.clickOnCoursesLink();
	}
	

	
	
	
	@AfterMethod
	public void tearDown() throws Exception
	{
		Thread.sleep(7000);
		driver.quit(); 
	}
	
	
	

	
	
}
