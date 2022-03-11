package com.cg.feb22.oop.intro;

public class Employee {

	int eid;
	String firstName;
	double salary;

	Employee() {
		System.out.println("constructor called");
	}

	public Employee(int a, String b, double c) {
		this.eid = a;
		this.firstName = b;
		this.salary = c;
		System.out.println("constructor called");
	}

	void work() {
		System.out.println(firstName + " works...");
	}

	public Employee(String firstName, double salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}