package com.cg.feb22.oop.ex;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExDemo4 {

	static void printNums() throws InterruptedException {
		for (int i = 0; i <= 10; i++) {
			Thread.sleep(500); // bank cheque bounce
			System.out.println(i);
		}
	}

	static void Hdfc() {
		try {
			ExDemo4.printNums();
		} catch (InterruptedException e) {
			System.out.println("1000");
		}
	}
	
	@Test
	public void TestMe()
	{
		assertEquals(10,10);
	}

	static void Icici() {
		try {
			ExDemo4.printNums();
		} catch (InterruptedException e) {
			System.out.println("500");
		}
	}

	public static void main(String[] args) {

		System.out.println("Start");
//		ExDemo4.printNums();
		System.out.println("End");

	}

}