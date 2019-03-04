package com.learning.samples.multilevel;

public class TeachingAssociate extends Teacher{

	private int weeklyHrs = 0; 
	
	public TeachingAssociate(String name, String course, int weeklyHrs) {
		super(name, course);
		this.setWeeklyHrs(weeklyHrs);
	}
	
	public int getWeeklyHrs() {
		return weeklyHrs;
	}
	
	public void setWeeklyHrs(int weeklyHrs) {
		this.weeklyHrs = weeklyHrs;
	}

	public void display() {
		super.display();
		System.out.println("No. of Hours per week - " + weeklyHrs);
	}
}
