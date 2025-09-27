package com.fdmgroup.dependenciesExercises;

public class PowerSource {

	private double watts;
	
	//Default constructor
	public PowerSource(double watts) {
		this.watts = watts;
	}
	
	//setter method only
	public void setWatts(double newWatts) {
		this.watts = newWatts;
	}
	
	//methods
	public double supplyPower() {
		return this.watts;
	}
	
}
