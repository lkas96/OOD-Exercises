package com.fdmgroup.polymorphismExercises;

public abstract class UserAccount {
	
	private String username;
	private String password;
	private String fullName;
	
	public UserAccount(String username, String password, String fullName) {
		this.username = username;
		this.password = password;
		this.fullName = fullName;
	}
	
	//getters and setters
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getFullName() {
		return this.fullName;
	}
	
	public void setUsername(String newUserName) {
		this.username = newUserName;
	}
	
	public void setFullName(String newFullName) {
		this.fullName = newFullName;
	}
	
	
	//methods
	public boolean changePassword(String newPass, String confirmPass) {
//		System.out.println(newPass);
//		System.out.println(confirmPass);
		if (newPass.contentEquals(confirmPass)) {
			this.password = newPass;
			return true;
		} else {
			return false;
		}
	}
	
	public void accessWebsite() {
		//abstract method to force child to implement, UML is italics.
	}
	
}
