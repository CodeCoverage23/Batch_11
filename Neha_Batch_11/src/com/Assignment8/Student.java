package com.Assignment8;
import java.util.Scanner;
public class Student{
	//1.1
	static String  country="India";
	String firstName;
	String lastName;
	String city;
	long mobileNumber;
	Scanner sc = new Scanner(System.in);
	//1.2
	public void getUserInput() {
	
		System.out.println("Enter the First Name : ");
		 firstName = sc.next();
		System.out.println("Enter the Last Name : ");
		 lastName = sc.next();
		System.out.println("Enter the name of City : ");
		 city  = sc.next();
		System.out.println("Enter the Mobile number : ");
		 mobileNumber=sc.nextLong();
		 getStudentInformation();
		}
	//1.3
	public void getStudentInformation() {
		System.out.println("Your give information is : ");
		System.out.println("Name " + firstName + " "+lastName);
		System.out.println("City:  "+city);
		System.out.println("Mobile Number : "+mobileNumber);
		System.out.println("Country : "+country);
		
	}
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n = sc.nextInt();
		Student obj = new Student();
		for( int i=1 ;i<=n; i++) {
			System.out.println("Enter the  "+ i+"Student Information ");
			obj.getUserInput();
						
		}
		
		
	}
}
