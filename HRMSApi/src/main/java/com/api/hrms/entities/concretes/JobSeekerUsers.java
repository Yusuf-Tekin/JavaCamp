package com.api.hrms.entities.concretes;

import java.util.Date;

public class JobSeekerUsers extends User{

	private String name;
	private String surname;
	private long identifyNumber;
	private Date date;
	
	public JobSeekerUsers(int id, String email, String password, String rePassword, boolean accountConfirm,String name,String surname,long identifyNumber,Date date) {
		super(id, email, password, rePassword, accountConfirm);
		// TODO Auto-generated constructor stub
		
		this.name = name;
		this.surname = surname;
		this.identifyNumber = identifyNumber;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public long getIdentifyNumber() {
		return identifyNumber;
	}

	public void setIdentifyNumber(long identifyNumber) {
		this.identifyNumber = identifyNumber;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
