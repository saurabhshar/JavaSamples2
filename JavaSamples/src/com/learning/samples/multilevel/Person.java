package com.learning.samples.multilevel;

public class Person {

	private String name;
	
	public Person (String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("Person is  - " + name);
	}
}
