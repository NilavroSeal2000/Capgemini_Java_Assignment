package com.cg.feb22.demo;

import java.util.Scanner;

public class AssignmentC15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check prime or not: ");
		int n = sc.nextInt();
		sc.close();
		int i;
		if (n > 2) {
			for (i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					System.out.println("NOT PRIME");
					break;
				}
			}
			if (i >= n / 2) {
				System.out.println("PRIME");
			}
		} else {
			System.out.println("NOT PRIME");
		}

	}
}
