package com.fdmgroup.dependenciesExercises;

import java.util.Arrays;

public class Runner {

	public static void main(String[] args) {
		
		//Creating the objects now following example. 
		
		HardDrive drive1 = new HardDrive("Seagate", "2TB");
		
		HardDrive drive2 = new HardDrive("Dell", "3TB");
		drive2.setUsedSpace(50);
		
		Processor processor1 = new Processor("Intel Xeon", 2.93, 6);
		
		Processor processor2 = new Processor("Intel Celeron", 2.9, 2);
		
		Memory memory1 = new Memory("Kingston", 4, 1600);
		
		Memory memory2 = new Memory("Corsair", 8, 1333);
		
		Computer computer1 = new Computer("Dell", drive1, memory1, processor1);
		
		Computer computer2 = new Computer("Lenovo", drive2, memory2, processor2);
		
		PowerSource powerSource = new PowerSource(50);
		
		computer1.getPower(powerSource);
		
		ComputerStore storedComputers = new ComputerStore("ComputerStorage1");
		
		storedComputers.addComputer(computer1);
		storedComputers.addComputer(computer2);
		
		System.out.println((storedComputers.getAllComputer())); //need override tostring method
		
	}

}
