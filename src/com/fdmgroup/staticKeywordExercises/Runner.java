package com.fdmgroup.staticKeywordExercises;

public class Runner {

	public static void main(String[] args) {
		
//		//Part 1
//		double output1 = EnergyMatterCalculator.matterToEnergy(50);
//		System.out.println(output1);
//		double output2 = EnergyMatterCalculator.energyToMatter(50);
//		System.out.println(output2);
		
		//Part 2
		Employee.setMinimumWage(9.53);
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.setHourlyWage(9);
		emp2.setHourlyWage(8);
		emp3.setHourlyWage(10);
		
		System.out.println("Emp1 Wage (Hourly/Min)" + emp1.getHourlyWage() + "/" + emp1.getMinimumWage());
		System.out.println("Emp2 Wage (Hourly/Min)" + emp2.getHourlyWage() + "/" + emp2.getMinimumWage());
		System.out.println("Emp3 Wage (Hourly/Min)" + emp3.getHourlyWage() + "/" + emp3.getMinimumWage());
		
	}

}
