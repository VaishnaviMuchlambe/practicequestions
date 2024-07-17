package com.collection.testa;
//collection->LinkedHashSet
import java.util.LinkedHashSet;

public class Testb {
	public static void main(String[] args) {
		LinkedHashSet<String> al = new LinkedHashSet<String>();
		
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

