package com.api.hrms.business.abstracts;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.api.hrms.core.email.EmailConfirmControl.concretes.EmailConfirmControl;
import com.api.hrms.core.email.EmailControl.concretes.EmailControl;
import com.api.hrms.core.email.EmailDomainControl.EmailDomainControl;
import com.api.hrms.core.email.EmailRegexControl.concretes.EmailRegex;
import com.api.hrms.core.identity.concretes.IdentityControl;
import com.api.hrms.core.mernis.mernisControl;
import com.api.hrms.core.password.PasswordControl;
import com.api.hrms.core.results.Result;
import com.api.hrms.entities.concretes.employer_users;
import com.api.hrms.entities.concretes.job_seeker_users;
import com.api.hrms.entities.concretes.system_users;
import com.api.hrms.entities.concretes.user;

public interface UserService {
	
	public Result addEmployerUser(employer_users user,EmailRegex regexControl,EmailControl emailControl,EmailDomainControl emailDomainControl,PasswordControl passwordControl);
	public Result addSystemUser(system_users user,PasswordControl passwordControl);

	
	public List<user> getUsers();
	

}
