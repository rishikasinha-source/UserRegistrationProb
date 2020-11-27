import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {

	@Test 
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserRegistrationProbException {
		UserRegistration userValidator=new UserRegistration();	
		boolean result=userValidator.validateFirstName.validate("Rishika");
		Assert.assertEquals(true,result);
	}
	
	
	@Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() throws UserRegistrationProbException {
		UserRegistration userValidator=new UserRegistration();
		boolean result=userValidator.validateFirstName.validate("Ri");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void givenFirstName_WhenWithSpChars_ShouldReturnFalse() throws UserRegistrationProbException {
			UserRegistration userValidator=new UserRegistration();
		boolean result=userValidator.validateFirstName.validate("Ri$hika");
		Assert.assertEquals(false, result);
	} 
	
@Test
	
	public void validateEmailAddress_WhenValid_ShouldReturnTrue() throws UserRegistrationProbException {
	 UserRegistration userValidator=new UserRegistration();
	boolean result=userValidator.validateEmailAddress.validate("");
	Assert.assertEquals(false, result);
}

@Test

public void validateMobileFormat_WhenValid_ShouldReturnTrue() throws UserRegistrationProbException {
	 UserRegistration userValidator=new UserRegistration();
 boolean result=userValidator.validateMobileFormat.validate("919821345678");
 Assert.assertEquals(true, result);
}

@Test
public void givenMobileFormat_WhenWithSpChars_ShouldReturnFalse() throws UserRegistrationProbException {
	UserRegistration userValidator=new UserRegistration();
boolean result=userValidator.validateMobileFormat.validate("91983456@789");
Assert.assertEquals(false, result);
}

}	