package com.cg.feb22.demo;

import java.util.Scanner;

public class AssignmentA5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the table: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=10;i++)
		{
			System.out.printf("%d X %d = %d\n",i,n,i*n);
		}
		sc.close();
	}
}
