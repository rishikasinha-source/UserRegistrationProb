import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test 
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationProbException {
		try {
		UserRegistration userValidator=new UserRegistration();	
		boolean result=userValidator.validateFirstName("Rishika");
		Assert.assertEquals(true,result);
	} catch(UserRegistrationProbException e) {
		e.printStackTrace();
	}
	}
	
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() throws UserRegistrationProbException {
		try {
		UserRegistration userValidator=new UserRegistration();
		boolean result=userValidator.validateFirstName("Ri");
		Assert.assertEquals(false, result);
		} catch(UserRegistrationProbException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() throws UserRegistrationProbException {
		try {
			UserRegistration userValidator=new UserRegistration();
		boolean result=userValidator.validateFirstName("Ri$hika");
		Assert.assertEquals(false, result);
	} catch(UserRegistrationProbException e) {
		e.printStackTrace();
	}
	}
	
@Test
	
	public void validateEmailAddress_WhenValid_ShouldReturnTrue() throws UserRegistrationProbException {
	 try {
		 UserRegistration userValidator=new UserRegistration();
		boolean result=userValidator.validateEmailAddress("");
		Assert.assertEquals(false, result);
	} catch(UserRegistrationProbException e) {
		e.printStackTrace();
	}
}

@Test

public void validateMobileFormat_WhenValid_ShouldReturnTrue() throws UserRegistrationProbException {
	 try {
		 UserRegistration userValidator=new UserRegistration();
	 boolean result=userValidator.validateMobileFormat("919821345678");
	 Assert.assertEquals(true, result);
	} catch(UserRegistrationProbException e) {
		e.printStackTrace();
	}
}

@Test
public void givenMobileFormat_WhenWithSpChars_ShouldReturnFalse() throws UserRegistrationProbException {
	try {
		UserRegistration userValidator=new UserRegistration();
	boolean result=userValidator.validateMobileFormat("91983456@789");
	Assert.assertEquals(false, result);
	} catch(UserRegistrationProbException e) {
		e.printStackTrace();
	}
}

}	