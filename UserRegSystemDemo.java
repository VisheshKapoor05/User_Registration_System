package User_Registration_System;

import java.util.Scanner;

public class UserRegSystemDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter firstName: ");
		String firstName = sc.next();
		
		UserValidationService validationService = new UserValidationService();
		validationService.validFirstName(firstName);
	}

}
