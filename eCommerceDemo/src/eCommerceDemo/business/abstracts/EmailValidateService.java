package eCommerceDemo.business.abstracts;

import eCommerceDemo.entities.concretes.User;

public interface EmailValidateService {
	
	boolean isValid(User user, String email);

}
