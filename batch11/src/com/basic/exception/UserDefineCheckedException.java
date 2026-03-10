package com.basic.exception;

public class UserDefineCheckedException {

	public static String validateAge(int age) throws InvalidAgeException {

		if (age > 18) {
			return "You are eligible for vote!";
		} else {
			throw new InvalidAgeException("Your age is less than 18");
		}

	}

	public static void main(String[] args) throws InvalidAgeException {

		int age = 15;

		String validateAge = validateAge(age);

		System.out.println(validateAge);
		System.out.println("You are done with voting...");

	}

}
