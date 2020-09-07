package br.com.exercises.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise06 {
	/*
	 * Write a Java program to remove the third element from a array list.
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
		
		list.remove(2);
		
		System.out.println("After removing third element from the list: " + list);	
	}
}