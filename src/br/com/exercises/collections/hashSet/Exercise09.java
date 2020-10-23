package br.com.exercises.collections.hashSet;

import java.util.HashSet;

public class Exercise09 {
	/*
	 * Write a Java program to convert a hash set to an array.
	 */
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Black");
		hashSet.add("White");
		hashSet.add("Pink");
		hashSet.add("Yellow");

		System.out.println("Original HashSet: " + hashSet);

		String[] arrayStrings = new String[hashSet.size()];
		hashSet.toArray(arrayStrings);

		System.out.println("Array elements: ");

		for (String element : arrayStrings) {
			System.out.println(element);
		}
	}
}