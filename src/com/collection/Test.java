package com.collection;
import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {
		Student s1 = new Student(11, "vaishnavi", 52.4f);
		Student s2 = new Student(12, "aditya", 43.6f);
		Student s3 = new Student(13, "pratik", 54.8f);
		Student s4 = new Student(14, "om", 44.5f);
		Student s5 = new Student(15, "rutuja", 54.3f);
		
		ArrayList<Student> Studentlist = new ArrayList<Student>();
		Studentlist.add(s1);
		Studentlist.add(s2);
		Studentlist.add(s3);
		Studentlist.add(s4);
		Studentlist.add(s5);
		for(int i=0; i<Studentlist.size();i++)
		{
		 Student t =	Studentlist.get(i);
			System.out.println(t);
		}
			
	}
}

