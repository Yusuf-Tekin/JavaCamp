package app.dataAccess.abstracts;

import app.entities.concretes.User;

public interface DatabaseService {
	
	public void add(User user);
	public void delete(User user);	

}
