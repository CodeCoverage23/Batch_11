package com.basic.exception;

public class UncheckedException {

	
	public static void main(String[] args) {
		int a = 10;

		try {
			double d = a / 0;
			System.out.println(d);

		} catch (ArithmeticException e) {
			System.out.println("Divide by ZERO is not possible");
			// System.out.println(e.getMessage());
			// e.printStackTrace();
		}

		System.out.println("Rest of the code...");
	}
	
}
