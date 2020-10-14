package br.com.exercises.collections.linkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Exercise14 {
	/*
	 * Write a Java program of swap two elements in an linked list.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("Pink");
		linkedList.add("Orange");

		System.out.println("Original Linked List: " + linkedList);
		
		Collections.swap(linkedList, 0, 2);
		
		System.out.println("The new Linked List: " + linkedList);
	}
}