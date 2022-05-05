package com.fbistech.util;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
public @interface JiraPolicy {   
/*	Interface class can only contain method declaration without method body */
	boolean logTicketReady();

}
