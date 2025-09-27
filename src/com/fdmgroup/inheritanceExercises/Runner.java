package com.fdmgroup.inheritanceExercises;

public class Runner {

	public static void main(String[] args) {

		AdminUser admin1 = new AdminUser("admin1", "admin1123", "admin1 xyz");
		Customer cust1 = new Customer("cust1", "cust1123", "customer1 xyz");
		AdminUser admin2 = new AdminUser("admin2", "admin2123", "admin2 xyz");
		Customer cust2 = new Customer("cust2", "cust2123", "customer2 xyz");
		
//		System.out.println("Existing admin1 pass : " + admin1.getPassword());
//		System.out.println(admin1.changePassword("newpass", "newpass"));
//		System.out.println("New admin1 pass : " + admin1.getPassword());
//		admin.accessWebsite();
//		
//		System.out.println("-----------------------------------------------");
//		
//		System.out.println("Existing cust1 pass : " + cust1.getPassword());
//		System.out.println(cust1.changePassword("newpass", "newpass123"));
//		System.out.println("No change cust1 pass : " + cust1.getPassword());
//		cust.accessWebsite();
		
		
		UserAccountManager uam = new UserAccountManager();
		uam.addUser(admin1);
		uam.addUser(admin2);
		uam.addUser(cust1);
		uam.addUser(cust2);
		
		System.out.println("Login admin1 right: " + uam.login("admin1", "admin1123"));
		System.out.println("Login admin1 wrong: " + uam.login("admin1", "admin11234"));
	}

}
