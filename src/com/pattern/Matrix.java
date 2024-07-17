package com.pattern;

public class Matrix {
public static void basic( int size) {
	 for(int r = 1; r<=size; r++) {
		    for( int c=1; c<=size; c++) {
			 System.out.print("* ");
		 }
		 System.out.println();
	  }
   }



public static void lpattern(int size) {
	for(int  r=1; r<=size; r++) {
		for(int c=1; c<=size;c++) {
			if(c==1 || r==size) {
				System.out.print("* ");
		        }
		    }
		System.out.println();
        }
    }

public static void ipattern( int size ) {
	 int mid=0;
	if(size%2==0) 
	mid= size/2;
	else 
	mid= (size/2)+1;
		for (int r=1; r<=size; r++) {
		for (int c=1; c<=size; c++) {
			if (r==1 || r==size|| c==mid) {
				System.out.print("*  ");
		 }
			else {
				System.out.print("      ");
			}
	}
		System.out.println();
}
}

public static void outerpattern() {
	for(int r=1; r<=5; r++) {
		for(int c=1;c<=5;c++) {
			if(r==1 ||c==1 || r==5 || c==5) {
			System.out.print("* ");
		}
			else {
			System.out.print(" ");
	         }
	        }
	     }
	System.out.println();
      }
}

 
     
		  
	

     
   