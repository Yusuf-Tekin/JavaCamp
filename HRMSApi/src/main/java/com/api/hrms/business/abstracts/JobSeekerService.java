package com.api.hrms.business.abstracts;

import com.api.hrms.core.email.EmailControl.concretes.EmailControl;
import com.api.hrms.core.email.EmailRegexControl.concretes.EmailRegex;
import com.api.hrms.core.identity.concretes.IdentityControl;
import com.api.hrms.core.mernis.mernisControl;
import com.api.hrms.core.password.PasswordControl;
import com.api.hrms.core.results.Result;
import com.api.hrms.entities.concretes.job_seeker_users;


public interface JobSeekerService{
	
	public Result addJobSeekerUser(job_seeker_users user,EmailRegex regexControl,EmailControl emailControl,IdentityControl identityControl,mernisControl mernisControl,PasswordControl passwordControl);


}
