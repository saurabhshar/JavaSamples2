package com.learning.samples.defaultmethod;

public interface MyInterface {

	// An Existing/regular method in interface 
	public void print();
	
	// Newly defined default method in interface
	default void print(String str) {
		System.out.println("Printing on MyInterface: " + str);
	}
	
}
