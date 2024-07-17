package com.sumofpositiveaaray;
//find sum of all positive numbers
public class testb {
     public static void main ( String[] args) {
    	 
    	 int a[] = {23, -33, -43, -65, 64} ;
    	 int sum =0;
    	 for(int i=0; i< a.length;++i) {
    		 if (a[i] > 0) 
    			 sum = sum + a[i];
    	 }
    			 System.out.println(sum);
    		 
    	 
     }
}
