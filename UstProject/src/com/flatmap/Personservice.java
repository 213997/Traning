package com.flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class Personservice {
	public static void main(String[] args) {
		
	List<Person> person= Persondao.getAll();
	
	
	List<List<String>> map = person.stream().map(person1 ->person1.getPhoneNumbers()).collect(Collectors.toList());
	
			
			System.out.println(map);
			
			List<String>flatmap=person.stream().flatMap(person1-> person1.getPhoneNumbers().stream()).collect(Collectors.toList());
			System.out.println(flatmap);
		
	}
}

