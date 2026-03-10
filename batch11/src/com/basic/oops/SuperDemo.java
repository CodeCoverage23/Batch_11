package com.basic.oops;

class School {

	int classRooms;
	int students;

	public School(int classRooms, int students) {
		this.classRooms = classRooms;
		this.students = students;
	}

	public void display() {
		System.out.println("Number of class rooms : " + classRooms);
		System.out.println("Number of class students : " + students);
	}

	public School() {

	}

}

public class SuperDemo extends School {

	public SuperDemo(int classRooms, int students) {
		super(classRooms, students);
	}

	public static void main(String[] args) {

		SuperDemo s = new SuperDemo(10, 1000);
		s.getParentMethod();

	}

	void getParentMethod() {
		super.display();

		super.classRooms = 40;
		super.students = 3500;

		super.display();

	}

}
