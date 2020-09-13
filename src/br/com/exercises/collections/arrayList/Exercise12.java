package br.com.exercises.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise12 {
	/*
	 * Write a Java program to extract a portion of a array list.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		list.add("Blue");
		
		System.out.println("Original list: " + list);
		List<String> sublist = list.subList(0, 3);
		System.out.println("List of first three elements: " + sublist);
	}
}