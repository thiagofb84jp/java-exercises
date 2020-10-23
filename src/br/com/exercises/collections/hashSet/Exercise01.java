package br.com.exercises.collections.hashSet;

import java.util.HashSet;

public class Exercise01 {
	/*
	 * Write a Java program to append the specified element to the end of a hash set.
	 */
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Black");
		hashSet.add("White");
		hashSet.add("Pink");
		hashSet.add("Yellow");
		
		System.out.println("The HashSet elements: " + hashSet);
	}
}