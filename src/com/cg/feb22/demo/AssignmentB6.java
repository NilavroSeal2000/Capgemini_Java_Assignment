package com.cg.feb22.demo;

import java.util.*;

public class AssignmentB6 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		int fact = 1;
		if (a == 0 || a == 1) {
			System.out.println("Factorial of the number is 1");
		} else {
			for (int i = 1; i <= a; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial of the number is " + fact);
		}
		sc.close();
	}
}