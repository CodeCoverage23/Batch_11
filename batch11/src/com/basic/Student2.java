package com.basic;

/**
 * TO understand static veriable
 */
public class Student2 {

	int rollNo;
	String name;
	static String clgName = "COEP";

	public Student2(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student2 [rollNo=" + rollNo + ", name=" + name + ", clgName=" + clgName + "]";
	}

	public static void main(String[] args) {

		Student2 s1 = new Student2(101, "Jonh");
		Student2 s2 = new Student2(102, "Sam");
		Student2 s3 = new Student2(103, "Alex");
		Student2 s4 = new Student2(104, "Jonh");
		Student2 s5 = new Student2(105, "Jonh");

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);

	}

}
