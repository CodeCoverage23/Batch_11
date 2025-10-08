package com.basic.array;

public class ArrayOperations {

	public static void main(String[] args) {

		// Array declaration and Initialization

		int numbers[] = new int[5]; // specify size

		// Assigning values to the array

		numbers[0] = 50;
		numbers[1] = 60;
		numbers[2] = 70;
		numbers[3] = 80;
		numbers[4] = 90;

		for (int n : numbers) {
			System.out.println(n);
		}

		// direct initialization

		String[] fruits = { "Apple", "Banana", "Mango", "Cherry" };

		System.out.println("I need Mangos : " + fruits[2]);

		for (String s : fruits) {
			System.out.println(s.toUpperCase());
		}

		// Modify array value on 2nd position
		numbers[1] = 100;
		System.out.println("Modified value : " + numbers[1]);

		// Addition of array
		int additionOfArrayElements = 0;
		for (int n : numbers) {
			// additionOfArrayElements = additionOfArrayElements + n;
			additionOfArrayElements += n;
		}
		System.out.println(additionOfArrayElements);

	}

}
