package com.collection.test;
//collection ->HashSet 
import java.util.HashSet;

public class TestB {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>() ;
		hs.add("vaishnavi");
		hs.add("mansi");
		hs.add("pratik");
		hs.add("aditya");
		hs.add("aditya");
		System.out.println(hs.size());
		hs.forEach(s-> System.out.println(s));
	}
}
