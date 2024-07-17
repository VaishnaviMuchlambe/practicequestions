package com.file2.io;
import java.io.FileInputStream;
import java.io.ObjectOutputStream;

public class Testp {
	
public static void main(String[] args)  throws Exception{
	
	FileInputStream fos = new FileInputStream("a1.txt");
	ObjectOutputStream ofs = new ObjectOutputStream(fos);
	
	ofs.writeObject(fos);
	System.out.println("data is written in a1.txt ...");
	
	fos.close();
	
	
	
}
}
