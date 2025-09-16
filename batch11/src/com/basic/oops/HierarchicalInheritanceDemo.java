package com.basic.oops;

class Animal2 {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog2 extends Animal2 {

	void bark() {
		System.out.println("Barking...");
	}

}

class Cat extends Animal2 {
	void meow() {
		System.out.println("Meowing...");
	}
}

public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {

		Dog2 d = new Dog2();

		d.eat();
		d.bark();

		Cat c = new Cat();

		c.eat();
		c.meow();

	}

}
