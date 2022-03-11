package com.cg.feb22.collection;



public class Employee implements Comparable<Employee> {

	private int eid;
	private String firstName;
	private double salary;

	public Employee() {
		super();
	}

	public Employee(int eid, String firstName, double salary) {
		super();
		this.eid = eid;
		this.firstName = firstName;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", salary=" + salary + "]";
	}


//	@Override
//	public int compareTo(Employee obj) {
//		return this.eid - obj.eid;
//	}

	@Override
	public int compareTo(Employee obj) {
		return Double.valueOf(this.eid).compareTo(Double.valueOf(obj.salary));
		//return (int) (this.salary - obj.salary);
		//return this.firstName.compareTo(obj.firstName);
	}
}