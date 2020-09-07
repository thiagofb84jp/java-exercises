package br.com.exercises.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise04 {
	/*
	 * Write a Java program to retrieve an element (at a specified index) from a given array list.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		list.add("Blue");
		
		System.out.println(list);
		
		String element = list.get(0);
		System.out.println("First element: " + element);

		element = list.get(2);
		System.out.println("Third element: " + element);
		
		element = list.get(5);
		System.out.println("Firth element: " + element);
		
		System.out.println("Size of Array List: " + list.size());
	}
}