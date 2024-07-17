package com.constructorwithvariable;
public class Y extends  X{

	int a = 3;
	  
	  void m1() {
		   int a =4;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	  }
}
