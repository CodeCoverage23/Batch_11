package com.basic;

public class OperatorsDemo {

	public static void main(String[] args) {

		/*
		 * unary operators
		 */
		int a = 10;
		int b = a + 1;
		System.out.println("Below operation is similer to this line: " + b);

		System.out.println(++a); // 11
		System.out.println(a++); // 11
		System.out.println(a); // 12

		System.out.println(--a); // 11
		System.out.println(a--); // 11
		System.out.println(a); // 10

		boolean d = true;
		System.out.println(d);
		System.out.println(!d);

		/*
		 * Arithmetic operators
		 */
		System.out.println("Arithmetic operators: ");
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / 2);
		System.out.println(a + b - a * b / a);
		System.out.println(a % 2);

		/*
		 * Relational Operators
		 */

		int i = 50;
		int j = 60;

		System.out.println(i < j); // true
		System.out.println(j < i); // f
		System.out.println(i > j); // false
		System.out.println(i <= j); // t
		System.out.println(i >= j); // f
		System.out.println(i != j); // t
		System.out.println(i == j); // f
		System.out.println(j != i);

		/*
		 * Logical Operators
		 */
		// and -> &&
		// Or -> ||
		System.out.println("Logical Operators: ");
		System.out.println(i < j && i == j);
		System.out.println(i < j || i == j);

		/*
		 * Ternary Operators
		 */

		int min = j > i ? j : i;
		System.out.println(min);

		/*
		 * Assignment oprs
		 */
		System.out.println("Assignment Operators: ");

		int data = 10;
		System.out.println(data += 2);
		System.out.println(data -= 2);
		System.out.println(data *= 2);
		System.out.println(data /= 2);
	}

}
