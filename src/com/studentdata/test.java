package com.studentdata;

public class test {
        public static void main (String []  args) {
        	Student  s1 =  new  Student() ;
        	
        s1.id =  23;
        s1.name  = "vaishnavi" ;
        s1.address  ="pandharpur";
       	s1.gender  ='F';
        s1.course  ="java";
        s1.email = "vaishnavimuchlambe001@gmail.com";
        s1.phoneNo = "8378873233";
       	s1.cgpa = 9.4f;
       	
        System.out.println(s1.id);	
        System.out.println(s1.name);	
        System.out.println(s1.address);	   
        System.out.println(s1.gender);	
        System.out.println(s1.course);	
        System.out.println(s1.email);	
        System.out.println(s1.phoneNo);	
        System.out.println(s1.cgpa);	
    	}  
}
