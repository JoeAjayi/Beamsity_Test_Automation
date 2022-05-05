package com.fbistech.ExtentReportListener;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.fbistech.util.JiraPolicy;
import com.fbistech.util.JiraServiceProvider;

public class TestJiraListener implements ITestListener {
	
/*	Whenever a listener class is created, the listener should implement 
 *  TestNg listener and the listener name is ITestListener. 
 *  ------->
 *	Whenever a class implementing particular interface, it should implement 
 *  all the methods which are available in that particular interface.
 */
	
	@Override 
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
   
	} 
   
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
 
	}

	
/* Whenever there is a test failure, automatically it will come over here and arise a bug ticket */ 	
	@Override
	public void onTestFailure(ITestResult result) {

		
		JiraPolicy jiraPolicy = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(JiraPolicy.class);
		boolean isTicketReady = jiraPolicy.logTicketReady();
		
		if (isTicketReady)
		{ 
			// if isTicketReady is true raise Jira ticket:
			System.out.println("Is ticket ready for JIRA: " + isTicketReady);
			 
			
			JiraServiceProvider jiraSp = new JiraServiceProvider("https://team-1610640570267.atlassian.net/",
					"joseph.ajayi@fbistech.com", "4N31bYXRZNKIk1E6It4i38FB", "BEAM");
			String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName()
					+ " - Got failed due to some assertion or exception under Jira integration with Selenium Test Script. "
					+ "Create an automated ticket for failed test script";
			String issueDescription = result.getThrowable().getMessage() + "\n";
			issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));

			jiraSp.createJiraTicket("Bug", issueSummary, issueDescription, "Joseph Ajayi [FBISTech - IT]");
		}
 
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}
	
}
