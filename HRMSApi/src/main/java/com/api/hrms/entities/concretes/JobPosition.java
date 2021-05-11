package com.api.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.api.hrms.entities.abstracts.IJobPosition;


@Entity
@Table(name = "jobposition")
public class JobPosition implements IJobPosition{
	
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "positionname")
	private String positionname;
	
	public JobPosition() {
		// TODO Auto-generated constructor stub
	}

	public JobPosition(int id, String positionname) {
		super();
		this.id = id;
		this.positionname = positionname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPositionname() {
		return positionname;
	}

	public void setPositionname(String positionname) {
		this.positionname = positionname;
	}
	
	
	
	

}
