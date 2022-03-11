package com.cg.feb22.misc;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
//		String input = "abcd";
//		String stringValue = "bc";
//		
//		Pattern pat = Pattern.compile(stringValue); // stringvalue is a string value
//		//Pattern pattern = new Pattern(); //Constructor is private
//		
//		
//		Matcher mat = pat.matcher(input);
//		
//		System.out.println(mat.matches()); // exact match
//		System.out.println(mat.find()); // searches for present or not
////      System.out.println(mat.start()); //Returns the start index of the previous match. 
//		System.out.println(mat.lookingAt()); // check if it is starting with the String or not
	
	
//		String input = "ABCD1234F";
//		String stringValue = "[0-9]";
//		// or [a-z][A-Z]
//		// [aeiou] to check vowel in any order it will work
//		// [^@!]   ^ means should not contains this character
//		
//		Pattern pat = Pattern.compile(stringValue); // stringvalue is a string value
//		//Pattern pattern = new Pattern(); //Constructor is private
//		
//		
//		Matcher mat = pat.matcher(input);
//		
//		//System.out.println(mat.matches()); // exact match
//		System.out.println(mat.find()); // searches for present or not
////      System.out.println(mat.start()); //Returns the start index of the previous match. 
//		//System.out.println(mat.lookingAt()); // check if it is starting with the String or not

		
		
//		System.out.println("Please enter mail: ");
//		String email = "String@String.String";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter PAN");
		String input = sc.next();
		String panCard = "[A-Z]{5}[0-9]{4}[A-Z]";
		Pattern pat = Pattern.compile(panCard); 
		Matcher mat = pat.matcher(input);
		System.out.println(mat.matches());
		sc.close();
	}
}
