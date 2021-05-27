package com.api.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.api.hrms.entities.abstracts.ActivationCode;

@Entity
@Table(name = "activation_codes")
public class activation_code implements ActivationCode{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "activation_code")
	private String activation_code;
	
	@Column(name = "is_confirmed")
	private boolean is_confirmed;
	
	@Column(name = "user_id")
	private int user_id;

	public activation_code() {
		super();
	}

	public activation_code(int id, String activation_code, boolean is_confirmed, int user_id) {
		super();
		this.id = id;
		this.activation_code = activation_code;
		this.is_confirmed = is_confirmed;
		this.user_id = user_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivation_code() {
		return activation_code;
	}

	public void setActivation_code(String activation_code) {
		this.activation_code = activation_code;
	}

	public boolean isIs_confirmed() {
		return is_confirmed;
	}

	public void setIs_confirmed(boolean is_confirmed) {
		this.is_confirmed = is_confirmed;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	
	
	
}
