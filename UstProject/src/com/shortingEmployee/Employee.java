package com.shortingEmployee;

public class Employee implements Comparable <Employee>{

	 long id;
	 String Name;
	 
	
	public Employee(long id, String name) {
		super();
		this.id = id;
		Name = name;
	}


	@Override
	public int compareTo(Employee o) {
		
		return 0;
	}
	

}
