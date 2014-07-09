package com.java.oracle.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BufferedReaderEx {
	public static void main(String[] args) {
		Map<String,Integer> wordMap=new HashMap<String,Integer>();
		 
		BufferedReader br = null;
 
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("D:\\userdata\\devikira\\Downloads\\Sir\\collection\\StockOut.txt"));
 
			while ((sCurrentLine = br.readLine()) != null) {
				
				String []words=sCurrentLine.split(" ");
				
				for(int i=0;i<words.length;i++){
					System.out.println("words"+words[i]);
				if (wordMap.containsKey(words[i])) 
				{					wordMap.put(words[i], wordMap.get(words[i])+1);
				}
				else
				{					wordMap.put(words[i], 1);
				}
				}
				
				//System.out.println(sCurrentLine);
			}
 
			for(Map.Entry<String, Integer> values:wordMap.entrySet())
			{
				System.out.println("Key is "+values.getKey()+"values is "+values.getValue());
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
	}
}
