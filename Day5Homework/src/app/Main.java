package app;

import app.business.concretes.UserManager;
import app.core.authAdapter;
import app.dataAccess.abstracts.DatabaseService;
import app.dataAccess.concretes.Database;
import app.entities.concretes.User;

public class Main {
	public static void main(String[] args) {
		
		
		User user1 = new User("yusuf", "tekin", "yusuf@gmail.com", "123456");
		UserManager userManager = new UserManager(new Database());
		
		userManager.RegisterUser(user1);
		userManager.ConfirmAccount(user1);
		
		User user2 = new User("Engin", "Demiroð", "engin@gmail.com", "123456"); // User 2 is not confirmed account
		userManager.RegisterUser(user2);
		
		
		User user3 = new User("Mustafa", "Murat Çoþkun", "coskun_mmustafa","123456");
		
		// Fake Google Auth
		authAdapter auth = new authAdapter();
		auth.authSocialAccount(user3.getEmail());
		
		
		// Email - Password Login
		userManager.LoginUser(user1.getEmail(), user1.getPassword()); // Login successfuly
		
		userManager.LoginUser(user2.getEmail(), user2.getPassword()); // User not found because user is not registered
		
		
	}
}
