package br.com.exercises.collections.hashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Exercise08 {
	/*
	 * Write a Java program to convert a hash set to a List/ArrayList.
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
		
		List<String> list = new ArrayList<String>(hashSet);
		
		System.out.println("ArrayList contains: " + list);

	}
}