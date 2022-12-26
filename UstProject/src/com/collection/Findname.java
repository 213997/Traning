package com.collection;

import java.util.LinkedList;

public class Findname {
	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<>();
	
		l.add("Aashish");
		l.add("roy");
		l.add("ravi");
		l.add("ram");
		
		for(String i:l) {
			if(i.startsWith("r")) {
				System.out.println(i);
			}
		}
		
		}
	
	
}


