package com.myassignment;
import java.util.Scanner;

public class greatestnum {
	public static void main (String [] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter first number :");
	int x = sc.nextInt();

	
	System.out.print("Enter Second number :");
	
	int y = sc.nextInt();

	System.out.print("Enter Third number :");
	
	int z= sc.nextInt();

	if (x>y && x>z) { 
		System.out.println("x is greater :"+x);
	}
	else if(y>x && y>z) {
		System.out.println("y is greater :"+y);
		
	}
	else {
		System.out.println("z is greater :"+z);
	}

}}