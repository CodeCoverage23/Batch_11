package com.basic.oops;

class Animal1 {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog1 extends Animal1 {

	void bark() {
		System.out.println("Barking...");
	}

}

class BabyDog extends Dog1 {
	void weep() {
		System.out.println("Weeping...");
	}
}

public class MultilevelInheritanceDemo {

	public static void main(String[] args) {

		BabyDog d = new BabyDog();

		d.eat();
		d.bark();
		d.weep();

	}

}
