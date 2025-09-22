package com.myassignment;

public class multiplication {
	
		
	public int multiply(int a, int b) {

		int mul = a * b;
		return mul;
	}

	public static void main(String[] args) {

		multiplication obj = new multiplication();

		int ans = obj.multiply(9, 6);

		System.out.println("Multiplication of two number is : " + ans);
	}
}
