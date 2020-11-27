import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IValidateFunction {
	boolean validate(String n);
}

public class UserRegistration{

	IValidateFunction validateFirstName = n -> {
		String expression= "^[A-Z][a-z]{2,}$";
		Pattern pattern=Pattern.compile(expression);
		boolean result=pattern.matcher(n).matches();
		if(n.matches(expression))
			return true;
		else
			try {
				throw new UserRegistrationProbException(UserRegistrationProbException.ExceptionType.INVALID,"Invalid First Name");
			} catch (UserRegistrationProbException e) {
				e.printStackTrace();
			}
		return result;
		
	};

	
	IValidateFunction validateEmailAddress= n -> {
		String expression="^[0-9a-zA-Z]+([._+-][0-9a-zA-Z])*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2})*$";
		Pattern pattern=Pattern.compile(expression);
		boolean result= pattern.matcher(n).matches();
		return result;
	};
	
	
	IValidateFunction validateMobileFormat= n-> {
		String expression="^([\\\\+]?91)[6-9]{1}[0-9]{9}$";
		Pattern pattern=Pattern.compile(expression);
		boolean result= pattern.matcher(n).matches();
			if(result)
				return result;
		else
			try {
		throw new UserRegistrationProbException(UserRegistrationProbException.ExceptionType.INVALID,
				"Invalid Mobile Number");	
			} catch(UserRegistrationProbException e) {
				e.printStackTrace();
			}
			return result;
};
	
	IValidateFunction validatePassword= n-> {
		String expression="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
		Pattern pattern=Pattern.compile(expression);
		boolean result= pattern.matcher(n).matches();
		if(result)
			return result;
		else
			try {
			throw new UserRegistrationProbException(UserRegistrationProbException.ExceptionType.INVALID, "Invalid Password");
} catch(UserRegistrationProbException e) {
	e.printStackTrace();
}
		return result;
	};

	public boolean validateEmailAddress(String string, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8, String string9, String string10, String string11,
			String string12, String string13, String string14, String string15, String string16, String string17,
			String string18, String string19) {
		// TODO Auto-generated method stub
		return false;
	}
public static void main(String args[]) throws UserRegistrationProbException {

	UserRegistration user = new UserRegistration();
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to User Registration System ");
	System.out.println("Enter the First Name");
	String firstName=scan.nextLine();
	user.validateFirstName.validate(firstName);
	System.out.println("Enter the email address");
	String emailAddress=scan.nextLine();
	user.validateEmailAddress.validate(emailAddress);
	System.out.println("Enter the mobile number format");
	String mobileFormat=scan.nextLine();
	user.validateMobileFormat.validate(mobileFormat);
	System.out.println("Enter the password format");
	String password=scan.nextLine();
	user.validatePassword.validate(password);
}

private void validatePassword() {
	// TODO Auto-generated method stub
	
}

private void validateMobileFormat() {
	// TODO Auto-generated method stub
	
}

private void validateEmailAddress() {
	// TODO Auto-generated method stub
	
}

private void validateFirstName() {
	// TODO Auto-generated method stub
	
}

}
