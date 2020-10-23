package br.com.exercises.collections.hashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exercise07 {
	/*
	 * Write a Java program to convert a hash set to a tree set.
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

		Set<String> treeSet = new TreeSet<String>(hashSet);

		System.out.println("TreeSet elements: " + treeSet);

		for (String element : treeSet) {
			System.out.println(element);
		}
	}
}