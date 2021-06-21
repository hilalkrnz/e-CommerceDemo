package eCommerceDemo.dataAccess.concretes;

import java.util.List;

import eCommerceDemo.dataAccess.abstracts.UserDao;
import eCommerceDemo.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " User added into HibernateDao");
		
	}

	@Override
	public void delete(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " User deleted into HibernateDao");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " User updated into HibernateDao");
		
	}

	@Override
	public User get(int id) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

}
