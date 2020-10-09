package br.com.exercises.collections.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class Exercise01 {
	/*
	 * Write a Java program to associate the specified value with the specified key in a Tree Map.
	 */
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "Red");
		treeMap.put(2, "Green");
		treeMap.put(3, "Black");
		treeMap.put(4, "White");
		treeMap.put(5, "Blue");
		
		for(Map.Entry<Integer, String> entry: treeMap.entrySet()) {
			System.out.println(entry.getKey() + " => " + entry.getValue());
		}
	}
}