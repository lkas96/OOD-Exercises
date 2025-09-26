package Module_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

//	//Section 1.1
//	private static String[] courses = {"UNIX", "SQL", "Java", "Python", "Web Apps"};
//	
//	public static void main(String[] args) {
//		
//		for (int i = 0; i < courses.length; i++) {
//			System.out.println("I love learning " + courses[i]);
//		}
//	}
	
	
//	//Section 1.2 & 1.3
//	private static String[] courses = {"UNIX", "SQL", "Java", "Python", "Web Apps"};
//	private static List<String> coursesList = new ArrayList<>();
//	
//	public static void main(String[] args) {
//		
//		for (int i = 0; i < courses.length; i++) {
//			coursesList.add(courses[i]);
//		}
////		System.out.println(coursesList.toString());
//		
//		for (int i = 0; i < coursesList.size(); i++) {
//			System.out.println(coursesList.get(i));
//		}
//		
//	}
	
	
	
	
	//Section 1.4 and 1.5
	private static List<Double> prices = new ArrayList<>();
	private static double tempSum;
	
	private static double[] copiedArray = new double[5]; //for 1.5
	
	public static void main(String[] args) {
		prices.add(4.5);
		prices.add(1.99);
		prices.add(9.75);
		prices.add(3.15);
		prices.add(10.25);
		
		for (int i = 0; i < prices.size(); i++) {
//			tempSum += prices.get(i);
			copiedArray[i] = prices.get(i);
			
		}
		
//		System.out.println("$" + tempSum);
		System.out.println(Arrays.toString(copiedArray));


	}
	
	
//	//Section 1.5
//	private static double[] copiedArray = new double[5];
//	
//	public static void main(String[]args) {
//		
//	}
	
	
	
	
	
	
//	//Section 1.6
//	private static String numberString = "10,7,25,3,8";
//	private static int sum;
//	
//	public static void main(String[] args) {
//		String[] splitNumbers = numberString.split(",");
//		
//		for (String s : splitNumbers) {
//			sum += Integer.parseInt(s);
//			
//		}
//		System.out.println(sum);
//
//	}
	
	
	
//	//Section 1.7
//	private static String reverseString = "desrever neeb sah txet siht";
//	
//	public static void main(String[] args) {
//		char[] characters = reverseString.toCharArray();
//		
//		String reversed = "";
//		
//		for (char c : characters) {
//			reversed = c + reversed;
//		}
//		System.out.println(reversed.toString());
//	}

	
	
//	//Section 2.1
//	public static void main(String[]args) {
//		for (int i = 1; i <= 1_000_000; i++) {
//			System.out.println(i);
//		}
//	}
	
	
	
//	//Section 2.2
//	private static long sum = 0;
//	
//	public static void main(String[]args) {
//		for (int i = 1; i <= 1_000_000; i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
//	}
	
	
	
//	//Section 2.3
//	public static void main(String[]args) {
//		for (int i = 1; i <=20; i++) {
//			if (! (i%2 == 0)) {
//				//if modulous returns remainder, is odd number. print
//				System.out.println(i);
//			}
//		}
//	}
	
	
	
//	//Section 2.4
//	public static void main(String[] args) {
//		for (int i = 1; i < 13; i++) {
//			System.out.println(i + " x 3 = " + i*3);
//		}
//	}
	
	
	
//	//Section 2.5
//	private static int[] scores = {25,15,99,75,47,59,82};
//	
//	public static void main(String[] args) {
//		for (int i = 0; i < scores.length ; i++) {
//			if ( i%2 == 0) {
//				//even number so ignore.
//				System.out.println(scores[i]);
//			} else {
//				System.out.println(scores[i]+1);
//			}
//			
//		}
//	}
	
	
	
//	//Section 2.6
//	private static char letterB = 'b';
//	
//	public static void main(String[] args) {
////		System.out.println((int)letterB); //gives 98 int value
//		
//		for (int i = (int)letterB; i < (int)letterB+25; i++) {
//			if (i%2 == 0) {
//				System.out.println((char)i); //cast back to char from int value
//			} else {
//				//do nothing 
//			}
//		}
//
//	}
	
	
	
//	//Section 2.7
//	public static void main(String[]args) {
//		System.out.println("For 2 times table. (1-10)");
//		for (int i = 1; i < 11; i++) {
//			System.out.println(i + " x 2 = " + i*2);
//		}
//		
//		System.out.println("For 12 times table. (1-10)");
//		for (int i = 1; i < 11; i++) {
//			System.out.println(i + " x 12 = " + i*12);
//		}
//	}
	
	
	
//	//Section 3
//	public static void main(String[]args) {
//		int counter = 1;
//		int numberNow = 1;
//		while (counter <= 1_000_000) {
//			System.out.println(numberNow++);
//			counter++;
//		}
//	}
	
	
	
	
//	//Section 3.2
//	private static int letterAValue = (int)'a'; //also start counter
//	private static int counter = letterAValue; //COUNTER but starts at a char value
//	private static int letterZValue = (int)'z'; //stop at this value
//	
//	public static void main(String[]args) {
//		while (counter < letterZValue + 1) {
//			System.out.println((char)counter);
//			counter++;
//		}
//	}
	
	
	
	
//	//Section 3.3
//	private static int fiboSum = 0;
//	private static List<Integer> fiboSequence = new ArrayList<>();
//	
//	public static void main(String[]args) {
//		while (fiboSum < 1000) {
//			if (fiboSum == 0) {
//				fiboSequence.add(0);
//				fiboSequence.add(1);
//				fiboSum = fiboSequence.get(fiboSequence.size()-2) + fiboSequence.get(fiboSequence.size()-1);
//			} else {
//				fiboSum = fiboSequence.get(fiboSequence.size()-2) + fiboSequence.get(fiboSequence.size()-1);
//				fiboSequence.add(fiboSum);
//				
//				if (fiboSum > 1000) {
//					//remove the last sequence cause exceed
//					fiboSequence.remove(fiboSequence.size()-1);				
//				}				
//			}
//		}
//		System.out.println(fiboSequence.toString());
//	}
	
	
	
	
//	//Section 4.1
//	private static String[] cities = {"Glasgow", "London", "Birmingham", "Cardiff", "Manchester", "Newcastle"};
//	
//	public static void main(String[]args) {
//		for (int i = 0; i < cities.length; i++) {
//			if (cities[i].substring(0,1).equals("B")) {
//				System.out.println(cities[i] + " - match the starting letter B");
//				break;
//			} else {
//				System.out.println(cities[i] + " - doesn't match the starting letter B");
//			}
//		}
//	}
//	
	
	
	
//	//Section 4.2
//	private static int[] numbers = {6,15,75,32,89,24,103,17,5,250,63,91};
//	
//	public static void main(String[] args) {
//		for (int n : numbers) {
//			if (n > 100) {
//				System.out.println(n);
//				break;
//			}
//		}
//	}
	
	
	
	


}

/*
//Section 
public static void main(String[] args) {


}
*/