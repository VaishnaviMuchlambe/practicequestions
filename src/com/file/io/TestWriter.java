package com.file.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestWriter {

public static void main(String[] args) throws IOException  {
		//reader
		FileInputStream fis  = null;
		fis = new FileInputStream("Source.txt");
		//writer
	FileOutputStream fos = new 	FileOutputStream("Target.txt") ;
			int d = 0;
			 //reading and writing
			 while((d = fis.read())!= -1) {
				 fos .write(d);
			 }
		
		 if (fis!= null)
			 fis.close();
		
	}
}
