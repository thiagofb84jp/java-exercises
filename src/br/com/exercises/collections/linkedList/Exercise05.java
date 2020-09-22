package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise05 {
	/*
	 * Write a Java program to insert the specified element at the end of a linked list.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("White");

		System.out.println("Original Linked List: " + linkedList);

		linkedList.offerLast("Pink");
		linkedList.offerLast("Yellow");

		System.out.println("Final Linked List: " + linkedList);
	}
}