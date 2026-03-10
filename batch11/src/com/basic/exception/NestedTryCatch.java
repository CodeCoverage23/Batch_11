package com.basic.exception;

public class NestedTryCatch {

	public static void main(String[] args) {

		int a = 10;

		try {
			if (a > 10) {
				System.out.println("A is greater");
			}
			System.out.println(a + 100);
			try {
				System.out.println(a / 0);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("Rest of the code...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
