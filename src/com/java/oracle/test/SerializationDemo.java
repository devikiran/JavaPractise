package com.java.oracle.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;

public class SerializationDemo {
public static void main(String[] args) {
	//serialize();
	deserialize();
}
public static void serialize()
{
	
	try { 
		MyClass object1 = new MyClass("Hello", -7, 2.7e10); 
		System.out.println("object1: " + object1); 
		FileOutputStream fos = new FileOutputStream("serial.ser"); 
		ObjectOutputStream oos = new ObjectOutputStream(fos); 
		oos.writeObject(object1); 
		oos.flush(); 
		oos.close(); 
		} 
		catch(Exception e) { 
		System.out.println("Exception during serialization: " + e); 
		System.exit(0); 
		} 
}
public static void deserialize()
{
		// Object deserialization 
		try { 
		MyClass object2; 
		FileInputStream fis = new FileInputStream("serial.ser"); 
		ObjectInputStream ois = new ObjectInputStream(fis); 
		object2 = (MyClass)ois.readObject(); 
		ois.close(); 
		System.out.println("object2: " + object2); 
		} 
		catch(Exception e) { 
		System.out.println("Exception during deserialization: " + 
		e); 
		System.exit(0); 
		} 
		} 
		} 
		class MyClass implements Serializable { 
			 private static final long serialVersionUID = -63; 
		String s; 
		int i; 
		double d; 
		public MyClass(String s, int i, double d) { 
		this.s = s; 
		this.i = i; 
		this.d = d; 
		} 
		public String toString() { 
		return "s=" + s + "; i=" + i + "; d=" + d; 
		} 
		}