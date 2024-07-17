package com.collection.test;
// collection->Arraylist
import java.util.ArrayList;
public class TestA {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("vaishnavi");
		al.add("neha");
		al.add("tanvi");
		al.add("sonal");
		al.add("sonal");
		al.add("sonal");
		
		System.out.println(al.size());
		al.forEach(t->System.out.println(t));
		
		
	}
}
