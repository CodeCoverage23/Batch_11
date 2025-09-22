package com.myassignment;
import java.util.Scanner;


public class factorialMethod {

	public static void main(String args[]) {

		int number = 5;
		int result = factorial(number);
		System.out.println("Factorial of " + number + " is: " + result);

	}

	public static int factorial(int a) {
		if (a == 0) {
			return 1;
		} else {
			return a * factorial(a - 1);
		}
	}

	public static int factorial1(int a) {
		int b = 1;
		for (int i = a; a > 0; i--) {
			b = b * i;
		}
		return b;
	}

}
