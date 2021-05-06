package app.business.abstracts;

import app.entities.concretes.User;

public interface UserManagerService extends UserControlService{
	
	public void RegisterUser(User user);
	public void LoginUser(String email,String password);
	
	public void SendConfirmEmail(String email);
	public void ConfirmAccount(User user);
	
}
