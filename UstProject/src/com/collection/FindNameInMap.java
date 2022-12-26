package com.collection;

import java.util.HashMap;
import java.util.Map;

public class FindNameInMap {
	public static void main(String[] args) {
		Map<String,Integer> m=new HashMap<>();
		
	
	
		m.put("Aashish",101);
		m.put("roy",102);
		m.put("ravi",103);
		m.put("ram",104);
		
		System.out.println(m.entrySet());

		for(String s:m.keySet()) {
			System.out.println(m.get(m));
		}

	
}
}
