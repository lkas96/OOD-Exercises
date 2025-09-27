package com.fdmgroup.classesAndObjectsExercises;

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
		
		System.out.println(drive1.getModel());
		System.out.println(drive1.getCapacity());
		System.out.println(drive1.getUsedSpace());
		
		drive1.setUsedSpace(50);
		
		System.out.println(drive1.getModel());
		System.out.println(drive1.getCapacity());
		System.out.println(drive1.getUsedSpace());
		
//		System.out.println(processor1.getModel());
//		System.out.println(processor1.getSpeed());
//		System.out.println(processor1.getNumberOfCores());
//		
//		System.out.println(memory1.getModel());
//		System.out.println(memory1.getSpeed());
//		System.out.println(memory1.getUsedSpace());
	}

}
