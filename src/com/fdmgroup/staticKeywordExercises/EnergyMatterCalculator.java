package com.fdmgroup.staticKeywordExercises;

public class EnergyMatterCalculator {

	public static final double SPEED_OF_LIGHT = 299792458;
	
	//method
	public static double matterToEnergy(double matter) {
		//e=mc^2
		return matter * (SPEED_OF_LIGHT * SPEED_OF_LIGHT);
	}
	
	public static double energyToMatter(double energy) {
		//m = e/c^2
		return energy / (SPEED_OF_LIGHT * SPEED_OF_LIGHT);
	}
}
