package com.streamApiExample;

public class Main {
	
	static int func(int n) {
		int res=1;
		for(int i=1;i<=n;i++) {
			res*=i;
		}
		return res;
	}
	public static void main(String[] args) {
		int i,x=1,n=5;
		x=func(n);
		System.out.println(x);
		
		
	}

}
