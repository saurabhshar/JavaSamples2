package com.learning.samples.defaultmethod;

import java.util.Iterator;

public class MyClass implements MyInterface {

	@Override
	public void print() {
		// Regular Interface method - needs implementation
		System.out.println("Implemented method.");
		Iterator<String> itr;
	}

}
