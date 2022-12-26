package com.collection;

import java.util.LinkedList;

public class Zoo {
	public static void main(String[] args) {
		LinkedList<String> animal=new LinkedList<>();
		
		animal.add("lion");
		animal.add("tiger");
		animal.add("dog");
		System.out.println("linkedList "+animal);
		
		animal.set(2, "pig");
		System.out.println(animal);
	}

}
