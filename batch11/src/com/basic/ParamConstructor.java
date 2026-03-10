package com.basic;

/**
 * Refers to student object
 */
public class ParamConstructor {

	int rollNo;
	String name;
	String clgName;

	ParamConstructor(int i, String n, String a) {
		rollNo = i;
		name = n;
		clgName = a;
	}

	public static void main(String[] args) {

		ParamConstructor p = new ParamConstructor(101, "Pavan", "ABC");

		System.out.println(p.rollNo);
		System.out.println(p.name);
		System.out.println(p.clgName);

	}

}
