package eCommerceDemo.core;

import eCommerceDemo.GoogleAuth.GoogleAuthenticationManager;
import eCommerceDemo.entities.concretes.User;

public class GoogleAuthenticationAdapter implements AuthService{

	@Override
	public void login(User user) {
		GoogleAuthenticationManager googleAuthenticationManager = new GoogleAuthenticationManager();
		googleAuthenticationManager.login(user.getEmail());
		
		
	}

}
