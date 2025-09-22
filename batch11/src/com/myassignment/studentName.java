package com.myassignment;

public class studentName {

	public String getStudentName() {
		
		String name= "Anu";
		return name;
}
	
	public static void main(String args[]) {
		studentName n=  new studentName();
		
		String b =n.getStudentName();
		System.out.println(b);
}
}
