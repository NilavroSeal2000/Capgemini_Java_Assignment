package com.cg.feb22.oop.intro;

//static members  in 	static context 	- 	with ClassName		
//static members  in 	nonstatic context 	- with ClassName	
//nonstatic members  in 	static context 	- 	with objectName		
//nonstatic members  in 	nonstatic context 	- with this
// this = belonging to this object / pointing to this object 

class Class1 {

	static int num;
	int num2;

	static void m1() {
		System.out.println(Class1.num);
		Class1 obj = new Class1();
		System.out.println(obj.num2);
	}

	void m2() {
		System.out.println(Class1.num);
		System.out.println(this.num2);
	}

}