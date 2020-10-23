package br.com.exercises.collections.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Exercise02 {
	/*
	 * Write a Java program to iterate through all elements in a hash list.
	 */
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Black");
		hashSet.add("White");
		hashSet.add("Pink");
		hashSet.add("Yellow");

		Iterator<String> iterator = hashSet.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}