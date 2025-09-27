package com.fdmgroup.classesAndObjectsExercises;

public class HardDrive {

	private final String MODEL;
	private final String CAPACITY;
	private double usedSpace;
	
	//Constructor Custom
	public HardDrive(String model, String capacity) {
		this.MODEL = model;
		this.CAPACITY = capacity;
		usedSpace = 0;
	}
	
	
	
	//Getters Setters
	public String getModel() {
		return this.MODEL;
	}
	
//	public void setModel(String setModel) {
//		this.MODEL = setModel;
//	}
	
	public String getCapacity() {
		return this.CAPACITY;
	}
	
//	public void setCapacity(String setCapacity) {
//		this.CAPACITY = setCapacity;
//	}
	
	public double getUsedSpace() {
		return this.usedSpace;
	}
	
	public void setUsedSpace(double setSpaceUsed) {
		this.usedSpace = setSpaceUsed;
	}
	
	
	
	//Methods
	public String readData(String file) {
		return ("data from file: " + file);
	}
	
	public void writeData(String data, String file) {
		System.out.println("write data method - Data is: " + data + ". File is:"+ file);
	}
	
}
