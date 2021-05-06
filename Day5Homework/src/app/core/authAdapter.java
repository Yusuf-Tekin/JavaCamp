package app.core;

import app.googleAuth.googleAuth;

public class authAdapter implements authService{

	@Override
	public void authSocialAccount(String email) {
		// TODO Auto-generated method stub
		
		googleAuth auth = new googleAuth();
		auth.SignUpGoogle(email);
		
		
	}
	
}
