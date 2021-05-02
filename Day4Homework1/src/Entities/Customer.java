package Entities;

import java.util.Date;

public class Customer {
	
	private int id;
	private String name;
	private String surname;
	private Date dateofbirth;
	private String nationaltid;
	public Customer(int id, String name, String surname, Date dateofbirth, String nationaltid) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.dateofbirth = dateofbirth;
		this.nationaltid = nationaltid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getNationaltid() {
		return nationaltid;
	}
	public void setNationaltid(String nationaltid) {
		this.nationaltid = nationaltid;
	}
	
	
	
	
}
