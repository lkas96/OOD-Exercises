package com.fdmgroup.classesAndObjectsExercises;

public class Memory {
	
	private final String MODEL;
	private final double CAPACITY;
	private double usedSpace;
	private final double SPEED;

	//Custom Constructor
	public Memory(String model, double capacity, double speed) {
		this.MODEL = model;
		this.CAPACITY = capacity;
		this.SPEED = speed;
		usedSpace = 0;
	}
	
	
	//Getters Setters
	public String getModel() {
		return this.MODEL;
	}
	
	public double getSpeed() {
		return this.SPEED;
	}
	
	public double getCapacity() {
		return this.CAPACITY;
	}
	
	public double getUsedSpace() {
		return this.usedSpace;
	}
	
	public void setUsedSpace(double setSpaceUsed) {
		usedSpace = setSpaceUsed;
	}
	
	
	
	//Methods
	public void storeData(String data) {
		System.out.println("storeData method - data is: " + data);
	}
	
	
}
