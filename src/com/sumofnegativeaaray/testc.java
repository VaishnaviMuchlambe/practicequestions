package com.sumofnegativeaaray;
//find sum of all negative numbers
public class testc {
	 public static void main ( String[] args) {
		 
		 int a[] = {23, -33, -43, -65, 64} ;
		 int sum = 0;
		 for(int i=0; i< a.length;++i) {
    		 if (a[i] < 0) 
    			 sum = sum + a[i];
    	 }
		 System.out.println(sum);
		 }
		 
	 }

