package br.com.exercises.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise05 {
	/*
	 * Write a Java program to update specific array element by given element.
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
		
		list.set(2, "Yellow");
		list.add(6, "Grey");
		
		System.out.println(list);
	}
}