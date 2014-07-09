package com.java.oracle.test;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
public static void main(String[] args) {
	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	map.put(1, 10);
	map.put(2, 20);
	map.put(3, 30);
	map.put(4, 40);
	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}
}
}
