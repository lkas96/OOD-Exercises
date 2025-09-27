package com.fdmgroup.interfacesExercise;

public class Toy implements BasketItem {
	
	private String name;
	private double price;
	private int minAge;
	private int maxAge;
	
	//never set any constructor, java will auto use default constructor, which is
	// public Toy(){}
	//then just use the set methods to assign values to TOY OBJECT.
	
	public int getMinAge() {
		return minAge;
	}

	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}

	public int getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
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
        return "Toy [name=" + this.name + "]";
    }
	
	
}
