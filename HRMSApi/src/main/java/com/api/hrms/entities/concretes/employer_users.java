package com.api.hrms.entities.concretes;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "employer_users")
public class employer_users extends user{
	
	@Column(name = "employers_id")
	private int employers_id;
	
	@Column(name = "company_name")
	private String company_name;
	
	@Column(name = "web_adress")
	private String web_adress;
	
	@Column(name = "phone_number")
	private String phone_number;
	
	@Column(name = "is_activated")
	private boolean is_Activated;
	
	

	
	public employer_users() {
		super();
	}

	public employer_users(int employers_id, String company_name, String web_adress, String phone_number,
			boolean is_Activated) {
		super();
		this.employers_id = employers_id;
		this.company_name = company_name;
		this.web_adress = web_adress;
		this.phone_number = phone_number;
		this.is_Activated = is_Activated;
	}

	public int getEmployers_id() {
		return employers_id;
	}

	public void setEmployers_id(int employers_id) {
		this.employers_id = employers_id;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	public String getWeb_adress() {
		return web_adress;
	}

	public void setWeb_adress(String web_adress) {
		this.web_adress = web_adress;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public boolean isIs_Activated() {
		return is_Activated;
	}

	public void setIs_Activated(boolean is_Activated) {
		this.is_Activated = is_Activated;
	}
	
	

}
