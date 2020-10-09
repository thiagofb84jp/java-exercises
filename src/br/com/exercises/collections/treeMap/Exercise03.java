package br.com.exercises.collections.treeMap;

import java.util.TreeMap;

public class Exercise03 {
	/*
	 * Write a Java program to delete all elements from a given Tree Map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("C1", "Red");
		treeMap.put("C2", "Green");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "White");
		
		System.out.println("Original TreeMap content: " + treeMap);
		treeMap.clear();
		System.out.println("The new TreeMap: " + treeMap);
	}
}