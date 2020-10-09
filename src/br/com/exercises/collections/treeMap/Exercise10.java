package br.com.exercises.collections.treeMap;

import java.util.TreeMap;

public class Exercise10 {
	/*
	 * Write a Java program to search a value in a Tree Map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("C1", "Red");
		treeMap.put("C2", "Green");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "White");
		System.out.println("Original TreeMap content: " + treeMap);

		if (treeMap.containsValue("Green")) {
			System.out.println("The TreeMap contains value Green");
		} else {
			System.out.println("The TreeMap does not contains value Green");
		}

		if (treeMap.containsValue("Pink")) {
			System.out.println("The TreeMap contains value Pink");
		} else {
			System.out.println("The TreeMap does not contains value Pink");
		}
	}
}