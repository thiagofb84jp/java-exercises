package br.com.exercises.collections.hashSet;

import java.util.HashSet;

public class Exercise03 {
	/*
	 * Write a Java program to get the number of elements in a hash set.
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
		System.out.println("Size of the HashSet: " + hashSet.size());
	}
}