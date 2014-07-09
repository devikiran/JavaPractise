package com.java.oracle.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample2 {
public static void main(String[] args) {
	File inputFile=new File("D:\\userdata\\devikira\\Downloads\\Sir\\collection\\StockOut.txt");
	File outputFile=new File("D:\\userdata\\devikira\\Downloads\\Sir\\collection\\StockOut2.txt");
	
	
	try {
		FileInputStream fis=new FileInputStream(inputFile);
		FileOutputStream fos=new FileOutputStream(outputFile);
		int count;
		 while ((count = fis.read()) != -1) 
		{
			System.out.println(count);
			
			fos.write(count);
			
			System.out.println(Character.toString((char)count));
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
