package User_Registration_System;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidationService {
	
	// first letter SHOULD be cap, and total should be more than 3 letters
	private String FIRST_NAME_REGEX = "^[A-Z]{1}[a-zA-Z]{2,}$";
	
	// first letter SHOULD be cap, and total should be more than 3 letters
	private String LAST_NAME_REGEX  = "^[A-Z]{1}[a-zA-Z]{2,}$";
	
	
	/* 
	 * ([a-zA-Z0-9]+) = any word in the first group or number
	 * (\\.)?         = can be only one . after 1st group
	 * ([a-zA-Z0-9]+) = again a character group after .
	 * (@[a-z]+)	  = @ and then again a word(bl)
	 * (\\.){1}		  = mandatory . after bl
	 * ([a-z]{2,3})	  = a TDL after . to account for com, co, etc
	 * (\\.)?		  = again a . which is not mandatory
	 * ([a-z]{0,2})$  = a country code after . (in)
	 */
	private String EMAIL_REGEX      = "^([a-zA-Z0-9]+)(\\.)?([a-zA-Z0-9]+)(@[a-z]+)(\\.){1}([a-z]{2,3})(\\.)?([a-z]{0,2})$";
	
	
	public void validFirstName(String firstName) {
		Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
		Matcher matcher = pattern.matcher(firstName);
		if(matcher.matches())
			System.out.println("You've entered a valid first name");
		else
			System.out.println("Please enter a valid first name");
	}
	
	public void validLastName(String lastName) {
		Pattern pattern = Pattern.compile(LAST_NAME_REGEX);
		Matcher matcher = pattern.matcher(lastName);
		if(matcher.matches())
			System.out.println("You've entered a valid last name");
		else
			System.out.println("Please enter a valid last name");
	}
	
	public void validEmail(String email) {
		Pattern pattern = Pattern.compile(EMAIL_REGEX);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches())
			System.out.println("You've entered a valid email address");
		else
			System.out.println("Please enter a valid email address");
	}

}
