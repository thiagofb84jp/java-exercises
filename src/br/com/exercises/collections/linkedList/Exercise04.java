package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise04 {
	/*
	 * Write a Java program to insert the specified element at the front of a linked list.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("White");

		System.out.println("Original Linked List: " + linkedList);

		linkedList.offerFirst("Pink");
		linkedList.offerFirst("Yellow");

		System.out.println("Final Linked List: " + linkedList);

	}
}