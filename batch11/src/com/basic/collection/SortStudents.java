package com.basic.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
	int rollNo;
	String name;
	String address;

	public Student(int rollNo, String name, String address) {
		this.rollNo = rollNo;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", address=" + address + "]";
	}

}

/*
 * Complete implementation
 */
class MyComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		return o1.name.compareTo(o2.name);
	}

}

public class SortStudents {

	public static void main(String[] args) {

		List<Student> listOfStudent = new ArrayList<>();

		listOfStudent.add(new Student(102, "Sachin", "Akola"));
		listOfStudent.add(new Student(101, "Shiva", "Akola"));
		listOfStudent.add(new Student(103, "Kishor", "Akola"));

		// Sorting based on String
		Collections.sort(listOfStudent, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.name.compareTo(o2.name);
			};
		});
		System.out.println(listOfStudent);
		// Sorting based on integers
		Collections.sort(listOfStudent, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.rollNo - o2.rollNo;
			};
		});
		System.out.println(listOfStudent);

	}

}
