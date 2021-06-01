package com.api.hrms.api.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.hrms.business.abstracts.JobSeekerService;
import com.api.hrms.core.email.EmailControl.concretes.EmailControl;
import com.api.hrms.core.email.EmailRegexControl.concretes.EmailRegex;
import com.api.hrms.core.identity.concretes.IdentityControl;
import com.api.hrms.core.mernis.mernisControl;
import com.api.hrms.core.password.PasswordControl;
import com.api.hrms.core.results.Result;
import com.api.hrms.entities.concretes.job_seeker_users;


@RestController
@RequestMapping("/api/user")
public class jobSeekerController {
	
	private JobSeekerService jobseekerservice;

	
	@Autowired
	public jobSeekerController(JobSeekerService jobseekerService) {
		this.jobseekerservice = jobseekerService;
	}
	
	
	@PostMapping("/addJobSeekerUser")
	public Result addUser(@RequestBody job_seeker_users user){
		return this.jobseekerservice.addJobSeekerUser(user, new EmailRegex(), new EmailControl(), new IdentityControl(), new mernisControl(),new PasswordControl());
	}

}
