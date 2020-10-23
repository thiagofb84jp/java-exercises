package br.com.exercises.collections.hashSet;

import java.util.HashSet;

public class Exercise11 {
	/*
	 * Write a Java program to compare two hash sets.
	 */
	public static void main(String[] args) {
		HashSet<String> hashSetOne = new HashSet<String>();
		hashSetOne.add("Red");
		hashSetOne.add("Green");
		hashSetOne.add("Black");
		hashSetOne.add("White");
		hashSetOne.add("Grey");
		hashSetOne.add("Blue");
		
		HashSet<String> hashSetTwo = new HashSet<String>();
		hashSetTwo.add("Red");
		hashSetTwo.add("Pink");
		hashSetTwo.add("Black");
		hashSetTwo.add("Orange");
		hashSetTwo.add("Yellow");
		hashSetTwo.add("Blue");
		
		for(String element: hashSetOne) {
			System.out.println(hashSetTwo.contains(element) ? "Yes" : "No");
		}
	}
}