package Module_1;

public class Main {
	
	//Section 1.1
	private static String message = "This is section 1.1 Simple Message";
	
	//Section 1.2
	private static String firstName = "Lawson";
	private static String secondName = "Kwek";
	private static String fullName = firstName + " " + secondName; //insert space if not it prints lawsonkwek
	
	//Section 1.3
	private static String receipientName = "Earl";
	
	//Section 1.5
	private static String sentence = "this is a sentence";
	
	//Section 2.1
	private static int faveNum = 69;
	
	//Section 2.2
	private static int num1 = 5, num2 = 3;
	
	//Section 2.3
	private static int counter = 0;
	
	//Section 2.4
	private static int a = 5, b = 2;
	private static double c = 5, d = 2;
	
	//Section 3.1
	private static char letter = 'a';
	private static int code = 98;
	
	//Section 3.2
	private static char char1 = 'x';
	private static char char2 = 'y';
	private static char char3 = 'z';
	private static String string1 = "x";
	private static String string2 = "y";
	private static String string3 = "z";
	
	//Section 4.1
	private static String number1 = "5";
	private static String number2 = "3";
	
	//Section 4.2
	private static String dNumber1 = "5.3";
	private static String dNumber2 = "3.2";
	
	//Section 4.3
	private static String sstring1 = "abc11";
	private static String sstring2 = "9xyz";
	private static String sstring3 = "abc7xyz";
	
	public static void main(String[] args) {
		
		//Section 1.1
		System.out.println(message);
		System.out.println();
		
		//Section 1.2
		System.out.println(fullName);
		System.out.println();
		
		//Section 1.3
		System.out.println("Hello " + receipientName + ", would you like to learn some Java today?");
		System.out.println();
		
		//Section 1.4
		System.out.println(firstName.length());
		System.out.println(firstName.toUpperCase());
		System.out.println(firstName.charAt(0));
		System.out.println(firstName.charAt(firstName.length()-1));
		System.out.println();
		
		//Section 1.5
		System.out.println(sentence.indexOf(" "));
		System.out.println(sentence.lastIndexOf(" "));
		System.out.println(sentence.indexOf("x"));
		System.out.println(sentence.substring(0, 4));
		System.out.println(sentence.substring(10)); //prints from character 10 till the end of string
		System.out.println(sentence.substring(5,9)); //we want to print 5,6,7,8 so stops at 9 substring(start,stop at)
		System.out.println(sentence.contains("a"));
		System.out.println(sentence.contains("x"));
		System.out.println("is " + sentence + "?");
		System.out.println(sentence.replaceFirst("t", "T")); //regular replace, replaces all, replaceFirst finds the first t
		System.out.println();
		
		//Section 2.1
		System.out.println("My favourite number is " + faveNum);
		System.out.println();
		
		//Section 2.2
		System.out.println(num1+num2);
		System.out.println();
		
		//Section 2.3
		counter ++;
		counter += 5;
		counter --;
		counter = counter - 2;
		counter = counter * 2;
		System.out.println(counter);
		System.out.println();
		
		//Section 2.4
		System.out.println(a/b); // int divide by int so gives int output data loss 5/2 remainder is 1 but missing. rounded down
		System.out.println(c/d); // int divide by double or double divided by int, answer will always be double with no missing remainders
		System.out.println(c/b);
		System.out.println(a/d);
		System.out.println();
		
		//Section 3.1
		System.out.println((int)letter);
		System.out.println((char)code);
		System.out.println((char)36);
		System.out.println();
		
		//Section 3.2
		System.out.println('c' - 'a');
		System.out.println('z' - 'a');
		System.out.println();
		
		//Section 3.3
		System.out.println(char1 + char2 + char3); 		//will add all the unicode values instead - 363
		System.out.println(char1 + char2 + string2); 	//first two will add values then string text 
		System.out.println(char1 + string1 + char3);	//char + string will just be treated as string then string already add another char will be string as well so it is xxz
		System.out.println();
		
		//Section 4.1
		System.out.println(Integer.parseInt(number1) + Integer.parseInt(number2));
		System.out.println();
		
		//Section 4.2
		System.out.println(Double.parseDouble(dNumber1)+ Double.parseDouble(dNumber2));
		System.out.println();
		
		//Section 4.3
		String substring1 = sstring1.substring(3); //start from fourth string letter abc11, 0,1,2 we do not want, so start at 3
		String substring2 = sstring2.substring(0,1); //starts at 0, cuts off at 1, not the same as cut off 1 letter but 2nd string letter, so prints 9, 9xyz
		String substring3 = sstring3.substring(3,4); //starts at 3, pointers ends at 4 does not print 4th string letter, so only prints 7 abc7xyz
		System.out.println(Integer.parseInt(substring1) + Integer.parseInt(substring2) + Integer.parseInt(substring3));
		System.out.println();
		
	}

}
