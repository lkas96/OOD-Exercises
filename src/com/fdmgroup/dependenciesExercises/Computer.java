package com.fdmgroup.dependenciesExercises;

public class Computer {
	
	private final String MODEL;
	private HardDrive hardDrive;
	private Memory memory;
	private final Processor PROCESSOR;
	
	//Custom Constructor
	public Computer(String model, HardDrive hardDrive, Memory memory, Processor processor) {
		this.MODEL = model;
		this.hardDrive = hardDrive;
		this.memory = memory;
		this.PROCESSOR = processor;
	}
	
	//Getter setters
	public String getModel() {
		return this.MODEL;
	}
	
	public HardDrive getHardDrive() {
		return this.hardDrive;
	}
	
	public Memory getMemory() {
		return this.memory;
	}
	
	public Processor getProcessor() {
		return this.PROCESSOR;
	}
	
	public void setHardDrive(HardDrive newHardDrive) {
		this.hardDrive = newHardDrive;
	}
	
	public void setMemory(Memory newMemory) {
		this.memory = newMemory;
	}
	
	//Methods
	public void turnOn() {
		
	}

	public void turnOff() {
		
	}
	
	public void getPower(PowerSource powerSource) {
		double watts = powerSource.supplyPower();
		System.out.println(watts + " watts received from power source.");
	}
	
	
	
}