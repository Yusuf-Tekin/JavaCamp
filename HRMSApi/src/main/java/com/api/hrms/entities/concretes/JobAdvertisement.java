package com.api.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_advertisement")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_positions")
	private String jobPositions;
	
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name = "job_city")
	private String jobCity;
	
	@Column(name = "min_salary")
	private float minSalary;
	
	@Column(name = "max_salary")
	private float maxSalary;
	
	@Column(name = "number_of_open_position")
	private int numberOfOpenPosition;
	
	@Column(name = "last_applicant_date")
	private Date lastApplicantsDate;
	
	@Column(name = "number_of_applicants")
	private int numberOfApplicants;
	
	@Column(name = "is_active")
	private boolean active;

	public JobAdvertisement() {
		// TODO Auto-generated constructor stub
	}
	
	public JobAdvertisement(String jobPositions, String jobDescription, String jobCity, float minSalary,
			float maxSalary, int numberOfOpenPosition, Date lastApplicantsDate, int numberOfApplicants,
			boolean isActive) {
		super();
		this.jobPositions = jobPositions;
		this.jobDescription = jobDescription;
		this.jobCity = jobCity;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.numberOfOpenPosition = numberOfOpenPosition;
		this.lastApplicantsDate = lastApplicantsDate;
		this.numberOfApplicants = numberOfApplicants;
		this.active = isActive;
	}
	
	
	public String getJobPositions() {
		return jobPositions;
	}

	public void setJobPositions(String jobPositions) {
		this.jobPositions = jobPositions;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobCity() {
		return jobCity;
	}

	public void setJobCity(String jobCity) {
		this.jobCity = jobCity;
	}

	public float getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(float minSalary) {
		this.minSalary = minSalary;
	}

	public float getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(float maxSalary) {
		this.maxSalary = maxSalary;
	}

	public int getNumberOfOpenPosition() {
		return numberOfOpenPosition;
	}

	public void setNumberOfOpenPosition(int numberOfOpenPosition) {
		this.numberOfOpenPosition = numberOfOpenPosition;
	}

	public Date getLastApplicantsDate() {
		return lastApplicantsDate;
	}

	public void setLastApplicantsDate(Date lastApplicantsDate) {
		this.lastApplicantsDate = lastApplicantsDate;
	}

	public int getNumberOfApplicants() {
		return numberOfApplicants;
	}

	public void setNumberOfApplicants(int numberOfApplicants) {
		this.numberOfApplicants = numberOfApplicants;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean isActive) {
		this.active = isActive;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
