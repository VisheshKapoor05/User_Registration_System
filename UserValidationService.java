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
	
	
	// 2 digit country code, a space, and then 10 digit phone number
	private String PHONE_NUM_REGEX  = "^([0-9]{2})(\s){1}([0-9]{10})$";
	
	
	/*
	 * (?=.*[A-Z])    = at least one upper case
	 * (?=.*[0-9])    = at least one numeric number
	 * .{8,}          = 8 or more characters
	 */
	private String PASSWORD_REGEX   = "^(?=.*[A-Z])(?=.*[0-9])(?=[^_\\W]*[_\\W][^_\\W]*$).{8,}$";

	
	public boolean validFirstName(String firstName) throws RuntimeException{
		
		if(firstName == "" || firstName == null) {
			throw new UserValidationExceptions();
		}
		Pattern pattern = Pattern.compile(FIRST_NAME_REGEX);
		Matcher matcher = pattern.matcher(firstName);
		if(matcher.matches())
			System.out.println("You've entered a valid first name");
		else
			throw new UserValidationExceptions("Exception: Wrong first name format");
		
		return matcher.matches();
	}
	
	public boolean validLastName(String lastName) {
		Pattern pattern = Pattern.compile(LAST_NAME_REGEX);
		Matcher matcher = pattern.matcher(lastName);
		if(matcher.matches())
			System.out.println("You've entered a valid last name");
		else
			throw new UserValidationExceptions("Exception: Wrong last name format");
	
		return matcher.matches();
	}
	
	public boolean validEmail(String email) {
		Pattern pattern = Pattern.compile(EMAIL_REGEX);
		Matcher matcher = pattern.matcher(email);
		if(matcher.matches())
			System.out.println("You've entered a valid email address");
		else
			throw new UserValidationExceptions("Exception: Wrong email format");
	
		return matcher.matches();
	}
	
	public boolean validPhoneNumber(String phoneNumber) {
		Pattern pattern = Pattern.compile(PHONE_NUM_REGEX);
		Matcher matcher = pattern.matcher(phoneNumber);
		if(matcher.matches())
			System.out.println("You've entered a valid phone number");
		else
			throw new UserValidationExceptions("Exception: Wrong Phone number format");
		
		return matcher.matches();
	}
	
	public boolean validPassword(String password) {
		Pattern pattern = Pattern.compile(PASSWORD_REGEX);
		Matcher matcher = pattern.matcher(password);
		if(matcher.matches())
			System.out.println("You've entered a valid password");
		else
			throw new UserValidationExceptions("Exception: Wrong Password format");
		
		return matcher.matches();
	}

}
