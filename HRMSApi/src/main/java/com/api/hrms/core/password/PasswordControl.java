package com.api.hrms.core.password;

public class PasswordControl implements PasswordControlAbs{

	@Override
	public boolean PasswordControlAbs(String password, String rePassword) {
		if(!password.equals(rePassword)) {
			return true;
		}
		else {
			return false;
		}
	}

}
