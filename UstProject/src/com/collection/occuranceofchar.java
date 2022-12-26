package com.collection;

import java.util.HashMap;
import java.util.Map;

public class occuranceofchar {
	
static void characterCount(String inputstring) {
	HashMap<Character,Integer> charcountMap=new HashMap<Character,Integer>();
	
	char[]  strArray=inputstring.toCharArray();
	
	 for(char c: strArray) {
		 if(charcountMap.containsKey(c)) {
			 charcountMap.put(c, charcountMap.get(c)+ 1);
		 }
		 else {
			 charcountMap.put(c, 1);
			
		 }
	 }
	 for(Map.Entry entery: charcountMap.entrySet()) {
		 System.out.println(entery.getKey()+ " "+ entery.getValue());
	 }
}
}

	


