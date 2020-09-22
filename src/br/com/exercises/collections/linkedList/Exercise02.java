package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise02 {
	/*
	 * Write a Java program to iterate through all elements in a linked list.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("White");
		linkedList.add("Pink");
		linkedList.add("Yellow");

		for(String element: linkedList) {
			System.out.println(element);
		}
	}	
}