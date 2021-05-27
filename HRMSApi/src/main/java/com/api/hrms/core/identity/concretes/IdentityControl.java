package com.api.hrms.core.identity.concretes;

import java.util.ArrayList;
import java.util.List;

import com.api.hrms.core.identity.abstracts.Identity;

public class IdentityControl implements Identity {

	List<String> IdentityNumbers = new ArrayList();
	
	@Override
	public boolean IdentityControl(String tc_Kimlik_Nu) {
		boolean status = false;
		for(String nu : IdentityNumbers) {
			if(tc_Kimlik_Nu == nu) {
				status = true;
				break;
			}
			status = false;
			
		}
		return true;
	}
	

}
