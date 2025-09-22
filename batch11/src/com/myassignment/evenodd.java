package com.myassignment;

import java.util.Scanner;

public class evenodd {
public static void main (String args[]) {
Scanner sc = new Scanner(System.in);
 System.out.print("Enter Number :");
 int a = sc.nextInt();
 
 
 if(a%2==0) {
	
	System.out.print("Number is even :"+a);
 }else {
	 System.out.print("Number is odd :"+a);
 }
	
	

}
}