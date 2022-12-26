package com.j8.Example;

public interface sim {
	void calling();
	void date();
	public default void payment() {
		System.out.println("do the payment ");
	}

}
