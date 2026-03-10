package com.basic.oops;

public class MethodOverloadingDemo {

	public static void main(String[] args) {

		MethodOverloadingDemo m = new MethodOverloadingDemo();

		m.add(12.12d, 12.12d);

		m.add(12, 120);

		m.mul(12, 12, 12);

	}

	// 1-> number of params should be diff

	public void mul(int a, int b) {
		System.out.println(a * b);

	}

	public void mul(int a, int b, int c) {
		System.out.println(a * b * c);
	}
	
	public long mul(long a, int b, int c) {
		return a * b * c;
	}

	// 2-> data types of the parameters should be diff

	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void add(double a, double b) {
		System.out.println(a + b);
	}

}
