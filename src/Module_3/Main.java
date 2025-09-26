package Module_3;

public class Main {
	
//	//Section 1.1
//	private static String alienColour = "yellow";
//
//	public static void main(String[] args) {
//		
//		if (alienColour.equalsIgnoreCase("green")) {
//			//success prints out 5 pts
//			System.out.println("That is correct!, Alien is green. 5 points for you");
//		} else {
//			System.out.println("Wrong boo no points for you....");
//		}
//
//	}
	
	
//	//Section 1.2 & 1.3
//	private static String alienColour = "boo";
//	
//	public static void main(String[] args) {
//
//		if (alienColour.equalsIgnoreCase("green")) {
//			//success prints out 5 pts
//			System.out.println("That is correct!, Alien is green. 5 points for you");
//		} else if (alienColour.equalsIgnoreCase("red")){
//			System.out.println("Alien is red, correct! 10 points for you.");
//		} else if (alienColour.equalsIgnoreCase("yellow")) {
//			System.out.println("Yellow yellow dirty fellow, you get 15 points!");
//		} else {
//			System.out.println("Wrong boo no points for you....invalid colour");
//		}
//	}
	
	
	
//	//Section 1.4
//	private static int age = 13;
//	
//	public static void main(String[] args) {
//		if (age < 2) {
//			System.out.println("Baby");
//		} else if (age < 4) {
//			System.out.println("Toddler");
//		} else if (age < 13) {
//			System.out.println("Child");
//		} else if (age < 20) {
//			System.out.println("Teenager");
//		} else if (age < 65) {
//			System.out.println("Working Adult");
//		} else {
//			System.out.println("Pensioner");
//		}
//	}
	
	
	
	
//	//Section 1.5
//	private static double salary = 150000;
//	
//	public static void main(String[]args) {
//		if (salary >= 150000) {
//			System.out.println("45%");
//		} else if (salary >= 50000 && salary < 150000) {
//			System.out.println("40%");
//		} else if (salary >= 12500 && salary < 50000) {
//			System.out.println("20%");
//		} else if (salary >= 0 && salary < 12500) {
//			System.out.println("0%");
//		} else {
//			System.out.println("No salary, unemployment no taxes needed.");
//		}
//	}
	
	
	
//	//Section 2.1 
//	private static int accountNumber = 99999999;
//	
//	public static void main(String[] args) {
//		if (accountNumber >=1000000 && accountNumber <=99999999) {
//			System.out.println("Valid Account Number");
//		} else {
//			System.out.println("Invalid Account Number");
//		}
//
//	}
	
	
	
//	//Section 2.2 & 2.3 & 2.4
//	private static String flightCode = "LH1234";
//	
//	public static void main(String[] args) {
//		
//		String tempSub = flightCode.substring(0, 2);
//		if (!tempSub.equals("BA") && !tempSub.equals("LH") && !tempSub.equals("FR")) {
////		if (tempSub.equals("BA") || tempSub.equals("LH") || tempSub.equals("FR")) {
////			System.out.println("British Airways.");
//			System.out.println("Invalid Airways");
////		} else {
////			System.out.println("Not Valid Airways!");
////		}
//
//	}}
//	
//	
//	

	
//	//Section 2.5
//	private static boolean validPassport = false;
//	private static boolean validDrivingLicense = false;
//	
//	public static void main(String[] args) {
//		if (validPassport == true && validDrivingLicense == true) {
//			System.out.println("ID Verified");
//		} else {
//			System.out.println("Unable to verify ID");
//		}
//
//	}
	
	
	//Section 2.6
	private static boolean hasLicense = true;
	private static boolean isDead = false;
	private static boolean hasPassedEyeTest = true;
	private static int age = 71; //don't even need age just the 3 booleans but same concept ok.
	
	public static void main (String[]args) {
		if (hasLicense == true && isDead == false && hasPassedEyeTest == true && age > 70) {
			System.out.println("Can still drive.");
		} else {
			System.out.println("Cannot drive too old, bo license.");
		}
	}
	
	
	
}

/*
	//Section 
	
	public static void main(String[] args) {


	}
*/
