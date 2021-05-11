package com.api.hrms.entities.concretes;

public class EmployerUsers extends User{
	
	
	private String companyName;
	private String webSite;
	private long phoneNumber;
	
	public EmployerUsers(int id, String email, String password, String rePassword, boolean accountConfirm,String companyName,String webSite,long phoneNumber) {
		super(id, email, password, rePassword, accountConfirm);
		// TODO Auto-generated constructor stub
		this.companyName = companyName;
		this.webSite = webSite;
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	

}
