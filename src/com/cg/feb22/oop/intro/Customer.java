package com.cg.feb22.oop.intro;

public class Customer {
	int custId;
	String custName;
	String custAddress;
	int age;
	String email;
	
	public Customer(int custId, String custName, String custAddress, int age, String email) {
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.age = age;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", age=" + age
				+ ", email=" + email + "]";
	}
	
	
}
