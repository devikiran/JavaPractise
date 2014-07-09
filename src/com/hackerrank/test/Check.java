package com.hackerrank.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Check {
public static void main(String[] args) {
	String s = "BASKETBALL";
    String s1 = "BHOCKEYSTICK";
    char[] sArray=s.toCharArray();
    char[] s1Array=s1.toCharArray();
    List<Character> firstList=new ArrayList<Character>();
    Set<Character> firstStringSet=new HashSet<Character>();
    Map<Character,Integer> val=new HashMap<Character,Integer>();
    
    for(int i=0;i<sArray.length;i++)
    {
    	for(int j=0;j<s1Array.length;j++)
    	{
    		if(sArray[i]==s1Array[j])
    		{
    			
    			if(val.containsKey(s1Array[j]))
    			{
    				val.put(s1Array[j],val.get(s1Array[j])+1);
    			}
    			else
    			{
    				val.put( s1Array[j],1);
    			}
    			//System.out.println(s1Array[j]);
    		}
    	}
    }
/*
   
  Set<Character> firstStringSet=new HashSet<Character>();
   Set<Character> secondStringSet=new HashSet<Character>();
     for(char firstSet : s.toCharArray()) {  firstStringSet.add(firstSet);	}
     System.out.println(firstStringSet);
   for(char secondSet:s1.toCharArray()) {
	   
	   if(firstStringSet.contains(secondSet))
	   {
		  secondStringSet.add(secondSet);
	   }
   }
   
   for(char val:secondStringSet){
	   System.out.println(val);
   }*/
	   
	   
    
    
   // secondStringSet.retainAll(firstStringSet);
   for(Integer c:val.values())
   {
  //System.out.println(c);
   if(c>1)
   System.out.println(val.get(c));
   }
   
   
   
   
    
  
}
}
