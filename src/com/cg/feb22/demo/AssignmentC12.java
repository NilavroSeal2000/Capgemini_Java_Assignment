package com.cg.feb22.demo;

import java.util.Scanner;

public class AssignmentC12 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num1,num2;
	System.out.println("Enter number 1: ");
	num1 = sc.nextInt();
	System.out.println("Enter number 2: ");
	num2 = sc.nextInt();
	
	num1 = num1 + num2;
	num2 = num1 - num2;
	num1 = num1 - num2;
	
	
	System.out.println("Number 1: "+num1+"\tNumber 2:"+num2);
	sc.close();
}
}
