package eCommerceDemo.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eCommerceDemo.business.abstracts.EmailValidateService;
import eCommerceDemo.entities.concretes.User;

public class EmailValidateManager implements EmailValidateService{
	
	public static final String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	
	public static boolean validate(String emailDemo) {
		
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailDemo);
		return matcher.find();
	}

	@Override
	public boolean isValid(User user, String email) {
		
		if(!validate(user.getEmail())) {
			
			System.out.println("E-mail is incorrect.");
			return false;
		}
		
		System.out.println("Verification code is sended to " + user.getEmail());
		
		return true;
	}


}
