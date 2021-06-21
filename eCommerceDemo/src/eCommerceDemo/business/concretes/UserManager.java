package eCommerceDemo.business.concretes;

import java.util.List;


import eCommerceDemo.business.abstracts.EmailValidateService;
import eCommerceDemo.business.abstracts.UserService;
import eCommerceDemo.core.AuthService;
import eCommerceDemo.core.GoogleAuthenticationAdapter;
import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.dataAccess.concretes.HibernateUserDao;
import eCommerceDemo.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private AuthService authService;
	private EmailValidateService emailValidateService;
	
	

	public UserManager(UserDao userDao, AuthService authService, EmailValidateService emailValidateService) {
		super();
		this.userDao = userDao;
		this.authService = authService;
		this.emailValidateService = emailValidateService;
	}


	@Override
	public void add(User user) {
		if(user.getFirstName().length() < 3 || user.getLastName().length() < 3) {
			
			System.out.println("Name and surname must contain at least 2 characters!");
			return;
		}
		
		if(user.getPassword().length() < 6 ) {
			
			System.out.println("Password must be greater than 6 characters.");
			return;
		}else if(emailValidateService.isValid(user, user.getEmail())) {
			
			userDao.add(user);
			authService.login(user);
		}
		
	}


	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void signIn(String email, String password) {
		// TODO Auto-generated method stub
		
	}

}
