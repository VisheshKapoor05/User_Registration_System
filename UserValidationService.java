package User_Registration_System;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidationService {
	
	private String FIRST_NAME_REGEX = "^[A-Z]{1}[a-z]{2,}$";
	private String LAST_NAME_REGEX  = "^[A-Z]{1}[a-z]{2,}$";
	
	
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

}
