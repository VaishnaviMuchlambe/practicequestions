package com.loops;
//no. divisible by 3 &5 in 1 -100
public class B {
	public static void main(String[] args) {
		  for(int i = 1; i<= 100; i++) {
			  if (i%3 == 0 && i%5 == 0)
				  System.out.println(i);
		   }
	    }
 }
