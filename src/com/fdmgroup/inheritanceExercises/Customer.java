package com.fdmgroup.inheritanceExercises;

public class Customer extends UserAccount{

	public Customer(String username, String password, String fullName ) {
		super(username, password, fullName); //calls parent constructor
	}
	
	@Override
	public void accessWebsite() {
		System.out.println("Accessing website with customer rights.");
	}
	

}
