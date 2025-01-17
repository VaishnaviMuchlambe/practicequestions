package com.collection;

public class Student {
	
	private int id;
	private String name;
	private float cgpa;

	 public Student(int id, String name, float cgpa) {
		 super ();
		 this.id = id;
		 this.name= name;
		 this.cgpa =cgpa;
	 }
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public int getId() {
		return id;
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
	public float getCgpa() {
		return cgpa;
	}
	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}
}
	