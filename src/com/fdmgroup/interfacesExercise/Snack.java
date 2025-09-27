package com.fdmgroup.interfacesExercise;

public class Snack implements BasketItem, FoodItem {
	
	private String name;
	private double price;
	private int calories;
	private int fatContent;
	private int sugarContent;

	public int getFatContent() {
		return fatContent;
	}

	public void setFatContent(int fatContent) {
		this.fatContent = fatContent;
	}

	public int getSugarContent() {
		return sugarContent;
	}

	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}

	@Override
	public int getCalories() {
		return this.calories;
	}

	@Override
	public void setCalories(int calories) {
		this.calories = calories;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public double getPrice() {
		return this.price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	
    // Override the toString() method
    @Override
    public String toString() {
        return "Snack [name=" + this.name + "]";
    }

	
}
