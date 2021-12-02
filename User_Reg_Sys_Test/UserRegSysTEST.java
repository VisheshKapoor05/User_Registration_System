package User_Registration_System.User_Reg_Sys_Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import User_Registration_System.UserValidationService;

public class UserRegSysTEST {
	
	@Test
	public void testFirstName() {
		UserValidationService obj = new UserValidationService();
		boolean output = obj.validFirstName("Vishesh");
		assertEquals(true, output);
	}
	
	@Test
	public void testLastName() {
		UserValidationService obj = new UserValidationService();
		boolean output = obj.validLastName("Kapoor");
		assertEquals(true, output);
	}
	
	@Test
	public void testEmail() {
		UserValidationService obj = new UserValidationService();
		boolean output = obj.validEmail("abc.xyz@bl.co.in");
		assertEquals(true, output);
	}
	
	@Test
	public void testPhoneNumber() {
		UserValidationService obj = new UserValidationService();
		boolean output = obj.validPhoneNumber("91 1234567890");
		assertEquals(true, output);
	}
	
	@Test
	public void testPassword() {
		UserValidationService obj = new UserValidationService();
		boolean output = obj.validPassword("@Vishesh1");
		assertEquals(true, output);
	}


}
