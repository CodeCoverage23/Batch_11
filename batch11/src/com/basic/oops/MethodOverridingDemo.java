package com.basic.oops;

class Vehicle {

	public void run() {
		System.out.println("Vehicle is runnig...");
	}

}

class Car extends Vehicle {

	@Override
	public void run() {
		System.out.println("Car is running safe...");
	}

}

public class MethodOverridingDemo {

	public static void main(String[] args) {

		Car c = new Car();
		c.run();

	}

}
