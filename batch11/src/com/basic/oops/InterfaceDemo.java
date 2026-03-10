package com.basic.oops;

interface Car2 {

	int NUMBER_OF_TYRES = 4; // by default public, static, final

	void run(); // by default public abstract

}

public class InterfaceDemo implements Car2 {

	@Override
	public void run() {
		System.out.println("Car is running with number of tyres : " + Car2.NUMBER_OF_TYRES);
	}

	public static void main(String[] args) {

		InterfaceDemo i = new InterfaceDemo();

		i.run();

	}

}
