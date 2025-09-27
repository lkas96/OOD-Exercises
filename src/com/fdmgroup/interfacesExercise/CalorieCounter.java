package com.fdmgroup.interfacesExercise;

import java.util.ArrayList;

public class CalorieCounter {
	
	private ArrayList<FoodItem> lowCalorieFoods = new ArrayList<>();
	
	public void addLowCalorieFood(FoodItem foodItem) {
		if (foodItem.getCalories() < 500) //checks calorie count then add else no
		lowCalorieFoods.add(foodItem);
	}
	
	public ArrayList<FoodItem> getAllLowCalorieFoods(){
		return lowCalorieFoods;
	}
	
}
