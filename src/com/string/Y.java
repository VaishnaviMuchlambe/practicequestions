package com.string;

public class Y {
	
	public static void main(String[] args) {
		 String s = new String("GoodMorning");
		  for (int i =0; i<=s.length(); i++) {
		   if( i % 2 ==0) {
		  System.out.println(s.charAt(i));
	        }
	   }
	}
}

