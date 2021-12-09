package User_Registration_System;

import java.util.Scanner;

public class UserRegSystemDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the User Registration System");
		System.out.println();
		
		UserValidationService validationService = new UserValidationService();
		
		try {
			System.out.println("Enter first Name: ");
			String firstName = sc.nextLine();
			validationService.validFirstName(firstName);
			
			System.out.println("Enter last Name: ");
			String lastName = sc.nextLine();
			validationService.validLastName(lastName);
			
			System.out.println("Enter an email address: ");
			String emailAddress = sc.nextLine();
			validationService.validEmail(emailAddress);
			
			System.out.println("Enter a phone number: ");
			String phoneNumber = sc.nextLine();
			validationService.validPhoneNumber(phoneNumber);
			
			System.out.println("Enter a password for this user: ");
			String password = sc.nextLine();
			validationService.validPassword(password);
			
		}
		catch(RuntimeException obj) {
			obj.printStackTrace();
		}
		
		System.out.println("END");
	}

}
