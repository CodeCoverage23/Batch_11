package com.basic;

public class IfElseDemo {

	public static void main(String[] args) {

		int a = 10;
		int b = 15;

		if (a > b) {
			System.out.println("A is greater than B");
		} else {
			System.out.println("B is greater than A");
		}

		System.out.println("Result : " + a % 2);

		if (a % 2 == 0) {
			System.out.println("The number is even ");
		} else {
			System.out.println("The number is not even ");
		}

	}

}
