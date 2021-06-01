package com.api.hrms.core.email.EmailControl.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.hrms.business.abstracts.JobSeekerService;
import com.api.hrms.business.abstracts.UserService;
import com.api.hrms.core.email.EmailControl.abstracts.EmailControlAbs;
import com.api.hrms.entities.concretes.user;

public class EmailControl implements EmailControlAbs {

	
	List<user> userList;
	
	@Override
	public boolean EmailControl(String email) {
		boolean status = true;
//		for(user e:userList) {
//			
//			if(email == e.getEmail()) {
//				status = true;
//				break;
//			}
//			
//			
//		}
		
		return status;
	}
	


}
