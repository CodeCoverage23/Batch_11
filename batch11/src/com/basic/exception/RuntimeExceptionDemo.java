package com.basic.exception;

public class RuntimeExceptionDemo {

	public static void main(String[] args) {

		try {
			// System.out.println(10 / 0);

//			String s1 = null;
//			System.out.println(s1.length());

			String s2 = "123455d";
			int num = Integer.parseInt(s2);
			System.out.println(num + 10);

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Rest of the code...");

	}

}
