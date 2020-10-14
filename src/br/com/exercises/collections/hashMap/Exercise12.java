package br.com.exercises.collections.hashMap;

import java.util.HashMap;

public class Exercise12 {
	/*
	 * Write a Java program to test if a map contains a mapping for the specified key.
	 */
	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("Red", 1);
		hashMap.put("Green", 2);
		hashMap.put("Black", 3);
		hashMap.put("White", 4);
		hashMap.put("Blue", 5);

		System.out.println("The original map: " + hashMap);

		System.out.println("1. Is key \'Green\' exists?");
		
		if (hashMap.containsKey("Green")) {
			System.out.println("Yes! - " + hashMap.get("Green"));
		} else {
			System.out.println("No!");
		}

		System.out.println("\n2. Is key \'Orange\' exists?");

		if (hashMap.containsKey("Orange")) {
			System.out.println("Yes! - " + hashMap.get("Orange"));
		} else {
			System.out.println("No!");
		}
	}
}