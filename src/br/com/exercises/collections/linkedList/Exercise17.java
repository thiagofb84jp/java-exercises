package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise17 {
	/*
	 * Write a Java program to retrieve but does not remove, the first element of a linked list.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("Pink");
		linkedList.add("Orange");

		System.out.println("Original Linked List: " + linkedList);

		String str = linkedList.peekFirst();

		System.out.println("First element in the list: " + str);

		System.out.println("Original Linked List: " + linkedList);
	}
}