package Module_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	
//	//Section 1.1
//	private static String[] friends = {"Earl", "Si Hong", "Daan", "Nippy", "Sky"};
//
//	public static void main(String[] args) {
//		System.out.println(friends.length);
//		
//		for (int i = 0; i < friends.length; i++) {
//			System.out.println(friends[i]);
//		}
//		
//		friends[4] = "Ekko";
//		System.out.println(friends[4]);
//		
//		Arrays.sort(friends);
//		
//		System.out.println(friends[0]);
//		
//		System.out.println(friends[4]);
//		
//		friends[1] = null;
//		
//		System.out.println(friends[1]);		
//	}

	
	
//	//Section 1.2
//	private static String[] pokerHand = new String[5];
//	
//	public static void main(String[] args) {
//		pokerHand[0] = "Queen of Hearts";
//		pokerHand[1] = "3 of Spades";
//		pokerHand[2] = "3 of Diamonds";
//		pokerHand[3] = "9 of Hearts";
//		pokerHand[4] = "6 of Clubs";
//		
//		for (int i = 0; i < pokerHand.length; i++) {
//			System.out.println(pokerHand[i]);
//		}
//	}
	
	
	
//	//Section 2.1
//	private static List<String> shoppingBasket = new ArrayList<>();
//
//	public static void main(String[] args) {
//		shoppingBasket.add("milk");
//		shoppingBasket.add("cereals");
//		shoppingBasket.add("apples");
//		shoppingBasket.add("oranges");
//		shoppingBasket.add("bread");
//		
//		System.out.println(shoppingBasket.size());
//		
//		System.out.println(shoppingBasket.get(0));
//		
//		System.out.println(shoppingBasket.get(4));
//		
//		shoppingBasket.remove(4);
//		System.out.println(shoppingBasket.size());
//		
//		shoppingBasket.remove(2);
//		System.out.println(shoppingBasket);
//		
//		shoppingBasket.add("potatoes");
//		shoppingBasket.add("olive oil");
//		shoppingBasket.add("chicken");
//		
//		Collections.sort(shoppingBasket); //Since arraylist no sort, use the parent class function, Collection has a sort feature.
//		System.out.println(shoppingBasket);
//		
//		System.out.println(shoppingBasket.get(0));
//		System.out.println(shoppingBasket.get(shoppingBasket.size()-1));
//	}
	
	
	
	//Section 2.2
	private static List<Integer> salaries = new ArrayList<>();
	
	public static void main(String[] args) {
		salaries.add(75000);
		salaries.add(25000);
		salaries.add(42000);
		salaries.add(30000);
		salaries.add(55000);
		salaries.add(42000);
		salaries.add(39000);
		
		System.out.println(Collections.max(salaries));
		System.out.println(Collections.min(salaries));
		System.out.println(Collections.frequency(salaries, 42000));
		
		Collections.sort(salaries);
		System.out.println(salaries.get(3)); //0,1,2,3,4,5,6 so middle is 3, assuming no need to check if odd or even so just call direct element
		
		Collections.reverse(salaries);
		System.out.println(salaries.get(0));
		System.out.println(salaries.get(salaries.size() - 1));
	}
	
	
}

/*
public static void main(String[] args) {
	
}
*/
