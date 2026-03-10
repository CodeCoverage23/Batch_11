package com.basic;

public class MethodDemo {

	public static void main(String[] args) {

		MethodDemo m = new MethodDemo();

		int a = m.addMethodWithReturnType();
		System.out.println("2nd Addition : " + a);

		m.add();

		float f = m.addMethodWithReturnAndParams(11.10f, 20.21f);
		System.out.println("3rd Addition : " + f);

		m.addMethodWithNoReturnType(a, f);

		// No need of object to call the static method
		printSum(10, a);

	}

	/*
	 * Simple method - no return type and no params
	 */

	public void add() {
		int c = 12 + 20;
		System.out.println("1st Addition : " + c);
	}

	/*
	 * Method with return type and no params
	 */
	public int addMethodWithReturnType() {
		int c = 12 + 20;
		return c;
	}

	/*
	 * Method with return type with params
	 */

	public float addMethodWithReturnAndParams(float a, float b) {
		return a + b;
	}

	/*
	 * Method with no return type with params
	 */

	void addMethodWithNoReturnType(long a, float b) {
		float c = a + b;
		System.out.println("4th Addition : " + c);
	}

	public static void printSum(int a, int b) {
		System.out.println(a + b);
	}

}
