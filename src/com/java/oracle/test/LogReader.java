package com.java.oracle.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogReader {

	public static void main(String[] args) throws IOException {
		List<String> values=readUsingFileReader("D:\\catalina\\catalina.out");
/*for(String query:values)
{
	System.out.println(query);
}*/writeUsingFile( values);

	}
	private static List readUsingFileReader(String fileName) throws IOException {
		List<String> quireies=new ArrayList<String>();
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            //process the line
        	if(line.contains("Final query:"))
        	{
        		//System.out.println("In the line");
        		quireies.add(line);
        	}
            //System.out.println(line);
        }
        br.close();
        fr.close();
         return quireies;
    }
	
	private static void writeUsingFile(List<String> data)
	{
		try {
			 
			String content = "This is the content to write into file";
 
			File file = new File("D:\\catalina\\query.txt");
 
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			for(String queryLine:data)
			{
			bw.write(queryLine);
			bw.newLine();
			}
			bw.close();
 
			System.out.println("Done");
 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
