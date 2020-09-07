package br.com.exercises.collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise10 {
	/*
	 * Write a Java program to shuffle elements in a array list.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		list.add("Blue");
		
		System.out.println("List before shuffling: " + list);
		Collections.shuffle(list);
		System.out.println("List after shuffling: " + list);
	}
}