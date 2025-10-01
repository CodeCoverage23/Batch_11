package com.Assignment7;

import java.util.Scanner;

public class Que2 {
	
	
	public int getNumberCube(int num) {
		return num*num*num;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer : ");
        int no = sc.nextInt();
     Que2 ob = new Que2();
     int cube = ob.getNumberCube(no);
     System.out.println("The Cube of the Entered Number is " +cube);
       
    }

    
    
}
