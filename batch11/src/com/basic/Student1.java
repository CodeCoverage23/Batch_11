package com.basic;

public class Student1 {

	int id;
	String name;
	int age;

	public Student1(int id, String name, int age) {

		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Student1(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("Id : " + id + " Name : " + name + " Age : " + age);
	}

	public static void main(String[] args) {

		Student1 s1 = new Student1(1, "Pavan");
		Student1 s2 = new Student1(2, "Kiran");

		s1.display();
		s2.display();

		Student1 s3 = new Student1(3, "Krish", 16);
		Student1 s4 = new Student1(4, "Krish", 16);

		s3.display();
		s4.display();

	}

}
