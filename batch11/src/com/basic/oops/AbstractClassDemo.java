package com.basic.oops;

abstract class Bike {

	int numberOfBike = 1;

	public void capacity() {
		System.out.println("Capacity is 2");
	}

	public abstract void run();

}

public class AbstractClassDemo extends Bike {

	public void run() {
		System.out.println("Bike is runing with speed 40");
	}

	public static void main(String[] args) {
		AbstractClassDemo a = new AbstractClassDemo();

		System.out.println("Number of bikes : " + a.numberOfBike);
		a.run();
		a.capacity();
	}

}
