package com.cg.feb22.oop;

class BasicPhone{
	void music()
	{
		System.out.println("Playing music...");
	}
}

class SmartPhone extends BasicPhone{
	@Override
	void music()
	{
		System.out.println("Playing Dolby music...");
	}
}

public class OverrideDemo {
public static void main(String[] args) {
	BasicPhone bp = new BasicPhone();
	bp.music();
	SmartPhone sp = new SmartPhone();
	sp.music();
}
}
