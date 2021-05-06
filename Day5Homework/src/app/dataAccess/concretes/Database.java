package app.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import app.dataAccess.abstracts.DatabaseService;
import app.entities.concretes.User;

public class Database implements DatabaseService{
	private List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		
	}
	
	public void getAllUsers() {
		for(User user:users) {
			System.out.println(user.getFirstName() + " " +  user.getLastName());
		}
		
	}
	
	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	
}
