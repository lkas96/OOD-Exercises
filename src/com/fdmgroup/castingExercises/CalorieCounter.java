package com.fdmgroup.castingExercises;

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
	
	public void removeHighCalorieFoodsFromBasket(Basket basket, int calories) {
		
		//we pass in a basket and an int, the calories exceeding this amount we want to remove
		//loop through the basket then check instance of two
		
		ArrayList<BasketItem> basketItemArray = basket.getAllItems();
		
		for (int i = 0; i < basketItemArray.size(); i++) {
			
			if (basketItemArray.get(i) instanceof ReadyMeal) {
				//check if calories above the passed in one, if so remove from basket item array list
				if (((ReadyMeal) basketItemArray.get(i)).getCalories() >= calories) {
					//calories and up remove
					basket.removeItem(basketItemArray.get(i));
				}
			} else if (basketItemArray.get(i) instanceof Snack) {
				if (((Snack) basketItemArray.get(i)).getCalories() >= calories) {
					basket.removeItem(basketItemArray.get(i));
				}
			}
			
		}
	}
	
}
