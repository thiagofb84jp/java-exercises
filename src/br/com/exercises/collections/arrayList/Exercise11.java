package br.com.exercises.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise11 {
	/*
	 * Write a Java program to reverse elements in a array list.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		list.add("Blue");
		
		System.out.println("List before reversing: " + list);
		Collections.reverse(list);
		System.out.println("List after reversing: " + list);
	}
}