package com.basic.oops;

class Person {

	public void getPerson() {
		System.out.println("Number of persons : " + 100);
	}

	public void test() {
		System.out.println("Test method from parent class");

	}

}

class Aman extends Person {

	public void getAman() {
		System.out.println("I am Aman");
	}

	@Override
	public void test() {
		System.out.println("Test method from child class");

	}
}

public class UpCastingDemo {

	public static void main(String[] args) {

		Person aman = new Aman();

		// Aman p = (Aman) new Person();

		aman.getPerson();
		aman.test();

	}

}
