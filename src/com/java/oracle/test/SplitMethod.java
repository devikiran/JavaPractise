package com.java.oracle.test;

import java.util.ArrayList;
import java.util.List;

public class SplitMethod {
public static void main(String[] args) {
	
	for(String t:split(",", "String1,String2"))
	{
		System.out.println(t);
	}
	}

public static List<String> split(String delimeter,String Value)
{
	List<String>  values = new ArrayList<String>();
	String temp=null;
	while(Value.contains(delimeter))
	{
		int offset=Value.indexOf(delimeter);
		if(offset==0)
		{
		temp=Value.substring(1,Value.length());	
		values.add(temp);
		break;
		}
		else
		{temp=Value.substring(0,offset);}
		Value=Value.substring(offset,Value.length());
		values.add(temp.replace(delimeter, ""));
		
	}if(!Value.contains(delimeter))
	{
		System.out.println("Delimeter passed not found");
	}
	  
	
	return values;
}
}
