package com.cg.feb22.demo;

import java.util.*;

public class AssignmentB8 {

	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int temp = 0, r = 1, s = 0;
		temp = n;
		while (temp != 0) {
			r = temp % 10;
			s = s * 10 + r;
			temp /= 10;
		}
		if (n == s) {
			System.out.println(s + " is a palindrome number");
		} else {

			System.out.println(s + " is not a palindrome number");
		}
		sc.close();
	}
}
