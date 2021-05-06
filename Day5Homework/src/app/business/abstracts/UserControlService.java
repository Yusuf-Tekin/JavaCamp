package app.business.abstracts;

import app.entities.concretes.User;

public interface UserControlService {
	
	public boolean nameSurnameControl(String firstName,String lastName);
	public boolean EmailControl(String email);
	public boolean EmailRegexControl(String email);
	public boolean PasswordControl(String password);
	
	
	
	public User Is_thereA_User(String email,String password);
	
	
}
