package com.api.hrms.core.email.EmailRegexControl.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.api.hrms.core.email.EmailRegexControl.abstracts.EmailRegexAbs;

public class EmailRegex implements EmailRegexAbs {
	
	String regex = "^(.+)@(.+)$";
	Pattern pattern = Pattern.compile(regex);
	@Override
	public boolean Control(String email) {
		Matcher matcher = pattern.matcher(email);
		
		if(matcher.matches() != true) {
			return false;
		}
		else {
			return true;
		}
		
	}

}
