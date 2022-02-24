package com.cg.feb22.practice;

import java.util.Random;

public class RandomDemo {
public static void main(String[] args) {
	Random ran = new Random();
	int[] a = new int[5];
	
	System.out.println(ran.nextInt());
	System.out.println(ran.nextInt(10));
}
}
