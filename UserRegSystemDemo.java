package User_Registration_System;

import java.util.Scanner;

public class UserRegSystemDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the User Registration System");
		System.out.println();
		
		System.out.println("Enter first Name: ");
		String firstName = sc.next();
		
		System.out.println("Enter last Name: ");
		String lastName = sc.next();
		
		UserValidationService validationService = new UserValidationService();
		validationService.validFirstName(firstName);
		validationService.validLastName(lastName);
	}

}
