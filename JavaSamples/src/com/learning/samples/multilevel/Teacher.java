package com.learning.samples.multilevel;

public class Teacher extends Person{

	private String course;
	
	public Teacher(String name, String course) {
		super(name);
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public void display() {
		super.display();
		System.out.println("Course name is - " + course);
	}

}
