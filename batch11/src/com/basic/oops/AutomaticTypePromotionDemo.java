package com.basic.oops;

public class AutomaticTypePromotionDemo {

	public static void main(String[] args) {

		AutomaticTypePromotionDemo.sum(44, 55);

		AutomaticTypePromotionDemo.sum(12.1, 11.1);

	}

	public static void sum(int a, long b) {
		System.out.println(a + b);
	}

	public static void sum(int a, long b, int c) {
		System.out.println(a + b + c);
	}

	public static void sum(float a, float b) {
		System.out.println("Method with float params");
		System.out.println(a + b);
	}

	public static void sum(double a, double b) {
		System.out.println("Method with double params");
		System.out.println(a + b);
	}

}
