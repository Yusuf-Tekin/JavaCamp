package com.api.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "job_seekers_users")
@PrimaryKeyJoinColumn(name = "job_seekers_id")
public class job_seeker_users extends user{
	
	@Column(name = "job_seekers_id")
	private int job_seekers_id;
	
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "identity_number")
	private String identityNumber;
	
	@Column(name = "year_of_birth")
	private Date birtOfDate;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="id",insertable=false, updatable=false)
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private user user;

	

	public job_seeker_users() {
		super();
	}

	public job_seeker_users(String firstName, String lastName, String identityNumber, Date birtOfDate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.birtOfDate = birtOfDate;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public Date getBirtOfDate() {
		return birtOfDate;
	}

	public void setBirtOfDate(Date birtOfDate) {
		this.birtOfDate = birtOfDate;
	}
	
	
	

}
