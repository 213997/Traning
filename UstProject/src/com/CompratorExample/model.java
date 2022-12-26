package com.CompratorExample;

public class model {
	private String ustid;
	private String name;
	private String Location;
	public String getUstid() {
		return ustid;
	}
	public void setUstid(String ustid) {
		this.ustid = ustid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public model(String ustid, String name, String location) {
		
		this.ustid = ustid;
		this.name = name;
		Location = location;
	}
	public model() {
		
	}
	
	

}
