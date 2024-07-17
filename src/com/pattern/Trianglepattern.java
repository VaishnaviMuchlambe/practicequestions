package com.pattern;

public class Trianglepattern {
 public static void pattern1(int size) {
	 for(int r=1; r<=size; r++) {
		 for(int c= 1; c<=r;c++) {
			 System.out.print("* ");
		 }
		 System.out.println();
      }
   }
 
public static void pattern2(int size) {
	for(int r=size;r>=1;r--) {
		for(int c=1;c<=r;c++) {
			System.out.print("* ");
		}
		System.out.println();
	 }
  }
 public static void pattern3() {
	 for (int r=1;r>=5;r--) {
		 for(int c=5;c>=1;c++) {
			 System.out.print("* ");
		 }
		 System.out.println();
	 }
 }
}