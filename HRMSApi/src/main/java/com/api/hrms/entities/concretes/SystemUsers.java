package com.api.hrms.entities.concretes;

public class SystemUsers extends User {

	
	private String name;
	private String surname;
	private String position;
	
	public SystemUsers(int id, String email, String password, String rePassword, boolean accountConfirm,String name,String surname,String position) {
		super(id, email, password, rePassword, accountConfirm);
		this.name = name;
		this.surname = surname;
		this.position = position;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	

}
