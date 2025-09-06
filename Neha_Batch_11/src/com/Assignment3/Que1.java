package com.Assignment3;

public class Que1 {
	String name;

	String getStudentName(String name ) {
		this.name=name;
		return name;
		
	}

	public static void main(String[] args) {
		Que1 obj=new Que1();
		
		String s=obj.getStudentName("Nehaa..");
		System.out.println(s);

	}
}
