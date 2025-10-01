package com.Assignment7;
import java.util.Scanner;
/**
 * Display the Factors of Entered Number
 */
public class Que3 {

	void display(int n) {
		for( int i=1;i<=n;i++) {
			if( n%i==0) {
				System.out.print(i);
				System.out.print(",");
			}
		}
	}
		public static void main(String[] args) {
			
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any Number");
		int n=sc.nextInt();
		Que3 ob=new Que3();
		ob.display(n);
		
	}
}
