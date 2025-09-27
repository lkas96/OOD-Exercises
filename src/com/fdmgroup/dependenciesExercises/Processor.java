package com.fdmgroup.dependenciesExercises;

public class Processor {
	
	private final String MODEL;
	private final double SPEED;
	private final int NUMBER_OF_CORES;
	
	//Custom constructor
	public Processor(String model, double speed, int numberOfCores) {
		this.MODEL = model;
		this.SPEED = speed;
		this.NUMBER_OF_CORES = numberOfCores;
	}
	
	//Getters only since all final
	public String getModel() {
		return this.MODEL;
	}
	
	public double getSpeed() {
		return this.SPEED;
	}
	
	public int getNumberOfCores() {
		return this.NUMBER_OF_CORES;
	}
	
	//METHOD
	public void processData(String data) {
		System.out.println("This is processData - Data is: " + data);
	}
	
}
