package com.flatmap;

import java.util.List;

public class Person {
	
	private int id;
	private  String nme;
	private String email;
	private String location;
	private List<String>PhoneNumbers;
	
	
	public Person() {
		
	}
	public Person(int id, String nme, String email, String location, List<String> phoneNumbers) {
		super();
		this.id = id;
		this.nme = nme;
		this.email = email;
		this.location = location;
		PhoneNumbers = phoneNumbers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNme() {
		return nme;
	}
	public void setNme(String nme) {
		this.nme = nme;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public List<String> getPhoneNumbers() {
		return PhoneNumbers;
	}
	public void setPhoneNumbers(List<String> phoneNumbers) {
		PhoneNumbers = phoneNumbers;
	}
	
	

}
