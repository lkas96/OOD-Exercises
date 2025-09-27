package com.fdmgroup.inheritanceExercises;

public class AdminUser extends UserAccount {

	public AdminUser(String username, String password, String fullName ) {
		super(username, password, fullName); //calls parent constructor
	}
	
	@Override
	public void accessWebsite() {
		System.out.println("Accessing website with admin rights.");
	}
	
}
