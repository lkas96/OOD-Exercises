package com.fdmgroup.interfacesExercise;

import java.util.ArrayList;

public class Basket {
	
	private ArrayList<BasketItem> basketItems = new ArrayList<>();
	
	//methods
	public void addItem(BasketItem basketItem) {
		basketItems.add(basketItem);
	}
	
	public void removeItem(BasketItem basketItem) {
		basketItems.remove(basketItem); //remove all instances if add multiple, remove only removes first instances.
	}
	
	public ArrayList<BasketItem> getAllItems(){
		return basketItems;
	}
}
