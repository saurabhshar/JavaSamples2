package com.learning.samples.defaultmethod;

public class DefaultInterfaceSample {

	public static void main(String[] args) {
		new DefaultInterfaceSample().process();
	}

	private void process() {
		MyClass myClass = new MyClass();
		myClass.print(); // Calling regular method
		myClass.print("Print default method");	// Calling default method	
	}
}

