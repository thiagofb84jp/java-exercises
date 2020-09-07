package br.com.exercises.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise02 {
	/*
	 * Write a Java program to iterate through all elements in a array list.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println(list);
		
		for(String elements: list) {
			System.out.println(elements);
		}
	}
}