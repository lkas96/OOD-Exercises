package com.fdmgroup.polymorphismExercises;

public class AdminUser extends UserAccount {
	
	public AdminUser(String username, String password, String fullName ) {
		super(username, password, fullName); //calls parent constructor
	}
	
	@Override
	public void accessWebsite() {
		System.out.println("Accessing website with admin rights.");
	}

	
	
	
	private static int minAdminPasswordLength;

	public static int getMinAdminPasswordLength() {
		return minAdminPasswordLength;
	}

	public static void setMinAdminPasswordLength(int minAdminPasswordLength) {
		AdminUser.minAdminPasswordLength = minAdminPasswordLength;
	}
	
	@Override
	public boolean changePassword(String newPass, String confirmPass) {
		//check if both matches
		//then check if minimum 10 chars
		if (newPass.length()>=getMinAdminPasswordLength()) {
			//allow change
//			System.out.println("calling super method now");
			return super.changePassword(newPass, confirmPass);
		} else {
			return false;
		}
	}
	
	//overloading method
	public boolean changePassword(String newPass, String confirmPass, UserAccount userAccount) {
		return userAccount.changePassword(newPass, confirmPass); //if call in customeraccount, i am changing customer account password
	}
	
	
	
	
}
