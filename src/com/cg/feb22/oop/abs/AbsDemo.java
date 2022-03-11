package com.cg.feb22.oop.abs;

abstract class AbsClass {
	abstract public void add(int a, int b);
}

public class AbsDemo extends AbsClass {
	
	@Override
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		AbsDemo obj= new AbsDemo();
		obj.add(5, 6);
	}
}
