package User_Registration_System;

import java.util.Scanner;

public class UserRegSystemDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the User Registration System");
		System.out.println();
		
		UserValidationService validationService = new UserValidationService();

		System.out.println("Enter first Name: ");
		String firstName = sc.next();
		validationService.validFirstName(firstName);
		
		System.out.println("Enter last Name: ");
		String lastName = sc.next();
		validationService.validLastName(lastName);
		
		System.out.println("Enter an email address: ");
		String emailAddress = sc.next();
		validationService.validEmail(emailAddress);
		
		System.out.println("Enter a phone number: ");
		String phoneNumber = sc.nextLine();
		validationService.validPhoneNumber(phoneNumber);
		
	}

}
