package com.basic.oops;

class Student5 {

	private int id;
	private String name;

	private String clgName;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClgName() {
		return clgName;
	}

	public void setClgName(String clgName) {
		this.clgName = clgName;
	}

}

class ReadOnlyClass {

	private String pancard = "ABCC6987J";
	private long adhanrNumber = 321654879856L;

	public String getPancard() {
		return pancard;
	}

	public long getAdhanrNumber() {
		return adhanrNumber;
	}

}

class WriteOnlyClass {
	private int numberOfVehicle;

	public void setNumberOfVehicle(int numberOfVehicle) {
		this.numberOfVehicle = numberOfVehicle;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {

		Student5 s = new Student5();

		s.setId(101);
		s.setName("John");

		System.out.println(s.getId());
		System.out.println(s.getName());

		ReadOnlyClass r = new ReadOnlyClass();

		System.out.println(r.getAdhanrNumber());

		WriteOnlyClass w = new WriteOnlyClass();
		w.setNumberOfVehicle(5);

	}

}
