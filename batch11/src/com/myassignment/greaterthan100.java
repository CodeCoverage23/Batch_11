package com.myassignment;

import java.util.Scanner;

public class greaterthan100 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Number :");
		 int a = sc.nextInt();
		 
		 
		 if(a>100) {
			
			System.out.print("Number is Greater than 100 : "+a);
		 }else {
			 System.out.print("Number is less than 100 :"+a);
		 }
			
	
	}

} 
