package com.fdmgroup.interfacesExercise;

public class Runner {
	
	public static void main(String[]args) {
		
		Toy toy1 = new Toy();
		toy1.setMinAge(3);
		toy1.setMaxAge(10);
		toy1.setName("BingBong");
		toy1.setPrice(9.99);
		
		Laptop laptop1 = new Laptop();
		laptop1.setCpuSpeed(5000);
		laptop1.setHardDrive(2048);
		laptop1.setMemory(3200);
		laptop1.setName("Dell Inspiron 15R");
		laptop1.setPrice(999);
		
		Snack snack1 = new Snack();
		snack1.setName("Donut balls");
		snack1.setPrice(3);
		snack1.setCalories(453);
		snack1.setFatContent(300);
		snack1.setSugarContent(99);
		
		Snack snack2 = new Snack();
		snack2.setName("Dubai Chocolate Bar");
		snack2.setPrice(99);
		snack2.setCalories(645);
		snack2.setFatContent(7030);
		snack2.setSugarContent(999);
		
		ReadyMeal rm1 = new ReadyMeal();
		rm1.setName("Chicken Fried Rice");
		rm1.setCuisineType("Chinese");
		rm1.setPrice(6.99);
		rm1.setCalories(345);
		
		ReadyMeal rm2 = new ReadyMeal();
		rm2.setName("Curry Udon");
		rm2.setCuisineType("Japan");
		rm2.setPrice(9.99);
		rm2.setCalories(600);
		
		Basket b = new Basket();
		CalorieCounter cc = new CalorieCounter();
		
		b.addItem(toy1);
		b.addItem(laptop1);
		b.addItem(snack1);
		b.addItem(snack2);
		b.addItem(rm1);
		b.addItem(rm2);
		
		System.out.println("Before removing. 6 Items in basket total.");
		System.out.println(b.getAllItems()); //to print properly, override toString method in whatever model class
		System.out.println("Removing toy now...");
		b.removeItem(toy1);
		System.out.println(b.getAllItems());
		
		System.out.println("-------------------------------------------------------------------");
		
		cc.addLowCalorieFood(snack1);
		cc.addLowCalorieFood(snack2);
		cc.addLowCalorieFood(rm1);
		cc.addLowCalorieFood(rm2);
		
		System.out.println("Added all 4 items. only 2 should be added becaose low 500 calories.");
		System.out.println(cc.getAllLowCalorieFoods()); //to print properly, override toString method in whatever model class
		
		System.out.println("-------------------------------------------------------------------");
		
		
		//testing compile error
//		cc.addLowCalorieFood(toy1); //yes compile error does trigger.
		
		
		
	}

}
