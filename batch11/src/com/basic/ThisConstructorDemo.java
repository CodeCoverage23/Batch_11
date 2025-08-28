package com.basic;

public class ThisConstructorDemo {

	int age;
	String name;

	// third call
	public ThisConstructorDemo() {
		this(12);
		System.out.println("This is default constructor...");
	}

	// second call
	public ThisConstructorDemo(int age) {
		this("Sam");
		this.age = age;
		System.out.println(age);
	}

	// first call
	public ThisConstructorDemo(String name) {
		this.name = name;
		System.out.println(name);
	}

	public static void main(String[] args) {

		ThisConstructorDemo t = new ThisConstructorDemo();
		ThisConstructorDemo instance = t.getInstance();
		System.out.println(instance);

	}

	public ThisConstructorDemo getInstance() {
		return this;
	}

}
