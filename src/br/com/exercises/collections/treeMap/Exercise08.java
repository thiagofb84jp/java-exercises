package br.com.exercises.collections.treeMap;

import java.util.TreeMap;

public class Exercise08 {
	/*
	 * Write a Java program to copy a Tree Map content to another Tree Map
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap1 = new TreeMap<String, String>();
		treeMap1.put("C1", "Red");
		treeMap1.put("C2", "Green");
		treeMap1.put("C3", "Black");
		treeMap1.put("C4", "White");
		treeMap1.put("C5", "Blue");
		System.out.println("TreeMap1" + treeMap1);

		TreeMap<String, String> treeMap2 = new TreeMap<String, String>();
		treeMap2.put("A1", "Orange");
		treeMap2.put("A2", "Pink");
		System.out.println("TreeMap2" + treeMap2);

		treeMap1.putAll(treeMap2);

		System.out.println("After coping map2 to map1: " + treeMap1);
	}
}