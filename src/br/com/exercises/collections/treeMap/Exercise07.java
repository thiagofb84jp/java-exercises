package br.com.exercises.collections.treeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class Exercise07 {
	/*
	 * Write a Java program to sort keys in Tree Map by using comparator.
	 */
	public static void main(String[] args) {
		TreeMap<String, String> treeMap = new TreeMap<String, String>(new shortKey());
		treeMap.put("C2", "Green");
		treeMap.put("C1", "Red");
		treeMap.put("C4", "White");
		treeMap.put("C3", "Black");

		System.out.println("Original TreeMap content: " + treeMap);
	}
}

class shortKey implements Comparator<String> {
	public int compare(String str1, String str2) {
		return str1.compareTo(str2);
	}
}