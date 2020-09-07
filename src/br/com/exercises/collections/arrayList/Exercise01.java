package br.com.exercises.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise01 {
	/*
	 * Write a Java program to create a new array list, add some elements (string) and print out the collection.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println(list);
	}
}