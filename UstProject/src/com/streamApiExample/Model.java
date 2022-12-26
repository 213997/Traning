package com.streamApiExample;

public class Model {
	private int ustid;
	private String name;
	private String location;
	private double salary;
	public int getUstid() {
		return ustid;
	}
	public void setUstid(int ustid) {
		this.ustid = ustid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Model(int ustid, String name, String location, double salary) {
		super();
		this.ustid = ustid;
		this.name = name;
		this.location = location;
		this.salary = salary;
	}
	
	public Model() {
		
	}
	

}
