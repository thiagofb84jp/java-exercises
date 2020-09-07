package br.com.exercises.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise03 {
	/**
	 * Write a Java program to insert an element into the array list at the first position.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println(list);
		
		list.add(0, "Pink");
		list.add(5, "Yellow");
		list.add(4, "Blue");
		
		System.out.println(list);
	}
}