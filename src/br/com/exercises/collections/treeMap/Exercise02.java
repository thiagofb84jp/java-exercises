package br.com.exercises.collections.treeMap;

import java.util.Set;
import java.util.TreeMap;

public class Exercise02 {
	/*
	 * Write a Java program to get all keys from the given a Tree Map.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("C1", "Red");
		treeMap.put("C2", "Green");
		treeMap.put("C3", "Black");
		treeMap.put("C4", "White");
		treeMap.put("C5", "Blue");
		treeMap.put("C6", "Yellow");
		treeMap.put("C7", "Purple");
		treeMap.put("C8", "Grey");

		Set<String> keys = treeMap.keySet();

		for (String key : keys) {
			System.out.println(key);
		}
	}
}