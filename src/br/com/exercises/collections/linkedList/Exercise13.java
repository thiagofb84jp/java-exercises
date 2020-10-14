package br.com.exercises.collections.linkedList;

import java.util.LinkedList;

public class Exercise13 {
	/*
	 * Write a Java program to remove all the elements from a linked list.
	 */
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Red");
		linkedList.add("Green");
		linkedList.add("Black");
		linkedList.add("Pink");
		linkedList.add("Orange");

		System.out.println("Original Linked List: " + linkedList);

		linkedList.clear();

		System.out.println("The new Linked List: " + linkedList);
	}
}