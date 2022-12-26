package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	
	System.out.println(list.size());
	list.add("aashish");
	list.add("ravi");
	list.add("roy");
	System.out.println(list);
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
}
}
