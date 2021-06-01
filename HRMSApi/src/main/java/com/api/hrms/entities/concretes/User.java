package com.api.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "users")
public class user {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id",nullable = false)
	private int id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "repassword")
	private String repassword;
	
	@Column(name = "joineddate")
	private Date joineddate;
	public user() {
		super();
	}
	
	@OneToMany(mappedBy = "job_seeker_users")
	private List<job_seeker_users> job_seeker_users;
	

	

	public user(int id, String email, String password, String repassword, Date date) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.repassword = repassword;
		this.joineddate = date;
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

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	public Date getDate() {
		return joineddate;
	}

	public void setDate(Date date) {
		this.joineddate = date;
	}
	
	

}
