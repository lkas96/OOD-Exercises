package com.fdmgroup.staticKeywordExercises;

public class Employee {

	private String name;
	private String jobTitle;
	private double hourlyWage;
	private static double minimumWage;
	
	//getter setters
	public String getName() {
		return this.name;
	}
	
	public String getJobTitle() {
		return this.jobTitle;
	}
	
	public double getHourlyWage() {
		return this.hourlyWage;
	}
	
	public double getMinimumWage() {
		return Employee.minimumWage;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setJobTitle(String newJobTitle) {
		this.jobTitle = newJobTitle;
	}
	
	public void setHourlyWage(double newHourlyWage) {
		this.hourlyWage = newHourlyWage;
	}
	
	public static void setMinimumWage(double newMinWage) {
		Employee.minimumWage = newMinWage;
	}
	
	
	
}
