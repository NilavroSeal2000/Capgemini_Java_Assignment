package com.cg.feb22.demo;

public class AssignmentB7 {
	public static void main(String[] args) {
		int i, j, c;
		for (i = 2; i <= 100; i++) {
			c = 0;
			for (j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					c = 1;
					break;
				}
			}
			if (c == 0)
				System.out.print(i + " ");
		}
	}
}
