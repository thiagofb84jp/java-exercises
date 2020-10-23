package br.com.exercises.collections.hashSet;

import java.util.HashSet;

public class Exercise12 {
	/*
	 * Write a Java program to compare two sets and retain elements which are same on both sets.
	 */
	public static void main(String[] args) {
		HashSet<String> hashSetOne = new HashSet<String>();
		hashSetOne.add("Red");
		hashSetOne.add("Green");
		hashSetOne.add("Black");
		hashSetOne.add("White");
		hashSetOne.add("Grey");
		hashSetOne.add("Pink");

		System.out.println("First HashSet content: " + hashSetOne);

		HashSet<String> hashSetTwo = new HashSet<String>();
		hashSetTwo.add("Red");
		hashSetTwo.add("Green");
		hashSetTwo.add("Black");
		hashSetTwo.add("Orange");
		hashSetTwo.add("Grey");
		hashSetTwo.add("Blue");

		System.out.println("Second HashSet content: " + hashSetTwo);

		hashSetOne.retainAll(hashSetTwo);
		System.out.println("HashSet content: " + hashSetOne);
	}
}