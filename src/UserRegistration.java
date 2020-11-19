import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateFirstName(String name)
	{
		String expression= "^[A-Z][a-z]{2,}$";
		if(name.matches(expression))
			return true;
		else
		return false;
		
	}
	
	public boolean validateEmailAddress(String email)
	{
		String expression="^[0-9a-zA-Z]+([._+-][0-9a-zA-Z])*@[0-9a-zA-Z]+.[a-zA-Z]{2,4}(.[a-zA-Z]{2})*$";
		Pattern pattern=Pattern.compile(expression);
		return pattern.matcher(email).matches();
		
	}
	
	public boolean validateMobileFormat(String mobileFormat) {
		String expression="^([\\\\+]?91)[6-9]{1}[0-9]{9}$";
		if(mobileFormat.matches(expression))
			return true;
		else
		return false;	
}
	
	public boolean validatePassword(String password) {
		String expression="^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
		if(password.matches(expression))
			return true;
		else
		return false;	
}


}
