package com.cg.feb22.oop.es;

import java.util.Scanner;

public class ExceptionClass {
public static void main(String[] args) {
	System.out.println("--- INTEGER DIVISION PROGRAM ---");
	int num1,num2;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter num1: ");
	num1 = sc.nextInt();
	System.out.println("Enter num2: ");
	num2 = sc.nextInt();
	
	try {
	System.out.println(num1/num2);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Zero division error.");
		
	}
	System.out.println("End of code");
}
}
