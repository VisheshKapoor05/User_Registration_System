package User_Registration_System;

public class UserValidationExceptions extends NullPointerException{
	
	public UserValidationExceptions() {
		System.out.println("Exception: Please enter other than null");
	}
	
	public UserValidationExceptions(String message) {
		System.out.println(message);
	}
	
}
