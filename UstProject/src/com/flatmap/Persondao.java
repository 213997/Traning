package com.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Persondao {
	public static List<Person> getAll(){
		
		return Stream.of(new Person(101,"aashish","aashish@","BLR",Arrays.asList("8083696209","123456"))).collect(Collectors.toList());
	}

}