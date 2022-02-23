package com.cg.feb22.demo;

import java.util.Random;

public class AssignmentC4  {
	public static void main(String[] args) {
		Random random = new Random();   
		int i=0;
		for(i=0;i<5;i++) {
			System.out.println(random.nextInt(100));
		}
	}
}