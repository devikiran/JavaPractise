package com.hackerrank.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringValues {
public static void main(String[] args) {
	




String s = "BASKETBALL";
String s1 = "BHOCKEYSTICK";

Set<Character> firstStringSet=new LinkedHashSet<Character>();

for(int i=0;i<s.length();i++)
{
	for(int j=0;j<s1.length();j++)
	{
		if(s.charAt(i)==s1.charAt(j))
		{
			firstStringSet.add(s.charAt(i));
		}
	}
}


for(char c:firstStringSet)
{

System.out.println(c);
}
}
}
