package com.j8.Example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Consumer1 {
	public static void main(String[] args) {
		Consumer<Integer> cons= t -> System.out.println("print the value: "+t);
		cons.accept(20);
		
		Supplier<LocalDate> s1=LocalDate::now;
	LocalDate s2=LocalDate.now();
	
	System.out.println(s1.get());
	
	List<String> al=new ArrayList<>();
	al.add("aashish");
	al.add("roy");
	
	al.stream().forEach((name) -> {
		print(() ->name);
	});
	
	List<String> l1=Arrays.asList("aashish","roy");
	System.out.println();
	
	}

	public static void print(Supplier <String> supplire) {
		System.out.println(supplire.get());
	}
	
}