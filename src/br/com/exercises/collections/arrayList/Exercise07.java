package br.com.exercises.collections.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise07 {
	/*
	 * Write a Java program to search an element in a array list.
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		list.add("Blue");
		
		foundElmentList(list, "Blue");		
		foundElmentList(list, "Grey");
	}
	
	private static void foundElmentList(List<String> listElement, String element) {
		if (listElement.contains(element)) {
			System.out.println("Found the element.");
		} else {
			System.out.println("There is no such element.");
		}		
	}
}