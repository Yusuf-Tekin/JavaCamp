package com.api.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.api.hrms.entities.abstracts.IUser;
@Entity
@Table(name = "Users")
public class User implements IUser{
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;
	
	@Column(name = "rePassword")
	private String rePassword;
	
	@Column(name = "accountConfirmation")
	private boolean accountConfirm;
	
	public void Users() {
		
	}

	public User(int id, String email, String password, String rePassword, boolean accountConfirm) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.rePassword = rePassword;
		this.accountConfirm = accountConfirm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRePassword() {
		return rePassword;
	}

	public void setRePassword(String rePassword) {
		this.rePassword = rePassword;
	}

	public boolean isAccountConfirm() {
		return accountConfirm;
	}

	public void setAccountConfirm(boolean accountConfirm) {
		this.accountConfirm = accountConfirm;
	}
	
	
	
}
