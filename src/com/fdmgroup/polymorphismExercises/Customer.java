package com.fdmgroup.polymorphismExercises;

public class Customer extends UserAccount{

	public Customer(String username, String password, String fullName ) {
		super(username, password, fullName); //calls parent constructor
	}
	
	@Override
	public void accessWebsite() {
		System.out.println("Accessing website with customer rights.");
	}
	
	
	private static int minPasswordLength;
	
	public static int getMinPasswordLength() {
		return minPasswordLength;
	}

	public static void setMinPasswordLength(int minPasswordLength) {
		Customer.minPasswordLength = minPasswordLength;
	}

	@Override
	public boolean changePassword(String newPass, String confirmPass) {
		//check if both matches
		//then check if minimum 10 chars
		if (newPass.length()>=getMinPasswordLength()) {
			//allow change
//			System.out.println("calling super method now");
			return super.changePassword(newPass, confirmPass);
		} else {
			return false;
		}
	}

}
