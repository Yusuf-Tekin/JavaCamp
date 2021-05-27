package com.api.hrms.api.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.hrms.business.abstracts.UserService;
import com.api.hrms.core.email.EmailControl.concretes.EmailControl;
import com.api.hrms.core.email.EmailDomainControl.EmailDomainControl;
import com.api.hrms.core.email.EmailRegexControl.concretes.EmailRegex;
import com.api.hrms.core.identity.concretes.IdentityControl;
import com.api.hrms.core.mernis.mernisControl;
import com.api.hrms.core.password.PasswordControl;
import com.api.hrms.core.results.Result;
import com.api.hrms.entities.concretes.employer_users;
import com.api.hrms.entities.concretes.job_seeker_users;
import com.api.hrms.entities.concretes.user;

@RestController
@RequestMapping("/api/user")
public class userController {
	
	private UserService userservice;
	@Autowired
	public userController(UserService userService) {
		this.userservice = userService;
	}
	
	
	@PostMapping("/addJobSeekerUser")
	public Result addUser(@RequestBody job_seeker_users user){
		return this.userservice.addJobSeekerUser(user, new EmailRegex(), new EmailControl(userservice), new IdentityControl(), new mernisControl(),new PasswordControl());
	}
	
	@GetMapping("/allUsers")
	public List<user> allUsers() {
		return this.userservice.getUsers();
	}
	
	@PostMapping("/addEmployerUsers")
	public Result addUser(@RequestBody employer_users user) {
		return this.userservice.addEmployerUser(user, new EmailRegex(), new EmailControl(userservice), new EmailDomainControl(),new PasswordControl());
	}

	
	
}
