package br.com.exercises.collections.treeMap;

import java.util.TreeMap;

public class Exercise06 {
	/*
	 * Write a Java program to get a reverse order view of the keys contained in a given map. 
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("C2", "Green");
		treeMap.put("C1", "Red");
		treeMap.put("C4", "White");
		treeMap.put("C3", "Black");

		System.out.println("Original TreeMap content: " + treeMap);
		System.out.println("Reverse order view of the keys: " + treeMap.descendingKeySet());
	}
}