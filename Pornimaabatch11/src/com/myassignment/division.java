package com.myassignment;

public class division {
	public int divide(int a, int b) {

		int div = a / b;
		return div;
	}

	public static void main(String[] args) {
		division obj = new division();
		int result = obj.divide(100, 5);
		System.out.println("Division of two number  is: " + result);
	}

}
