package br.com.exercises.collections.treeMap;

import java.util.TreeMap;

public class Exercise04 {
	/*
	 * Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("C1", "Red");
		treeMap.put("C2", "Green");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "White");
		
		System.out.println("Original TreeMap content: " + treeMap);
		System.out.println("Greatest key: " + treeMap.firstEntry());
		System.out.println("Last key: " + treeMap.lastEntry());
	}
}