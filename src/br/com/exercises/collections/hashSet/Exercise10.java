package br.com.exercises.collections.hashSet;

import java.util.HashSet;

public class Exercise10 {
	/*
	 * Write a Java program to remove all of the elements from a hash set.
	 */
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Black");
		hashSet.add("White");
		hashSet.add("Pink");
		hashSet.add("Yellow");

		System.out.println("Original HashSet contains: " + hashSet);

		hashSet.clear();

		System.out.println("HashSet content: " + hashSet);
	}
}