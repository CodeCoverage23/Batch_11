package com.basic.exception;

public class UserDefineRuntimeException {

	public long squareIt(int number) {

		if (number < 0) {
			throw new NegativeNumberException("Invalid parameter value");
		} else {
			return number * number;
		}

	}

	public static void main(String[] args) {

		UserDefineRuntimeException u = new UserDefineRuntimeException();

		long squareIt = u.squareIt(-45);
		System.out.println(squareIt);

	}

}
