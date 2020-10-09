package br.com.exercises.collections.treeMap;

import java.util.TreeMap;

public class Exercise09 {
	/*
	 * Write a Java program to search a key in a Tree Map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("C1", "Red");
		treeMap.put("C2", "Green");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "White");
		System.out.println("Original TreeMap content: " + treeMap);

		if (treeMap.containsKey("C1")) {
			System.out.println("The TreeMap contains key C1");
		} else {
			System.out.println("The TreeMap does not contains key C1");
		}

		if (treeMap.containsKey("C5")) {
			System.out.println("The TreeMap contains key C5");
		} else {
			System.out.println("The TreeMap does not contains key C5");
		}
	}
}