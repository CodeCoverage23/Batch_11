package com.basic;

public class SimpleIfDemo {

	public static void main(String[] args) {

		int x = 10;
		int y = 10;

		if (x == y) {
			System.out.println("X and Y are same");
		}

		int age = 19;

		if (age > 18) {
			System.out.println("Your age is greater than 18 ");
			System.out.println("Your age is " + age);
		}
		System.out.println("Rest of the code...");

		/*
		 * Nested If
		 */

		int weight = 41;

		if (age >= 18) {
			System.out.println("Your age is greater than 18");
			if (weight >= 50) {
				System.out.println("You can donate the BLOOD");
			}
		}

		/*
		 * We can use logical AND to avoid nested IF
		 * 
		 * if (age >= 18 && weight >= 50) {
		 * System.out.println("You can donate the BLOOD"); }
		 */

	}

}
