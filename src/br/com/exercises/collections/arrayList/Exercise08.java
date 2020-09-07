package br.com.exercises.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise08 {
	/*
	 * Write a Java program to sort a given array list.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		list.add("Blue");
		
		System.out.println("List before sort: " + list);
		Collections.sort(list);
		System.out.println("List after sort: " + list);
	}
}