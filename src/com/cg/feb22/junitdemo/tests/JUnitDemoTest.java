package com.cg.feb22.junitdemo.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cg.feb22.junitdemo.JUnitDemo;

public class JUnitDemoTest {

	private static JUnitDemo obj;

	@BeforeAll
	public static void setUp() {
		// initial code
		System.out.println("setUp");
		obj = new JUnitDemo();
	}

	@AfterAll
	public static void tearDown() {
		// closing code
		System.out.println("tearDown");
		obj = null;
	}

	@BeforeEach
	public void runBeforeEachTestCase() {
		System.out.println("runBeforeEachTestCase");
	}

	@AfterEach
	public void runAfterEachTestCase() {
		System.out.println("runAfterEachTestCase");
	}

	@Test
	public void testAddNums() {
		System.out.println("testAddNums");
		int expected = 30;
		int actual = obj.addNums(10, 20);
		assertEquals(expected, actual);
	}

	@Test
	public void testAddNums2() {
		System.out.println("testAddNums2");
		int unexpected = 40;
		int actual = obj.addNums(10, 20);
		assertNotEquals(unexpected, actual);
	}

}

//package com.cg.feb22.junitdemo.tests;
//
//import static org.junit.jupiter.api.Assertions.assertEquals; // JUnit 5
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//
//import org.junit.jupiter.api.Test;
//
//import com.cg.feb22.junitdemo.JUnitDemo;
//
//public class JUnitDemoTest {
//
//	// Positive Test Case
//	@Test
//	public void testAddNums1() {
//		JUnitDemo obj = new JUnitDemo();
//		int expected = 22;
//		int output = obj.addNums(10, 12);
//		assertEquals(expected, output);
//	}
//
//	// Negative Test Case
//	@Test
//	public void testAddNums2() {
//		JUnitDemo obj = new JUnitDemo();
//		int unexpected = 52;
//		int output = obj.addNums(10, 12);
//		assertNotEquals(unexpected, output);
//	}
//
//	// Positive Test Case
//	@Test
//	public void testSubNums1() {
//		JUnitDemo obj = new JUnitDemo();
//		int expected = -2;
//		int output = obj.subNums(10, 12);
//		assertEquals(expected, output);
//	}
//
//	// Negative Test Case
//	@Test
//	public void testSubNums2() {
//		JUnitDemo obj = new JUnitDemo();
//		int unexpected = 22;
//		int output = obj.subNums(10, 12);
//		assertNotEquals(unexpected, output);
//	}
//}
