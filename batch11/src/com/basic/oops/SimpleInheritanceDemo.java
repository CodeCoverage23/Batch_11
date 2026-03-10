package com.basic.oops;

class Animal {
	void eat() {
		System.out.println("Eating...");
	}

}

class Dog extends Animal {

	void bark() {
		System.out.println("Barking...");
	}

}

public class SimpleInheritanceDemo {

	public static void main(String[] args) {

		Dog d = new Dog();

		d.eat();
		d.bark();

	}

	protected void getAnimal() {
		System.out.println("number of animals");
	}

}
