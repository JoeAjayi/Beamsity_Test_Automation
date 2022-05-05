package com.fbistech.util;

import net.rcarz.jiraclient.BasicCredentials;
import net.rcarz.jiraclient.Field;
import net.rcarz.jiraclient.Issue;
import net.rcarz.jiraclient.Issue.FluentCreate;
import net.rcarz.jiraclient.JiraClient;
import net.rcarz.jiraclient.JiraException;

public class JiraServiceProvider {

	
	public JiraClient jira;  
	public String project;

	/* Constructor of the class */
	public JiraServiceProvider(String jiraUrl, String username, String password, String project)
	{
		BasicCredentials credentials  = new BasicCredentials(username, password);
    
		/*	Initializing JiraClient  */
		jira = new JiraClient(jiraUrl, credentials);
		this.project = project;
	}

	public void createJiraTicket(String issueType, String summary, String description, String reporterName) {
 
		try {
			FluentCreate fleuntCreate = jira.createIssue(project, issueType);
			fleuntCreate.field(Field.SUMMARY, summary);
			fleuntCreate.field(Field.DESCRIPTION, description);
			Issue newIssue = fleuntCreate.execute();
			System.out.println("New issue created in jira with ID: " + newIssue);

		} catch (JiraException e) {
			e.printStackTrace();
		}

	}
} 
