package com.java.oracle.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEXamples {
public static void main(String[] args) {
	try
	{
	File stockInputFile = new File("D:\\userdata\\devikira\\Downloads\\Sir\\collection\\Name.java");
    File StockOutputFile = new File("D:\\userdata\\devikira\\Downloads\\Sir\\collection\\StockOut.txt");

    /*
     * Constructor of FileInputStream throws FileNotFoundException if
     * the argument File does not exist.
     */

    FileInputStream fis = new FileInputStream(stockInputFile);
    FileOutputStream fos = new FileOutputStream(StockOutputFile);
    int count;

    while ((count = fis.read()) != -1) {
          fos.write(count);
    }
    fis.close();
    fos.close();
} catch (FileNotFoundException e) {
    System.err.println("FileStreamsReadnWrite: " + e);
} catch (IOException e) {
    System.err.println("FileStreamsReadnWrite: " + e);
}


}
}
