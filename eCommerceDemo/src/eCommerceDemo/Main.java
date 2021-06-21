package eCommerceDemo;

import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.business.concretes.EmailValidateManager;
import eCommerceDemo.business.concretes.UserManager;
import eCommerceDemo.core.GoogleAuthenticationAdapter;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class Main {
	
	public static void main(String[] args) {
		
		UserService userService = new UserManager(new HibernateUserDao(),
				new GoogleAuthenticationAdapter(), new EmailValidateManager()); 


		User user1 = new User(1, "Hilal", "Kurnaz", "hilalkrnz@gmail.com", "123456789");
		User user2 = new User(2, "Ahmet", "Demir", "ahmetdemir@gmail.com", "12345");
		
		userService.add(user1);
		userService.add(user2);
		
		
	}
}
