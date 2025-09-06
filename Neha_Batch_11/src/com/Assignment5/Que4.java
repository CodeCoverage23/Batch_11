package com.Assignment5;

import java.util.Scanner;

public class Que4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month in Integer : ");
		int month = sc.nextInt();
		switch(month) {
		case 1:
			System.out.println("January");
			break;
		case 2 :
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4 :
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6 :
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8 :
			System.out.println("Augast");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10 :
			System.out.println("Octember");
			break;
		case 11:
			System.out.println("Novembet");
			break;
		case 12 :
			System.out.println("December");
			break;
			default:
				System.out.println("Invalid Integer value Should be between 1 to 12 ");
		}
	}

}
