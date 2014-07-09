package com.ds.algorithms;

public class StringReverseRecursive {

public static void main(String[] args) {
	String recusrion=new StringReverseRecursive().reverse("abcdef");
	System.out.println(recusrion);
}

public String reverse(String value)
{
	int length=value.length();
	if (length>0)
return value.charAt(length-1)+reverse(value.substring(0,length-1));
	else
	{
		return "";
	}
	//return "";
}
}
