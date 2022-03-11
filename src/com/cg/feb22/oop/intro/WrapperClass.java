package com.cg.feb22.oop.intro;

public class WrapperClass {
public static void main(String[] args) {
//	int a= 10;
//	Employee e1 = new Employee();
//	//e1.
//	Integer n = 1,n1 = 2;
//	int n3 = n1+n;
//	System.out.println(n3);
//	System.out.println(n);
//	//n.
	
	String n1 = "50";
	String n2 = "70";
	String n3 = Integer.toString(Integer.parseInt(n1)+ Integer.parseInt(n2));
	System.out.println(n3);
}
}
