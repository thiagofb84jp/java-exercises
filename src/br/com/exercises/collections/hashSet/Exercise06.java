package br.com.exercises.collections.hashSet;

import java.util.HashSet;

public class Exercise06 {
	/*
	 * Write a Java program to clone a hash set to another hash set.
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add("Red");
		hashSet.add("Green");
		hashSet.add("Black");
		hashSet.add("White");
		hashSet.add("Pink");
		hashSet.add("Yellow");
		
		System.out.println("Original HashSet: " + hashSet);
		
		HashSet<String> hashSetCloned = new HashSet<String>();
		hashSetCloned = (HashSet<String>) hashSet.clone();
		System.out.println("Cloned Hash Set: " + hashSetCloned);		
	}
}