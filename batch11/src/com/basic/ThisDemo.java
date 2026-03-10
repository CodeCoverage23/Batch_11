package com.basic;

public class ThisDemo {

	int age;
	String name;

	public ThisDemo(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {

		ThisDemo t = new ThisDemo(18, "Sam");

		t.printAge();

	}

	public void printAge() {
		System.out.println("Before this keyword use : " + this.age);
		this.age = 22;
		System.out.println("After this keyword use : " + this.age);
		
		this.printName();
		
	}
	
	public void printName() {
		System.out.println(this.name);
	}

}
