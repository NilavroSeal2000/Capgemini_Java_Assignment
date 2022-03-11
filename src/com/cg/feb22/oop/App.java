package com.cg.feb22.oop;

public class App {

	static int num = 10; // booking window
	int num2 = 20; // cinema hall

	App()
	{
		System.out.println("Constructor Call");
	}
	static {
		System.out.println("Static");
	}
	static void enterCinemaPremises() {
		System.out.println("I am in cinema premises.");
	}

	void enterCinemaHall() {
		System.out.println("I am in cinema hall now.");
	}

	public static void main(String[] args) {

		System.out.println(num);
//		System.out.println(num2); // CE
		//enterCinemaPremises();

		App obj = new App();
		System.out.println(obj.num2);
		obj.enterCinemaHall();

	}

}