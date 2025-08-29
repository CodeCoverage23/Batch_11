package com.basic;

public class StaticMethodDemo {

	/**
	 * returns cube of the given variable
	 * 
	 * @param a The int variable
	 * @return The int value
	 */
	public static int cube(int a) {
		return a * a * a;
	}

	public static void main(String[] args) {

		int cube = StaticMethodDemo.cube(9);
		System.out.println(cube);

		System.out.println(StaticMethodDemo.cube(125));

		double sqrt = Math.sqrt(4);
		System.out.println(sqrt);

		int min = Math.min(44, cube);
		System.out.println(min);

		double random = Math.random();
		System.out.println(random);
	}

}
