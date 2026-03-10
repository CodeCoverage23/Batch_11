package com.basic;

public class VariableDemo {

	int a = 30; // instance variable

	static int b = 50; // static variable
	
	
	String s = null; // instance variable
	

	public static void main(String[] args) {

		int data = 20; // local variable

		VariableDemo v = new VariableDemo(); // Object

		System.out.println(data);
		System.out.println(b);
		System.out.println(v.a);
		v.variableMethod();

	}

	void variableMethod() {
		int data = 10; // local variable
		System.out.println(data);
		System.out.println(a);

	}

	void instanceMethod() {

		System.out.println(a);
	}

}

/*
 * class Demo {
 * 
 * void method() { System.out.println(VariableDemo.b); }
 * 
 * }
 */
