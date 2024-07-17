package com.collection.testa;
//collection->LinkedlList
import java.util.LinkedList;

public class Testa {
	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
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

