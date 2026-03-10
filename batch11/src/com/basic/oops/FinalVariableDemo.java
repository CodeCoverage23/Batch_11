package com.basic.oops;

public class FinalVariableDemo {

	final int speedLimit = 90;

	/*
	 * We can not change the value of final variable
	 *
	 * public int run() { return
	 * this.speedLimit = 100; }
	 */
	public static void main(String[] args) {

		FinalVariableDemo f = new FinalVariableDemo();

		System.out.println("Bike is running with speed : " + f.speedLimit);

	}

}
