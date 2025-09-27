package com.fdmgroup.dependenciesExercises;

import java.util.ArrayList;

public class ComputerStore {

	private String name;
	private ArrayList<Computer> computers = new ArrayList<>();
	
	//Constructor
	public ComputerStore(String name) {
		this.name = name;
	}
	
	//getter setter
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	//Methods
	public void addComputer(Computer computer) {
		computers.add(computer);
	}
	
	public ArrayList<Computer> getAllComputer(){
		return computers;
	}
}
