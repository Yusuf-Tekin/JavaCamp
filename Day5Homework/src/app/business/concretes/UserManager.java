package app.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import app.business.abstracts.UserManagerService;
import app.dataAccess.concretes.Database;
import app.entities.concretes.User;

public class UserManager implements UserManagerService{
	
	List<User> users;
	String regex = "^(.+)@(.+)$";
	Pattern pattern = Pattern.compile(regex);
	
	public UserManager(Database database) {
		this.users = database.getUsers();
	}
	
	@Override
	public boolean EmailControl(String email) {
		
		for(User user:users) {
			if(user.getEmail().equals(email)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean EmailRegexControl(String email) {
		Matcher matcher = pattern.matcher(email); 
		if(matcher.matches() == false) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean PasswordControl(String password) {
		if(password.length() < 6) {
			return false;
		}
		else {
			return true;	
		}
	}
	@Override
	public boolean nameSurnameControl(String firstName, String lastName) {
		if(firstName.length() < 2 || lastName.length() < 2) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public void SendConfirmEmail(String email) {
		
		System.out.println(email + " adlý e-posta adresine doðrulama gönderildi.");
		
	}
	
	@Override
	public void ConfirmAccount(User user) {
		
		user.setConfirmed(true);
		users.add(user);
		System.out.println("Hesap doðrulandý ve kayýt tamamlandý...");

	}

	
	@Override
	public User Is_thereA_User(String email, String password) {
		for(User user : users) {
			if(email == user.getEmail()) {
				return user;
			}	
		}
		return null;
		
	}

	
	
	
	@Override
	public void LoginUser(String email,String password) {
		
		User user = Is_thereA_User(email, password);
		
		if(user == null) {
			System.err.println("Kullanýcý bulunamadý...");
		}
		else {
			
			if(password == user.getPassword()) {
				System.out.println("GÝRÝÞ BAÞARILI");
			}
			else {
				System.err.println("Bilgilerinizi kontrol edin...");
			}
			
		}
		
		
	}


	@Override
	public void RegisterUser(User user) {
		
		if(EmailControl(user.getEmail()) == false) {
			System.err.println("Email baþkasý tarafýndan kullanýlýyor.");
		}
		else if(EmailRegexControl(user.getEmail()) == false) {
			System.err.println("Email adresi gereksinimleri karþýlamýyor.Baþka bir email adresi deneyiniz.");
		}
		else if(PasswordControl(user.getPassword()) == false) {
			System.err.println("Parola uzunluðu en az 6 karakter olmalýdýr.");
		}
		else if(nameSurnameControl(user.getFirstName(), user.getLastName()) == false) {
			System.err.println("Ad ve Soyad verileri en az 2 karakterden oluþmalýdýr.");
		}
		else {
			SendConfirmEmail(user.getEmail());
		}
		
	}

	

	
	
	
}
