package com.file.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException  {
		//reader
		FileInputStream fis  = null;
		fis = new FileInputStream("Source.txt");
		 int d = 0;
		 
		 while((d = fis.read())!= -1) {
			 System.out.print((char)d);
		 }
		 if (fis!= null)
			 fis.close();
		
	}
}
