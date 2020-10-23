package br.com.exercises.collections.hashSet;

import java.util.HashSet;

public class Exercise04 {
	/*
	 * Write a Java program to empty an hash set.
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
		hashSet.removeAll(hashSet);
		System.out.println("HashSet after removing all the elements: " + hashSet);
	}
}