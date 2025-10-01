package com.Assignment9;
import java.util.Scanner;
public class ObjectCreation {
	
	public static void main(String[] args) {
        // create multiple objects
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of object want to create : ");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			ObjectCreation obj_i = new ObjectCreation();
			 System.out.println( i+" object is created ");
		}
      System.out.println("All Objects are created ");
    }
}
