package br.com.exercises.collections.hashSet;

import java.util.HashSet;

public class Exercise05 {
	/*
	 * Write a Java program to test a hash set is empty or not.
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
		System.out.println("Checking the above array list is empty or not?: " + hashSet.isEmpty());
		System.out.println("Remove all elements from a HashSet: " + hashSet.removeAll(hashSet));
		System.out.println("HashSet after removing all the elements: " + hashSet);
		System.out.println("Checking the above array list is empty or not?: " + hashSet.isEmpty());
	}
}