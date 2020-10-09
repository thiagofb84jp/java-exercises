package br.com.exercises.collections.treeMap;

import java.util.TreeMap;

public class Exercise05 {
	/*
	 * Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("C2", "Green");
		treeMap.put("C1", "Red");
		treeMap.put("C4", "White");
		treeMap.put("C3", "Black");
		
		System.out.println("Original TreeMap content: " + treeMap);
		System.out.println("Greatest key: " + treeMap.firstKey());
		System.out.println("Last key: " + treeMap.lastKey());
	}	
}